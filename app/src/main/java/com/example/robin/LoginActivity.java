package com.example.robin;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.FullScreenTheme);
        setContentView(R.layout.activity_login);

        Intent temp = new Intent(this, ChatActivity.class);
        startActivity(temp);
        finish();

        // Setting up the custom font for the App name
        //Typeface text_font = Typeface.createFromAsset(getAssets(), "fonts/KaushanScript-Regular.otf");
        //TextView app_name = (TextView) findViewById(R.id.text_appname);
        //app_name.setTypeface(text_font);

//        app_name.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View v) {
//                EditText username = (EditText) findViewById(R.id.edittext_username);
//                EditText password = (EditText) findViewById(R.id.edittext_password);
//
//                username.setText("nair.dheeraj@yahoo.co.in");
//                password.setText("pass123");
//
//                return true;
//            }
//        });
    }

    public void login(View view) {
        Intent temp = new Intent(this, ChatActivity.class);
        startActivity(temp);
        finish();
    }
}
