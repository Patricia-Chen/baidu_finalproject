package com.example.test.bean;

import com.example.test.R;

import java.util.ArrayList;
import java.util.List;

public class News {
    public String title;
    public String media;
    public int picture;

    public News(String title, String media, int picture) {
        this.title = title;
        this.media = media;
        this.picture = picture;
    }
    public String getTitle(){
        return this.title;
    }

    private static int[] pictureArray={
            R.drawable.conversation, R.drawable.rainfornews,
            R.drawable.english, R.drawable.train,
            R.drawable.book,R.drawable.wangyi,
            R.drawable.nuclear,R.drawable.yunnan,
            R.drawable.conversation, R.drawable.rainfornews,
            R.drawable.english, R.drawable.train,
            R.drawable.book,R.drawable.wangyi,
            R.drawable.nuclear,R.drawable.yunnan,
    };
    private static String[] titleArray={
           "习近平同阿尔及利亚总统特本会谈",
            "北方新一轮降雨今起发展 南方高温再度增强",
            "经济惨淡！多数英国人希望加强与欧盟联系，“后悔脱欧”成为热词",
            "山东莱荣高铁被举报：偷工减料暗藏重大安全隐患",
            "中国网络文学走出国门：16部作品首次入选大英图书馆馆藏",
            "百岁基辛格访华，王毅：美国对华政策需要基辛格式的外交智慧",
            "金与正讲话讨论朝美爆发核战争可能性，释放什么信号",
            "云南旅游负面频发，“拒绝记者参团”能解决问题吗？",
            "习近平同阿尔及利亚总统特本会谈",
            "北方新一轮降雨今起发展 南方高温再度增强",
            "经济惨淡！多数英国人希望加强与欧盟联系，“后悔脱欧”成为热词",
            "山东莱荣高铁被举报：偷工减料暗藏重大安全隐患",
            "中国网络文学走出国门：16部作品首次入选大英图书馆馆藏",
            "百岁基辛格访华，王毅：美国对华政策需要基辛格式的外交智慧",
            "金与正讲话讨论朝美爆发核战争可能性，释放什么信号",
            "云南旅游负面频发，“拒绝记者参团”能解决问题吗？",
    };
    private static String[] mediaArray={
            "新华社","新浪新闻","人民日报","新京报","腾讯新闻","外交部","澎湃新闻","视觉中国","陈泓雨","陈泓雨","陈泓雨","陈泓雨","陈泓雨","陈泓雨","陈泓雨","陈泓雨"};

    public static List<News> getDefaultList(){
        List<News> newsList=new ArrayList<>();
        for (int i = 0; i < pictureArray.length; i++) {
            newsList.add(new News(titleArray[i],mediaArray[i],pictureArray[i]));
        }
        return newsList;
    }
}
