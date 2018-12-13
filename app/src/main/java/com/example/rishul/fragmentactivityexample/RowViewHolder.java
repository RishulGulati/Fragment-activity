package com.example.rishul.fragmentactivityexample;

import android.support.v7.widget.RecyclerView;
import android.view.View;

public class RowViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {



    private RecyclerViewClickListener mListener;
    RowViewHolder(View v, RecyclerViewClickListener listener) {
        super(v);
        mListener = listener;
        v.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        mListener.onClick(v, getAdapterPosition());

    }
}