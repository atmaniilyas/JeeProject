<%@ page import="com.example.demo.Model.User" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.demo.Model.Book" %>
<%@ page import="static com.example.demo.Services.BookServices.getAllBooks" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%!User user = new User();
%>
<%
 user = (User) session.getAttribute("user");
 if(user==null){
     request.getRequestDispatcher("myAccount.jsp").forward(request,response);
 }
 if(user.getUsername()==null)
 {
     request.getRequestDispatcher("myAccount.jsp").forward(request,response);
 }
%>
<% List<Book> books = getAllBooks();%>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.1/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
    <link rel="stylesheet" href="css/style.css">
    <title>books</title>
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
                <a class="nav-link" href="EditProfile.jsp">My Account</a>
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

        </ul>
        <form class="form-inline my-2 my-md-0">
            <div class="form-group">
                <input class="form-control" type="text" placeholder="Search Book" aria-label="Search" name="keyword">
            </div>
            <button type="button" class="btn btn-primary">Search</button>
        </form>
    </div>
</nav>

<div  class="container mt-5 mb-5 ">
    <%
        for(int i = 0 ; i<books.size() ; i++){
            Book book = books.get(i);
    %>
    <div class="card">
        <%String imgPath = book.getBookimg();%>
        <div class="row g-0">
            <div class="col-md-6 border-end">
                <div class="d-flex flex-column justify-content-center">
                    <div class="main_image">	<img src="img/<%=imgPath%>" id="main_product_image" width="313" height="500">	</div>
                    <div class="thumbnail_images">	</div>
                </div>
            </div>
            <div class="col-md-6">
                <div class=" right-side" style="padding-top: 150px" >
                    <div class="d-flex justify-content-between align-items-center">
                        <h3><%=book.getTitle()%></h3>

                    </div>
                    <div class="mt-2 pr-3 content">
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua</p>
                    </div>
                    <h3><%=book.getPrice()%>&nbsp; $</h3>
                    <div class="ratings d-flex flex-row align-items-center">
                        <div class="d-flex flex-row">	<i class='bx bxs-star' ></i>	<i class='bx bxs-star' ></i>	<i class='bx bxs-star' ></i>	<i class='bx bxs-star' ></i>	<i class='bx bx-star' ></i>	</div>
                        <span>Qte : <%=book.getQte()%></span>&nbsp;
                        <span>Pages : <%=book.getPages()%></span>
                    </div>
                    <div class="buttons d-flex flex-row mt-5 gap-3">	<a href="AddOrder?id=<%=book.getId()%>"><button class="btn btn-outline-dark">Order Now</button>	</a>	</div>
                    <i class='bx bx-share-alt share'></i>
                </div>
            </div>
        </div>
    </div>
    <% } %>
</div>
<hr/>
</div>

</body>
</html>
