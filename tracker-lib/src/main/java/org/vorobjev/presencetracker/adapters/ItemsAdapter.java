package org.vorobjev.presencetracker.adapters;

import android.app.Activity;
import android.view.View;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.Collection;

public class ItemsAdapter<T> extends ArrayAdapter<T> {

    protected Activity mContext;

    public ItemsAdapter(Activity context, int layoutID, Collection<T> list) {
        super(context, layoutID, new ArrayList<>(list));
        mContext = context;
    }

    public void updateData(Collection<T> newList) {
        clear();
        addAll(newList);
    }

    protected View updateVisibility(View view, T item) {
        // set visibility if needed
        return view;
    }
}
