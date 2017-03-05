package com.example.viewpagertest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.cultraview.viewpager.ViewPagerIdicator;
import com.cultraview.viewpager.VpSimpleFragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Window;

public class MainActivity extends FragmentActivity {
	
	private ViewPager mViewPager;
	private ViewPagerIdicator mIdicator;
	
	private List<String> mtitle = Arrays.asList("¶ÌÐÅ","ÊÕ²Ø","ÍÆ¼ö");
	
	private List<VpSimpleFragment> mContent = new ArrayList<VpSimpleFragment>();
	private FragmentPagerAdapter mAdpater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        
        initViews();
        
        initDatas();
        
        mViewPager.setAdapter(mAdpater);
    }

	private void initDatas() {
		
		for(String title :mtitle){
			
			VpSimpleFragment fragment = VpSimpleFragment.newInstance(title);
			mContent.add(fragment);
		}
		
		
		mAdpater = new FragmentPagerAdapter(getSupportFragmentManager()) {
			
			@Override
			public int getCount() {
				return mContent.size();
			}
			
			@Override
			public Fragment getItem(int position) {
					
				return   mContent.get(position);
			}
		};
	}		
		
 

	private void initViews() {

	mViewPager = (ViewPager) findViewById(R.id.id_viewpager);
	mIdicator = (ViewPagerIdicator) findViewById(R.id.id_indicator);
	
	}

}
