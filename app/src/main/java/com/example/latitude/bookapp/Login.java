package com.example.latitude.bookapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private MyDatabaseHelper data;
    private Button BtnLogin;
    private EditText Email,PassWord;
    private String email,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        data= new MyDatabaseHelper(Login.this,"BooksManager.sqlite",null,1);
        data.getWritableDatabase();

        BtnLogin=(Button) findViewById(R.id.email_sign_in_button);
        Email=(EditText) findViewById(R.id.email);
        PassWord=(EditText) findViewById(R.id.password);




        BtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email=Email.getText().toString();
                pass=PassWord.getText().toString();
                if(data.CheckUser(email,pass)==true)
                {

                    Intent intent= new Intent(Login.this,MainActivity.class);
                    startActivity(intent);
                }
                else {
                    Toast toast= Toast.makeText(Login.this,"Email hoặc Pass không chính xác !!!",Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

    }
}
