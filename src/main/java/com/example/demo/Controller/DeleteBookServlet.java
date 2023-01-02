package com.example.demo.Controller;

import com.example.demo.Model.Book;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import static com.example.demo.DatabaseConnection.MaConnection.getConnection;
import static com.example.demo.Services.BookServices.getAllBooks;

@WebServlet(name = "DeleteBookServlet", value = "/DeleteBook")
public class DeleteBookServlet extends HttpServlet {
    private static List<Book>books = getAllBooks();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id =Integer.parseInt(request.getParameter("id"));
        try{
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("delete from book where id=?");
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        request.setAttribute("list",books);
        response.sendRedirect("AllBooksServlet");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
