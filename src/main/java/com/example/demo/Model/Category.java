package com.example.demo.Model;

import java.util.List;

public class Category {
    private int id;
    private String name;
    private boolean actif;
    private List<Book>books;

    public Category() {
    }

    public Category(int id, String name, boolean actif, List<Book> books) {
        this.id = id;
        this.name = name;
        this.actif = actif;
        this.books = books;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActif() {
        return actif;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", actif=" + actif +
                ", books=" + books +
                '}';
    }
}
