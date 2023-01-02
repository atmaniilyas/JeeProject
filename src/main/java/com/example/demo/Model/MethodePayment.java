package com.example.demo.Model;

import java.util.List;

public class MethodePayment {
    private int id;
    private String methode;
    private Orders orders;
    private List<Payment> payments;

    public MethodePayment() {
    }

    public MethodePayment(int id, String methode, Orders orders, List<Payment> payments) {
        this.id = id;
        this.methode = methode;
        this.orders = orders;
        this.payments = payments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMethode() {
        return methode;
    }

    public void setMethode(String methode) {
        this.methode = methode;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }
}
