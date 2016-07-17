package ru.remindme.remindme.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.HashMap;
import java.util.Map;

import ru.remindme.remindme.fragment.AbstractTabFragment;
import ru.remindme.remindme.fragment.BirthdaysFragment;
import ru.remindme.remindme.fragment.HistoryFragment;
import ru.remindme.remindme.fragment.IdeasFragment;
import ru.remindme.remindme.fragment.TodoFragment;

public class TabsFragmentAdapter extends FragmentPagerAdapter
{
    private Map<Integer, AbstractTabFragment> tabs;
    private Context context;

    public TabsFragmentAdapter(Context context, FragmentManager fm)
    {
        super(fm);
        this.context = context;
        initTabsMap(context);
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        return tabs.get(position).getTitle();
    }

    @Override
    public Fragment getItem(int position)
    {
        return tabs.get(position);
    }

    @Override
    public int getCount()
    {
        return tabs.size();
    }

    private void initTabsMap(Context context)
    {
        if (tabs == null)
        {
            tabs = new HashMap<>();
        }

        tabs.put(0, HistoryFragment.getInstance(context));
        tabs.put(1, IdeasFragment.getInstance(context));
        tabs.put(2, TodoFragment.getInstance(context));
        tabs.put(3, BirthdaysFragment.getInstance(context));
    }
}
