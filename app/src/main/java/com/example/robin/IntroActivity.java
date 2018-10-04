package com.example.robin;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import agency.tango.materialintroscreen.MaterialIntroActivity;
import agency.tango.materialintroscreen.SlideFragmentBuilder;

public class IntroActivity extends MaterialIntroActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_Intro);

        addSlide(new SlideFragmentBuilder()
                .backgroundColor(R.color.intro_bg_1)
                .buttonsColor(R.color.intro_btn_1)
                .image(R.drawable.app_icon)
                .title("Robin")
                .description("Personal assistant at your fingerprints.")
                .build());

        addSlide(new SlideFragmentBuilder()
                .backgroundColor(R.color.intro_bg_2)
                .buttonsColor(R.color.intro_btn_2)
                .image(R.drawable.intro_1)
                .title("Calculator")
                .description("Get results to arithmetic expressions!")
                .build());

        addSlide(new SlideFragmentBuilder()
                .backgroundColor(R.color.intro_bg_3)
                .buttonsColor(R.color.intro_btn_3)
                .image(R.drawable.intro_2)
                .title("Remember?")
                .description("Just say 'Remember that' to make the assistant remember that.")
                .build());

        addSlide(new SlideFragmentBuilder()
                .backgroundColor(R.color.intro_bg_4)
                .buttonsColor(R.color.intro_btn_4)
                .image(R.drawable.intro_3)
                .title("Navigation")
                .description("Go to any place with navigation on your command.")
                .build());

        addSlide(new SlideFragmentBuilder()
                .backgroundColor(R.color.intro_bg_5)
                .buttonsColor(R.color.intro_btn_5)
                .image(R.drawable.intro_4)
                .title("Other apps?")
                .description("Need to open some other app, you can do that too!")
                .build());
    }

    @Override
    public void onFinish() {
        Intent temp = new Intent(this, ChatActivity.class);
        startActivity(temp);
        finish();
    }
}