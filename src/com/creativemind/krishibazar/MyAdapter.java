package com.creativemind.krishibazar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyAdapter extends FragmentPagerAdapter {

	public MyAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int arg0) {
		Fragment fragment = null;
		if (arg0 == 0) {
			fragment = new RawMaterialFragment();
		}
		else if(arg0 == 1) {
			fragment = new ProducedMaterialFragment();
		}
		return fragment;
	}

	@Override
	public int getCount() {
		return 2;
	}

}
