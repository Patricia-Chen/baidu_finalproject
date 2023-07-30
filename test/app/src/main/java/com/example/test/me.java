package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class me extends AppCompatActivity {
    public void ClickImgBtnAndJump(ImageButton btn, int btnid, Class a) {
        btn = (ImageButton) findViewById(btnid);//id后面为上方button的id

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(com.example.test.me.this,a);//this前面为当前activty名称，class前面为要跳转到得activity名称
                startActivity(intent);
            }
        });
    }
    private ImageButton homepage_tab_button;
    private ImageButton video_tab_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me);
        ClickImgBtnAndJump(homepage_tab_button,R.id.homepage_tab, homepage.class);
        ClickImgBtnAndJump(video_tab_button,R.id.video_tab,videopage.class);
    }
}