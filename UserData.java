package com.example.angelyu.myapplication;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Angelyu on 2015/6/13.
 */
public class UserData {

    public static final String sp = "userDetail";
    SharedPreferences userDatabase;

    public UserData(Context context) {
        userDatabase = context.getSharedPreferences(sp, 0);
    }

    public void storeUserData(User user){
        SharedPreferences.Editor spEditor = userDatabase.edit();
        spEditor.putString("firstName", user.fname);
        spEditor.putString("lastName", user.lname);
        spEditor.putString("Email", user.email);
        spEditor.putString("Password", user.password);
        spEditor.putString("phoneNumber", user.phoneNo);
        spEditor.commit();
    }

    public User getUserLogin(){
        String fname = userDatabase.getString("firstName", "");
        String lname = userDatabase.getString("lastName", "");
        String email = userDatabase.getString("Email", "");
        String password = userDatabase.getString("password", "");
        String phoneNo = userDatabase.getString("phoneNumber", "");

        User storedUser = new User(fname, lname, email, password, phoneNo);

        return storedUser;
    }

    public void setUserLogin(boolean loggedIn){
        SharedPreferences.Editor spEditor = userDatabase.edit();
        spEditor.putBoolean("LoggedIn", loggedIn);
        spEditor.commit();
    }

    public boolean getIsloggedIn(){
        if (userDatabase.getBoolean("LoggedIn", false) == true){
            return true;
        }
        return false;
    }

    public void clearUserData(){
        SharedPreferences.Editor spEditor = userDatabase.edit();
        spEditor.clear();
        spEditor.commit();
    }
}
