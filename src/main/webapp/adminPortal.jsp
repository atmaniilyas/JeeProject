<%@ page import="com.example.demo.Model.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%!User user ; %>
<%
    user = (User) session.getAttribute("user");
    if(this.user==null){
            request.getRequestDispatcher("admin.jsp").forward(request,response);
    }
%>
<html>
<head>
    <TITLE>Admin Portal</TITLE>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
    <a class="navbar-brand">Ecomm Project</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample09" aria-controls="navbarsExample09" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarsExample09">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="#">Shopping Cart <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="Logout.jsp">Log Out</a>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Books
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <a class="dropdown-item" href="#">Browse The Books</a>
                    <a class="dropdown-item" href="#">Store Hours &#38; Directions</a>
                    <div class="dropdown-divider"></div>
                    <a class="dropdown-item" href="#">FAQ</a>
                </div>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="Logout.jsp">Log Out</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Welcome <% out.print(user.getLastName());%></a>
            </li>
        </ul>
        <form class="form-inline my-2 my-md-0">
            <div class="form-group">
                <input class="form-control" type="text" placeholder="Search Book" aria-label="Search" name="keyword">
            </div>
            <button type="submit" class="btn btn-primary">Search</button>
        </form>
    </div>
</nav>
<div class="container">
     <a href="addBook.jsp"><input class="btn btn-primary" type="button" value="Add Book"></a>
     <a href="AllBooksServlet"><input class="btn btn-primary" type="button" value="AllBooks"></a>
</div>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>
