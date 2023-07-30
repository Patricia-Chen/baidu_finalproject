package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SimpleAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SpinnerIcon extends AppCompatActivity {
    private static final int[] iconArray = {
            R.drawable.conversation, R.drawable.rainfornews,
            R.drawable.english, R.drawable.train, R.drawable.book
    };
    private static final String[] starArray = {
            "习近平同阿尔及利亚总统特本会谈",
            "北方新一轮降雨今起发展 南方高温再度增强",
            "经济惨淡！多数英国人希望加强与欧盟联系，“后悔脱欧”成为热词",
            "山东莱荣高铁被举报：偷工减料暗藏重大安全隐患",
            "中国网络文学走出国门：16部作品首次入选大英图书馆馆藏"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_icon);
        List<Map<String, Object>> list = new ArrayList<>();
        for (int i = 0; i < iconArray.length; i++) {
            Map<String, Object> item = new HashMap<>();
            item.put("icon", iconArray[i]);
            item.put("title", starArray[i]);
            list.add(item);
        }
        SimpleAdapter startAdapter = new SimpleAdapter(this, list, R.layout.item_simple,
                new String[]{"icon", "title"},
                new int[]{R.id.iv_icon, R.id.tv_title});
        Spinner sp_icon=findViewById(R.id.sp_icon);
        sp_icon.setAdapter(startAdapter);
        sp_icon.setSelection(0);
    }
}