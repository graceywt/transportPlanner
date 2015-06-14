package com.example.angelyu.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Logout extends ActionBarActivity implements View.OnClickListener {

    Button logout;
    UserData userData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);

        logout = (Button) findViewById(R.id.logout);
        logout.setOnClickListener(this);

        userData = new UserData(this);
    }


    @Override
    protected void onStart(){
        super.onStart();
        if(authenticate() == true){
            return;
        }else{
            startActivity(new Intent(this, MainLogin.class));
        }
    }

    private boolean authenticate(){
        return  userData.getIsloggedIn();
    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.logout:
                userData.clearUserData();
                userData.setUserLogin(false);

                startActivity(new Intent(this, MainLogin.class));

                break;
        }
    }

}
