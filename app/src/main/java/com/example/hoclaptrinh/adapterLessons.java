package com.example.hoclaptrinh;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class adapterLessons extends ArrayAdapter<lesson> {
    private Context context;
    private int layout;
    private ArrayList<lesson> lessonArrayList;

    public adapterLessons(@NonNull Context context, int layout, @NonNull ArrayList<lesson> lessonArrayList) {
        super(context, layout, lessonArrayList);
        this.context = context;
        this.layout = layout;
        this.lessonArrayList = lessonArrayList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        viewHolder viewHolder;
        if (convertView == null){
            convertView = LayoutInflater.from(context).inflate(layout, parent, false);
            viewHolder = new viewHolder();
            viewHolder.txtChapter = convertView.findViewById(R.id.txtChapter);
            viewHolder.txtDescription = convertView.findViewById(R.id.txtDescription);
            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (viewHolder) convertView.getTag();
        }
        lesson lesson = lessonArrayList.get(position);
        viewHolder.txtChapter.setText(lesson.getChapter());
        viewHolder.txtDescription.setText(lesson.getDescription());
        return convertView;
    }
    public class viewHolder{
        TextView txtChapter;
        TextView txtDescription;
    }
}
