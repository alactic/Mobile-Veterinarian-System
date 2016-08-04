package com.example.elvis.petapps;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;


public class Dog_Activity extends ActionBarActivity {
    public static final String TAG=SQL_Helper.class.getSimpleName();
    SQL_Helper helper=new SQL_Helper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog_);

        LinearLayout puppy = (LinearLayout) findViewById(R.id.puppy_care);
        puppy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dog_Activity.this, Puppy_care.class);
                startActivity(intent);
            }
        });
        LinearLayout diet = (LinearLayout) findViewById(R.id.dog_diet);
        diet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dog_Activity.this, Diet_Activity.class);
                startActivity(intent);
            }
        });

        LinearLayout prevent = (LinearLayout) findViewById(R.id.dog_preventive);
        prevent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dog_Activity.this, Dog_Preventive_Activity.class);
                startActivity(intent);
            }
        });


        LinearLayout health = (LinearLayout) findViewById(R.id.dog_health);
        health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dog_Activity.this, Dog_health_Activity.class);
                startActivity(intent);
            }
        });

        LinearLayout breed = (LinearLayout) findViewById(R.id.dog_breed);
        breed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dog_Activity.this, Dog_breed.class);
                startActivity(intent);
            }
        });

        LinearLayout diagnose = (LinearLayout) findViewById(R.id.dog_diagnose);
        diagnose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dog_Activity.this, Dog_Diagnose.class);
                startActivity(intent);
            }
        });

           }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cat_, menu);
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
}
