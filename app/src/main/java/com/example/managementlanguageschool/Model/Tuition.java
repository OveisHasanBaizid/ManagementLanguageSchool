package com.example.managementlanguageschool.Model;

public class Tuition {
    private final int amount;
    private boolean isPaid;
    private final Date datePay;

    public Tuition(int amount, boolean isPaid, Date datePay) {
        this.amount = amount;
        this.isPaid = isPaid;
        this.datePay = datePay;
    }

    public int getAmount() {
        return amount;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public Date getDatePay() {
        return datePay;
    }
}
