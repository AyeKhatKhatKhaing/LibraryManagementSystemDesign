package com.example.librarymanagementsystemdesign;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;



public class viewPagerAdapter extends FragmentPagerAdapter {
    Fragment fragment=null;
    String Title=null;
    public viewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                fragment=new AllBookFragment();
                break;
            case 1:
                fragment=new CategoryFragment();
                break;
            case 2:
                fragment=new AccountSettingFragment();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position)
        {
            case 0:
                Title="All Book";
                break;
            case 1:
                Title="Category";

                break;
            case 2:
                Title="Account";

                break;

        }
        return Title;
    }
}
