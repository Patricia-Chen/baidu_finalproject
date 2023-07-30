package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Context;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.Arrays;
import java.util.LinkedList;
public class SpinnerDropDown extends AppCompatActivity {
    private final static String[] starArray={"金","木","水","火","土"};
    private Spinner sp_dropdown;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        sp_dropdown=findViewById(R.id.sp_dropdown);
        //声明一个下拉列表的数组适配器，作用是打包
        ArrayAdapter<String> startAdapter= new ArrayAdapter<>(this,R.layout.item_select,starArray);
        sp_dropdown.setAdapter(startAdapter);
        //设置下拉框默认第一项
        sp_dropdown.setSelection(0);
        //给下拉框设置选择监听器，一旦用户选中某一项，就触发监听器的onItemSelected方法
    }
    public void onItemSelected(AdapterView<?>parent, View view, int position, long id){

    }
}