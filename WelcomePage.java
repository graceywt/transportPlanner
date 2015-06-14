package com.example.angelyu.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class WelcomePage extends ActionBarActivity implements View.OnClickListener{

    EditText start, destination;
    Button search;
    RouteData routeData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);

        start = (EditText) findViewById(R.id.start);
        destination = (EditText) findViewById(R.id.destination);
        search = (Button) findViewById(R.id.routesubmit);

        routeData = new RouteData(this);
    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.routesubmit:
                String origin = start.getText().toString();
                String dest = destination.getText().toString();

                Route route = new Route(null,null);
                routeData.storeRouteData(route);

                startActivity(new Intent(this, SearchRoute.class));
                break;
        }
    }
}
