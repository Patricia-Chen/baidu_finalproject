package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.test.adapter.NewsBaseAdapter;
import com.example.test.bean.News;
import java.util.List;

public class homepage extends AppCompatActivity {

    public void ClickImgBtnAndJump(ImageButton btn, int btnid,Class a) {
        btn = (ImageButton) findViewById(btnid);//id后面为上方button的id
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(com.example.test.homepage.this,a);//this前面为当前activty名称，class前面为要跳转到得activity名称
                startActivity(intent);
            }
        });
    }

    public void clickandjump(int titleid) {
        TextView txtViewRegister = (TextView) findViewById(titleid);
        txtViewRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ComponentName componentname = new ComponentName(com.example.test.homepage.this, conversation.class);
                Intent intent = new Intent();
                intent.setComponent(componentname);
                startActivity(intent);

            }
        });
    }

    void onListItemClick() {
        Intent intent = null;
        intent = new Intent(homepage.this, conversation.class);
        this.startActivity(intent);
    }
    private ImageButton me_tab_button;
    private ImageButton video_tab_button;
    private ImageButton add_button;
    private LinearLayout listlayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        //ListView listView_news = findViewById(R.id.listView_news);
        List<News> newsList = News.getDefaultList();
        NewsBaseAdapter adapter = new NewsBaseAdapter(this, newsList);
       // listView_news.setAdapter(adapter);

        clickandjump(R.id.news1_title);
        clickandjump(R.id.news2_title);
        clickandjump(R.id.news3_title);
        clickandjump(R.id.news4_title);
        clickandjump(R.id.news5_title);
        clickandjump(R.id.news6_title);
        clickandjump(R.id.news7_title);

        ClickImgBtnAndJump(me_tab_button,R.id.me_tab, me.class);
        ClickImgBtnAndJump(video_tab_button,R.id.video_tab, videopage.class);
        ClickImgBtnAndJump(add_button,R.id.add_btn, addnews.class);


        Button weather_button =findViewById(R.id.weather);//id后面为上方button的id

        weather_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(homepage.this, weather.class);
                startActivity(intent);
            }
        });



        LinearLayout searchlinear= (LinearLayout) findViewById(R.id.searchlinear);
        searchlinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(com.example.test.homepage.this, ScrollSearch.class);//this前面为当前activty名称，class前面为要跳转到得activity名称
                startActivity(intent);
            }
        });

    }
}