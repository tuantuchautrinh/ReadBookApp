package com.example.latitude.bookapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class Image2 extends AppCompatActivity {
    private ImageView imageView1,imageView2,imageView3,imageView4,imageView5,imageView6,
            imageView7,imageView8,imageView9,imageView10,
            imageView11,imageView12,imageView13,imageView14,imageView15,imageView16,imageView17,
            imageView18,imageView19,imageView20,imageView21,imageView22,imageView23,imageView24;
   private int ID;



    private List<ImageView> list;
    private MyDatabaseHelper data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        AnhXa();
        data= new MyDatabaseHelper(Image2.this,"BooksManager.sqlite",null,1);
        Intent intent=getIntent();
        int MaS=intent.getIntExtra("Id",0);
        ID=MaS;



    }
    public void ClickImage1(View view)
    {
        Intent intent= new Intent(Image2.this,EditBook.class);
        intent.putExtra("IDImage",R.mipmap.image1);
        startActivity(intent);
        //finish();
    }
    public void AnhXa()
    {

        imageView1= (ImageView) findViewById(R.id.image1);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Image2.this,EditBook.class);

                intent.putExtra("Id",ID);
               data.queryData("Update  Book SET Image='"+R.mipmap.image1+"' where Id='"+ID+"'");
                startActivity(intent);
                finish();
            }
        });

        imageView2= (ImageView) findViewById(R.id.image2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Image2.this,EditBook.class);

                intent.putExtra("Id",ID);
                data.queryData("Update  Book SET Image='"+R.mipmap.image2+"' where ID='"+ID+"'");
                startActivity(intent);
                finish();
            }
        });
        imageView3= (ImageView) findViewById(R.id.image3);

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Image2.this,EditBook.class);

                intent.putExtra("Id",ID);
                data.queryData("Update  Book SET Image='"+R.mipmap.image3+"' where ID='"+ID+"'");
                startActivity(intent);
                finish();
            }
        });
        imageView4= (ImageView) findViewById(R.id.image4);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Image2.this,EditBook.class);

                intent.putExtra("Id",ID);
                data.queryData("Update  Book SET Image='"+R.mipmap.image4+"' where ID='"+ID+"'");
                startActivity(intent);
                finish();
            }
        });
        imageView5= (ImageView) findViewById(R.id.image5);
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Image2.this,EditBook.class);
                intent.putExtra("IDImage",R.mipmap.image5);
                intent.putExtra("Id",ID);
                data.queryData("Update  Book SET Image='"+R.mipmap.image5+"' where ID='"+ID+"'");
                startActivity(intent);
                finish();
            }
        });
        imageView6= (ImageView) findViewById(R.id.image6);
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Image2.this,EditBook.class);
                intent.putExtra("IDImage",R.mipmap.image6);
                intent.putExtra("Id",ID);
                data.queryData("Update  Book SET Image='"+R.mipmap.image6+"' where ID='"+ID+"'");
                startActivity(intent);
                finish();
            }
        });
        imageView7= (ImageView) findViewById(R.id.image7);

        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Image2.this,EditBook.class);
                intent.putExtra("IDImage",R.mipmap.image7);
                intent.putExtra("Id",ID);
                data.queryData("Update  Book SET Image='"+R.mipmap.image7+" where ID='"+ID+"'");
                startActivity(intent);
                finish();
            }
        });

        imageView8= (ImageView) findViewById(R.id.image8);

        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Image2.this,EditBook.class);
                intent.putExtra("IDImage",R.mipmap.image8);
                intent.putExtra("Id",ID);
                data.queryData("Update  Book SET Image='"+R.mipmap.image8+"' where ID='"+ID+"'");
                startActivity(intent);
                finish();
            }
        });
        imageView9= (ImageView) findViewById(R.id.image9);
        imageView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Image2.this,EditBook.class);
                intent.putExtra("IDImage",R.mipmap.image9);
                intent.putExtra("Id",ID);
                data.queryData("Update  Book SET Image='"+R.mipmap.image9+"' where ID='"+ID+"'");
                startActivity(intent);
                finish();
            }
        });
        imageView10= (ImageView) findViewById(R.id.image10);
        imageView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Image2.this,EditBook.class);
                intent.putExtra("IDImage",R.mipmap.image10);
                intent.putExtra("Id",ID);
                data.queryData("Update  Book SET Image='"+R.mipmap.image10+"' where ID='"+ID+"'");
                startActivity(intent);
                finish();
            }
        });
        imageView11= (ImageView) findViewById(R.id.image11);
        imageView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Image2.this,EditBook.class);
                intent.putExtra("IDImage",R.mipmap.image11);
                intent.putExtra("Id",ID);
                data.queryData("Update  Book SET Image='"+R.mipmap.image11+"' where ID='"+ID+"'");
                startActivity(intent);
                finish();
            }
        });

        imageView12= (ImageView) findViewById(R.id.image12);
        imageView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Image2.this,EditBook.class);
                intent.putExtra("IDImage",R.mipmap.image12);
                intent.putExtra("Id",ID);
                data.queryData("Update  Book SET Image='"+R.mipmap.image12+"' where ID='"+ID+"'");
                startActivity(intent);
                finish();
            }
        });

        imageView13= (ImageView) findViewById(R.id.image13);
        imageView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Image2.this,EditBook.class);
                intent.putExtra("IDImage",R.mipmap.image13);
                intent.putExtra("Id",ID);
                data.queryData("Update  Book SET Image='"+R.mipmap.image13+"' where ID='"+ID+"'");
                startActivity(intent);
                finish();
            }
        });

        imageView14= (ImageView) findViewById(R.id.image14);
        imageView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Image2.this,EditBook.class);
                intent.putExtra("IDImage",R.mipmap.image14);intent.putExtra("Id",ID);
                data.queryData("Update  Book SET Image='"+R.mipmap.image14+"' where ID='"+ID+"'");
                startActivity(intent);
                finish();
            }
        });

        imageView15= (ImageView) findViewById(R.id.image15);
        imageView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Image2.this,EditBook.class);
                intent.putExtra("IDImage",R.mipmap.image15);
                intent.putExtra("Id",ID);
                data.queryData("Update  Book SET Image='"+R.mipmap.image15+"' where ID='"+ID+"'");
                startActivity(intent);
                finish();
            }
        });

        imageView16= (ImageView) findViewById(R.id.image16);
        imageView16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Image2.this,EditBook.class);
                intent.putExtra("IDImage",R.mipmap.image16);
                data.queryData("Update  Book SET Image='"+R.mipmap.image16+"' where ID='"+ID+"'");
                startActivity(intent);
                finish();
            }
        });

        imageView17= (ImageView) findViewById(R.id.image17);
        imageView17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Image2.this,EditBook.class);
                intent.putExtra("IDImage",R.mipmap.image17);
                intent.putExtra("Id",ID);
                data.queryData("Update  Book SET Image='"+R.mipmap.image17+"' where ID='"+ID+"'");
                startActivity(intent);
                finish();
            }
        });

        imageView18= (ImageView) findViewById(R.id.image18);
        imageView18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Image2.this,EditBook.class);
                intent.putExtra("IDImage",R.mipmap.image18);
                data.queryData("Update  Book SET Image='"+R.mipmap.image18+"' where ID='"+ID+"'");
                startActivity(intent);
                finish();
            }
        });

        imageView19= (ImageView) findViewById(R.id.image19);
        imageView19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Image2.this,EditBook.class);
                intent.putExtra("IDImage",R.mipmap.image19);
                intent.putExtra("Id",ID);
                data.queryData("Update  Book SET Image='"+R.mipmap.image19+"' where ID='"+ID+"'");
                startActivity(intent);
                finish();
            }
        });

        imageView20= (ImageView) findViewById(R.id.image20);
        imageView20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Image2.this,EditBook.class);
                intent.putExtra("IDImage",R.mipmap.image20);intent.putExtra("Id",ID);
                data.queryData("Update  Book SET Image='"+R.mipmap.image20+"' where ID='"+ID+"'");
                startActivity(intent);
                finish();
            }
        });

        imageView21= (ImageView) findViewById(R.id.image21);
        imageView21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Image2.this,EditBook.class);
                intent.putExtra("IDImage",R.mipmap.image21);
                intent.putExtra("Id",ID);
                data.queryData("Update  Book SET Image='"+R.mipmap.image21+"' where ID='"+ID+"'");
                startActivity(intent);
                finish();
            }
        });

        imageView22= (ImageView) findViewById(R.id.image22);
        imageView22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Image2.this,EditBook.class);
                intent.putExtra("IDImage",R.mipmap.image22);intent.putExtra("Id",ID);
                data.queryData("Update  Book SET Image='"+R.mipmap.image22+"' where ID='"+ID+"'");
                startActivity(intent);
                finish();
            }
        });

        imageView23= (ImageView) findViewById(R.id.image23);
        imageView23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Image2.this,EditBook.class);
                intent.putExtra("IDImage",R.mipmap.image24);intent.putExtra("Id",ID);
                data.queryData("Update  Book SET Image='"+R.mipmap.image24+"' where ID='"+ID+"'");
                startActivity(intent);
                finish();
            }
        });

        imageView24= (ImageView) findViewById(R.id.image24);
        imageView24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Image2.this,EditBook.class);
                intent.putExtra("IDImage",R.mipmap.image24);intent.putExtra("Id",ID);
                data.queryData("Update  Book SET Image='"+R.mipmap.image24+"' where ID='"+ID+"'");
                startActivity(intent);
                finish();
            }
        });

        imageView1.setImageResource(R.mipmap.image1);
        imageView2.setImageResource(R.mipmap.image2);
        imageView3.setImageResource(R.mipmap.image3);
        imageView4.setImageResource(R.mipmap.image4);
        imageView5.setImageResource(R.mipmap.image5);
        imageView6.setImageResource(R.mipmap.image6);
        imageView7.setImageResource(R.mipmap.image7);
        imageView8.setImageResource(R.mipmap.image8);
        imageView10.setImageResource(R.mipmap.image10);
        imageView11.setImageResource(R.mipmap.image11);
        imageView12.setImageResource(R.mipmap.image13);
        imageView14.setImageResource(R.mipmap.image14);
        imageView15.setImageResource(R.mipmap.image15);
        imageView16.setImageResource(R.mipmap.image16);
        imageView17.setImageResource(R.mipmap.image17);
        imageView18.setImageResource(R.mipmap.image18);
        imageView19.setImageResource(R.mipmap.image19);
        imageView20.setImageResource(R.mipmap.image20);
        imageView21.setImageResource(R.mipmap.image21);
        imageView22.setImageResource(R.mipmap.image22);
        imageView23.setImageResource(R.mipmap.image24);
        imageView24.setImageResource(R.mipmap.image24);


    }
}
