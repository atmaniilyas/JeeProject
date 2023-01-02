package com.example.demo.Services;

import com.example.demo.DatabaseConnection.MaConnection;
import com.example.demo.Model.Role;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashSet;

import java.util.Set;

public class RoleServices extends MaConnection {

    public static String getRoleAdminName() throws Exception{
        try {
            Connection con = getConnection();
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery("SELECT roleName FROM role where id =2");
            String adminRole = String.valueOf(rs);
            return adminRole;
        }catch (Exception e){
            e.printStackTrace();
        }
        return "Error";
    }
    public static String getRoleClientName() throws Exception{
        try {
            Connection con = getConnection();
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery("SELECT roleName FROM role where id =1");
            String clientRole = String.valueOf(rs);
            return clientRole;
        }catch (Exception e){
            e.printStackTrace();
        }
        return "Error";
    }
}
