package com.example.elvis.petapps;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by elvis on 6/2/2016.
 */
public class Message {
    public static void message(Context context, String message)
    {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
