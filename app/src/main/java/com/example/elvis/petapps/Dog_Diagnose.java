package com.example.elvis.petapps;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class Dog_Diagnose extends ActionBarActivity {
    public final static String EXTRA_MESSAGE = "com.example.elvis.petapps.MESSAGE";
    SQL_Helper helper=new SQL_Helper(this);
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog__diagnose);


        RadioButton mouth=(RadioButton) findViewById(R.id.radio_dog_mouth);
        mouth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_vomit, helper.dog_vomiting);
                String get_vomitting = helper.retrieve2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_vomit);
                Intent intent = new Intent(Dog_Diagnose.this, Health_Condition_Activity.class);
                intent.putExtra(EXTRA_MESSAGE, get_vomitting);
                startActivity(intent);
            }
        });


        RadioButton ear=(RadioButton) findViewById(R.id.radio_dog_ear);
        ear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_ear, helper.dog_ear_infection);
                String get_ear_infection = helper.retrieve2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_ear);
                Intent intent = new Intent(Dog_Diagnose.this, Health_Condition_Activity.class);
                intent.putExtra(EXTRA_MESSAGE, get_ear_infection);
                startActivity(intent);
            }
        });

        RadioButton eyes=(RadioButton) findViewById(R.id.radio_dog_eye);
        eyes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_eye_infect, helper.dog_eye_infection);
                String get_eye_discharge = helper.retrieve2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_eye_infect);
                Intent intent = new Intent(Dog_Diagnose.this, Health_Condition_Activity.class);
                intent.putExtra(EXTRA_MESSAGE, get_eye_discharge);
                startActivity(intent);
            }
        });

        RadioButton skin=(RadioButton) findViewById(R.id.radio_dog_skin);
        skin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_hot, helper.dog_hot_spot);
                String get_hot_spot = helper.retrieve2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_hot);
                Intent intent = new Intent(Dog_Diagnose.this, Health_Condition_Activity.class);
                intent.putExtra(EXTRA_MESSAGE, get_hot_spot);
                startActivity(intent);
            }
        });

        RadioButton leg=(RadioButton) findViewById(R.id.radio_dog_legs);
        leg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_arthrit, helper.dog_arthritis);
                String get_arthritis = helper.retrieve2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_hot);
                Intent intent = new Intent(Dog_Diagnose.this, Health_Condition_Activity.class);
                intent.putExtra(EXTRA_MESSAGE, get_arthritis);
                startActivity(intent);
            }
        });


        //String day=add_day.getText().toString();
        //Toast.makeText(this, text, Toast.LENGTH_LONG).show();
        editText=(EditText) findViewById(R.id.dog_edit_symptom);
        Button button=(Button) findViewById(R.id.dog_diagnose_symptom);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String text= editText.getText().toString();
                helper.insert_to_db2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_arthrit, helper.dog_arthritis);
                helper.insert_to_db2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_diabet, helper.dog_diabetis);
                helper.insert_to_db2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_diarrh, helper.dog_diarrhea);
                helper.insert_to_db2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_ear, helper.dog_ear_infection );
                helper.insert_to_db2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_eye, helper.dog_eye_title);
                helper.insert_to_db2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_hot, helper.dog_hot_spot);
                helper.insert_to_db2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_lower, helper.dog_lower_urinary);
                helper.insert_to_db2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_obsessive,helper.dog_obsessive_lick);
                helper.insert_to_db2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_vomit, helper.dog_vomiting);

                String get_vit = helper.retrieve2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, text);
                if(get_vit==null)
                {

                }else
                {
                    Intent intent = new Intent(Dog_Diagnose.this, Health_Condition_Activity.class);
                    intent.putExtra(EXTRA_MESSAGE, get_vit);
                    startActivity(intent);
                }

                            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_dog__diagnose, menu);
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
