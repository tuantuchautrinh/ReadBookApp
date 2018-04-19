package com.example.latitude.bookapp;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lvContact;
    private List<Book> listContact = new ArrayList<>();
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;

    MyDatabaseHelper database;


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(actionBarDrawerToggle.onOptionsItemSelected(item))
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
          actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.Open, R.string.Close);
         drawerLayout.addDrawerListener(actionBarDrawerToggle);
         actionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);






        //Bước 1: Tạo data
       // initData();

        database= new MyDatabaseHelper(MainActivity.this,"BooksManager.sqlite",null,1);
        database.getWritableDatabase();
        listContact.clear();
        database.GetListBooks(listContact);

        //Bước 2: Tạo adapter ở ví dụ này chúng ta tự tạo một Adapter không phụ thuộc vào Adapter có sẵn
        BookApdapter adapter = new BookApdapter(listContact, this);

        //Bước 3: Tạo ListView Sét adapter vào ListView
        lvContact = (ListView) findViewById(R.id.listbook);
        lvContact.setAdapter(adapter);
        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,ScrollView.class);
                intent.putExtra("Id",listContact.get(position).getID());
                startActivity(intent);
            }
        });
        NavigationView navigationView= (NavigationView) findViewById(R.id.nav_menu);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id=item.getItemId();
                switch (id)
                {
                    case R.id.ThemMoi:
                        Intent intent = new Intent(MainActivity.this,AddNewBooks.class);
                        startActivity(intent);
                        break;

                }

                return true;
            }
        });


    }

    public void initData() {

        listContact.add(new Book(1,"harry potter","abc" ,"J. K. Rowling", R.drawable.avatar1));
        listContact.add(new Book(1,"harry potter","abc" ,"J. K. Rowling", R.drawable.avatar1));
        listContact.add(new Book(1,"harry potter","abc" ,"J. K. Rowling", R.drawable.avatar1));
        listContact.add(new Book(1,"harry potter","abc" ,"J. K. Rowling", R.drawable.avatar1));
        listContact.add(new Book(1,"harry potter","abc" ,"J. K. Rowling", R.drawable.avatar1));
        listContact.add(new Book(1,"harry potter","abc" ,"J. K. Rowling", R.drawable.avatar1));
        listContact.add(new Book(1,"harry potter","abc" ,"J. K. Rowling", R.drawable.avatar1));
        listContact.add(new Book(1,"harry potter","abc" ,"J. K. Rowling", R.drawable.avatar1));
        listContact.add(new Book(1,"harry potter","abc" ,"J. K. Rowling", R.drawable.avatar1));
        listContact.add(new Book(1,"harry potter","abc" ,"J. K. Rowling", R.drawable.avatar1));

    }

    @Override
    protected void onResume() {
        listContact.clear();

        database.GetListBooks(listContact);

        //Bước 2: Tạo adapter ở ví dụ này chúng ta tự tạo một Adapter không phụ thuộc vào Adapter có sẵn
        BookApdapter adapter = new BookApdapter(listContact, this);

        //Bước 3: Tạo ListView Sét adapter vào ListView
        lvContact = (ListView) findViewById(R.id.listbook);
        lvContact.setAdapter(adapter);


        super.onResume();
    }
}
