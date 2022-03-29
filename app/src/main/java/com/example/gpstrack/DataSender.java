package com.example.gpstrack;

import android.location.Location;

public class DataSender {
    private static Location current;
    public static void setCurrent(Location l){
        current = l;
    }

    public static Location getCurrent() {
        return current;
    }
}
