package com.example.managementlanguageschool.Model;

import java.io.Serializable;

public class Course implements Serializable {
    private String title;
    private final String termTitle;
    private long teacherID;
    private Time classTime;
    private String nameBook;
    private int tuitionAmount;
    private int numberSessions;

    public Course(String title, String termID, long teacherID, Time courseTime, String nameBook, int tuitionAmount, int numberSessions) {
        this.title = title;
        this.termTitle = termID;
        this.teacherID = teacherID;
        this.classTime = courseTime;
        this.nameBook = nameBook;
        this.tuitionAmount = tuitionAmount;
        this.numberSessions = numberSessions;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getTeacher() {
        return teacherID;
    }

    public void setTeacher(long teacherID) {
        this.teacherID = teacherID;
    }

    public Time getClassTime() {
        return classTime;
    }

    public String getNameBook() {
        return nameBook;
    }

    public int getTuitionAmount() {
        return tuitionAmount;
    }

    public int getNumberSessions() {
        return numberSessions;
    }

    public String getTermTitle() {
        return termTitle;
    }
}
