package com.example.elvis.petapps;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class Cat_diagnose extends ActionBarActivity {

    public final static String EXTRA_MESSAGE = "com.example.elvis.petapps.MESSAGE";
    SQL_Helper helper=new SQL_Helper(this);
    EditText editText;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_diagnose);

        RadioButton mouth=(RadioButton) findViewById(R.id.radio_cat_mouth);
        mouth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2_cat(helper.CAT, helper.CAT_TEXT, helper.cat_vomit, helper.cat_vomit_title);
                String get_vomitting = helper.retrieve2_from_cat_table(helper.CAT, helper.CAT_TEXT, helper.cat_vomit);
                Intent intent = new Intent(Cat_diagnose.this, Health_Condition_Activity.class);
                intent.putExtra(EXTRA_MESSAGE, get_vomitting);
                startActivity(intent);
            }
        });


        RadioButton ear=(RadioButton) findViewById(R.id.radio_cat_ear);
        ear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2_cat(helper.CAT, helper.CAT_TEXT, helper.cat_ear, helper.cat_ear_title);
                String get_ear_infection = helper.retrieve2_from_cat_table(helper.CAT, helper.CAT_TEXT, helper.cat_ear);
                Intent intent = new Intent(Cat_diagnose.this, Health_Condition_Activity.class);
                intent.putExtra(EXTRA_MESSAGE, get_ear_infection);
                startActivity(intent);
            }
        });

        RadioButton eyes=(RadioButton) findViewById(R.id.radio_cat_eye);
        eyes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2_cat(helper.CAT, helper.CAT_TEXT, helper.cat_eyes, helper.cat_eye_title);
                String get_eye_discharge = helper.retrieve2_from_cat_table(helper.CAT, helper.CAT_TEXT, helper.cat_eyes);
                Intent intent = new Intent(Cat_diagnose.this, Health_Condition_Activity.class);
                intent.putExtra(EXTRA_MESSAGE, get_eye_discharge);
                startActivity(intent);
            }
        });

        RadioButton skin=(RadioButton) findViewById(R.id.radio_cat_skin);
        skin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2_cat(helper.CAT, helper.CAT_TEXT, helper.cat_shedding, helper.cat_shedding_title);
                String get_hot_spot = helper.retrieve2_from_cat_table(helper.CAT, helper.CAT_TEXT, helper.cat_shedding);
                Intent intent = new Intent(Cat_diagnose.this, Health_Condition_Activity.class);
                intent.putExtra(EXTRA_MESSAGE, get_hot_spot);
                startActivity(intent);
            }
        });

      /*  RadioButton leg=(RadioButton) findViewById(R.id.radio_dog_legs);
        leg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_arthrit, helper.);
                String get_arthritis = helper.retrieve2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, helper.dog_hot);
                Intent intent = new Intent(Cat_diagnose.this, Health_Condition_Activity.class);
                intent.putExtra(EXTRA_MESSAGE, get_arthritis);
                startActivity(intent);
            }
        });*/


        //String day=add_day.getText().toString();
        //Toast.makeText(this, text, Toast.LENGTH_LONG).show();
        editText=(EditText) findViewById(R.id.cat_edit_symptom);
        Button button=(Button) findViewById(R.id.cat_diagnose_symptom);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String text= editText.getText().toString();
                helper.insert_to_db2_cat(helper.CAT, helper.CAT_TEXT, helper.cat_shedding, helper.cat_shedding_title);
                helper.insert_to_db2_cat(helper.CAT, helper.CAT_TEXT, helper.cat_vomit, helper.cat_vomit_title);
                helper.insert_to_db2_cat(helper.CAT,helper.CAT_TEXT , helper.cat_lick, helper.cat_lick_article);
                helper.insert_to_db2_cat(helper.CAT,helper.CAT_TEXT , helper.cat_diabtics, helper.cat_diabtics_title);
                helper.insert_to_db2_cat(helper.CAT,helper.CAT_TEXT , helper.cat_diarrhia, helper.cat_diarrhia_title);
                helper.insert_to_db2_cat(helper.CAT,helper.CAT_TEXT , helper.cat_hyp, helper.cat_Hyper);
                helper.insert_to_db2_cat(helper.CAT,helper.CAT_TEXT , helper.cat_kidney, helper.cat_kidney_title);
                helper.insert_to_db2_cat(helper.CAT,helper.CAT_TEXT , helper.cat_urin , helper.cat_urinary);
                helper.insert_to_db2_cat(helper.CAT,helper.CAT_TEXT , helper.cat_resp, helper.cat_resp_title);
                helper.insert_to_db2_cat(helper.CAT,helper.CAT_TEXT , helper.cat_ear , helper.cat_ear_title);
                helper.insert_to_db2_cat(helper.CAT,helper.CAT_TEXT , helper.cat_eyes, helper.cat_eye_title);
                helper.insert_to_db2_cat(helper.CAT,helper.CAT_TEXT , helper.cat_bad, helper.cat_bad_breath);

                String get_vit = helper.retrieve2_from_cat_table(helper.CAT, helper.CAT_TEXT, text);
                if(get_vit==null)
                {
                   // Message.message(context, "not");
                }else
                {
                    Intent intent = new Intent(Cat_diagnose.this, Health_Condition_Activity.class);
                    intent.putExtra(EXTRA_MESSAGE, get_vit);
                    startActivity(intent);
                }
                //dog_vita = (TextView) findViewById(R.id.dog_vitamin);
                //dog_vita.setText(get_vita);
                //String get_ear_infection = helper.retrieve2(helper.ADULT_DOG, helper.ADULT_DOG_TEXT, text);

            }
        });

   }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cat_diagnose, menu);
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
