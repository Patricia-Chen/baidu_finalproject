package com.example.test.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.test.R;
import com.example.test.bean.News;

import java.util.List;

public class NewsBaseAdapter extends BaseAdapter {

    private Context mContext;
    private List<News> mNewsList;
    public NewsBaseAdapter(Context mContext, List<News> mNewsList) {
        this.mContext = mContext;
        this.mNewsList = mNewsList;
    }

    @Override
    public int getCount() {
        return mNewsList.size();
    }

    @Override
    public Object getItem(int position) {
        return mNewsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=LayoutInflater.from(mContext).inflate(R.layout.item_list,null);
        ImageView news_picture=view.findViewById(R.id.news_picture);
        TextView news_title= view.findViewById(R.id.news_title);
        TextView news_media= view.findViewById(R.id.news_media);

        News news =mNewsList.get(position);
        news_picture.setImageResource(news.picture);
        news_title.setText(news.title);
        news_media.setText(news.media);
        return view;
    }

}
