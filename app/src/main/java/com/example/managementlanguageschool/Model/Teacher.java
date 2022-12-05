package com.example.managementlanguageschool.Model;

import java.io.Serializable;

public class Teacher extends Person implements Serializable {
    private final String degree;
    private final int salaryID;
    public Teacher(Person p, String degree, int salary) {
        super(p);
        this.degree = degree;
        this.salaryID = salary;
    }

    public int getSalaryID() {
        return salaryID;
    }

    public String getDegree() {
        return degree;
    }

}
