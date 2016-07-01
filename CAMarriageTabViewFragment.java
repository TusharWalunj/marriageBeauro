package com.android.communityapp.fragment;


import android.app.Fragment;
import android.os.Bundle;
import android.support.design.widget.TabLayout;



import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.communityapp.R;
import com.android.communityapp.adapter.CATabViewAdapter;

/**
 * Created by user on 6/30/2016.
 */
public class CAMarriageTabViewFragment extends Fragment {
   
    private TabLayout tabLayout;
    private ViewPager viewPager;

    public CAMarriageTabViewFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View mRootView = inflater.inflate(R.layout.tabview_fragment, container, false);

        viewPager = (ViewPager)mRootView.findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout)mRootView.findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        return (mRootView);
    }

    private void setupViewPager(ViewPager viewPager) {
        CATabViewAdapter adapter = new CATabViewAdapter(getSupportFragmentManager());
        adapter.addFragment(new CABoyFragment(),getResources().getString(R.string.groom));
        adapter.addFragment(new CAGirlFragment(),getResources().getString(R.string.bride));
        viewPager.setAdapter(adapter);


    }


}