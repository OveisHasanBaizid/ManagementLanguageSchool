package com.example.managementlanguageschool.Model;

import java.io.Serializable;

public class Manager extends Person implements Serializable {
    private String username;
    private String password;

    public Manager(String firstName, String lastName, Date birthDay, char gender
            , long nationalCode, long phoneNumber, String username, String password) {
        super(firstName, lastName, birthDay, gender, nationalCode, phoneNumber);
        this.username = username;
        this.password = password;
    }

    public Manager(Person p, String username, String password) {
        super(p);
        this.username = username;
        this.password = password;
    }

    public Manager(String line) {
        String[] array = line.split("//");
        super.decoder(array[0]);
        decoder(array[1]);
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
    //It acts like the toString method and converts an object into a string in a specific format

    public String coder() {
        return super.coder() + "//" + username + "," + password;
    }

    //Receives the object as a string and separates and decodes it
    public void decoder(String line) {
        String[] array = line.split(",");
        this.username = array[0];
        this.password = array[1];
    }
}
