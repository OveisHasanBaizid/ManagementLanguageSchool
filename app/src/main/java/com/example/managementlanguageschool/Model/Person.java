package com.example.managementlanguageschool.Model;

import java.io.Serializable;

public class Person implements Serializable {
    private String firstName;
    private String lastName;
    private Date birthDay;
    private char gender;
    private long nationalCode;
    private long phoneNumber;

    public Person(String firstName, String lastName, Date birthDay, char gender, long nationalCode, long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.gender = gender;
        this.nationalCode = nationalCode;
        this.phoneNumber = phoneNumber;
    }

    public Person() {

    }

    public Person(Person p) {
        this.firstName = p.firstName;
        this.lastName = p.lastName;
        this.birthDay = p.birthDay;
        this.gender = p.gender;
        this.nationalCode = p.nationalCode;
        this.phoneNumber = p.phoneNumber;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public Person(String line) {
        decoder(line);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public long getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(long nationalCode) {
        this.nationalCode = nationalCode;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    //It acts like the toString method and converts an object into a string in a specific format

    public String coder() {
        return this.firstName + "," + this.lastName + "," + this.birthDay + "," + this.gender + "," + this.nationalCode + "," + this.phoneNumber;
    }

    //Receives the object as a string and separates and decodes it
    public void decoder(String line) {
        String[] array;
        array = line.split(",");
        this.firstName = array[0];
        this.lastName = array[1];
        this.birthDay = new Date(array[2]);
        this.gender = array[3].charAt(0);
        this.nationalCode = Long.parseLong(array[4]);
        this.phoneNumber = Long.parseLong(array[5]);
    }
}
