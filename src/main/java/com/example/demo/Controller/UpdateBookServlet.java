package com.example.demo.Controller;

import com.example.demo.Model.Book;
import com.example.demo.Model.Category;
import com.example.demo.Model.User;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import static com.example.demo.DatabaseConnection.MaConnection.getConnection;
import static com.example.demo.Services.BookServices.getAllBooks;
import static com.example.demo.Services.UserServices.getUserId;

@WebServlet(name = "UpdateBookServlet", value = "/UpdateBookServlet")
public class UpdateBookServlet extends HttpServlet {
    private static List<Book> books = getAllBooks();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String title = request.getParameter("title");
        String pages = request.getParameter("pages");
        String qte = request.getParameter("qte");
        String author = request.getParameter("author");
        String bookImg = request.getParameter("bookImg");
        double price = Double.parseDouble(request.getParameter("price"));
        int categoryId = Integer.parseInt(request.getParameter("categoryid"));
        HttpSession session = request.getSession(true);
        User user = (User) session.getAttribute("user");
        try{
            Connection connection = getConnection();
            PreparedStatement pst = connection.prepareStatement("UPDATE book SET pages=?,qte=?,author=?,user_id=?,bookimg=?,title=?,category_id=?,price=? WHERE id = ?");
            pst.setInt(1, Integer.parseInt(pages));
            pst.setInt(2, Integer.parseInt(qte));
            pst.setString(3,author);
            pst.setInt(4,getUserId(user.getUsername(), user.getPassword()));
            pst.setString(5,bookImg);
            pst.setString(6,title);
            pst.setInt(7,categoryId);
            pst.setDouble(8,price);
            pst.setInt(9,id);
            pst.executeUpdate();
            for (int i =0 ; i<books.size() ; i++){
                if (books.get(i).getId()==id){
                    books.get(i).setTitle(title);
                    books.get(i).setPages(pages);
                    Category category = new Category();
                    category.setId(categoryId);
                    books.get(i).setCategory(category);
                    books.get(i).setQte(Integer.parseInt(qte));
                    books.get(i).setBookimg(bookImg);
                    books.get(i).setAuthor(author);
                    books.get(i).setPrice(price);
                }
            }
            System.out.println(categoryId);
            pst.close();
            connection.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        request.getRequestDispatcher("AllBook.jsp").forward(request,response);
    }
}
