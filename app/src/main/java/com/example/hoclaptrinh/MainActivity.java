package com.example.hoclaptrinh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.lvLessons);
        ArrayList<lesson> lessonArrayList = new ArrayList<lesson>();
        lessonArrayList.add(new lesson("Bài 1", "Tổng quan về lập trình Android"));
        lessonArrayList.add(new lesson("Bài 2", "các activity, fragment và intent"));
        lessonArrayList.add(new lesson("Bài 3", "Xây dựng giao diện người dùng"));
        lessonArrayList.add(new lesson("Bài 3", "Xây dựng giao diện người dùng"));
        lessonArrayList.add(new lesson("Bài 3", "Xây dựng giao diện người dùng"));
        lessonArrayList.add(new lesson("Bài 3", "Xây dựng giao diện người dùng"));
        lessonArrayList.add(new lesson("Bài 1", "Tổng quan về lập trình Android"));
        lessonArrayList.add(new lesson("Bài 2", "các activity, fragment và intent"));
        lessonArrayList.add(new lesson("Bài 3", "Xây dựng giao diện người dùng"));
        lessonArrayList.add(new lesson("Bài 3", "Xây dựng giao diện người dùng"));
        lessonArrayList.add(new lesson("Bài 3", "Xây dựng giao diện người dùng"));
        lessonArrayList.add(new lesson("Bài 3", "Xây dựng giao diện người dùng"));
        lessonArrayList.add(new lesson("Bài 1", "Tổng quan về lập trình Android"));
        lessonArrayList.add(new lesson("Bài 2", "các activity, fragment và intent"));
        lessonArrayList.add(new lesson("Bài 3", "Xây dựng giao diện người dùng"));
        lessonArrayList.add(new lesson("Bài 3", "Xây dựng giao diện người dùng"));
        lessonArrayList.add(new lesson("Bài 3", "Xây dựng giao diện người dùng"));
        lessonArrayList.add(new lesson("Bài 3", "Xây dựng giao diện người dùng"));
        lessonArrayList.add(new lesson("Bài 1", "Tổng quan về lập trình Android"));
        lessonArrayList.add(new lesson("Bài 2", "các activity, fragment và intent"));
        lessonArrayList.add(new lesson("Bài 3", "Xây dựng giao diện người dùng"));
        lessonArrayList.add(new lesson("Bài 3", "Xây dựng giao diện người dùng"));
        lessonArrayList.add(new lesson("Bài 3", "Xây dựng giao diện người dùng"));
        lessonArrayList.add(new lesson("Bài 3", "Xây dựng giao diện người dùng"));
        adapterLessons aptLessons = new adapterLessons(this, R.layout.lv_lesson, lessonArrayList);
        lv.setAdapter(aptLessons);
    }
}
