package com.google.expandablerecyclerviewexample.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ParentViewHolder;
import com.google.expandablerecyclerviewexample.R;

public class TitleParentViewHolder extends ParentViewHolder {

    public TextView textView;
    public ImageView imageView;


    public TitleParentViewHolder(View itemView) {
        super(itemView);
        textView=itemView.findViewById(R.id.recycler_item);
        imageView=itemView.findViewById(R.id.imag_expand);
    }
}
