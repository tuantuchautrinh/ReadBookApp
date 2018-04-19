package com.example.latitude.bookapp;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class AddNewBooks extends AppCompatActivity {
    private EditText name, author, content;
    private ImageView image;
    MyDatabaseHelper data;
    private FloatingActionButton button;
   private int Image;

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
        button = (FloatingActionButton) findViewById(R.id.fab) ;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddNewBooks.this,Image.class);
                startActivity(intent);
               // finish();
            }
        });

        Intent intent= getIntent();
        Image= intent.getIntExtra("IDImage",R.mipmap.avata);
        image.setImageResource(Image);


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
        int Images= Image;



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

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Intent intent= getIntent();
        Image= intent.getIntExtra("IDImage",R.mipmap.avata);
        image.setImageResource(Image);
    }
}
