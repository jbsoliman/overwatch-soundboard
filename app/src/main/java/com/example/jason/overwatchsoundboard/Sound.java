package com.example.jason.overwatchsoundboard;

/**
 * Created by Jason on 2016-07-05.
 */

public class Sound {

    private String mName;
    private int mResourceId;

    public Sound(String name, int resourceId) {
        this.mName = name;
        this.mResourceId = resourceId;
    }

    public int getResourceId() {
        return mResourceId;
    }

    public void setResourceId(int resourceId) {
        this.mResourceId = resourceId;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    @Override
    public String toString() {
        return mName;
    }
}
