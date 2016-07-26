package com.example.jason.overwatchsoundboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Jason Soliman on 7/25/2016.
 */
public class MenuActivity extends MainActivity {
//
//    private Button Sounds, Info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.charmenu);



        getSupportActionBar().setTitle(Constants.choice);
        TextView title = (TextView)findViewById(R.id.actionbartitle);
        title.setText(Constants.choice);

//
//        Info = (Button) findViewById(R.id.infobutton);
//        Sounds = (Button) findViewById(R.id.soundbutton);
//
//        Info.setOnClickListener(this);
//        Sounds.setOnClickListener(this);


    }

    public void sounds (View view) {

        Intent intent = new Intent(MenuActivity.this, ListActivity.class);
        startActivity(intent);
    }

    public void info (View view){
        Intent intent = new Intent(MenuActivity.this, InfoActivity.class);
        startActivity(intent);
    }
}
