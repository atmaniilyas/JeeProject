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
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import static com.example.demo.DatabaseConnection.MaConnection.getConnection;
import static com.example.demo.Services.BookServices.getAllBooks;
import static com.example.demo.Services.CategoriesServices.*;
import static com.example.demo.Services.CategoriesServices.innitArts;
import static com.example.demo.Services.UserServices.getUserId;

@WebServlet(name = "BookIdServlet", value = "/BookUpdate")
public class BookIdServlet extends HttpServlet {
   private static List<Book> books = getAllBooks();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        try {
            Connection connection = getConnection();
            PreparedStatement pst = connection.prepareStatement("SELECT * from book where id=?");
            pst.setInt(1,id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Book book = new Book();
                book.setId(rs.getInt("id"));
                book.setPages(String.valueOf(rs.getInt("pages")));
                book.setQte(rs.getInt("qte"));
                book.setAuthor(rs.getString("author"));
                book.setBookimg(rs.getString("bookimg"));
                book.setTitle(rs.getString("title"));
                book.setPrice(rs.getDouble("price"));
                Category category = new Category();
                if(category.equals("1")) {
                    book.setCategory(innitComedy());
                    category.setName("Comedy");
                }
                if(category.equals("2")) {
                    book.setCategory(innitHistory());
                    category.setName("History");
                }
                if(category.equals("3")) {
                    book.setCategory(innitProgrammingLanguage());
                    category.setName("Programming Language");
                }
                if(category.equals("4")) {
                    book.setCategory(innitArts());
                    category.setName("Arts");
                }
                book.setCategory(category);
                HttpSession IDS= request.getSession();
                IDS.setAttribute("id",book.getId());
                request.setAttribute("book",book);
            }
            rs.close();
            pst.close();
            connection.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        request.getRequestDispatcher("UpdateBook.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession ids= request.getSession();
        int id = Integer.parseInt(ids.getAttribute("id").toString());
        String title = request.getParameter("title");
        String pages = request.getParameter("pages");
        String qte = request.getParameter("qte");
        String author = request.getParameter("author");
        String bookImg = request.getParameter("bookImg");
        double price = Double.parseDouble(request.getParameter("price"));
        int categoryId = Integer.parseInt(request.getParameter("category"));
        HttpSession session = request.getSession(true);
        User user = (User) session.getAttribute("user");
        Category category = new Category();
        try {
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
            if(category.equals("1")) {
                category.setName("Comedy");
                category.setId(1);

            }
            if(category.equals("2")) {
                category.setName("History");
                category.setId(2);
            }
            if(category.equals("3")) {
                category.setName("Programming Language");
                category.setId(3);
            }
            if(category.equals("4")) {
                category.setName("Arts");
                category.setId(4);
            }
            for (int i =0 ; i<books.size() ; i++){
                if (books.get(i).getId()==id){
                    books.get(i).setTitle(title);
                    books.get(i).setPages(pages);
                    books.get(i).setCategory(category);
                    books.get(i).setQte(Integer.parseInt(qte));
                    books.get(i).setBookimg(bookImg);
                    books.get(i).setAuthor(author);
                    books.get(i).setPrice(price);
                    System.out.println(category);
                }
            }
            pst.close();
            connection.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        request.setAttribute("list",books);
        response.sendRedirect("AllBooksServlet");

    }
}
