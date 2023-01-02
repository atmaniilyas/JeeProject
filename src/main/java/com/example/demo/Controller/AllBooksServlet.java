package com.example.demo.Controller;

import com.example.demo.Model.Book;
import com.example.demo.Model.Category;
import com.example.demo.Model.Orders;
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
import static com.example.demo.Services.OrdersServices.getAllOrders;


@WebServlet(name = "AllBooksServlet", value = "/AllBooksServlet")
public class AllBooksServlet extends HttpServlet {
    private static  List<Orders> ordersList = getAllOrders();
    private static List<Book> allBooksLink = getAllBooks();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        List<Book> books = new ArrayList<>();
        try {
            Connection conn = getConnection();
            PreparedStatement pst = conn.prepareStatement("select * from book");
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                Orders order = new Orders();
                Category category1 = new Category();
                Book book = new Book();
                book.setId(rs.getInt("id"));
                order.setId(rs.getInt("id"));
                book.setPages(rs.getString("pages"));
                book.setQte(rs.getInt("qte"));
                book.setBookimg(rs.getString("bookimg"));
                book.setTitle(rs.getString("title"));
                book.setPrice(rs.getDouble("price"));
                book.setAuthor(rs.getString("author"));
                if(rs.getInt("category_id")==1) {
                    category1.setName("Comedy");
                    category1.setId(2);
                    book.setCategory(category1);
                }

                if(rs.getInt("category_id")==2) {
                    category1.setName("History");
                    category1.setId(2);
                    book.setCategory(category1);
                }
                if(rs.getInt("category_id")==3) {
                    category1.setName("Programming Language");
                    category1.setId(3);
                    book.setCategory(category1);
                }
                if(rs.getInt("category_id")==4) {
                    category1.setName("Arts");
                    category1.setId(4);
                    book.setCategory(category1);
                }
                order.setCount(0);
                ordersList.add(order);
                book.setOrders(ordersList);
                books.add(book);


            }
            rs.close();
            pst.close();
            conn.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        request.setAttribute("list",books);
        request.getRequestDispatcher("AllBooks.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
