package com.example.tagcloudviewdemo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.moxun.tagcloudlib.view.TagsAdapter;

import java.util.List;

/**
 * Created by Administrator on 2016/12/30.
 */

public class CursorTagsAdapter extends TagsAdapter{
    private List<String> mList;

    public CursorTagsAdapter(List<String> mList) {
        this.mList = mList;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public View getView(Context context, int position, ViewGroup parent) {
        TextView tv = (TextView) View.inflate(context, R.layout.item_layout, null);
        tv.setText(getItem(position));
        return tv;
    }

    @Override
    public String getItem(int position) {
        return mList.get(position);
    }

    @Override
    public int getPopularity(int position) {
        return 1;
    }

    @Override
    public void onThemeColorChanged(View view, int themeColor) {

    }
}
