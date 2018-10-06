package com.example.robin;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.FullScreenTheme);
        setContentView(R.layout.activity_login);

        //region Code-block for setting up custom font
        Typeface text_font = Typeface.createFromAsset(getAssets(), "fonts/Quicksand-Bold.otf");

        TextView app_name = (TextView) findViewById(R.id.text_appname);
        EditText username = (EditText) findViewById(R.id.edittext_username);
        TextView password = (EditText) findViewById(R.id.edittext_password);
        Button login_button = (Button) findViewById(R.id.button_login);

        app_name.setTypeface(text_font);
        username.setTypeface(text_font);
        password.setTypeface(text_font);
        login_button.setTypeface(text_font);
        //endregion

        //region Code-block for placing sample user-credentials
        app_name.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                EditText username = (EditText) findViewById(R.id.edittext_username);
                EditText password = (EditText) findViewById(R.id.edittext_password);

                username.setText("dheerajd.nair2015@vit.ac.in");
                password.setText("12345678");

                return true;
            }
        });
        //endregion
    }

    public void login(View view) {
        Intent temp = new Intent(this, ChatActivity.class);
        startActivity(temp);
        finish();
    }
}
