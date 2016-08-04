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

public class Dog_Preventive_Activity extends ActionBarActivity {
    SQL_Helper helper=new SQL_Helper(this);
    TextView eye, ear, teeth, tail, breath;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog__preventive_);

        LinearLayout layout_eye=(LinearLayout) findViewById(R.id.button_prevent_eyes);
        layout_eye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_eye, helper.dog_eye_title);
                String get_eye=helper.retrieve2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_eye);
                eye=(TextView) findViewById(R.id.prevent_eyes);
                eye.setText(get_eye);
            }
        });

        LinearLayout layout_ear=(LinearLayout) findViewById(R.id.button_prevent_ear);
        layout_ear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_ear, helper.dog_ear_title);
                String get_ear = helper.retrieve2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_ear);
                ear = (TextView) findViewById(R.id.prevent_ear);
                ear.setText(get_ear);
                //Toast.makeText(Dog_Preventive_Activity.this, get_ear, Toast.LENGTH_LONG).show();
            }
        });

        final LinearLayout layout_teeth=(LinearLayout) findViewById(R.id.button_prevent_teeth);
        layout_teeth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_teeth, helper.dog_teeth_title);
                String get_teeth = helper.retrieve2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_teeth);
                teeth = (TextView) findViewById(R.id.prevent_teeth);
                teeth.setText(get_teeth);
            }
        });

        final LinearLayout layout_breath=(LinearLayout) findViewById(R.id.button_prevent_breath);
        layout_breath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_breath, helper.dog_breath_title);
                String get_breath = helper.retrieve2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_breath);
                breath = (TextView) findViewById(R.id.prevent_breath);
                breath.setText(get_breath);
            }
        });

        final LinearLayout layout_tail=(LinearLayout) findViewById(R.id.button_prevent_toanails);
        layout_tail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_toetail, helper.dog_toetail_title);
                String get_tail = helper.retrieve2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_toetail);
                tail = (TextView) findViewById(R.id.prevent_toanails);
                tail.setText(get_tail);
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