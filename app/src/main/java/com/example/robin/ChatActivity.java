package com.example.robin;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import ai.api.AIDataService;
import ai.api.AIServiceException;
import ai.api.android.AIConfiguration;
import ai.api.model.AIError;
import ai.api.model.AIRequest;
import ai.api.model.AIResponse;
import ai.api.model.Result;

public class ChatActivity extends AppCompatActivity implements TextToSpeech.OnInitListener {
    private LinearLayout chat_activity;
    private List<Message> messageList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MessageAdapter mAdapter;
    private TextView message_entered;
    private TextToSpeech tts;
    private String query_message;

    private PendingIntent pendingIntent;
    private AlarmManager alarmManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        chat_activity = (LinearLayout) findViewById(R.id.chat_activity_layout);

        tts = new TextToSpeech(this, this);
        tts.setSpeechRate(Float.parseFloat("0.8"));

        message_entered = (TextView) findViewById(R.id.edittext_chatbox);
        recyclerView = (RecyclerView) findViewById(R.id.reyclerview_message_list);

        alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);

        mAdapter = new MessageAdapter(messageList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(mAdapter);
    }

    @Override
    public void onDestroy() {
        if (tts != null) {
            tts.stop();
            tts.shutdown();
        }
        super.onDestroy();
    }

    public void sendMessage(View view) {
        final AIConfiguration config = new AIConfiguration("6a7700325a904163a44467c8a7f760e0",
                AIConfiguration.SupportedLanguages.English,
                AIConfiguration.RecognitionEngine.System);

        final AIRequest aiRequest = new AIRequest();

        query_message = message_entered.getText().toString();

        if (query_message.length() == 0) {
            Toast.makeText(getApplicationContext(), "Enter something!", Toast.LENGTH_SHORT).show();
        } else if (query_message.equalsIgnoreCase("what did you remember")) {
            Message temp = new Message();
            temp.setMessage_content(query_message);
            temp.setMessage_type(1);
            messageList.add(temp);

            mAdapter.notifyDataSetChanged();

            SharedPreferences preferences = getApplicationContext().getSharedPreferences("RememberItems", 0);
            String speech = preferences.getString("remember_message", "No, I don't think you asked me to remember anything.");

            if(!speech.equals("No, I don't think you asked me to remember anything.")){
                speech = "You asked me to remember this: \n\n" + speech;
            }

            temp = new Message();
            temp.setMessage_content(speech);
            temp.setMessage_type(2);
            messageList.add(temp);

            tts.speak(speech, TextToSpeech.QUEUE_FLUSH, null);
            message_entered.setText("");

            mAdapter.notifyDataSetChanged();
        } else if (query_message.equalsIgnoreCase("forget")) {
            Message temp = new Message();
            temp.setMessage_content(query_message);
            temp.setMessage_type(1);
            messageList.add(temp);

            mAdapter.notifyDataSetChanged();

            SharedPreferences preferences = getApplicationContext().getSharedPreferences("RememberItems", 0);
            SharedPreferences.Editor editor = preferences.edit();

            editor.clear();
            String speech = "I have forgot!";
            editor.apply();

            temp = new Message();
            temp.setMessage_content(speech);
            temp.setMessage_type(2);
            messageList.add(temp);

            tts.speak(speech, TextToSpeech.QUEUE_FLUSH, null);
            message_entered.setText("");

            mAdapter.notifyDataSetChanged();
        } else {
            Message temp = new Message();
            temp.setMessage_content(query_message);
            temp.setMessage_type(1);
            messageList.add(temp);

            aiRequest.setQuery(query_message);
            mAdapter.notifyDataSetChanged();
        }

        // This is the ASync task for handling the task of setting up the API.AI query
        final AsyncTask<AIRequest, Integer, AIResponse> task =
                new AsyncTask<AIRequest, Integer, AIResponse>() {
                    private AIError aiError;

                    @Override
                    protected AIResponse doInBackground(final AIRequest... params) {
                        final AIRequest request = params[0];
                        try {
                            final AIDataService aiDataService = new AIDataService(config);
                            final AIResponse response = aiDataService.request(request);
                            // Return response
                            return response;
                        } catch (final AIServiceException e) {
                            aiError = new AIError(e);
                            return null;
                        }
                    }

                    @Override
                    protected void onPostExecute(final AIResponse response) {
                        if (response != null) {
                            onResult(response);
                        } else {
                            onError(aiError);
                        }
                    }
                };
        task.execute(aiRequest);
    }

    public void onResult(final AIResponse response) {
        final Result result = response.getResult();
        Log.i("custom", "Resolved query: " + result.getResolvedQuery());
        Log.i("custom", "Action: " + result.getAction());
        final String speech = result.getFulfillment().getSpeech();
        Log.i("custom", "Speech: " + speech);

        // Check if the action is 'alarm.set'
        if (result.getAction().equals("alarm.set")) {
            AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
            Intent myIntent = new Intent(ChatActivity.this, AlarmReceiver.class);
            PendingIntent pendingIntent = PendingIntent.getBroadcast(ChatActivity.this, 0, myIntent, 0);

            alarmManager.setExact(AlarmManager.RTC_WAKEUP, result.getTimeParameter("time").getTime(), pendingIntent);
        } else if (result.getAction().equals("web.search")) {
            Uri uri = Uri.parse("http://www.google.com/#q=" + result.getStringParameter("q"));

            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        } else if (result.getAction().equals("launch.app")) {
            String app_name = result.getStringParameter("app_name").toLowerCase();

            // Open gallery
            if (app_name.equals("photos") || app_name.equals("gallery")) {
                final int RESULT_GALLERY = 0;

                Intent galleryIntent = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(galleryIntent, RESULT_GALLERY);
            }

            // Open camera app
            if (app_name.equals("camera")) {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                startActivity(intent);
            }

            // Open messages app
            if (app_name.equals("messages")) {
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse("sms:"));
                startActivity(sendIntent);
            }

            // Open Playstore app
            if (app_name.equals("app store") || app_name.equals("playstore")) {

                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse(
                        "https://play.google.com/store/apps/topic?id=editors_choice"));
                startActivity(sendIntent);
            }
        } else if (result.getAction().equals("change.background")) {
            final int random = new Random().nextInt(7);

            if (random == 0) {
                chat_activity.setBackgroundResource(R.drawable.chat_background_1);
            } else if (random == 1) {
                chat_activity.setBackgroundResource(R.drawable.chat_background_2);
            } else if (random == 2) {
                chat_activity.setBackgroundResource(R.drawable.chat_background_3);
            } else if (random == 3) {
                chat_activity.setBackgroundResource(R.drawable.chat_background_4);
            } else if (random == 4) {
                chat_activity.setBackgroundResource(R.drawable.chat_background_5);
            } else if (random == 5) {
                chat_activity.setBackgroundResource(R.drawable.chat_background_6);
            } else if (random == 6) {
                chat_activity.setBackgroundResource(R.drawable.chat_background_7);
            }
        } else if (result.getAction().equals("navigate.place")) {
            Uri gmmIntentUri = Uri.parse("google.navigation:q=" + result.getStringParameter("geo-city"));
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        } else if (result.getAction().equals("remember.this")) {
            Log.i("custom", query_message);

            SharedPreferences preferences = getApplicationContext().getSharedPreferences("RememberItems", 0);
            SharedPreferences.Editor editor = preferences.edit();

            editor.clear();
            editor.putString("remember_message", query_message);
            editor.apply();
        }

        Message temp = new Message();
        temp.setMessage_content(speech);
        temp.setMessage_type(2);
        messageList.add(temp);

        tts.speak(speech, TextToSpeech.QUEUE_FLUSH, null);
        message_entered.setText("");

        mAdapter.notifyDataSetChanged();
    }

    public void onError(final AIError error) {
        Log.i("custom", "Resolved query: " + error.getMessage());
    }

    @Override
    public void onInit(int status) {

    }
}
