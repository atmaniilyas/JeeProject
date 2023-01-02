package com.example.demo.DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class MaConnection  {
    static Connection conn;
    public static Connection getConnection() throws Exception{
    String url_db = "jdbc:mysql://localhost:3306/booktp";
    String user_db = "root";
    String pwd_db = "1234";
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url_db, user_db, pwd_db);
    } catch (Exception e) {
        e.printStackTrace();
    }
    return conn;
    }
}
