package com.example.elvis.petapps;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class Insert_Data extends Activity {
     SQL_Helper helper=new SQL_Helper(this);
    public static final String TAG=SQL_Helper.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_);


    }

    public void Dog_care(String dog_care){
        SQLiteDatabase db=helper.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(helper.DOG_CARE, dog_care);
        db.insert(helper.PET_TABLE, null, contentValues);
        Log.v(TAG, "inserted");
    }

    /*public void retrieve() {
        SQLiteDatabase db = helper.getWritableDatabase();
        String[] column = {helper.ID, helper.DOG_CARE};
        Cursor cursor = db.query(helper.PET_TABLE, column, null, null, null, null, null);
        while (cursor.moveToNext()) {
            int bio = cursor.getColumnIndex(helper.DOG_CARE);
            String data = cursor.getString(bio);
            // Toast.makeText(this, data, Toast.LENGTH_LONG).show();
            Log.v(TAG, data);
        }
    }*/





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cat_, menu);
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
