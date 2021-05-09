package com.android.android_project2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.Calendar;

import static java.lang.Math.abs;

public class MonthCalendarAdapter extends FragmentStateAdapter{
    private static int NUM_ITEMS=100;

    public MonthCalendarAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Calendar cal = Calendar.getInstance();
        int year = Calendar.getInstance().get(Calendar.YEAR);   //수정 필요
        int month = Calendar.getInstance().get(Calendar.MONTH)+1;   //수정 필요

        int move = position - NUM_ITEMS;
        int bias;
            if(move < 0)
                bias=-1;
            else {
                bias=1;
            }
        int moveYear = abs(move) / 12 * bias;
        int moveMonth = abs(move) % 12 * bias;

        year += moveYear;
      //  Calendar.getInstance().get(Calendar.YEAR);
     //   month = Calendar.getInstance().get(Calendar.MONTH);
        //day = Calendar.getInstance().get(Calendar.DATE);

        return MonthCalendarFragment.newInstance(year,month);
    }

    @Override
    public int getItemCount() {
        return NUM_ITEMS;
    }


}
