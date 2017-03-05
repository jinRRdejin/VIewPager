package com.cultraview.viewpager;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class VpSimpleFragment extends Fragment {

	
	private String mTitle;
	public static final String BUNDLE_TITLE = "title";
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		Bundle bunble = getArguments();
		if(bunble != null){
			mTitle = bunble.getString(BUNDLE_TITLE);
		}
		
		TextView tv = new TextView(getActivity());
		tv.setText(mTitle);
		tv.setGravity(Gravity.CENTER);
		return tv;
			
	}	
	
	public static VpSimpleFragment newInstance(String title){//fragrement ��Ҫ���������ʱ����ҪnewInstance
		
		Bundle bunble = new Bundle();  //Bundle ��һ��KER - Value ��
		bunble.putString(BUNDLE_TITLE, title);
		
		VpSimpleFragment fragment = new VpSimpleFragment();
		fragment.setArguments(bunble);   //setArguement ��������
		return fragment;
		
	}
}
