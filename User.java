package com.example.angelyu.myapplication;

public class User {

    String fname, lname, email, password, phoneNo;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public User(String fName, String lName, String email, String password, String phoneNo) {
        this.fname = fName;
        this.lname = lName;
        this.email = email;
        this.password = password;
        this.phoneNo = phoneNo;
    }


}
