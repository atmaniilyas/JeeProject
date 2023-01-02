package com.example.demo.Controller;

import com.example.demo.Model.Book;
import com.example.demo.Model.User;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import static com.example.demo.DatabaseConnection.MaConnection.getConnection;

@WebServlet(name = "RegisterServlet", value = "/Register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstname =request.getParameter("firstname");
        String lastname =request.getParameter("lastname");
        String username = request.getParameter("username");
        String pass=request.getParameter("password");
        String email = request.getParameter("email");

        try {
            Connection conn = getConnection();
            PreparedStatement pst = conn.prepareStatement("insert into user (firstname,lastname,username,password,email,id_role) values(?,?,?,?,?,?)");

            pst.setString(1,firstname);
            pst.setString(2,lastname);
            pst.setString(3,username);
            pst.setString(4,pass);
            pst.setString(5,email);
            pst.setInt(6,1);
            pst.executeUpdate();
            pst.close();
            conn.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        request.getRequestDispatcher("myAccount.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
