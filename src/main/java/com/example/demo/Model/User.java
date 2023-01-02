package com.example.demo.Model;

import java.util.List;
import java.util.Set;

public class User {
    private int id;
    private String Firstname;
    private String LastName;
    private String username;
    private String password;
    private String email;
    private Set<Role> roles;
    private List<Book> books;

    public User() {
    }

    public User(int id, String firstname, String lastName, String username, String password, String email, Set<Role> roles, List<Book> books) {
        this.id = id;
        Firstname = firstname;
        LastName = lastName;
        this.username = username;
        this.password = password;
        this.email = email;
        this.roles = roles;
        this.books = books;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
