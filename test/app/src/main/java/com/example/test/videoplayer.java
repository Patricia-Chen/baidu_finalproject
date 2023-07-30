package com.example.test;
import android.net.Uri;
import android.os.Bundle;


import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;


public class videoplayer extends AppCompatActivity {

    private VideoView mVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videoplayer);

        mVideo = findViewById(R.id.mvideo);
        //网络加载
        String uri = "android.resource://" + getPackageName() + "/" + R.raw.cat;
        mVideo.setVideoURI(Uri.parse(uri));
        //视屏控制器
        MediaController mediaController = new MediaController(videoplayer.this);
        //VideoView绑定控制器
        mVideo.setMediaController(mediaController);
        //获取焦点
        mVideo.requestFocus();
        //播放视频
        mVideo.start();
    }
    }
