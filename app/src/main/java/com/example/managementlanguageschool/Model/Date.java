package com.example.managementlanguageschool.Model;
import android.annotation.SuppressLint;

import androidx.annotation.NonNull;

import java.io.Serializable;
import java.text.SimpleDateFormat;

public class Date implements Serializable {
    private int year;
    private int month;
    private int day;

    public Date() {

    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Date(Date d) {
        if (d != null) {
            this.year = d.year;
            this.month = d.month;
            this.day = d.day;
        }
    }

    public Date(String line) {
        String a[] = line.split("/");
        this.year = Integer.parseInt(a[0]);
        this.month = Integer.parseInt(a[1]);
        this.day = Integer.parseInt(a[2]);
    }

    @SuppressLint("SimpleDateFormat")
    public Date(java.util.Date date) {
        this(new SimpleDateFormat("yyyy/MM/dd").format(date));
    }
    @NonNull
    @Override
    public String toString() {
        String y = String.valueOf(year);
        if (year < 10)
            y = "0" + y;
        String m = String.valueOf(month);
        if (month < 10)
            m = "0" + m;
        String d = String.valueOf(day);
        if (day < 10)
            d = "0" + d;
        return y + "/" + m + "/" + d;
    }
}
