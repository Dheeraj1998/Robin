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
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.skyfishjy.library.RippleBackground;

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
import bsh.EvalError;
import bsh.Interpreter;

public class ChatActivity extends AppCompatActivity implements TextToSpeech.OnInitListener {
    private LinearLayout chat_activity;
    private List<Message> messageList = new ArrayList<>();
    private MessageAdapter mAdapter;
    private TextView message_entered;
    private TextToSpeech tts;
    private String query_message;

    private SharedPreferences historyPreferences;

    private PendingIntent pendingIntent;
    private AlarmManager alarmManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        final RippleBackground rippleBackground = (RippleBackground)findViewById(R.id.app_icon_image);
        rippleBackground.startRippleAnimation();

        chat_activity = (LinearLayout) findViewById(R.id.chat_activity_layout);

        tts = new TextToSpeech(this, this);
        tts.setSpeechRate(Float.parseFloat("0.8"));

        message_entered = (TextView) findViewById(R.id.edittext_chatbox);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.reyclerview_message_list);

        alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);

        mAdapter = new MessageAdapter(messageList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(mAdapter);

        historyPreferences = getApplicationContext().getSharedPreferences("ChatHistory", 0);
        getChatHistory();
    }


    //region Function for hiding the app icon on Chat Activity
    public void hideIcon(View view){
        final RippleBackground rippleBackground = (RippleBackground) findViewById(R.id.app_icon_image);
        Animation animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out);

        animFadeOut.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                rippleBackground.stopRippleAnimation();
                rippleBackground.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        rippleBackground.startAnimation(animFadeOut);
    }

    public void hideIcon(View view, boolean fast){
        final RippleBackground rippleBackground = (RippleBackground) findViewById(R.id.app_icon_image);
        rippleBackground.setVisibility(View.GONE);
        rippleBackground.stopRippleAnimation();
    }
    //endregion

    //region onDestroy Function
    @Override
    public void onDestroy() {
        if (tts != null) {
            tts.stop();
            tts.shutdown();
        }
        super.onDestroy();
    }
    //endregion

    //region Function for retrieving the chat-history
    public void getChatHistory(){
        int totalMessageCount = historyPreferences.getInt("total_count", 0);

        if(totalMessageCount != 0){
            hideIcon(getCurrentFocus(), true);
            int backgroundColor = historyPreferences.getInt("background_color", 0);
            changeBackground(backgroundColor);

            for(int i = 1; i <= totalMessageCount; i++){

                //region Code-block for building the appropriate message
                Message temp = new Message();
                String message_content;

                if (i % 2 != 0) {
                    message_content = historyPreferences.getString(i + "_sent", "Error.");
                    temp.setMessage_type(1);
                }

                else {
                    message_content = historyPreferences.getString(i + "_receive", "Error.");
                    temp.setMessage_type(2);
                }

                temp.setMessage_content(message_content);
                //endregion

                //region Code-block for sending the message to RecyclerView
                messageList.add(temp);
                mAdapter.notifyDataSetChanged();
                //endregion
            }
        }
    }
    //endregion

    //region Function for storing the chat-history
    public void storeChatHistory(int type, String message){
        int totalMessageCount = historyPreferences.getInt("total_count", 0);
        SharedPreferences.Editor historyEditor = historyPreferences.edit();

        if (type == 1) {
            historyEditor.putString((totalMessageCount + 1) + "_sent", message);
        }

        else {
            historyEditor.putString((totalMessageCount + 1) + "_receive", message);
        }
        historyEditor.putInt("total_count", totalMessageCount + 1);
        historyEditor.apply();
    }
    //endregion

    //region Function for changing the background
    public void changeBackground(int random){
        if (random == 0) {
            chat_activity.setBackgroundResource(R.color.background_1);
            getWindow().setStatusBarColor(getResources().getColor(R.color.background_dk_1));
        } else if (random == 1) {
            chat_activity.setBackgroundResource(R.color.background_2);
            getWindow().setStatusBarColor(getResources().getColor(R.color.background_dk_2));
        } else if (random == 2) {
            chat_activity.setBackgroundResource(R.color.background_3);
            getWindow().setStatusBarColor(getResources().getColor(R.color.background_dk_3));
        } else if (random == 3) {
            chat_activity.setBackgroundResource(R.color.background_4);
            getWindow().setStatusBarColor(getResources().getColor(R.color.background_dk_4));
        } else if (random == 4) {
            chat_activity.setBackgroundResource(R.color.background_5);
            getWindow().setStatusBarColor(getResources().getColor(R.color.background_dk_5));
        } else if (random == 5) {
            chat_activity.setBackgroundResource(R.color.background_6);
            getWindow().setStatusBarColor(getResources().getColor(R.color.background_dk_6));
        } else if (random == 6) {
            chat_activity.setBackgroundResource(R.color.background_7);
            getWindow().setStatusBarColor(getResources().getColor(R.color.background_dk_7));
        } else if (random == 7) {
            chat_activity.setBackgroundResource(R.color.background_8);
            getWindow().setStatusBarColor(getResources().getColor(R.color.background_dk_8));
        } else if (random == 8) {
            chat_activity.setBackgroundResource(R.color.background_9);
            getWindow().setStatusBarColor(getResources().getColor(R.color.background_dk_9));
        } else if (random == 9) {
            chat_activity.setBackgroundResource(R.color.background_10);
            getWindow().setStatusBarColor(getResources().getColor(R.color.background_dk_10));
        }
    }
    //endregion

    public void sendMessage(View view) {
        final AIConfiguration config = new AIConfiguration("6a7700325a904163a44467c8a7f760e0",
                AIConfiguration.SupportedLanguages.English,
                AIConfiguration.RecognitionEngine.System);

        final AIRequest aiRequest = new AIRequest();

        query_message = message_entered.getText().toString();

        //region Code-block for hiding the icon on chatting
        final RippleBackground rippleBackground = (RippleBackground) findViewById(R.id.app_icon_image);
        if (rippleBackground.getVisibility() != View.GONE) {
            hideIcon(getCurrentFocus());
        }
        //endregion

        if (query_message.length() == 0) {
            Toast.makeText(getApplicationContext(), "Enter something!", Toast.LENGTH_SHORT).show();
        } else {
            Message temp = new Message();
            temp.setMessage_content(query_message);
            temp.setMessage_type(1);
            messageList.add(temp);

            mAdapter.notifyDataSetChanged();
            storeChatHistory(1, query_message);

            if (query_message.equalsIgnoreCase("clear history")) {
                SharedPreferences.Editor historyEditor = historyPreferences.edit();
                historyEditor.clear();
                historyEditor.apply();

                String speech = "The history has been cleared.";
                temp = new Message();
                temp.setMessage_content(speech);
                temp.setMessage_type(2);
                messageList.add(temp);

                tts.speak(speech, TextToSpeech.QUEUE_FLUSH, null);
                message_entered.setText("");

                mAdapter.notifyDataSetChanged();
            } else if (query_message.equalsIgnoreCase("what did you remember")) {
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
                storeChatHistory(2, speech);
            } else if (query_message.equalsIgnoreCase("forget")) {
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
                storeChatHistory(2, speech);
            } else if (query_message.startsWith("calculate") || query_message.startsWith("Calculate")) {
                String speech;

                Interpreter interpreter = new Interpreter();

                try {
                    String eval_expression = query_message.substring(9).trim();
                    interpreter.eval("result = " + eval_expression);
                    speech = "The result is: " + interpreter.get("result");
                } catch (EvalError evalError) {
                    speech = "The entered expression is invalid!";
                    evalError.printStackTrace();
                }

                temp = new Message();
                temp.setMessage_content(speech);
                temp.setMessage_type(2);
                messageList.add(temp);

                tts.speak(speech, TextToSpeech.QUEUE_FLUSH, null);
                message_entered.setText("");

                mAdapter.notifyDataSetChanged();
                storeChatHistory(2, speech);
            } else {
                aiRequest.setQuery(query_message);
            }
        }

        //region ASync task for handling the task of setting up the API.AI query
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
        //endregion
    }

    public void onResult(final AIResponse response) {
        final Result result = response.getResult();
        final String speech = result.getFulfillment().getSpeech();

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

            // Open Play-store app
            if (app_name.equals("app store") || app_name.equals("playstore")) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps")));
            }
        } else if (result.getAction().equals("change.background")) {
            final int random = new Random().nextInt(10);
            changeBackground(random);

            SharedPreferences.Editor historyEditor = historyPreferences.edit();
            historyEditor.putInt("background_color", random);
            historyEditor.apply();
        } else if (result.getAction().equals("navigate.place")) {
            Uri gmmIntentUri = Uri.parse("google.navigation:q=" + result.getStringParameter("geo-city"));
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        } else if (result.getAction().equals("remember.this")) {
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
        storeChatHistory(2, speech);
    }

    public void onError(final AIError error) {
        Log.i("custom", "Resolved query: " + error.getMessage());
    }

    @Override
    public void onInit(int status) {

    }
}
