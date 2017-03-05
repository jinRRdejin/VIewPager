package com.example.viewpagertest02;

import java.util.List;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

public class myPagerAdapter extends PagerAdapter {
	
	private List<View>  pageList;
	
	public myPagerAdapter(List<View>  pageList){
		this.pageList = pageList;
	}
	@Override
	public int getCount() {

		return pageList.size();
         //展示页面数量
	}

	@Override
	public boolean isViewFromObject(View arg0, Object arg1) {
		return arg0 == arg1;
	}
	
	@Override
	public  void destroyItem(ViewGroup container, int position, Object object) {
     
		container.removeView(pageList.get(position));
		//负责移除指定的界面
	}
	
	@Override
	public Object instantiateItem(ViewGroup container, int position) {
		container.addView(pageList.get(position));
		return pageList.get(position);
		
		//初始化指令位置的界面，并需要返回页面本身（识别该页面的KEY 也可以）

	}
	

}
