package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.SearchView;
import android.widget.TextView;

public class ScrollSearch extends AppCompatActivity {
    private ImageButton me_tab_button;
    private ImageButton news1_button;
    private ImageButton video_tab_button;
    public void clickandjump(int titleid) {
        TextView txtViewRegister = (TextView) findViewById(titleid);
        txtViewRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ComponentName componentname = new ComponentName(com.example.test.ScrollSearch.this, conversation.class);
                Intent intent = new Intent();
                intent.setComponent(componentname);
                startActivity(intent);

            }
        });
    }

    public void ClickImgBtnAndJump(ImageButton btn, int btnid, Class a) {
        btn = (ImageButton) findViewById(btnid);//id后面为上方button的id

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(com.example.test.ScrollSearch.this,a);//this前面为当前activty名称，class前面为要跳转到得activity名称
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_search);

        ClickImgBtnAndJump(me_tab_button,R.id.me_tab,me.class);
        ClickImgBtnAndJump(video_tab_button,R.id.video_tab,videopage.class);
        ClickImgBtnAndJump(news1_button,R.id.news1_picture,conversation.class);

        clickandjump(R.id.news1_title);
        clickandjump(R.id.news2_title);
        clickandjump(R.id.news3_title);
        clickandjump(R.id.news4_title);
        clickandjump(R.id.news5_title);
        clickandjump(R.id.news6_title);
        clickandjump(R.id.news7_title);

        LinearLayout searchlinear= (LinearLayout) findViewById(R.id.searchlinear);
        searchlinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(com.example.test.ScrollSearch.this, search.class);//this前面为当前activty名称，class前面为要跳转到得activity名称
                startActivity(intent);
            }
        });
    }
}