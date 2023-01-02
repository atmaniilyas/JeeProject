package com.example.demo.Controller;


import com.example.demo.Model.Role;
import com.example.demo.Model.User;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.List;

import static com.example.demo.Services.AdminPortal.*;
import static com.example.demo.Services.RoleServices.getRoleAdminName;


@WebServlet(name = "AdminPortalServlet", value = "/admin")
public class AdminPortalServlet extends HttpServlet {
    private static List<User> adminUsers = getListUsers();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        try {
            Connection conn = getConnection();
            PreparedStatement psmt = conn.prepareStatement("SELECT * FROM user where username=? and password=? and id_role=2");
            psmt.setString(1, username);
            psmt.setString(2, password);
            ResultSet rs = psmt.executeQuery();
            User user = new User();
            while (rs.next()) {
                user.setId(rs.getInt("id"));
                user.setFirstname(rs.getString("firstName"));
                user.setLastName(rs.getString("lastName"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setEmail(rs.getString("email"));
                Role role = new Role();
                role.setId(2);
                role.setRole_name(getRoleAdminName());
                roles.add(role);
                user.setRoles(roles);
                adminUsers.add(user);
                HttpSession adminSession = request.getSession(true);
                adminSession.setAttribute("user",user);
            }
            rs.close();
            psmt.close();
            conn.close();

            request.getRequestDispatcher("adminPortal.jsp").forward(request, response);
        }catch (Exception e){
            e.printStackTrace();
            request.getRequestDispatcher("error.jsp").forward(request,response);
        }

    }
}
