package com.example.elvis.petapps;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;


public class Cat_Activity extends ActionBarActivity {
     SQL_Helper helper=new SQL_Helper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_);

        LinearLayout layout_kitten=(LinearLayout) findViewById(R.id.kitten_care);
        layout_kitten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //helper.insert_to_db_cat(helper.CAT_CARE, helper.kitten_care);
                Intent intent=new Intent(Cat_Activity.this, Kitten_Activity.class);
                startActivity(intent);
            }
        });

        LinearLayout layout_diet=(LinearLayout) findViewById(R.id.linear_cat_diet);
        layout_diet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //helper.insert_to_db_cat(helper.CAT_CARE, helper.kitten_care);
                Intent intent=new Intent(Cat_Activity.this, Cat_diet_Activity.class);
                startActivity(intent);
            }
        });

        LinearLayout layout_prevent=(LinearLayout) findViewById(R.id.cat_preventive);
        layout_prevent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //helper.insert_to_db_cat(helper.CAT_CARE, helper.kitten_care);
                Intent intent=new Intent(Cat_Activity.this, Cat_preventive_Activity.class);
                startActivity(intent);
            }
        });

        LinearLayout layout_health=(LinearLayout) findViewById(R.id.cat_health);
        layout_health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //helper.insert_to_db_cat(helper.CAT_CARE, helper.kitten_care);
                Intent intent=new Intent(Cat_Activity.this, Cat_Health_Activity.class);
                startActivity(intent);
            }
        });

        LinearLayout layout_breed=(LinearLayout) findViewById(R.id.cat_breed);
        layout_breed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //helper.insert_to_db_cat(helper.CAT_CARE, helper.kitten_care);
                Intent intent=new Intent(Cat_Activity.this, Cat_breed.class);
                startActivity(intent);
            }
        });

        LinearLayout layout_diagnose=(LinearLayout) findViewById(R.id.cat_diagnose);
        layout_diagnose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //helper.insert_to_db_cat(helper.CAT_CARE, helper.kitten_care);
                Intent intent=new Intent(Cat_Activity.this, Cat_diagnose.class);
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
