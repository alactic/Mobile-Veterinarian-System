package com.example.elvis.petapps;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;


public class Kitten_Activity extends ActionBarActivity {
  SQL_Helper helper=new SQL_Helper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitten_);
        helper.insert_to_db2_cat(helper.CAT,helper.CAT_TEXT, helper.kitten_care, helper.kitten_care_title);
        String cat_care=helper.retrieve2_from_cat_table(helper.CAT,helper.CAT_TEXT,helper.kitten_care);
        TextView textView=(TextView) findViewById(R.id.kitten_intro);
        textView.setText(cat_care);

        LinearLayout feed=(LinearLayout) findViewById(R.id.button_feed_kitten);
        feed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2_cat(helper.CAT,helper.CAT_TEXT, helper.kitten_feed, helper.kitten_feed_title);
                String get_feed=helper.retrieve2_from_cat_table(helper.CAT,helper.CAT_TEXT, helper.kitten_feed);
                TextView feed_kitten=(TextView) findViewById(R.id.feed_kitten);
                feed_kitten.setText(get_feed);
            }
        });

        LinearLayout beside=(LinearLayout) findViewById(R.id.button_kitten_besides);
        beside.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2_cat(helper.CAT,helper.CAT_TEXT, helper.cat_besides, helper.cat_besides_title);
                String get_beside=helper.retrieve2_from_cat_table(helper.CAT,helper.CAT_TEXT, helper.cat_besides);
                TextView beside=(TextView) findViewById(R.id.kitten_besides);
                beside.setText(get_beside);
            }
        });

        LinearLayout often=(LinearLayout) findViewById(R.id.button_kitten_often);
        often.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2_cat(helper.CAT,helper.CAT_TEXT, helper.cat_often, helper.cat_often_title);
                String get_often=helper.retrieve2_from_cat_table(helper.CAT,helper.CAT_TEXT,helper.cat_often);
                TextView often=(TextView) findViewById(R.id.kitten_often);
                often.setText(get_often);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_kitten_, menu);
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
