package com.example.jason.overwatchsoundboard;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String DEFAULT = "not available";

    private Button Announcer, Bastion, DVa, Genji, Hanzo, Junkrat, Lucio, McCree,
            Mei, Mercy, Pharah, Reaper, Reinhardt, Roadhog, Soldier76, Symmetra, Torbjorn, Tracer, Widowmaker,
            Winston, Zarya, Zenyatta;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.abs_layout);

        TextView title = (TextView) findViewById(R.id.actionbartitle);
        title.setText("Overwatch Soundboard");

        Announcer = (Button) findViewById(R.id.button1);
        Bastion = (Button) findViewById(R.id.button2);
        DVa = (Button) findViewById(R.id.button3);
        Genji = (Button) findViewById(R.id.button4);
        Hanzo = (Button) findViewById(R.id.button5);
        Junkrat = (Button) findViewById(R.id.button6);
        Lucio = (Button) findViewById(R.id.button7);
        McCree = (Button) findViewById(R.id.button8);
        Mei = (Button) findViewById(R.id.button9);
        Mercy = (Button) findViewById(R.id.button10);
        Pharah = (Button) findViewById(R.id.button11);
        Reaper = (Button) findViewById(R.id.button12);
        Reinhardt = (Button) findViewById(R.id.button13);
        Roadhog = (Button) findViewById(R.id.button14);
        Soldier76 = (Button) findViewById(R.id.button15);
        Symmetra = (Button) findViewById(R.id.button16);
        Torbjorn = (Button) findViewById(R.id.button17);
        Tracer = (Button) findViewById(R.id.button18);
        Widowmaker = (Button) findViewById(R.id.button19);
        Winston = (Button) findViewById(R.id.button20);
        Zarya = (Button) findViewById(R.id.button21);
        Zenyatta = (Button) findViewById(R.id.button22);

        Announcer.setOnClickListener(this);
        Bastion.setOnClickListener(this);
        DVa.setOnClickListener(this);
        Genji.setOnClickListener(this);
        Hanzo.setOnClickListener(this);
        Junkrat.setOnClickListener(this);
        Lucio.setOnClickListener(this);
        McCree.setOnClickListener(this);
        Mei.setOnClickListener(this);
        Mercy.setOnClickListener(this);
        Pharah.setOnClickListener(this);
        Reaper.setOnClickListener(this);
        Reinhardt.setOnClickListener(this);
        Roadhog.setOnClickListener(this);
        Soldier76.setOnClickListener(this);
        Symmetra.setOnClickListener(this);
        Torbjorn.setOnClickListener(this);
        Tracer.setOnClickListener(this);
        Widowmaker.setOnClickListener(this);
        Winston.setOnClickListener(this);
        Zarya.setOnClickListener(this);
        Zenyatta.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.button1:
                Constants.choice = "Announcer";
                break;
            case R.id.button2:
                Constants.choice = "Bastion";
                break;

            case R.id.button3:
                Constants.choice = "D.Va";
                break;

            case R.id.button4:
                Constants.choice = "Genji";
                break;

            case R.id.button5:
                Constants.choice = "Hanzo";
                break;

            case R.id.button6:
                Constants.choice = "Junkrat";
                break;

            case R.id.button7:
                Constants.choice = "Lucio";
                break;

            case R.id.button8:
                Constants.choice = "McCree";
                break;

            case R.id.button9:
                Constants.choice = "Mei";
                break;

            case R.id.button10:
                Constants.choice = "Mercy";
                break;

            case R.id.button11:
                Constants.choice = "Pharah";
                break;

            case R.id.button12:
                Constants.choice = "Reaper";
                break;

            case R.id.button13:
                Constants.choice = "Reinhardt";
                break;

            case R.id.button14:
                Constants.choice = "Roadhog";
                break;

            case R.id.button15:
                Constants.choice = "Soldier: 76";
                break;

            case R.id.button16:
                Constants.choice = "Symmetra";
                break;

            case R.id.button17:
                Constants.choice = "Torbjorn";
                break;

            case R.id.button18:
                Constants.choice = "Tracer";
                break;

            case R.id.button19:
                Constants.choice = "Widowmaker";
                break;

            case R.id.button20:
                Constants.choice = "Winston";
                break;

            case R.id.button21:
                Constants.choice = "Zarya";
                break;

            case R.id.button22:
                Constants.choice = "Zenyatta";
                break;

        }
            Intent intent = new Intent(MainActivity.this, ListActivity.class);
            startActivity(intent);



        }




    }

