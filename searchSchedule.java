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
	mfast = (Button) findViewById(R.id.fast);
	mfast.setText("Fastest");
                    mfast.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                                   
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
                    
                    if (BRT.equals(sourceField) && BRT.equals(destinationField) || KTM.equals(sourceField) && KTM.equals(destinationField) || LRT.equals(sourceField) && LRT.equals(destinationField)){
                        routes.append("Source & Distance: /s,/s"+sourceField,+destinationField);
                        int[] time = new int[10];
                        
                        a=0;
                        
                        while ((time[a]!=null){
                            if (time[a] < time[a + 1]) {
                               time.append(time[a]);
                                time[a]++;
                            }
                        }
			distance = (TextView) findViewById(R.id.distance);
                        price = (TextView) findViewById(R.id.price);
                        distance.append(distance);
                        price.append(price);
                        
                    }
                    else{
                            view.append("Source and/or destination is not found!");
                    }

                    Button mcheap = (Button) findViewById(R.id.cheap);
		    mcheap.setText("Cheapest");
                    mcheap.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                                    
			}
			@Override
    protected String doInBackground(String... arg0) {


            try{
                String source = (String)arg0[0];
                String destination = (String)arg0[1];


                StringBuffer sb;
                InputStream iS = resources.getAssets().open("option name=\"ASSETS_FOLDER_RELATIVE_PATH\" value=\"/src/main/assets\"");
                BufferedReader reader = new BufferedReader(new InputStreamReader(iS)); {
                }

                sb = new StringBuffer(" ");
                String line="&/n";

                while ((line = in.readLine()) != null) {
                    
                    if (BRT.equals(sourceField) && BRT.equals(destinationField) || KTM.equals(sourceField) && KTM.equals(destinationField) || LRT.equals(sourceField) && LRT.equals(destinationField)){
                        routes.append("Source & Distance: /s,/s"+sourceField,+destinationField);
                        
                        int[] Price = new int[10];
                       
                        b=0;
                        
                        while (Price[b]!=null) {
                                if (Price[b]<Price[b+1]){
                                    price.append(Price[b]);
                                    Price[b]++;
                                }

                        }
			distance = (TextView) findViewById(R.id.distance);
			time = (TextView) findViewById(R.id.time);
                        distance.append(distance);
                    }
                    else{
                            view.append("Source and/or destination is not found!");
                    }

			}

		Button meco = (Button) findViewById(R.id.eco);
		meco.setText("Eco-friendly");
                    meco.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                                    
			}
			@Override
    protected String doInBackground(String... arg0) {


            try{
                String source = (String)arg0[0];
                String destination = (String)arg0[1];


                StringBuffer sb;
                InputStream iS = resources.getAssets().open("option name=\"ASSETS_FOLDER_RELATIVE_PATH\" value=\"/src/main/assets\"");
                BufferedReader reader = new BufferedReader(new InputStreamReader(iS)); {
                }

                sb = new StringBuffer(" ");
                String line="&/n";

                while ((line = in.readLine()) != null) {//looks through BRT, KTM & lRT
                    
                    if (BRT.equals(sourceField) && BRT.equals(destinationField) || KTM.equals(sourceField) && KTM.equals(destinationField) || LRT.equals(sourceField) && LRT.equals(destinationField)){
                        routes.append("Source & Distance: /s,/s"+sourceField,+destinationField);
                        
                        int[] route = new int[15];
                       
                        c=0;
                        
                        while (route[c]!=null) {
                                if (route[c]<route[c+1]){
                                    price.append(route[c]);
                                    route[c]++;
                                }

                        }
			
                            distance = (TextView) findViewById(R.id.distance);
                            price = (TextView) findViewById(R.id.price);
			    time = (TextView) findViewById(R.id.time);
                            distance.append(distance);
                            price.append(price);
			    time.append(time);
                    }
                    else{
                            view.append("Source and/or destination is not found!");
                    }

			}

                                    

                                    

                        }

                        );


                       
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
