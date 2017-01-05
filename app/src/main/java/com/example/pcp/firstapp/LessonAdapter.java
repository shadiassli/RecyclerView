package com.example.pcp.firstapp;

/**
 * Created by Pcp on 05/01/2017.
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

public class LessonAdapter extends RecyclerView.Adapter<LessonAdapter.MyViewHolder>{

private List<Lesson> lessonList;

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView title , year,genre;
        public MyViewHolder(View view ){
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            genre = (TextView) view.findViewById(R.id.subject);
            year = (TextView) view.findViewById(R.id.date);

        }


    }
    public LessonAdapter(List<Lesson> lessonList){
        this.lessonList=lessonList;

    }
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView=LayoutInflater.from(parent.getContext()).inflate(R.layout.lesson_list,parent,false);
        return new MyViewHolder(itemView);

    }



    public void onBindViewHolder(MyViewHolder holder, int position) {
        Lesson lesson = lessonList.get(position);
        holder.title.setText(lesson.getTitle());
        holder.genre.setText(lesson.getSubject());
        holder.year.setText(lesson.getDate());
    }

    public int getItemCount(){

        return lessonList.size();

    }
}
