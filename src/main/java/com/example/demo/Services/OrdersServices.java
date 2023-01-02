package com.example.demo.Services;

import com.example.demo.Model.Orders;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.example.demo.DatabaseConnection.MaConnection.getConnection;

public class OrdersServices {
    private static List<Orders> ordersList = new ArrayList<>();

    public static List<Orders> getAllOrders(){

        return ordersList;
    }

    private static void addOrder(String nameOfOrder, Date dateOfOrder , int bookId , int idMethode , int countOfOrders) throws Exception{
        /*SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        dateOfOrder = dateFormat.parse(String.valueOf(dateOfOrder));*/
        try {
            Connection connection = getConnection();
            PreparedStatement pst = connection.prepareStatement("insert into orders(order_name,date_order,book_id,id_methodepayement,counto) values (?,?,?,?,?)");
            pst.setString(1,nameOfOrder);
            pst.setDate(2, (java.sql.Date) dateOfOrder);
            pst.setInt(3,bookId);
            pst.setInt(4,idMethode);
            pst.setInt(5,countOfOrders);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
