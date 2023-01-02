<%@ page import="com.example.demo.Model.User" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.demo.Model.Book" %>
<%@ page import="com.example.demo.Model.Orders" %>
<%@ page import="static com.example.demo.Services.BookServices.getAllBooks" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%!User user ; %>
<%
    user = (User) session.getAttribute("user");
    if(this.user==null){
        request.getRequestDispatcher("admin.jsp").forward(request,response);
    }
%>
<%
    List<Book> books = (List<Book>) request.getAttribute("list");
    List<Orders> ordersList =(List<Orders>) request.getAttribute("orderList");
%>
<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <title>All Books</title>
</head>
<body>
<table class="table">
    <thead>
    <tr>
        <th scope="col">id</th>
        <th scope="col">title</th>
        <th scope="col">Author</th>
        <th scope="col">Pages</th>
        <th scope="col">qte</th>
        <th scope="col">price</th>
        <th scope="col">bookimg</th>
        <th scope="col">category</th>
        <th scope="col">Orders</th>
        <th scope="col">Actions</th>
    </tr>
    </thead>
    <tbody>
    <%
        //Book book : books
        for(int i = 0 ; i<books.size() ; i++){
            Book book = books.get(i);
    %>
    <tr>
        <%String imgPath = book.getBookimg(); %>

        <input type="hidden" name="id" value="<%=book.getId()%>">
        <td><%=book.getId()%></td>

        <input type="hidden" name="title" value="<%=book.getTitle()%>">
        <td><%=book.getTitle() %></td>

        <input type="hidden" name="author" value="<%=book.getAuthor()%>">
        <td><%=book.getAuthor() %></td>

        <input type="hidden" name="pages" value="<%=book.getPages()%>">
        <td><%=book.getPages() %></td>

        <input type="hidden" name="qte" value="<%=book.getQte()%>">
        <td><%=book.getQte() %></td>

        <input type="hidden" name="price" value="<%=book.getPrice()%>">
        <td><%=book.getPrice() %>$</td>

        <input type="hidden" name="bookImg" value="<%=book.getBookimg()%>">
        <td><img width="40cm" height="40cm" src="img/<%=imgPath%>"> </td>

        <td><%=book.getCategory().getName()%></td>

        <td><%=book.getOrders().get(i).getCount()%></td>

        <td><a href="BookUpdate?id=<%=book.getId()%>"><button class="btn btn-primary" type="submit">Edit Book</button></a>&nbsp;<a href="DeleteBook?id=<%=book.getId()%>"><button class="btn btn-danger">Delete Book</button></a></td>
    </tr>
    <% } %>
    </tbody>
</table>
<a href="addBook.jsp"><input type="button" class="btn btn-primary" value="addBook"></a>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>
