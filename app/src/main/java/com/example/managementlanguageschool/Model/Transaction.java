package com.example.managementlanguageschool.Model;

public class Transaction {
    private final int ID;
    private final String transaction_type;
    private final String destination;
    private final int amount;
    private Date date;

    public Transaction(int ID, String transaction_type, String destination, int amount, Date date) {
        this.ID = ID;
        this.transaction_type = transaction_type;
        this.destination = destination;
        this.amount = amount;
        this.date = date;
    }

    public int getID() {
        return ID;
    }

    public String getTransaction_type() {
        return transaction_type;
    }

    public String getDestination() {
        return destination;
    }

    public int getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

