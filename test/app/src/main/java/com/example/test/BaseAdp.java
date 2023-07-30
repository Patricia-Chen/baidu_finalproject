package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

import com.example.test.adapter.NewsBaseAdapter;
import com.example.test.bean.News;

import java.util.List;

public class BaseAdp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_adp);
        Spinner sp_base_news=findViewById(R.id.sp_base_news);

        List<News> newsList= News.getDefaultList();
        NewsBaseAdapter adapter=new NewsBaseAdapter(this,newsList);
        sp_base_news.setAdapter(adapter);
        sp_base_news.setSelection(0);
    }
}