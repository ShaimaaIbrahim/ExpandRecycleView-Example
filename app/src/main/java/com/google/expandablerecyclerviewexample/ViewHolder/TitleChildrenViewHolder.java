package com.google.expandablerecyclerviewexample.ViewHolder;

import android.view.View;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ChildViewHolder;
import com.google.expandablerecyclerviewexample.R;

public class TitleChildrenViewHolder extends ChildViewHolder {

    public TextView textView;
    public TextView textView1;
    public TextView textView2;

    public TitleChildrenViewHolder(View itemView) {
        super(itemView);
        textView=itemView.findViewById(R.id.option1);
        textView1=itemView.findViewById(R.id.option2);
        textView2=itemView.findViewById(R.id.option3);
    }
}
