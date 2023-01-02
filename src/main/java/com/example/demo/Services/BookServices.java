package com.example.demo.Services;

import com.example.demo.DatabaseConnection.MaConnection;
import com.example.demo.Model.Book;
import com.example.demo.Model.Category;
import com.example.demo.Model.Orders;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BookServices extends MaConnection {
        private static List<Book> books ;

        public static List<Book> getAllBooks(){
            return books;
        }
        public static List<Book> addBook(Book book){
            books.add(book);
            return books;
        }
        public static int bookId(String author,String title) throws Exception{
            int id =0;
            Connection connection = getConnection();
            PreparedStatement psmt = connection.prepareStatement("SELECT id FROM book where author=? and title=?");
            psmt.setString(1, author);
            psmt.setString(2, title);
            ResultSet rs = psmt.executeQuery();
            while (rs.next()) {
                id = rs.getInt("id");
            }
            return id;
        }
        public static Book searchBookByTitle(int id){
            Book book = new Book();
            for (int i = 0 ; i<getAllBooks().size();i++){
                if (id == getAllBooks().get(i).getId()){
                    book.setTitle(getAllBooks().get(i).getTitle());
                    book.setPages(getAllBooks().get(i).getPages());
                    book.setCategory(getAllBooks().get(i).getCategory());
                    book.setId(getAllBooks().get(i).getId());
                    book.setQte(getAllBooks().get(i).getQte());
                    book.setBookimg(getAllBooks().get(i).getBookimg());
                    book.setAuthor(getAllBooks().get(i).getAuthor());
                    book.setCategory(getAllBooks().get(i).getCategory());
                    book.setPrice(getAllBooks().get(i).getPrice());
                    return book;
                }
            }
            return null;
        }
        public static List<Book> deleteBook(int id) throws Exception{
            for(int i =0 ; i<books.size();i++)
            {
                if (books.get(i).getId() == id)
                {
                    books.remove(books.get(i));
                }
                try{
                    Connection connection = getConnection();
                    PreparedStatement pst = connection.prepareStatement("DELETE from book where id = ?");
                    pst.setInt(1,id);
                    pst.executeUpdate();
                    pst.close();
                    connection.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            return books;
        }
        public static List<Book> updateBook(int id){
            try{
                Connection connection = getConnection();
                PreparedStatement pst = connection.prepareStatement("UPDATE book set pages=?,qte=?,author=?,user_id=? where id = ?");
                pst.setInt(1,id);
                pst.executeUpdate();
                pst.close();
                connection.close();
            }catch (Exception e){
                e.printStackTrace();
            }
            return books;
        }
    public static List<Book> getAllBooksClient(){
        books = new ArrayList<>();
        try {
            Connection conn = getConnection();
            PreparedStatement pst = conn.prepareStatement("select * from book");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
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
                if (rs.getInt("category_id") == 1) {
                    category1.setName("Comedy");
                    category1.setId(2);
                    book.setCategory(category1);
                }

                if (rs.getInt("category_id") == 2) {
                    category1.setName("History");
                    category1.setId(2);
                    book.setCategory(category1);
                }
                if (rs.getInt("category_id") == 3) {
                    category1.setName("Programming Language");
                    category1.setId(3);
                    book.setCategory(category1);
                }
                if (rs.getInt("category_id") == 4) {
                    category1.setName("Arts");
                    category1.setId(4);
                    book.setCategory(category1);
                }
                books.add(book);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return books;
    }
}
