package com.example.demo.Controller;

import com.example.demo.Model.Book;
import com.example.demo.Model.Role;
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

import static com.example.demo.Services.AdminPortal.*;
import static com.example.demo.Services.BookServices.getAllBooks;
import static com.example.demo.Services.BookServices.getAllBooksClient;
import static com.example.demo.Services.RoleServices.getRoleClientName;

@WebServlet(name = "LoginServlet", value = "/Login")
public class LoginServlet extends HttpServlet {
    private static List<User> clientUsers = getListClientUsers();
    private static List<Book> books = new ArrayList<>();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String pass = request.getParameter("password");
        try {
            Connection conn = getConnection();
            PreparedStatement pst = conn.prepareStatement("select * from user where username=? and password=? and id_role=1");
            pst.setString(1, username);
            pst.setString(2, pass);
            ResultSet rs = pst.executeQuery();
            User user = new User();
            while (rs.next()) {
                user.setId(rs.getInt("id"));
                user.setFirstname(rs.getString("firstName"));
                user.setLastName(rs.getString("lastName"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setEmail(rs.getString("email"));
                Role role = new Role();
                role.setId(1);
                role.setRole_name(getRoleClientName());
                roles.add(role);
                user.setRoles(roles);
                clientUsers.add(user);
            }
            System.out.println(books.toString());
            rs.close();
            rs.close();
            conn.close();
            HttpSession adminSession = request.getSession(true);
            adminSession.setAttribute("user",user);

        }catch (Exception e){
            e.printStackTrace();
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
        books = getAllBooksClient();
        //request.setAttribute("list",books);
        response.sendRedirect("books.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doGet(request, response);
    }
}
