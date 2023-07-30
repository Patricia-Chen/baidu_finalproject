package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;


public class videopage extends AppCompatActivity {


    public void ClickImgBtnAndJump(ImageButton btn, int btnid,Class a) {
        btn = (ImageButton) findViewById(btnid);//id后面为上方button的id

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(com.example.test.videopage.this,a);//this前面为当前activty名称，class前面为要跳转到得activity名称
                startActivity(intent);
            }
        });
    }

    public void ClickLinearAndJump(LinearLayout ln, int lnid, Class a) {
        ln = (LinearLayout) findViewById(lnid);//id后面为上方button的id
        ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(com.example.test.videopage.this,a);//this前面为当前activty名称，class前面为要跳转到得activity名称
                startActivity(intent);
            }
        });
    }

    private ImageButton me_tab_button;
    private ImageButton homepage_tab_button;
    private LinearLayout video1;
    private LinearLayout video2;
    private LinearLayout video3;
    private LinearLayout video4;

    private LinearLayout search;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videopage);
        ClickImgBtnAndJump(me_tab_button,R.id.me_tab, me.class);
        ClickImgBtnAndJump(homepage_tab_button,R.id.homepage_tab, homepage.class);
        ClickLinearAndJump(video1,R.id.video1,videoplayer.class);
        ClickLinearAndJump(video2,R.id.video2, videoplayer2.class);
        ClickLinearAndJump(video3,R.id.video3, videoplayer3.class);
        ClickLinearAndJump(video4,R.id.video4, videoplayer2.class);
        ClickLinearAndJump(search,R.id.searchlinear,search.class);
    }
}