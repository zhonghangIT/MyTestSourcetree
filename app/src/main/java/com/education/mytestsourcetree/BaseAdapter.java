package com.education.mytestsourcetree;

import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by zhonghang on 16/7/12.
 */

public class BaseAdapter extends RecyclerView.Adapter<BaseAdapter.MyViewHodler> {
    private int[] array = {1, 2, 3, 4, 5, 6, 7};

    @Override
    public MyViewHodler onCreateViewHolder(ViewGroup parent, int viewType) {
        MyViewHodler viewHodler = null;
        if (viewType == 0) {
            viewHodler = new MyViewHodler(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_left, null));
        } else if (viewType == 1) {
            viewHodler = new MyViewHodler(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_right, null));
        }
        return viewHodler;
    }

    @Override
    public void onBindViewHolder(MyViewHodler holder, int position) {

    }

    @Override
    public int getItemViewType(int position) {
        return array[position] % 2;
    }

    @Override
    public int getItemCount() {
        return array.length;
    }

    class MyViewHodler extends RecyclerView.ViewHolder {

        public MyViewHodler(View itemView) {
            super(itemView);
        }
    }
}
