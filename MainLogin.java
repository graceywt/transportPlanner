package com.example.angelyu.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.angelyu.myapplication.R.*;


public class MainLogin extends ActionBarActivity implements View.OnClickListener {

    EditText email, password;
    Button login, register;
    UserData userData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);

        email = (EditText) findViewById(id.editText);
        password = (EditText) findViewById(id.editText2);
        login = (Button) findViewById(id.Login);
        register = (Button) findViewById(R.id.LogRegister);

        login.setOnClickListener(this);
        register.setOnClickListener(this);

        userData = new UserData(this);
    }


    @Override
    public void onClick(View v){
        switch(v.getId()){
            case id.Login:
                String emailadd = email.getText().toString();
                String pw = password.getText().toString();

                User user = new User(null,null);
                userData.storeUserData(user);
                userData.setUserLogin(true);

                startActivity(new Intent(this, WelcomePage.class));

                break;

            case id.LogRegister:
                startActivity(new Intent(this, Register.class));
                break;
        }
    }

}
