package com.example.elvis.petapps;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;


public class Dog_health_Activity extends ActionBarActivity {
    public final static String EXTRA_MESSAGE = "com.example.elvis.petapps.MESSAGE";
    SQL_Helper helper=new SQL_Helper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog_health_);


        final LinearLayout arthritis = (LinearLayout) findViewById(R.id.button_arthritis);
        arthritis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_arthrit, helper.dog_arthritis);
                String get_arthritis = helper.retrieve2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_arthrit);
                Intent intent = new Intent(Dog_health_Activity.this, Health_Condition_Activity.class);
                intent.putExtra(EXTRA_MESSAGE, get_arthritis);
                startActivity(intent);
            }
        });

        final LinearLayout diabetis = (LinearLayout) findViewById(R.id.button_diabetis);
        diabetis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_diabet, helper.dog_diabetis);
                String get_diabetis = helper.retrieve2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT,helper.dog_diabet);
                Intent intent = new Intent(Dog_health_Activity.this, Health_Condition_Activity.class);
                intent.putExtra(EXTRA_MESSAGE, get_diabetis);
                startActivity(intent);
            }
        });

        final LinearLayout diarrhea = (LinearLayout) findViewById(R.id.button_diarrhea);
        diarrhea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_diarrh, helper.dog_diarrhea);
                String get_diarrhea = helper.retrieve2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_diarrh);
                Intent intent = new Intent(Dog_health_Activity.this, Health_Condition_Activity.class);
                intent.putExtra(EXTRA_MESSAGE, get_diarrhea);
                startActivity(intent);
            }
        });

        final LinearLayout ear_infection = (LinearLayout) findViewById(R.id.button_ear_infection);
        ear_infection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_ear, helper.dog_ear_infection );
                String get_ear_infection = helper.retrieve2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_ear);
                Intent intent = new Intent(Dog_health_Activity.this, Health_Condition_Activity.class);
                intent.putExtra(EXTRA_MESSAGE, get_ear_infection);
                startActivity(intent);
            }
        });

        final LinearLayout eye_discharge = (LinearLayout) findViewById(R.id.button_eye_discharge);
        eye_discharge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_eye, helper.dog_eye_title);
                String get_eye_discharge = helper.retrieve2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_eye);
                Intent intent = new Intent(Dog_health_Activity.this, Health_Condition_Activity.class);
                intent.putExtra(EXTRA_MESSAGE, get_eye_discharge);
                startActivity(intent);
            }
        });

        final LinearLayout hot_spot = (LinearLayout) findViewById(R.id.button_hot_spot);
        hot_spot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_hot, helper.dog_hot_spot);
                String get_hot_spot = helper.retrieve2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_hot);
                Intent intent = new Intent(Dog_health_Activity.this, Health_Condition_Activity.class);
                intent.putExtra(EXTRA_MESSAGE, get_hot_spot);
                startActivity(intent);
            }
        });

        final LinearLayout lower_urinary = (LinearLayout) findViewById(R.id.button_lower_urinary);
        lower_urinary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_lower, helper.dog_lower_urinary);
                String get_lower_urinary = helper.retrieve2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_lower);
                Intent intent = new Intent(Dog_health_Activity.this, Health_Condition_Activity.class);
                intent.putExtra(EXTRA_MESSAGE, get_lower_urinary);
                startActivity(intent);
            }
        });

        final LinearLayout obsessive_lick = (LinearLayout) findViewById(R.id.button_obsessive_lick);
        obsessive_lick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_obsessive,helper.dog_obsessive_lick);
                String get_obsessive_lick = helper.retrieve2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_obsessive);
                Intent intent = new Intent(Dog_health_Activity.this, Health_Condition_Activity.class);
                intent.putExtra(EXTRA_MESSAGE, get_obsessive_lick);
                startActivity(intent);
            }
        });

        final LinearLayout vomitting = (LinearLayout) findViewById(R.id.button_vomitting);
        vomitting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_vomit, helper.dog_vomiting);
                String get_vomitting = helper.retrieve2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_vomit);
                Intent intent = new Intent(Dog_health_Activity.this, Health_Condition_Activity.class);
                intent.putExtra(EXTRA_MESSAGE, get_vomitting);
                startActivity(intent);
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_dog_health_, menu);
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
