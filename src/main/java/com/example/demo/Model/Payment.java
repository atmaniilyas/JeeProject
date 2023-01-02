package com.example.demo.Model;

import java.util.Date;

public class Payment {
    private int id;
    private Date date_payment;
    private String description;
    private MethodePayment methodePayment;

    public Payment() {
    }

    public Payment(int id, Date date_payment, String description, MethodePayment methodePayment) {
        this.id = id;
        this.date_payment = date_payment;
        this.description = description;
        this.methodePayment = methodePayment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate_payment() {
        return date_payment;
    }

    public void setDate_payment(Date date_payment) {
        this.date_payment = date_payment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MethodePayment getMethodePayment() {
        return methodePayment;
    }

    public void setMethodePayment(MethodePayment methodePayment) {
        this.methodePayment = methodePayment;
    }
}
