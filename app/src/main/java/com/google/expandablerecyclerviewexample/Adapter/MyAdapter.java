package com.google.expandablerecyclerviewexample.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bignerdranch.expandablerecyclerview.Adapter.ExpandableRecyclerAdapter;
import com.bignerdranch.expandablerecyclerview.Model.ParentObject;
import com.google.expandablerecyclerviewexample.Model.TitleChild;
import com.google.expandablerecyclerviewexample.Model.TitleParent;
import com.google.expandablerecyclerviewexample.R;
import com.google.expandablerecyclerviewexample.ViewHolder.TitleChildrenViewHolder;
import com.google.expandablerecyclerviewexample.ViewHolder.TitleParentViewHolder;

import java.util.List;

public class MyAdapter extends ExpandableRecyclerAdapter<TitleParentViewHolder , TitleChildrenViewHolder> {

    private LayoutInflater inflater;

    public MyAdapter(Context context, List<ParentObject> parentItemList) {
        super(context, parentItemList);
        inflater=LayoutInflater.from(context);
    }

    @Override
    public TitleParentViewHolder onCreateParentViewHolder(ViewGroup viewGroup) {
        View view= inflater.inflate(R.layout.list_parent , viewGroup ,false);

        return new TitleParentViewHolder(view);
    }

    @Override
    public TitleChildrenViewHolder onCreateChildViewHolder(ViewGroup viewGroup) {
      View view=inflater.inflate(R.layout.list_child , viewGroup ,false);
      return new TitleChildrenViewHolder(view);
    }

    @Override
    public void onBindParentViewHolder(TitleParentViewHolder titleParentViewHolder, int i, Object o) {

        TitleParent parent=(TitleParent)o;
        titleParentViewHolder.textView.setText(parent.getTitle());
    }

    @Override
    public void onBindChildViewHolder(TitleChildrenViewHolder titleChildrenViewHolder, int i, Object o) {
        TitleChild titleChild=(TitleChild)o;
        titleChildrenViewHolder.textView.setText(titleChild.getOption1());
        titleChildrenViewHolder.textView1.setText(titleChild.getOption2());
      //  titleChildrenViewHolder.textView2.setText(titleChild.getOption2());

    }
}
