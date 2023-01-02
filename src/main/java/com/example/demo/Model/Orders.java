package com.example.demo.Model;

import java.util.Date;
import java.util.List;

public class Orders {
    private int id;
    private String order_name;
    private Date date_order;
    private List<Book> books;
    private MethodePayment methodePayment;

    private int count;

    public Orders() {
    }

    public Orders(int id, String order_name, Date date_order, List<Book> books, MethodePayment methodePayment, int count) {
        this.id = id;
        this.order_name = order_name;
        this.date_order = date_order;
        this.books = books;
        this.methodePayment = methodePayment;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrder_name() {
        return order_name;
    }

    public void setOrder_name(String order_name) {
        this.order_name = order_name;
    }

    public Date getDate_order() {
        return date_order;
    }

    public void setDate_order(Date date_order) {
        this.date_order = date_order;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public MethodePayment getMethodePayment() {
        return methodePayment;
    }

    public void setMethodePayment(MethodePayment methodePayment) {
        this.methodePayment = methodePayment;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", order_name='" + order_name + '\'' +
                ", date_order=" + date_order +
                ", books=" + books +
                ", methodePayment=" + methodePayment +
                ", count=" + count +
                '}';
    }
}
