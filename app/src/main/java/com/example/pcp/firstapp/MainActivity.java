package com.example.pcp.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import android.widget.LinearLayout;



public class MainActivity extends AppCompatActivity  {

    private List<Lesson> lessonList = new ArrayList<>();
    private RecyclerView recyclerview;
    private LessonAdapter LA;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      recyclerview=(RecyclerView)findViewById(R.id.ReView);
        LA=new LessonAdapter(lessonList);
        recyclerview.setHasFixedSize(true);
        RecyclerView.LayoutManager lLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerview.setLayoutManager(lLayoutManager);
        recyclerview.addItemDecoration(new DividerItemDecoration(this,LinearLayoutManager.VERTICAL));
        recyclerview.setItemAnimator(new DefaultItemAnimator());
        recyclerview.setAdapter(LA);

        recyclerview.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerview, new ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Lesson lesson = lessonList.get(position);
                Toast.makeText(getApplicationContext(), lesson.getTitle() + " is selected!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
        prepareLessonData();
    }

   private void prepareLessonData(){
        Lesson lesson=new Lesson("LayOuts","The first Lesson Of layouts","21/12/2016");
        lessonList.add(lesson);
       lesson=new Lesson("LinearLayouts","How to use it","22/12/2016");
       lessonList.add(lesson);
       lesson=new Lesson("Views","Type of views ","23/12/2016");
       lessonList.add(lesson);
       lesson=new Lesson("Text View","how to use it ","24/12/2016");
       lessonList.add(lesson);
       lesson=new Lesson("ImageView ","How to use it","25/12/2016");
       lessonList.add(lesson);
       lesson=new Lesson("RecyclerView","How to use it ","27/12/2016");
       lessonList.add(lesson);
       lesson=new Lesson("Activity","The Main Activity ","30/12/2016");
       lessonList.add(lesson);
       lesson=new Lesson("Fragment","How to Use Fragments","4/1/2016");
       lessonList.add(lesson);
       LA.notifyDataSetChanged();

    }


}
