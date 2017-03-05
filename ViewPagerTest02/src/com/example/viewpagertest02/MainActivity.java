package com.example.viewpagertest02;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.Window;

public class MainActivity extends Activity {
	
	private myPagerAdapter mAdapter;
	private View page1,page2,page3;
	private List<View> pageList;//数据源就是包含三个View的一个List
	
	private ViewPager mViewPager;//视图就是一个ViewPager

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//    	requestWindowFeature(Window.FEATURE_NO_TITLE);
    	requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        mViewPager = (ViewPager) findViewById(R.id.myViewPager);
        
        LayoutInflater inflater = getLayoutInflater();
        page1 = inflater.inflate(R.layout.pageo1, null);
        page2 = inflater.inflate(R.layout.pageo2, null);
        page3 = inflater.inflate(R.layout.pageo3, null);
        
        pageList = new ArrayList<View>();
        pageList.add(page1);
        pageList.add(page2);
        pageList.add(page3);
        
        mAdapter = new myPagerAdapter(pageList);//适配器
        mViewPager.setAdapter(mAdapter);
        
    }
}
