<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html xmlns:th="http://www.w3.org/1999/xhtml">
<head>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<!-- navbar begein -->
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
        <a class="nav-link" href="myAccount.jsp">My Account</a>
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
      <button type="submit" class="btn btn-primary">Search</button>
    </form>
  </div>
</nav>

<!-- navbar end -->
<div class="container">
  <div class="row">
    <div class="col-xl-8" style="margin-bottom: -100px">
      <center>
        <h2 class="section-headline"><span class="badge badge-secondary">User Account</span></h2>
      </center>
    </div>
    <div class="col-xl-4">
      <img src="https://i.ibb.co/YRtKMT9/logo.png" class="img-fluid"/>
    </div>
  </div>
  <hr/>
  <img class="img-fluid" src="https://i.ibb.co/SdJ27PB/wood.jpg" style="margin-top: -75px"/>
  <hr/>
  <div class="row">
    <div class="col-9 offset-3">
      <ul class="nav nav-tabs" role="tablist">
        <li class="nav-item">
          <a class="nav-link" data-toggle="tab" href="#menu1">Log In</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" data-toggle="tab" href="#menu2">Forget Password</a>
        </li>
      </ul>
      <!-- Tab panes -->
      <div class="tab-content">
        <!--Log In-->
        <div id="menu1" class="container tab-pane fade" style="background-color: #ededed" ><br/>
          <form action ="#" method="post">
            <div class="form-group">
              <label for="newUsername">UserName *:</label>
              <input required="required" type="text" class="form-control" id="newUsername" name="username"/>
              <p style="color: #828282">Enter your Username here.</p>
            </div>
            <div class="form-group">
              <label for="password">Password :</label>
              <input required="required" type="password" class="form-control" id="password" name="password"/>
              <p style="color: #828282">Enter your Password.</p>
            </div>
            <button type="submit" class="btn btn-primary">Log In</button>
          </form>
        </div>
        <!--Forget Password -->
        <div id="menu2" class="container tab-pane fade" style="background-color: #ededed"><br/>
          <div  class="alert alert-success">Email Sent</div>
          <form action="#" method="post">
            <div class="form-group">
              <label for="recoverEmail">Email *:</label>
              <input required="required" type="text" class="form-control" id="recoverEmail" name="email"/>
              <p style="color: #828282">Enter your Email here.</p>
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
          </form>
        </div>
      </div>
    </div>
  </div>

</div>
<div th:replace="common/header :: body-bottom-scripts"/>
</body>
</html>