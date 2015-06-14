

package com.example.win8.myapplication;

    import android.app.Activity;
    import android.os.Bundle;
    import android.view.Menu;
    import android.view.View;
    import android.widget.Button;
    import android.widget.EditText;
    import android.widget.TextView;

    public class Search extends Activity {


        private EditText source1, destination1;
        private TextView source, destination;
        private Button go;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            source1=(EditText) findViewById(R.id.start);
            destination1=(EditText) findViewById(R.id.destination);

            source = (TextView)findViewById(R.id.start);
           destination = (TextView)findViewById(R.id.destination);
            go=(Button) findViewById(R.id.routesubmit);
            go.setText("Go");
        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            //getMenuInflater().inflate(R.Menu.menu, menu);
            return true;
        }

        public void search(View view){
            String source = source1.getText().toString();
            String destination = destination1.getText().toString();
            return new SearchActivity(Context context, TextView sourceField, TextView destinationField, int flag);

        }





}


