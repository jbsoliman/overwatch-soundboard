package com.example.jason.overwatchsoundboard;

/**
 * Created by Jason on 2016-07-05.
 */

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.TypedArray;

public abstract class SoundData {


    public static Sound[] getSounds(Context context) {
        Resources res = context.getApplicationContext().getResources();


        if (Constants.choice.equals("Announcer")) {

            TypedArray announcer = res.obtainTypedArray(R.array.announcer);
            TypedArray announcerids = res.obtainTypedArray(R.array.announcerids);
            Sound[] sounds = new Sound[announcer.length()];

            for (int i = 0; i < sounds.length; i++) {
                sounds[i] = new Sound(announcer.getString(i), announcerids.getResourceId(i, -1));
            }

            announcer.recycle();
            announcerids.recycle();

            return sounds;
        }

       else if (Constants.choice.equals("D.Va")) {
            TypedArray labels = res.obtainTypedArray(R.array.dva);
            TypedArray ids = res.obtainTypedArray(R.array.dvaids);
            Sound[] dvasounds = new Sound[labels.length()];

            for (int i = 0; i < dvasounds.length; i++) {
                dvasounds[i] = new Sound(labels.getString(i), ids.getResourceId(i, -1));
            }

            labels.recycle();
            ids.recycle();

            return dvasounds;

        }

        else if (Constants.choice.equals("Bastion")) {
            TypedArray labels = res.obtainTypedArray(R.array.bastion);
            TypedArray ids = res.obtainTypedArray(R.array.bastionids);
            Sound[] sounds = new Sound[labels.length()];

            for (int i = 0; i < sounds.length; i++) {
                sounds[i] = new Sound(labels.getString(i), ids.getResourceId(i, -1));
            }

            labels.recycle();
            ids.recycle();

            return sounds;

        }

        else if (Constants.choice.equals("Genji")) {
            TypedArray labels = res.obtainTypedArray(R.array.genji);
            TypedArray ids = res.obtainTypedArray(R.array.genjiids);
            Sound[] sounds = new Sound[labels.length()];

            for (int i = 0; i < sounds.length; i++) {
                sounds[i] = new Sound(labels.getString(i), ids.getResourceId(i, -1));
            }

            labels.recycle();
            ids.recycle();

            return sounds;

        }
        else if (Constants.choice.equals("Hanzo")) {
            TypedArray labels = res.obtainTypedArray(R.array.hanzo);
            TypedArray ids = res.obtainTypedArray(R.array.hanzoids);
            Sound[] sounds = new Sound[labels.length()];

            for (int i = 0; i < sounds.length; i++) {
                sounds[i] = new Sound(labels.getString(i), ids.getResourceId(i, -1));
            }

            labels.recycle();
            ids.recycle();

            return sounds;

        }

        else if (Constants.choice.equals("Junkrat")) {
            TypedArray labels = res.obtainTypedArray(R.array.junkrat);
            TypedArray ids = res.obtainTypedArray(R.array.junkratids);
            Sound[] sounds = new Sound[labels.length()];

            for (int i = 0; i < sounds.length; i++) {
                sounds[i] = new Sound(labels.getString(i), ids.getResourceId(i, -1));
            }

            labels.recycle();
            ids.recycle();

            return sounds;

        }

        else if (Constants.choice.equals("Lucio")) {
            TypedArray labels = res.obtainTypedArray(R.array.lucio);
            TypedArray ids = res.obtainTypedArray(R.array.lucioids);
            Sound[] sounds = new Sound[labels.length()];

            for (int i = 0; i < sounds.length; i++) {
                sounds[i] = new Sound(labels.getString(i), ids.getResourceId(i, -1));
            }

            labels.recycle();
            ids.recycle();

            return sounds;

        }

        else if (Constants.choice.equals("McCree")) {
            TypedArray labels = res.obtainTypedArray(R.array.mccree);
            TypedArray ids = res.obtainTypedArray(R.array.mccreeids);
            Sound[] sounds = new Sound[labels.length()];

            for (int i = 0; i < sounds.length; i++) {
                sounds[i] = new Sound(labels.getString(i), ids.getResourceId(i, -1));
            }

            labels.recycle();
            ids.recycle();

            return sounds;

        }

        else if (Constants.choice.equals("Mei")) {
            TypedArray labels = res.obtainTypedArray(R.array.mei);
            TypedArray ids = res.obtainTypedArray(R.array.meiids);
            Sound[] sounds = new Sound[labels.length()];

            for (int i = 0; i < sounds.length; i++) {
                sounds[i] = new Sound(labels.getString(i), ids.getResourceId(i, -1));
            }

            labels.recycle();
            ids.recycle();

            return sounds;

        }

        else if (Constants.choice.equals("Mercy")) {
            TypedArray labels = res.obtainTypedArray(R.array.mercy);
            TypedArray ids = res.obtainTypedArray(R.array.mercyids);
            Sound[] sounds = new Sound[labels.length()];

            for (int i = 0; i < sounds.length; i++) {
                sounds[i] = new Sound(labels.getString(i), ids.getResourceId(i, -1));
            }

            labels.recycle();
            ids.recycle();

            return sounds;

        }

        else if (Constants.choice.equals("Pharah")) {
            TypedArray labels = res.obtainTypedArray(R.array.pharah);
            TypedArray ids = res.obtainTypedArray(R.array.pharahids);
            Sound[] sounds = new Sound[labels.length()];

            for (int i = 0; i < sounds.length; i++) {
                sounds[i] = new Sound(labels.getString(i), ids.getResourceId(i, -1));
            }

            labels.recycle();
            ids.recycle();

            return sounds;

        }

        else if (Constants.choice.equals("Reaper")) {
            TypedArray labels = res.obtainTypedArray(R.array.reaper);
            TypedArray ids = res.obtainTypedArray(R.array.reaperids);
            Sound[] sounds = new Sound[labels.length()];

            for (int i = 0; i < sounds.length; i++) {
                sounds[i] = new Sound(labels.getString(i), ids.getResourceId(i, -1));
            }

            labels.recycle();
            ids.recycle();

            return sounds;

        }

        else if (Constants.choice.equals("Reinhardt")) {
            TypedArray labels = res.obtainTypedArray(R.array.reinhardt);
            TypedArray ids = res.obtainTypedArray(R.array.reinhardtids);
            Sound[] sounds = new Sound[labels.length()];

            for (int i = 0; i < sounds.length; i++) {
                sounds[i] = new Sound(labels.getString(i), ids.getResourceId(i, -1));
            }

            labels.recycle();
            ids.recycle();

            return sounds;

        }

        else if (Constants.choice.equals("Roadhog")) {
            TypedArray labels = res.obtainTypedArray(R.array.roadhog);
            TypedArray ids = res.obtainTypedArray(R.array.roadhogids);
            Sound[] sounds = new Sound[labels.length()];

            for (int i = 0; i < sounds.length; i++) {
                sounds[i] = new Sound(labels.getString(i), ids.getResourceId(i, -1));
            }

            labels.recycle();
            ids.recycle();

            return sounds;

        }

        else if (Constants.choice.equals("Soldier: 76")) {
            TypedArray labels = res.obtainTypedArray(R.array.soldier);
            TypedArray ids = res.obtainTypedArray(R.array.soldierids);
            Sound[] sounds = new Sound[labels.length()];

            for (int i = 0; i < sounds.length; i++) {
                sounds[i] = new Sound(labels.getString(i), ids.getResourceId(i, -1));
            }

            labels.recycle();
            ids.recycle();

            return sounds;

        }

        else if (Constants.choice.equals("Symmetra")) {
            TypedArray labels = res.obtainTypedArray(R.array.symmetra);
            TypedArray ids = res.obtainTypedArray(R.array.symmetraids);
            Sound[] sounds = new Sound[labels.length()];

            for (int i = 0; i < sounds.length; i++) {
                sounds[i] = new Sound(labels.getString(i), ids.getResourceId(i, -1));
            }

            labels.recycle();
            ids.recycle();

            return sounds;

        }

        else if (Constants.choice.equals("Torbjorn")) {
            TypedArray labels = res.obtainTypedArray(R.array.torbjorn);
            TypedArray ids = res.obtainTypedArray(R.array.torbjornids);
            Sound[] sounds = new Sound[labels.length()];

            for (int i = 0; i < sounds.length; i++) {
                sounds[i] = new Sound(labels.getString(i), ids.getResourceId(i, -1));
            }

            labels.recycle();
            ids.recycle();

            return sounds;

        }

        else if (Constants.choice.equals("Tracer")) {
            TypedArray labels = res.obtainTypedArray(R.array.tracer);
            TypedArray ids = res.obtainTypedArray(R.array.tracerids);
            Sound[] sounds = new Sound[labels.length()];

            for (int i = 0; i < sounds.length; i++) {
                sounds[i] = new Sound(labels.getString(i), ids.getResourceId(i, -1));
            }

            labels.recycle();
            ids.recycle();

            return sounds;

        }

        else if (Constants.choice.equals("Widowmaker")) {
            TypedArray labels = res.obtainTypedArray(R.array.widowmaker);
            TypedArray ids = res.obtainTypedArray(R.array.widowmakerids);
            Sound[] sounds = new Sound[labels.length()];

            for (int i = 0; i < sounds.length; i++) {
                sounds[i] = new Sound(labels.getString(i), ids.getResourceId(i, -1));
            }

            labels.recycle();
            ids.recycle();

            return sounds;

        }

        else if (Constants.choice.equals("Winston")) {
            TypedArray labels = res.obtainTypedArray(R.array.winston);
            TypedArray ids = res.obtainTypedArray(R.array.winstonids);
            Sound[] sounds = new Sound[labels.length()];

            for (int i = 0; i < sounds.length; i++) {
                sounds[i] = new Sound(labels.getString(i), ids.getResourceId(i, -1));
            }

            labels.recycle();
            ids.recycle();

            return sounds;

        }

        else if (Constants.choice.equals("Zarya")) {
            TypedArray labels = res.obtainTypedArray(R.array.zarya);
            TypedArray ids = res.obtainTypedArray(R.array.zaryaids);
            Sound[] sounds = new Sound[labels.length()];

            for (int i = 0; i < sounds.length; i++) {
                sounds[i] = new Sound(labels.getString(i), ids.getResourceId(i, -1));
            }

            labels.recycle();
            ids.recycle();

            return sounds;

        }

        else if (Constants.choice.equals("Zenyatta")) {
            TypedArray labels = res.obtainTypedArray(R.array.zenyatta);
            TypedArray ids = res.obtainTypedArray(R.array.zenyattaids);
            Sound[] sounds = new Sound[labels.length()];

            for (int i = 0; i < sounds.length; i++) {
                sounds[i] = new Sound(labels.getString(i), ids.getResourceId(i, -1));
            }

            labels.recycle();
            ids.recycle();

            return sounds;

        }



        else
            return null;
    }
}



