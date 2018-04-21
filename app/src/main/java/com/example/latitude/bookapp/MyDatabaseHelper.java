package com.example.latitude.bookapp;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public  class MyDatabaseHelper extends SQLiteOpenHelper {
    private static final String TAG ="SQLite";

    //Phiên bản
    private static final int DATABASE_VERSION = 1;

    //Tên cơ sở dữ liệu
    private static final String DATABASE_NAME = "Book_Manager";

    //Tên bảng: Book.
    private static final String TABLE_BOOK = "Book";

    private static final String COLUMN_BOOK_ID = "Book_Id";
    private static final String COLUMN_BOOK_NAME = "Book_Name";
    private static final String COLUMN_BOOK_IMAGE = "Book_Image";
    private static final String COLUMN_BOOK_AUTHOR = "Book_Author";
    private static final String COLUMN_BOOK_CONTENT = "Book_Content";



    public MyDatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.i(TAG,"MyDatabaseHelper.onCreate...");
        //Script tạo bảng.
        String script = "CREATE TABLE" + TABLE_BOOK + "(" + COLUMN_BOOK_ID + "INTERGER PRIMARY KEY," + COLUMN_BOOK_NAME + "TEXT," + COLUMN_BOOK_IMAGE + "," + COLUMN_BOOK_AUTHOR + "TEXT," + COLUMN_BOOK_CONTENT + "TEXT" + ")";
        //Chạy lệnh tạo bảng
        String query="CREATE TABLE Book ( ID INTEGER PRIMARY KEY AUTOINCREMENT, Name VARCHAR (200) NOT NULL, Author VARCHAR (50) NOT NULL, Content TEXT, Image INTEGER );";
        String query2="INSERT INTO Book ( Name, Author, Content, Image ) VALUES ( 'Harry pỏter', 'abc', 'Content', '"+R.mipmap.avata+"' );";
        String query3="INSERT INTO Book ( Name, Author, Content, Image ) VALUES ( 'Harry pỏter', 'abc', 'Content', '"+R.mipmap.avata+"' );";
        String query4="INSERT INTO Book ( Name, Author, Content, Image ) VALUES ( 'Harry pỏter', 'abc', 'Content', '"+R.mipmap.avata+"' );";
        String query5="INSERT INTO Book ( Name, Author, Content, Image ) VALUES ( 'Harry pỏter', 'abc', 'Content', '"+R.mipmap.avata+"' );";
        String query6="INSERT INTO Book ( Name, Author, Content, Image ) VALUES ( 'Harry pỏter', 'abc', 'Content', '"+R.mipmap.avata+"' );";
        String query7="INSERT INTO Book ( Name, Author, Content, Image ) VALUES ( 'Harry pỏter', 'abc', 'Content', '"+R.mipmap.avata+"' );";
        String query8="CREATE TABLE IF NOT EXISTS TaiKhoan(ID INTEGER PRIMARY KEY AUTOINCREMENT,Email TEXT not null unique, PASSWORD TEXT);";
        String query9="INSERT INTO  TaiKhoan(Email,PASSWORD) VALUES('user@gmail.com','Admin');";
        String query12="INSERT INTO  TaiKhoan(Email,PASSWORD) VALUES('User1@gmail.com','123123');";
        String query11="INSERT INTO  TaiKhoan(Email,PASSWORD) VALUES('User2@gmail.com','123123');";
        db.execSQL(query);
        db.execSQL(query8);
        db.execSQL(query9);
        db.execSQL(query12);
        db.execSQL(query11);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        Log.i(TAG, "MyDatabaseHelper.onUpgrade...");

        //Hủy (drop) bảng cũ nếu nó đã tồn tại.
      //  db.exeSQL("")
    }
    public void queryData(String query)
    {
        SQLiteDatabase sqLiteDatabase= getWritableDatabase();
        sqLiteDatabase.execSQL(query);

    }
    public Cursor getData(String query)
    {
        SQLiteDatabase sqLiteDatabase= getReadableDatabase();
        return sqLiteDatabase.rawQuery(query,null);
    }



    public List<Book> GetListBooks(List<Book> list)
    {
        String query ="select * from book";
        String Name,Author,content;
        int Id,Images;
        Cursor cursor = getData(query);
        while ((cursor.moveToNext()))
        {
            Id= cursor.getInt(0);
            Name= cursor.getString(1);
            Author=cursor.getString(2);
            content=cursor.getString(3);
            Images=cursor.getInt(4);
            list.add(new Book(Id,Name,Author,content,Images));

        }
        return list;

    }


    public void Insert(String Name,String Author,String Content,int Images)

    {
        String query = "INSERT INTO Book ( Name, Author, Content, Image ) VALUES ( '"+Name+"', '"+Author+"', '"+Content+"', '"+Images+"' );";
        queryData(query);
    }
    public List<Book> GetDetails(List<Book> list,int Id) {
        String query = "select * from book where Id='" + Id + "'";
        String Name, Author, content;
        int Images;
        Cursor cursor = getData(query);
        while ((cursor.moveToNext())) {
            Id = cursor.getInt(0);
            Name = cursor.getString(1);
            Author = cursor.getString(2);
            content = cursor.getString(3);
            Images = cursor.getInt(4);
            list.add(new Book(Id, Name, Author, content, Images));

        }
        return list;
    }

    public boolean CheckUser (String Email, String password){
        String query = "select *  from TaiKhoan where Email='"+Email+"' and PassWord='"+password+"'";
        Cursor cursor = getData(query);
        int cursorCount = cursor.getCount();
//        database.close();
        if (cursorCount > 0) {
            return true;
        }

        return false;

    }
    public Book getBook(int Id)
    {
        Cursor cursor=getData("select * from Book where Id='"+Id+"'");
        cursor.moveToLast();
        Book book= new Book(cursor.getInt(0),cursor.getString(1),cursor.getString(2),cursor.getString(3),cursor.getInt(4));
        return book;
    }


    public void Update(String Name,String Author,String Content,int Images,int Id)

    {
        String query = "Update  Book SET Name='"+Name+"', Author='"+Author+"', Content='"+Content+"', Image='"+Images+"' where Id='"+Id+"'";
        queryData(query);
    }
    public void Delete(int Id)

    {
        String query = "DELETE FROM Book WHERE ID='"+Id+"'";
        queryData(query);
    }


}
