package com.example.managementlanguageschool.Model;

import java.io.Serializable;

public class Student extends Person implements Serializable {
    private final float average;
    private final Date registrationDate;
    private final int tuitionID;
    private final int courseID;

    public Student(String firstName, String lastName, Date birthDay, char gender, long nationalCode, long phoneNumber, float average, Date registrationDate, int tuitionID, int courseID) {
        super(firstName, lastName, birthDay, gender, nationalCode, phoneNumber);
        this.average = average;
        this.registrationDate = registrationDate;
        this.tuitionID = tuitionID;
        this.courseID = courseID;
    }

    public Student(Person person, float average, Date registrationDate, int tuitionID, int courseID) {
        super(person);
        this.courseID = courseID;
        this.average = average;
        this.registrationDate = registrationDate;
        this.tuitionID = tuitionID;
    }

    public int getCourseID() {
        return courseID;
    }

    public float getAverage() {
        return average;
    }
    public Date getRegistrationDate() {
        return registrationDate;
    }
    public int getTuitionID() {
        return tuitionID;
    }
}
