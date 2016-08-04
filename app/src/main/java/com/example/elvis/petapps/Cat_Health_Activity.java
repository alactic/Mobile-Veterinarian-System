package com.example.elvis.petapps;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;


public class Cat_Health_Activity extends ActionBarActivity {
    public final static String EXTRA_MESSAGE = "com.example.elvis.petapps.MESSAGE";
    SQL_Helper helper=new SQL_Helper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat__health_);

        final LinearLayout lick = (LinearLayout) findViewById(R.id.button_cat_licking);
        lick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2_cat(helper.CAT,helper.CAT_TEXT , helper.cat_lick, helper.cat_lick_article);
                String get_lick = helper.retrieve2_from_cat_table(helper.CAT,helper.CAT_TEXT ,helper.cat_lick);
                Intent intent = new Intent(Cat_Health_Activity.this, Cat_Health_Detail.class);
                intent.putExtra(EXTRA_MESSAGE, get_lick);
                startActivity(intent);
            }
        });

        final LinearLayout diabetics = (LinearLayout) findViewById(R.id.button_cat_diabetic);
        diabetics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2_cat(helper.CAT,helper.CAT_TEXT , helper.cat_diabtics, helper.cat_diabtics_title);
                String get_diabetic = helper.retrieve2_from_cat_table(helper.CAT,helper.CAT_TEXT , helper.cat_diabtics);
                Intent intent = new Intent(Cat_Health_Activity.this, Cat_Health_Detail.class);
                intent.putExtra(EXTRA_MESSAGE, get_diabetic);
                startActivity(intent);
            }
        });

        final LinearLayout diarrhia = (LinearLayout) findViewById(R.id.button_cat_diarrhia);
        diarrhia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2_cat(helper.CAT,helper.CAT_TEXT , helper.cat_diarrhia, helper.cat_diarrhia_title);
                String get_diarrhia = helper.retrieve2_from_cat_table(helper.CAT,helper.CAT_TEXT ,helper.cat_diarrhia);
                Intent intent = new Intent(Cat_Health_Activity.this, Cat_Health_Detail.class);
                intent.putExtra(EXTRA_MESSAGE, get_diarrhia);
                startActivity(intent);
            }
        });

        final LinearLayout Hyperthyroidism = (LinearLayout) findViewById(R.id.button_cat_Hyperthyroidism);
        Hyperthyroidism.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2_cat(helper.CAT,helper.CAT_TEXT , helper.cat_hyp, helper.cat_Hyper);
                String get_hyper = helper.retrieve2_from_cat_table(helper.CAT,helper.CAT_TEXT ,helper.cat_hyp);
                Intent intent = new Intent(Cat_Health_Activity.this, Cat_Health_Detail.class);
                intent.putExtra(EXTRA_MESSAGE, get_hyper);
                startActivity(intent);
            }
        });

        final LinearLayout kidney = (LinearLayout) findViewById(R.id.button_cat_kidney);
        kidney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2_cat(helper.CAT,helper.CAT_TEXT , helper.cat_kidney, helper.cat_kidney_title);
                String get_kidney = helper.retrieve2_from_cat_table(helper.CAT,helper.CAT_TEXT ,helper.cat_kidney);
                Intent intent = new Intent(Cat_Health_Activity.this, Cat_Health_Detail.class);
                intent.putExtra(EXTRA_MESSAGE, get_kidney);
                startActivity(intent);
            }
        });

        final LinearLayout urinary = (LinearLayout) findViewById(R.id.button_cat_urinary);
        urinary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2_cat(helper.CAT,helper.CAT_TEXT , helper.cat_urin , helper.cat_urinary);
                String get_urinary = helper.retrieve2_from_cat_table(helper.CAT,helper.CAT_TEXT ,helper.cat_urin);
                Intent intent = new Intent(Cat_Health_Activity.this, Cat_Health_Detail.class);
                intent.putExtra(EXTRA_MESSAGE, get_urinary);
                startActivity(intent);
            }
        });

        final LinearLayout shedding = (LinearLayout) findViewById(R.id.button_cat_shedding);
        shedding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2_cat(helper.CAT,helper.CAT_TEXT , helper.cat_shedding , helper.cat_shedding_title);
                String get_shedding = helper.retrieve2_from_cat_table(helper.CAT,helper.CAT_TEXT ,helper.cat_shedding);
                Intent intent = new Intent(Cat_Health_Activity.this, Cat_Health_Detail.class);
                intent.putExtra(EXTRA_MESSAGE, get_shedding);
                startActivity(intent);
            }
        });

        final LinearLayout vomit = (LinearLayout) findViewById(R.id.button_cat_vomit);
        vomit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2_cat(helper.CAT,helper.CAT_TEXT , helper.cat_vomit, helper.cat_vomit_title);
                String get_vomit = helper.retrieve2_from_cat_table(helper.CAT,helper.CAT_TEXT ,helper.cat_vomit);
                Intent intent = new Intent(Cat_Health_Activity.this, Cat_Health_Detail.class);
                intent.putExtra(EXTRA_MESSAGE, get_vomit);
                startActivity(intent);
            }
        });

        final LinearLayout resp = (LinearLayout) findViewById(R.id.button_cat_resp);
        resp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2_cat(helper.CAT,helper.CAT_TEXT , helper.cat_resp, helper.cat_resp_title);
                String get_resp = helper.retrieve2_from_cat_table(helper.CAT,helper.CAT_TEXT ,helper.cat_resp);
                Intent intent = new Intent(Cat_Health_Activity.this, Cat_Health_Detail.class);
                intent.putExtra(EXTRA_MESSAGE, get_resp);
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cat__health_, menu);
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
