package com.example.demo.Controller;

import com.example.demo.Model.Book;
import com.example.demo.Model.MethodePayment;
import com.example.demo.Model.Orders;
import com.example.demo.Model.User;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

import static com.example.demo.DatabaseConnection.MaConnection.getConnection;

@WebServlet(name = "AddOrderServlet", value = "/AddOrder")
public class AddOrderServlet extends HttpServlet {
    private static int idc;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Book book = new Book();
        try{
            Connection connection = getConnection();
            PreparedStatement pst = connection.prepareStatement("SELECT * from book where id =?");
            pst.setInt(1,id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                book.setId(rs.getInt("id"));
                book.setTitle(rs.getString("title"));
                book.setPages(String.valueOf(rs.getInt("pages")));
                book.setQte(rs.getInt("qte"));
                book.setAuthor(rs.getString("author"));
                book.setBookimg(rs.getString("bookimg"));
                book.setPrice(rs.getDouble("price"));
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        request.setAttribute("book",book);
        HttpSession sessionId = request.getSession(true);
        sessionId.setAttribute("id",id);
        HttpSession sessionBook = request.getSession(true);
        sessionBook.setAttribute("bookSession",book);
        request.getRequestDispatcher("AddOrder.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            HttpSession session = request.getSession(true);
            int id = (int) session.getAttribute("id");
            HttpSession sessionBook = request.getSession(true);
            Book book = (Book) sessionBook.getAttribute("bookSession");
            Date date = new Date();
            long millis = System.currentTimeMillis();
            java.sql.Date dateT = new java.sql.Date(millis);
            String title = book.getTitle()+book.getAuthor()+book.getPages()+date.getTime();
            int methodeDePayment = Integer.parseInt(request.getParameter("methodePayment"));
            Orders orders = new Orders();
            try{
                Connection connection = getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("INSERT into orders (order_name, date_order, book_id, id_methodepayment, counto) values (?,?,?,?,?)");
                preparedStatement.setString(1,title);
                preparedStatement.setDate(2,dateT);
                preparedStatement.setInt(3,id);
                preparedStatement.setInt(4,methodeDePayment);
                preparedStatement.setInt(5,idc++);
                preparedStatement.executeUpdate();
                orders.setCount(idc);
                orders.setDate_order(dateT);
                orders.setOrder_name(title);
            }catch (Exception e){
                e.printStackTrace();
            }
            request.setAttribute("order",orders);
            request.getRequestDispatcher("Orders.jsp").forward(request,response);
    }
}
