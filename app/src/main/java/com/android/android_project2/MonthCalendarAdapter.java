package com.android.android_project2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MonthCalendarAdapter extends FragmentStateAdapter{
    private static int NUM_ITEMS=100;
    public MonthCalendarAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        int year = position;   //수정 필요
        int month = position+1;   //수정 필요

        return MonthCalendarFragment.newInstance(year,month);
    }

    @Override
    public int getItemCount() {
        return NUM_ITEMS;
    }
}
