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

public class Diet_Activity extends ActionBarActivity {
    SQL_Helper helper=new SQL_Helper(this);
    TextView feed, tips, dog_bone, dog_vita;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet_);

        LinearLayout feed_basis=(LinearLayout) findViewById(R.id.button_feed_basis);
        feed_basis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.feed_basis, helper.feed_basis_title);
                String get_basis=helper.retrieve2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT,helper.feed_basis);
                feed=(TextView) findViewById(R.id.feed_basis);
                feed.setText(get_basis);
            }
        });

        LinearLayout feed_tips=(LinearLayout) findViewById(R.id.button_feed_tips);
        feed_tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.feed_tips, helper.feed_tips_title);
                String get_tips = helper.retrieve2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.feed_tips);
                tips = (TextView) findViewById(R.id.feed_tips);
                tips.setText(get_tips);
            }
        });

        final LinearLayout bone=(LinearLayout) findViewById(R.id.button_dog_bone);
        bone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_bone, helper.dog_bone_title);
                String get_bone = helper.retrieve2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_bone);
                dog_bone = (TextView) findViewById(R.id.dog_bone);
                dog_bone.setText(get_bone);
            }
        });

        final LinearLayout vita=(LinearLayout) findViewById(R.id.button_dog_vitamin);
       vita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_vitamin, helper.dog_vitamin_title);
                String get_vita = helper.retrieve2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_vitamin);
                dog_vita = (TextView) findViewById(R.id.dog_vitamin);
                dog_vita.setText(get_vita);
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