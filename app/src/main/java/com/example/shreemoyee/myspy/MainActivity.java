package com.example.shreemoyee.myspy;

import android.content.Intent;
import android.os.Bundle;

import android.view.View.OnClickListener;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public  String str1;
    public  String str2;
    public String str0;

    private Spinner spinner1, spinner2,spinner3, spinner4;
    private Button track,fire,cab,learn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //addItemsOnSpinner2();
        addListenerOnButton(); //learn button functions goes here
        addListenerOnSpinnerItemSelection();

        fire=findViewById(R.id.firebtn);
        fire.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        fire.class);
                myIntent.putExtra("building",str0);
                myIntent.putExtra("room",str1);
                myIntent.putExtra("number",str2);

                startActivity(myIntent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    /**public void addItemsOnSpinner2() {

        spinner2 = (Spinner) findViewById(R.id.spinner2);
        List<String> list = new ArrayList<String>();
        list.add("list 1");
        list.add("list 2");
        list.add("list 3");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(dataAdapter);
    }**/

    public void addListenerOnSpinnerItemSelection() {
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner1.setOnItemSelectedListener(new CustomOnItemSelectedListener());
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        spinner2.setOnItemSelectedListener(new CustomOnItemSelectedListener());
        spinner3 = (Spinner) findViewById(R.id.spinner3);
        spinner3.setOnItemSelectedListener(new CustomOnItemSelectedListener());
        spinner4 = (Spinner) findViewById(R.id.spinner4);
        spinner4.setOnItemSelectedListener(new CustomOnItemSelectedListener());
    }

    // get the selected dropdown list value
    public void addListenerOnButton() {

        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        spinner3 = (Spinner) findViewById(R.id.spinner3);
        spinner4 = (Spinner) findViewById(R.id.spinner4);

        learn = (Button) findViewById(R.id.learn);

        learn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {



                str0=String.valueOf(spinner1.getSelectedItem());
                str1=String.valueOf(spinner3.getSelectedItem());
                str2=String.valueOf(spinner4.getSelectedItem());

                Toast.makeText(MainActivity.this,
                        "You are currently in : " +
                                "\nBuilding : "+ String.valueOf(spinner1.getSelectedItem()) +
                                "\nFloor : "+ String.valueOf(spinner2.getSelectedItem())+
                                "\nRoom : "+ String.valueOf(spinner3.getSelectedItem())+
                                "\nNumbered: "+ String.valueOf(spinner4.getSelectedItem()),
                        Toast.LENGTH_SHORT).show();
            }

        });
    }

    /**
     * Created by shreemoyee on 2/2/18.
     */

    public static class CustomOnItemSelectedListener implements AdapterView.OnItemSelectedListener {
        public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
            /**Toast.makeText(parent.getContext(),
                    "You selected" + parent.getItemAtPosition(pos).toString(),
                    Toast.LENGTH_SHORT).show();**/
        }

        @Override
        public void onNothingSelected(AdapterView<?> arg0) {
            // TODO Auto-generated method stub
        }
    }
}
