package com.example.latitude.bookapp;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class ScrollView extends AppCompatActivity {
    int Id,Images;
    MyDatabaseHelper data;
    String Name, Author, content;
    TextView Title,Content;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view);


        Title = (TextView) findViewById(R.id.Title);
        Content=(TextView) findViewById(R.id.Content);
        Intent intent= getIntent();
        Id= intent.getIntExtra("Id",0);

        data= new MyDatabaseHelper(ScrollView.this,"BooksManager.sqlite",null,1);

        String query = "select * from book where Id='" + Id + "'";


        Cursor cursor = data.getData(query);
        while ((cursor.moveToNext())) {
            Id = cursor.getInt(0);
            Name = cursor.getString(1);
            Author = cursor.getString(2);
            content = cursor.getString(3);
            Images = cursor.getInt(4);
            //list.add(new Book(Id, Name, Author, content, Images));

        }
        Title.setText(Name);
        Content.setText(content);
     //   return list;






    }
}
