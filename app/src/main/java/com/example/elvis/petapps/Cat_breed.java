package com.example.elvis.petapps;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;


public class Cat_breed extends ActionBarActivity {
    public final static String EXTRA_MESSAGE = "com.example.elvis.petapps.MESSAGE";
    SQL_Helper helper=new SQL_Helper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_breed);

        final LinearLayout bobtail = (LinearLayout) findViewById(R.id.cat_Bobtail);
        bobtail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2_cat(helper.CAT_BREED,helper.CAT_BREED_TEXT , helper.cat_breed_bob , helper.cat_breed_bobtail);
                String get_breed = helper.retrieve2_from_cat_table(helper.CAT_BREED,helper.CAT_BREED_TEXT ,helper.cat_breed_bob);
                Intent intent = new Intent(Cat_breed.this, Breed_detail.class);
                intent.putExtra(EXTRA_MESSAGE, get_breed);
                Bundle bundle=new Bundle();
                bundle.putInt("image",R.drawable.cat_bobtail);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        final LinearLayout curl = (LinearLayout) findViewById(R.id.cat_Curl);
        curl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2_cat(helper.CAT_BREED,helper.CAT_BREED_TEXT , helper.cat_breed_cur, helper.cat_breed_curl);
                String get_breed = helper.retrieve2_from_cat_table(helper.CAT_BREED,helper.CAT_BREED_TEXT ,helper.cat_breed_cur);
                Intent intent = new Intent(Cat_breed.this, Breed_detail.class);
                intent.putExtra(EXTRA_MESSAGE, get_breed);
                Bundle bundle=new Bundle();
                bundle.putInt("image",R.drawable.cat_curl);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        final LinearLayout shorthair = (LinearLayout) findViewById(R.id.cat_Shorthair);
        shorthair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2_cat(helper.CAT_BREED,helper.CAT_BREED_TEXT , helper.cat_breed_short, helper.cat_breed_shorthair);
                String get_breed = helper.retrieve2_from_cat_table(helper.CAT_BREED,helper.CAT_BREED_TEXT ,helper.cat_breed_short);
                Intent intent = new Intent(Cat_breed.this, Breed_detail.class);
                intent.putExtra(EXTRA_MESSAGE, get_breed);
                Bundle bundle=new Bundle();
                bundle.putInt("image",R.drawable.cat_shorthair);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        final LinearLayout wirehair = (LinearLayout) findViewById(R.id.cat_Wirehair);
        wirehair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2_cat(helper.CAT_BREED,helper.CAT_BREED_TEXT , helper.getCat_breed_wirehair, helper.cat_breed_wirehair);
                String get_breed = helper.retrieve2_from_cat_table(helper.CAT_BREED,helper.CAT_BREED_TEXT ,helper.getCat_breed_wirehair);
                Intent intent = new Intent(Cat_breed.this, Breed_detail.class);
                intent.putExtra(EXTRA_MESSAGE, get_breed);
                Bundle bundle=new Bundle();
                bundle.putInt("image",R.drawable.cat_wirehair);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        final LinearLayout balinese = (LinearLayout) findViewById(R.id.cat_Balinese);
        balinese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2_cat(helper.CAT_BREED,helper.CAT_BREED_TEXT , helper.cat_breed_bali, helper.cat_breed_balinese);
                String get_breed = helper.retrieve2_from_cat_table(helper.CAT_BREED,helper.CAT_BREED_TEXT ,helper.cat_breed_bali);
                Intent intent = new Intent(Cat_breed.this, Breed_detail.class);
                intent.putExtra(EXTRA_MESSAGE, get_breed);
                Bundle bundle=new Bundle();
                bundle.putInt("image",R.drawable.cat_balinese);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        final LinearLayout bengal = (LinearLayout) findViewById(R.id.cat_Bengal);
        bengal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2_cat(helper.CAT_BREED,helper.CAT_BREED_TEXT , helper.cat_breed_beng , helper.cat_breed_bengal);
                String get_breed = helper.retrieve2_from_cat_table(helper.CAT_BREED,helper.CAT_BREED_TEXT ,helper.cat_breed_beng);
                Intent intent = new Intent(Cat_breed.this, Breed_detail.class);
                intent.putExtra(EXTRA_MESSAGE, get_breed);
                Bundle bundle=new Bundle();
                bundle.putInt("image",R.drawable.cat_bengal);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        final LinearLayout birman = (LinearLayout) findViewById(R.id.cat_Birman);
        birman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2_cat(helper.CAT_BREED,helper.CAT_BREED_TEXT , helper.cat_breed_bir , helper.cat_breed_birman);
                String get_breed = helper.retrieve2_from_cat_table(helper.CAT_BREED,helper.CAT_BREED_TEXT ,helper.cat_breed_bir);
                Intent intent = new Intent(Cat_breed.this, Breed_detail.class);
                intent.putExtra(EXTRA_MESSAGE, get_breed);
                Bundle bundle=new Bundle();
                bundle.putInt("image",R.drawable.cat_birman);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        final LinearLayout bombay = (LinearLayout) findViewById(R.id.cat_Bombay);
        bombay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2_cat(helper.CAT_BREED,helper.CAT_BREED_TEXT , helper.cat_breed_bom , helper.cat_breed_bombay);
                String get_breed = helper.retrieve2_from_cat_table(helper.CAT_BREED,helper.CAT_BREED_TEXT ,helper.cat_breed_bom);
                Intent intent = new Intent(Cat_breed.this, Breed_detail.class);
                intent.putExtra(EXTRA_MESSAGE, get_breed);
                Bundle bundle=new Bundle();
                bundle.putInt("image",R.drawable.cat_bombay);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        final LinearLayout british = (LinearLayout) findViewById(R.id.cat_British);
        british.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2_cat(helper.CAT_BREED,helper.CAT_BREED_TEXT , helper.getCat_breed_brit , helper.cat_breed_british);
                String get_breed = helper.retrieve2_from_cat_table(helper.CAT_BREED,helper.CAT_BREED_TEXT ,helper.getCat_breed_brit);
                Intent intent = new Intent(Cat_breed.this, Breed_detail.class);
                intent.putExtra(EXTRA_MESSAGE, get_breed);
                Bundle bundle=new Bundle();
                bundle.putInt("image",R.drawable.cat_britishsshorthair);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        final LinearLayout burmese = (LinearLayout) findViewById(R.id.cat_Burmese);
        burmese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2_cat(helper.CAT_BREED,helper.CAT_BREED_TEXT , helper.cat_breed_burm , helper.cat_breed_burmese);
                String get_breed = helper.retrieve2_from_cat_table(helper.CAT_BREED,helper.CAT_BREED_TEXT ,helper.cat_breed_burm);
                Intent intent = new Intent(Cat_breed.this, Breed_detail.class);
                intent.putExtra(EXTRA_MESSAGE, get_breed);
                Bundle bundle=new Bundle();
                bundle.putInt("image",R.drawable.cat_burmese);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cat_breed, menu);
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
