package com.example.jason.overwatchsoundboard;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Jason on 2016-07-05.
 */
public class ListActivity extends MainActivity {
    private SoundPlayer mSoundPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        getSupportActionBar().setTitle(Constants.choice);
        TextView title = (TextView)findViewById(R.id.actionbartitle);
        title.setText(Constants.choice + " Soundboard");



        ListView listView = (ListView) findViewById(R.id.listView);

        mSoundPlayer = new SoundPlayer(this);
        Sound[] soundArray = SoundData.getSounds(this);


            final ArrayAdapter<Sound> adapter =
                    new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, soundArray);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView parent, View view, int position, long id) {
                    Sound sound = (Sound) parent.getItemAtPosition(position);
                    mSoundPlayer.playSound(sound);
                }
            });
    }
}


