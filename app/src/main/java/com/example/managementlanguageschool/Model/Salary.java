package com.example.managementlanguageschool.Model;

public class Salary {

    private int amount;
    private boolean paid;
    private Date date;
    private int ID;

    public Salary(int amount, boolean paid, Date date) {
        this.amount = amount;
        this.paid = paid;
        this.date = date;
    }

    public Salary(int id, int amount, boolean paid, Date date) {
        this.amount = amount;
        this.paid = paid;
        this.date = date;
        this.ID = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getID() {
        return ID;
    }

}
