package ru.remindme.remindme.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import ru.remindme.remindme.fragment.ExampleFragment;

public class TabsPagerFragmentAdapter extends FragmentPagerAdapter
{
    private String[] tabs;

    public TabsPagerFragmentAdapter(FragmentManager fm)
    {
        super(fm);

        tabs = new String[] {"Tab 1", "Notification", "Tab 3"};
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        return tabs[position];
    }

    @Override
    public Fragment getItem(int position)
    {
        switch (position)
        {
            case 0:
                ExampleFragment.getInstance();

            case 1:
                ExampleFragment.getInstance();

            case 2:
                ExampleFragment.getInstance();
        }

        return ExampleFragment.getInstance();
    }

    @Override
    public int getCount()
    {
        return tabs.length;
    }
}
