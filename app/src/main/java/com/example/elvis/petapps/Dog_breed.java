package com.example.elvis.petapps;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.io.ByteArrayOutputStream;
import java.net.URL;


public class Dog_breed extends ActionBarActivity {
    public final static String EXTRA_MESSAGE = "com.example.elvis.petapps.MESSAGE";
    SQL_Helper helper=new SQL_Helper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog_breed);


        final LinearLayout labra = (LinearLayout) findViewById(R.id.dog_Labrador);
        labra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2(helper.DOG_BREED, helper.DOG_BREED_TEXT, helper.dog_breed_Labra, helper.dog_breed_Labrador);
                String get_breed = helper.retrieve2(helper.DOG_BREED, helper.DOG_BREED_TEXT,helper.dog_breed_Labra);
                Intent intent = new Intent(Dog_breed.this, Breed_detail.class);
                intent.putExtra(EXTRA_MESSAGE, get_breed);
                Bundle bundle=new Bundle();
                bundle.putInt("image",R.drawable.dog_labrador);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        final LinearLayout golden = (LinearLayout) findViewById(R.id.dog_Golden);
        golden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2(helper.DOG_BREED, helper.DOG_BREED_TEXT, helper.dog_breed_gold, helper.dog_breed_Golden);
                String get_breed = helper.retrieve2(helper.DOG_BREED, helper.DOG_BREED_TEXT,helper.dog_breed_gold);
                Intent intent = new Intent(Dog_breed.this, Breed_detail.class);
                intent.putExtra(EXTRA_MESSAGE, get_breed);
                Bundle bundle=new Bundle();
                bundle.putInt("image",R.drawable.dog_golden);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        final LinearLayout german = (LinearLayout) findViewById(R.id.dog_German);
        german.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2(helper.DOG_BREED, helper.DOG_BREED_TEXT, helper.dog_breed_germ, helper.dog_breed_german);
                String get_breed = helper.retrieve2(helper.DOG_BREED, helper.DOG_BREED_TEXT,helper.dog_breed_germ);
                Intent intent = new Intent(Dog_breed.this, Breed_detail.class);
                intent.putExtra(EXTRA_MESSAGE, get_breed);
                Bundle bundle=new Bundle();
                bundle.putInt("image",R.drawable.dog_german);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        final LinearLayout bulldog = (LinearLayout) findViewById(R.id.dog_Bulldog);
        bulldog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2(helper.DOG_BREED, helper.DOG_BREED_TEXT, helper.dog_breed_bull, helper.dog_breed_bulldog);
                String get_breed = helper.retrieve2(helper.DOG_BREED, helper.DOG_BREED_TEXT,helper.dog_breed_bull);
                Intent intent = new Intent(Dog_breed.this, Breed_detail.class);
                intent.putExtra(EXTRA_MESSAGE, get_breed);
                Bundle bundle=new Bundle();
                bundle.putInt("image",R.drawable.dog_bulldog);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        final LinearLayout york = (LinearLayout) findViewById(R.id.dog_Yorkshire);
        york.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2(helper.DOG_BREED, helper.DOG_BREED_TEXT, helper.dog_breed_york, helper.dog_breed_yorkshire);
                String get_breed = helper.retrieve2(helper.DOG_BREED, helper.DOG_BREED_TEXT,helper.dog_breed_york);
                Intent intent = new Intent(Dog_breed.this, Breed_detail.class);
                intent.putExtra(EXTRA_MESSAGE, get_breed);
                Bundle bundle=new Bundle();
                bundle.putInt("image",R.drawable.dog_york);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        final LinearLayout poodle = (LinearLayout) findViewById(R.id.dog_Poodle);
        poodle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2(helper.DOG_BREED, helper.DOG_BREED_TEXT, helper.dog_breed_pood, helper.dog_breed_poodle);
                String get_breed = helper.retrieve2(helper.DOG_BREED, helper.DOG_BREED_TEXT,helper.dog_breed_pood);
                Intent intent = new Intent(Dog_breed.this, Breed_detail.class);
                intent.putExtra(EXTRA_MESSAGE, get_breed);
                Bundle bundle=new Bundle();
                bundle.putInt("image",R.drawable.dog_poodle);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        final LinearLayout beagle = (LinearLayout) findViewById(R.id.dog_Beagle);
        beagle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2(helper.DOG_BREED, helper.DOG_BREED_TEXT, helper.dog_breed_beag, helper.dog_breed_beagle);
                String get_breed = helper.retrieve2(helper.DOG_BREED, helper.DOG_BREED_TEXT,helper.dog_breed_beag);
                Intent intent = new Intent(Dog_breed.this, Breed_detail.class);
                intent.putExtra(EXTRA_MESSAGE, get_breed);
                Bundle bundle=new Bundle();
                bundle.putInt("image",R.drawable.dog_beagle);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        final LinearLayout french = (LinearLayout) findViewById(R.id.dog_French);
        french.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2(helper.DOG_BREED, helper.DOG_BREED_TEXT, helper.dog_breed_fren, helper.dog_breed_french);
                String get_breed = helper.retrieve2(helper.DOG_BREED, helper.DOG_BREED_TEXT,helper.dog_breed_fren);
                Intent intent = new Intent(Dog_breed.this, Breed_detail.class);
                intent.putExtra(EXTRA_MESSAGE, get_breed);
                Bundle bundle=new Bundle();
                bundle.putInt("image",R.drawable.dog_french_bulldog);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        final LinearLayout dach = (LinearLayout) findViewById(R.id.dog_Dachshund);
        dach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2(helper.DOG_BREED, helper.DOG_BREED_TEXT, helper.dog_breed_dach, helper.dog_breed_dachshund);
                String get_breed = helper.retrieve2(helper.DOG_BREED, helper.DOG_BREED_TEXT,helper.dog_breed_dach);
                Intent intent = new Intent(Dog_breed.this, Breed_detail.class);
                intent.putExtra(EXTRA_MESSAGE, get_breed);
                Bundle bundle=new Bundle();
                bundle.putInt("image",R.drawable.dog_dach);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        final LinearLayout boxer = (LinearLayout) findViewById(R.id.dog_Boxer);
        boxer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insert_to_db2(helper.DOG_BREED, helper.DOG_BREED_TEXT, helper.dog_breed_box, helper.dog_breed_boxer);
                String get_breed = helper.retrieve2(helper.DOG_BREED, helper.DOG_BREED_TEXT,helper.dog_breed_box);
                Intent intent = new Intent(Dog_breed.this, Breed_detail.class);
                intent.putExtra(EXTRA_MESSAGE, get_breed);
                Bundle bundle=new Bundle();
                bundle.putInt("image",R.drawable.dog_boxer);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_dog_breed, menu);
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
