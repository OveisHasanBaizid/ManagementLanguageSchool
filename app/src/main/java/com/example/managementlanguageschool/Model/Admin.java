package com.example.managementlanguageschool.Model;

import java.io.Serializable;

public class Admin extends Person implements Serializable {
    private String username;
    private String password;
    private int salaryID;

    public Admin(String firstName, String lastName, Date birthDay, char gender, long nationalCode
            , long phoneNumber, String username, String password, int salaryID) {
        super(firstName, lastName, birthDay, gender, nationalCode, phoneNumber);
        this.username = username;
        this.password = password;
        this.salaryID = salaryID;
    }

    public Admin(Person p, String username, String password, int salaryID) {
        super(p);
        this.username = username;
        this.password = password;
        this.salaryID = salaryID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSalaryID() {
        return salaryID;
    }

    public void setSalary(int salaryID) {
        this.salaryID = salaryID;
    }

    //It acts like the toString method and converts an object into a string in a specific format
    public String coder() {
        return super.coder() + "//" + username + "," + password + "," + salaryID;
    }

    //Receives the object as a string and separates and decodes it
    public void decoder(String line) {
        String[] array;
        array = line.split(",");
        this.username = array[0];
        this.password = array[1];
        this.salaryID = Integer.parseInt(array[2]);
    }
}
