package com.example.gs.testnestscroll.myview;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.gs.testnestscroll.R;

import java.util.Random;

public class TestRecyclerViewAdapter extends RecyclerView.Adapter {
    private final RecyclerView mRv;

    public TestRecyclerViewAdapter(RecyclerView recyclerView) {
        mRv = recyclerView;
    }

    public int i = 0;

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Log.e("xie", "onCreateViewHolder:...");
        final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_item, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view, i);
//        Log.e("xie", "onCreateViewHolder item id:..." +myViewHolder.itemView.getId());
        i++;
        Log.e("xie", "onCreateViewHolder:..." + myViewHolder.tag);
        return myViewHolder;
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("xie", "__" + mRv.getChildCount());
            }
        });
        if (holder instanceof MyViewHolder) {
            ((MyViewHolder) holder).tv.setText("xx_" + ((MyViewHolder) holder).tag);
        }
//        Log.e("xie", "onBindViewHolder item id:...");
//        holder.shouldIgnore();
    }

    @Override
    public int getItemCount() {
        return 20;
    }

    // addView 调用
    @Override
    public void onViewAttachedToWindow(ViewHolder holder) {
//        Log.e("xie", "onAttached... AdapterPosition:" + holder.getAdapterPosition());
//        Log.e("xie", "onAttached... ItemId:" + holder.getItemId());
        super.onViewAttachedToWindow(holder);
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tv;
        public int id;
        public final String tag;

        public MyViewHolder(View view, int id) {
            super(view);
            tv = view.findViewById(R.id.text);
            this.id = id * 10;
            int rand = new Random().nextInt();
//            Log.e("xie", "rand:" + rand); //添加这个log,create就会变成7个
            tag = "**" + id + "**";
        }
    }
}
