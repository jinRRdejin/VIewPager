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
         //չʾҳ������
	}

	@Override
	public boolean isViewFromObject(View arg0, Object arg1) {
		return arg0 == arg1;
	}
	
	@Override
	public  void destroyItem(ViewGroup container, int position, Object object) {
     
		container.removeView(pageList.get(position));
		//�����Ƴ�ָ���Ľ���
	}
	
	@Override
	public Object instantiateItem(ViewGroup container, int position) {
		container.addView(pageList.get(position));
		return pageList.get(position);
		
		//��ʼ��ָ��λ�õĽ��棬����Ҫ����ҳ�汾��ʶ���ҳ���KEY Ҳ���ԣ�

	}
	

}
