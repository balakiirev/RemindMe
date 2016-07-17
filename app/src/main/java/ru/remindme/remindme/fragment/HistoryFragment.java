package ru.remindme.remindme.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

import ru.remindme.remindme.R;
import ru.remindme.remindme.adapter.RemindListAdapter;
import ru.remindme.remindme.dto.DTORemind;

public class HistoryFragment extends AbstractTabFragment
{
    private static final int LAYOUT = R.layout.fragment_history;

    public static HistoryFragment getInstance(Context context)
    {
        Bundle args = new Bundle();
        HistoryFragment fragment = new HistoryFragment();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_item_history));

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState)
    {
        view = inflater.inflate(LAYOUT, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(new RemindListAdapter(createMockRemindListData()));

        return view;
    }

    private List<DTORemind> createMockRemindListData()
    {
        DTORemind remind1 = new DTORemind("Item 1");
        DTORemind remind2 = new DTORemind("Item 2");
        DTORemind remind3 = new DTORemind("Item 3");
        DTORemind remind4 = new DTORemind("Item 4");
        DTORemind remind5 = new DTORemind("Item 5");
        DTORemind remind6 = new DTORemind("Item 6");

        return Arrays.asList(remind1, remind2, remind3, remind4, remind5, remind6);
    }

    public void setContext(Context context)
    {
        this.context = context;
    }
}
