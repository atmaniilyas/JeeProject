package com.example.demo.Services;

import com.example.demo.DatabaseConnection.MaConnection;
import com.example.demo.Model.Role;
import com.example.demo.Model.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AdminPortal extends MaConnection implements ServicesImpl {
    public static Set<Role> roles = new HashSet<>();
    private static List<User> adminUsers = new ArrayList<>();
    private static List<User> clientUsers = new ArrayList<>();
    public static List<User> getListUsers() {
        return adminUsers;
    }


    public static List<User> addToAdminList(User user){
        adminUsers.add(user);

        return adminUsers;
    }

    public static List<User> getListClientUsers() {
        return clientUsers;
    }

}
