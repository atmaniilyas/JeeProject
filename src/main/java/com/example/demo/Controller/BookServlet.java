package com.example.demo.Controller;


import com.example.demo.Model.Book;

import com.example.demo.Model.Category;
import com.example.demo.Model.Orders;
import com.example.demo.Model.User;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;


import static com.example.demo.DatabaseConnection.MaConnection.getConnection;
import static com.example.demo.Services.BookServices.*;
import static com.example.demo.Services.CategoriesServices.*;
import static com.example.demo.Services.OrdersServices.getAllOrders;
import static com.example.demo.Services.UserServices.getUserId;


@WebServlet(name = "BookServlet", value = "/addBook")
public class BookServlet extends HttpServlet {
    private static List<Book> books = getAllBooks();
    private static List<Orders> ordersList = getAllOrders();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String title = request.getParameter("title");
        String pages = request.getParameter("pagess");
        String qte = request.getParameter("qte");
        String author = request.getParameter("author");
        String bookimg = request.getParameter("bookimg");
        String category = request.getParameter("category");
        String price = request.getParameter("price");

        try{
            HttpSession session = request.getSession(true);
            User user = (User) session.getAttribute("user");
            Connection conn = getConnection();
            PreparedStatement ps = conn.prepareStatement("INSERT INTO book(pages,qte,author,user_id,bookimg,title,category_id,price) values (?,?,?,?,?,?,?,?)");
            ps.setString(1, pages);
            ps.setString(2, qte);
            ps.setString(3,author);
            ps.setInt(4,getUserId(user.getUsername(), user.getPassword()));
            ps.setString(5,bookimg);
            ps.setString(6,title);
            ps.setString(7, category);
            ps.setString(8,price);
            ps.executeUpdate();
            Book book = new Book();
            Orders order = new Orders();
            book.setId(bookId(author,title));
            order.setId(book.getId());
            book.setAuthor(author);
            book.setBookimg(bookimg);
            book.setQte(Integer.parseInt(qte));
            book.setPages(pages);
            Category category1 = new Category();
            if(category.equals("1")) {
                book.setCategory(innitComedy());
                category1.setName("Comedy");
            }
            if(category.equals("2")) {
                book.setCategory(innitHistory());
                category1.setName("History");
            }
            if(category.equals("3")) {
                book.setCategory(innitProgrammingLanguage());
                category1.setName("Programming Language");
            }
            if(category.equals("4")) {
                book.setCategory(innitArts());
                category1.setName("Arts");
            }
            order.setCount(0);
            ordersList.add(order);
            book.setOrders(ordersList);
            book.setCategory(category1);
            book.setTitle(title);
            ps.close();
            conn.close();
            request.getRequestDispatcher("adminPortal.jsp").forward(request,response);

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
