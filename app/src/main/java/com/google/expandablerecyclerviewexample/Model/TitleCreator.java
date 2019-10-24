package com.google.expandablerecyclerviewexample.Model;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class TitleCreator {

    public static TitleCreator titleCreator;
    public List<TitleParent>titleParents;

    public TitleCreator(Context context) {
         titleParents=new ArrayList<>();

         for (int i=1; i<3 ; ++i){

           TitleParent parent=new TitleParent(String.format("caller $", i));
           titleParents.add(parent);
         }
    }


    public static TitleCreator getInstance(Context context){

        if (titleCreator==null){
            titleCreator=new TitleCreator(context);
        }
        return titleCreator;
    }

    public List<TitleParent> getAll() {
        return titleParents;
    }



}
