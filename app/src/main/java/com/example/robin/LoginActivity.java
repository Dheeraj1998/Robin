package com.example.robin;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Setting up the custom font for the App name
        Typeface text_font = Typeface.createFromAsset(getAssets(), "fonts/KaushanScript-Regular.otf");
        TextView app_name = (TextView) findViewById(R.id.text_appname);
        app_name.setTypeface(text_font);
    }

    public void login(View view){
        Intent temp = new Intent(this, ChatActivity.class);
        startActivity(temp);
        finish();
    }
}
