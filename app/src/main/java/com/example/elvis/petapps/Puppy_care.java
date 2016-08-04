package com.example.elvis.petapps;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Puppy_care extends ActionBarActivity {
    SQL_Helper helper=new SQL_Helper(this);
    TextView Pup_intro, feed_puppy, puppy_eat, puppy_weight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puppy_care);
        helper.insert_to_db2(helper.PUPPY, helper.PUPPY_TEXT, helper.puppy_intro, helper.puppy_intro_title);
        String get_puppy_intro=helper.retrieve2(helper.PUPPY, helper.PUPPY_TEXT,helper.puppy_intro);

        Pup_intro=(TextView) findViewById(R.id.puppy_intro);
        Pup_intro.setText(get_puppy_intro);


        LinearLayout feed=(LinearLayout) findViewById(R.id.button_feed_puppy);
        feed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2(helper.PUPPY, helper.PUPPY_TEXT, helper.puppy_feed, helper.feed_puppy_title);
                String get_feed=helper.retrieve2(helper.PUPPY, helper.PUPPY_TEXT,helper.puppy_feed);
                feed_puppy=(TextView) findViewById(R.id.feed_puppy);
                feed_puppy.setText(get_feed);
            }
        });

        LinearLayout eat=(LinearLayout) findViewById(R.id.button_puppy_eat);
        eat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2(helper.PUPPY, helper.PUPPY_TEXT, helper.puppy_eat, helper.puppy_eat_title);
                String get_puppy_eat = helper.retrieve2(helper.PUPPY, helper.PUPPY_TEXT,helper.puppy_eat);
                puppy_eat = (TextView) findViewById(R.id.puppy_eat);
                puppy_eat.setText(get_puppy_eat);
            }
        });

        LinearLayout weight=(LinearLayout) findViewById(R.id.button_puppy_weight);
        weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2(helper.PUPPY, helper.PUPPY_TEXT, helper.puppy_weight, helper.puppy_weight_title);
                String get_puppy_weight = helper.retrieve2(helper.PUPPY, helper.PUPPY_TEXT,helper.puppy_weight);
                puppy_weight = (TextView) findViewById(R.id.puppy_weight);
                puppy_weight.setText(get_puppy_weight);
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_puppy_care, menu);
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
