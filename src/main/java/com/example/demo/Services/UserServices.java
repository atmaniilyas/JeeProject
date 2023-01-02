package com.example.demo.Services;

import com.example.demo.DatabaseConnection.MaConnection;
import com.example.demo.Model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import static com.example.demo.Services.AdminPortal.getListUsers;

public class UserServices extends MaConnection{

    public void addClient() throws Exception{
       Connection conn = getConnection();
    }
    public static User getUser(String username){
        User user1 = new User();
        user1.setUsername(username);
        List<User> users= getListUsers();
        for (int i =0;i<users.size();i++){
            if(user1.equals(users.get(i).getUsername())){
                return users.get(i);
            }
        }
        return null;
    }
    public static int getUserId(String username , String password) throws Exception {
        int id = 0;
        Connection connection= getConnection();
        PreparedStatement psmt = connection.prepareStatement("SELECT id FROM user where username=? and password=?");
        psmt.setString(1, username);
        psmt.setString(2, password);
        ResultSet rs = psmt.executeQuery();
        while (rs.next()) {
            id = rs.getInt("id");
        }
        return id;
    }
}
