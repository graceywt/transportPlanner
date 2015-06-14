package com.example.win8.myapplication;

import android.content.Context;
import android.os.AsyncTask;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class SearchActivity  extends AsyncTask<String,Void,String>{
    private TextView statusField,roleField;
   private Context context;


    //flag 0 means get and 1 means post.(By default it is get.)
    public SearchActivity(Context context,TextView sourceField,TextView destinationField,int flag) {
        this.context = context;
        this.sourceField = sourceField;
        this.destinationField = destinationField;

    }

    protected void onPreExecute(){

    }

    @Override
    protected String doInBackground(String... arg0) {


            try{
                String source = (String)arg0[0];
                String destination = (String)arg0[1];


                StringBuffer sb;
                InputStream iS = resources.getAssets().open("option name=\"ASSETS_FOLDER_RELATIVE_PATH\" value=\"/src/main/assets\"searchList.txt");
                BufferedReader reader = new BufferedReader(new InputStreamReader(iS)); {
                }

                sb = new StringBuffer(" ");
                String line="&/n";

                while ((line = in.readLine()) != null) {
                    sb.append(line);
                    if (BRT.equals(sourceField) && BRT.equals(destinationField) || KTM.equals(sourceField) && KTM.equals(destinationField) || LRT.equals(sourceField) && LRT.equals(destinationField)){
                        System.out.println("Source & Distance: /s,/s"+sourceField,+destinationField);
                        int[] time = new int[10];
                        int[] Price = new int[10];
                        a=0;
                        b=0;
                        while ((time[a]!=null){
                            if (time[a] < time[a + 1]) {
                               time.append(time[a]);
                                time[a]++;
                            }
                        }
                        while (Price[b]!=null) {
                                if (Price[b]<Price[b+1]){
                                    price.append(Price[b]);
                                    Price[b]++;
                                }

                        }
                    }
                    else{
                            System.out.println("Source and/or destination is not found!");
                    }

                    Button mfast = (Button) findViewById(R.id.fast);
                    mfast.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                                    selectFast();



                                    selectCheap();

                                    selectEco();

                        }

                        );


                        public void selectFast() {
                            distance = (TextView) findViewById(R.id.distance);
                            price = (TextView) findViewById(R.id.price);
                            System.out.println("Distance: " + distance);
                            System.out.println("Price: " + price);
                            ; // how to search the distance & price of the fastest route from time?

                        }

                        public void selectCheap() {

                        }

                        else if(arg0==cheap)

                        {
                            transport = (TextView) findViewById(R.id.transport);
                            details = (TextView) findViewById(R.id.details);
                            price = (TextView) findViewById(R.id.price);
                            time1 = (TextView) findViewById(R.id.time1);
                        }

                        else if(arg0==green)

                        {
                            transport = (TextView) findViewById(R.id.transport);
                            details = (TextView) findViewById(R.id.details);
                            price = (TextView) findViewById(R.id.price);
                            time1 = (TextView) findViewById(R.id.time1);

                        }
                    }

                }
                break;
                in.close();

            }

            catch(Exception e){
                return new String("Exception: " + e.getMessage());
            }
        }




        catch(Exception e){
            return new String("Exception: " + e.getMessage());
        }
    }
}


}
