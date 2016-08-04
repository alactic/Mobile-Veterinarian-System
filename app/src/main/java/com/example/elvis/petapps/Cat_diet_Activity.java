package com.example.elvis.petapps;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;


public class Cat_diet_Activity extends ActionBarActivity {
   SQL_Helper helper=new SQL_Helper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_diet_);

        LinearLayout feed=(LinearLayout) findViewById(R.id.button_cat_feed_basis);
        feed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2_cat(helper.CAT,helper.CAT_TEXT , helper.cat_basis, helper.cat_basis_title);
                String get_feed=helper.retrieve2_from_cat_table(helper.CAT,helper.CAT_TEXT , helper.cat_basis);
                TextView feed_kitten=(TextView) findViewById(R.id.cat_feed_basis);
                feed_kitten.setText(get_feed);
            }
        });

        LinearLayout error=(LinearLayout) findViewById(R.id.button_cat_feed_error);
        error.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2_cat(helper.CAT,helper.CAT_TEXT , helper.cat_feed , helper.cat_feed_error);
                String get_error=helper.retrieve2_from_cat_table(helper.CAT,helper.CAT_TEXT ,helper.cat_feed);
                TextView feed_error=(TextView) findViewById(R.id.cat_feed_error);
                feed_error.setText(get_error);
            }
        });

        LinearLayout feed_adult=(LinearLayout) findViewById(R.id.button_cat_adult);
        feed_adult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2_cat(helper.CAT,helper.CAT_TEXT ,helper.cat_adult ,helper.cat_adult_title);
                String get_feed_adult=helper.retrieve2_from_cat_table(helper.CAT,helper.CAT_TEXT ,helper.cat_adult);
                TextView feed_adult=(TextView) findViewById(R.id.cat_adult);
                feed_adult.setText(get_feed_adult);
            }
        });

        LinearLayout cat_vitamin=(LinearLayout) findViewById(R.id.button_cat_vitamin);
        cat_vitamin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2_cat(helper.CAT,helper.CAT_TEXT , helper.cat_vitamin, helper.cat_vitamin_title);
                String get_vitamin=helper.retrieve2_from_cat_table(helper.CAT,helper.CAT_TEXT ,helper.cat_vitamin);
                TextView vitamin=(TextView) findViewById(R.id.cat_vitamin);
                vitamin.setText(get_vitamin);
            }
        });

        LinearLayout cat_tips=(LinearLayout) findViewById(R.id.button_cat_tips);
        cat_tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2_cat(helper.CAT,helper.CAT_TEXT , helper.cat_tips, helper.cat_tips_title);
                String get_tip=helper.retrieve2_from_cat_table(helper.CAT,helper.CAT_TEXT ,helper.cat_tips);
                TextView tip=(TextView) findViewById(R.id.cat_tips);
                tip.setText(get_tip);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cat_diet_, menu);
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
