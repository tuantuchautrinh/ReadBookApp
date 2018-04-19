package com.example.latitude.bookapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;

public class AddNewBooks extends AppCompatActivity {
    private EditText name, author, content;
    private ImageView image;
    MyDatabaseHelper data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_books);
        if(getSupportActionBar()!=null)
        {

            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        name =(EditText) findViewById(R.id.addTen);
        author =(EditText) findViewById(R.id.addTacGia);
        content =(EditText) findViewById(R.id.addNoiDung);
        image =(ImageView) findViewById(R.id.addImage);
        data= new MyDatabaseHelper(AddNewBooks.this,"BooksManager.sqlite",null,1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_check,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {

            case R.id.check:

                        addBook();

                break;
        }

        return super.onOptionsItemSelected(item);
    }

    public void addBook()
    {
        String  Name = name.getText().toString();
        String Author = author.getText().toString();
        String   Content = content.getText().toString();
        int Images= R.mipmap.avata;



        //Images = image;
        if(Author.isEmpty()==false && Name.isEmpty()==false)
        {
            data.Insert(Name,Author,Content,Images);
            finish();

        }
        else {

            if(Name.isEmpty())
            {
                name.setError("Tên sách không được trống");
                return;
            }

            if(Author.isEmpty())
            {
                author.setError("Tên tác giả không đươc trống ");
                return;
            }

        }

    }





}
