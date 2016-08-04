package com.example.elvis.petapps;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class Retrieve_Data extends Activity {
    SQL_Helper helper=new SQL_Helper(this);
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_);
        retrieve();
    }

    public void retrieve() {
        SQLiteDatabase db = helper.getWritableDatabase();
        String[] column = {helper.ID, helper.DOG_CARE};
        Cursor cursor = db.query(helper.PET_TABLE, column, null, null, null, null, null);
        while (cursor.moveToNext()) {
            int bio = cursor.getColumnIndex(helper.DOG_CARE);
            String data = cursor.getString(bio);
             Toast.makeText(this, data, Toast.LENGTH_LONG).show();
            //Log.v(TAG, data);
        }


    }

}
