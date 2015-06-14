package com.example.angelyu.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class SearchRoute extends ActionBarActivity implements View.OnClickListener{

    Button fastest, cheapest, eco_friendly;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_route);

        fastest = (Button) findViewById(R.id.fast);
        cheapest = (Button) findViewById(R.id.cheap);
        eco_friendly = (Button) findViewById(R.id.green);


    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.fast:
                startActivity(new Intent(this, SearchRoute.class));
                break;

            case R.id.cheap:
                startActivity(new Intent(this,CheapRoute.class));
                break;

            case R.id.green:
                startActivity(new Intent(this,GreenRoute.class));
                break;
        }
    }

}
