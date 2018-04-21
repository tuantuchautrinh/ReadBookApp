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

public class EditBook extends AppCompatActivity {
    private EditText name, author, content;
    private ImageView image;
    MyDatabaseHelper data;
    private FloatingActionButton button;
    private int Image,Id;
    private Book book;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_book);

        Intent intent= getIntent();

        Image= intent.getIntExtra("IDImage",R.mipmap.avata);
//        image.setImageResource(Image);
        Id=intent.getIntExtra("Id",1);

        name =(EditText) findViewById(R.id.addTen);
        author =(EditText) findViewById(R.id.addTacGia);
        content =(EditText) findViewById(R.id.addNoiDung);
        image =(ImageView) findViewById(R.id.addImage);
        button = (FloatingActionButton) findViewById(R.id.fab) ;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EditBook.this,Image2.class);
                int MaSach=book.getID();
                intent.putExtra("Id",MaSach);
                startActivity(intent);
                 finish();
            }
        });

        data= new MyDatabaseHelper(EditBook.this,"BooksManager.sqlite",null,1);

        book=data.getBook(Id);
        name.setText(book.getName());
        author.setText(book.getAuthor());
        content.setText(book.getContext());
        Image=book.getImage();
        image.setImageResource(book.getImage());

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

                UpdateBook();

                break;
        }

        return super.onOptionsItemSelected(item);
    }

    public void UpdateBook()
    {
        String  Name = name.getText().toString();
        String Author = author.getText().toString();
        String   Content = content.getText().toString();
        int Images= Image;



        //Images = image;
        if(Author.isEmpty()==false && Name.isEmpty()==false)
        {
            data.Update(Name,Author,Content,Images,Id);
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


//        image.setImageResource(Image);
        int MaSach=intent.getIntExtra("Id",1);

        book=data.getBook(MaSach);
        name.setText(book.getName());
        author.setText(book.getAuthor());
        content.setText(book.getContext());
        Image=book.getImage();
        image.setImageResource(book.getImage());

    }
}
