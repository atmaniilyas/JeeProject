package com.example.demo.Model;

import java.io.File;
import java.util.List;

public class Book {
    private int id;
    private String title;
    private String pages;
    private int qte;
    private double price;
    private String author;
    private String bookimg;
    private List<User> users;
    private Category category;
    private List<Orders>orders;

    public Book() {
    }

    public Book(int id, String title, String pages, int qte, String author, String bookimg, List<User> users, Category category, List<Orders> orders,double price) {
        this.id = id;
        this.title = title;
        this.pages = pages;
        this.qte = qte;
        this.author = author;
        this.bookimg = bookimg;
        this.users = users;
        this.category = category;
        this.orders = orders;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookimg() {
        return bookimg;
    }

    public void setBookimg(String bookimg) {
        this.bookimg = bookimg;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", pages='" + pages + '\'' +
                ", qte=" + qte +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", bookimg='" + bookimg + '\'' +
                ", users=" + users +
                ", category=" + category +
                ", orders=" + orders +
                '}';
    }
}
