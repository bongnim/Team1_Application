package com.example.taxiorsubway;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

/**
 * Created by Belal on 2/3/2016.
 */
//Extending FragmentStatePagerAdapter
public class PageAdapter extends FragmentStatePagerAdapter{

    //integer to count number of tabs
    int tabCount;

    //Constructor to the class
    public PageAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        //Initializing tab count
        this.tabCount= tabCount;
    }

    //Overriding method getItem
    @Override
    public Fragment getItem(int position) {
        //Returning the current tabs
        switch (position) {
            case 0:
                TabOne tab1 = new TabOne();
                return tab1;
            case 1:
                TabTwo tab2 = new TabTwo();
                return tab2;
            case 2:
                TabThree tab3 = new TabThree();
                return tab3;
            default:
                return null;
        }
    }

    //Overriden method getCount to get the number of tabs
    @Override
    public int getCount() {
        return tabCount;
    }
}
