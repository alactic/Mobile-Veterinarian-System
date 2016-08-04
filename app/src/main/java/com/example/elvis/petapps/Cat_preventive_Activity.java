package com.example.elvis.petapps;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;


public class Cat_preventive_Activity extends ActionBarActivity {
    public final static String EXTRA_MESSAGE = "com.example.elvis.petapps.MESSAGE";
    SQL_Helper helper=new SQL_Helper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_preventive_);
        final LinearLayout groom = (LinearLayout) findViewById(R.id.button_cat_grooming);
        groom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2_cat(helper.CAT,helper.CAT_TEXT , helper.cat_groom, helper.cat_groom_title);
                String get_groom = helper.retrieve2_from_cat_table(helper.CAT,helper.CAT_TEXT ,helper.cat_groom);
                Intent intent = new Intent(Cat_preventive_Activity.this, Cat_prevent_detail.class);
                intent.putExtra(EXTRA_MESSAGE, get_groom);
                startActivity(intent);
            }
        });

        final LinearLayout breath = (LinearLayout) findViewById(R.id.button_cat_breath);
        breath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2_cat(helper.CAT,helper.CAT_TEXT , helper.cat_bad, helper.cat_bad_breath);
                String get_breath = helper.retrieve2_from_cat_table(helper.CAT,helper.CAT_TEXT ,helper.cat_bad_breath);
                Intent intent = new Intent(Cat_preventive_Activity.this, Cat_prevent_detail.class);
                intent.putExtra(EXTRA_MESSAGE, get_breath);
                startActivity(intent);
            }
        });

        final LinearLayout ear = (LinearLayout) findViewById(R.id.button_cat_ear);
        ear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2_cat(helper.CAT,helper.CAT_TEXT , helper.cat_ear , helper.cat_ear_title);
                String get_ear = helper.retrieve2_from_cat_table(helper.CAT,helper.CAT_TEXT ,helper.cat_ear);
                Intent intent = new Intent(Cat_preventive_Activity.this, Cat_prevent_detail.class);
                intent.putExtra(EXTRA_MESSAGE, get_ear);
                startActivity(intent);
            }
        });

        final LinearLayout eye = (LinearLayout) findViewById(R.id.button_cat_eye);
        eye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2_cat(helper.CAT,helper.CAT_TEXT , helper.cat_eyes, helper.cat_eye_title);
                String get_eye = helper.retrieve2_from_cat_table(helper.CAT,helper.CAT_TEXT ,helper.cat_eyes);
                Intent intent = new Intent(Cat_preventive_Activity.this, Cat_prevent_detail.class);
                intent.putExtra(EXTRA_MESSAGE, get_eye);
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cat_preventive_, menu);
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
