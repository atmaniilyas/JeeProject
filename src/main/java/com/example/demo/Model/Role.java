package com.example.demo.Model;

public class Role {
    private int id;
    private String role_name;
    private User user;

    public Role() {
    }

    public Role(int id, String role_name, User user) {
        this.id = id;
        this.role_name = role_name;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
