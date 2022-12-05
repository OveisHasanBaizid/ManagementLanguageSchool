package com.example.managementlanguageschool.Model;

import androidx.annotation.NonNull;

import java.io.Serializable;

/* This class simulates the clock
and includes hour and minute fields
 */
public class Time implements Serializable {
    private final int hour;
    private final int minutes;

    public Time(int hour, int minutes) {
        this.hour = hour;
        this.minutes = minutes;
    }

    public Time(String line) {
        String[] a = line.split(":");
        this.hour = Integer.parseInt(a[0]);
        this.minutes = Integer.parseInt(a[1]);
    }
    @NonNull
    @Override
    public String toString() {
        String h = String.valueOf(hour);
        if (hour < 10)
            h = "0" + h;
        String m = String.valueOf(minutes);
        if (minutes < 10)
            m = "0" + m;
        return h + ":" + m;
    }
}
