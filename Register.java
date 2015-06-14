package com.example.angelyu.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Register extends ActionBarActivity implements View.OnClickListener{

    EditText fname, lname, email, phoneNo, password;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        fname = (EditText) findViewById(R.id.fname);
        lname = (EditText) findViewById(R.id.lname);
        email = (EditText) findViewById(R.id.email);
        phoneNo = (EditText) findViewById(R.id.phoneNo);
        register = (Button) findViewById(R.id.register);

        register.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.register:
                String firstname = fname.getText().toString();
                String lastname = lname.getText().toString();
                String emailadd = email.getText().toString();
                String phonenum = phoneNo.getText().toString();
                String pw = password.getText().toString();

                User newUser = new User(firstname,lastname,emailadd,phonenum,pw);

                startActivity(new Intent(this, WelcomePage.class));
                break;
        }
    }

}
