package com.google.expandablerecyclerviewexample;

import android.content.DialogInterface;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bignerdranch.expandablerecyclerview.Model.ParentObject;
import com.google.expandablerecyclerviewexample.Adapter.MyAdapter;
import com.google.expandablerecyclerviewexample.Model.TitleChild;
import com.google.expandablerecyclerviewexample.Model.TitleCreator;
import com.google.expandablerecyclerviewexample.Model.TitleParent;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyAdapter adapter=new MyAdapter(this , initData());

        adapter.setParentClickableViewAnimationDefaultDuration();
        adapter.setParentAndIconExpandOnClick(true);

        recyclerView.setAdapter(adapter);
    }

    private List<ParentObject> initData() {

        TitleCreator titleCreator=TitleCreator.getInstance(this);

        List<TitleParent>titleParents=titleCreator.getAll();

        List<ParentObject>parentObjects=new ArrayList<>();

        for (TitleParent titleParent: titleParents){

      List<Object>childList=new ArrayList<>();

      childList.add(new TitleChild("Option 1" , "Option 2"));

      titleParent.setChildObjectList(childList);
      parentObjects.add(titleParent);

        }
        return parentObjects;
    }
}

