package com.example.jason.overwatchsoundboard;

import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Jason Soliman on 7/25/2016.
 */
public class MenuActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.charmenu);

        getSupportActionBar().setTitle(Constants.choice);
        TextView title = (TextView)findViewById(R.id.actionbartitle);
        title.setText(Constants.choice);







    }
}
