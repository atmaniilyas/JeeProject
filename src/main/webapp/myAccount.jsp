<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
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

<!-- Pills navs -->
<ul class="nav nav-pills nav-justified mb-3" id="ex1" role="tablist">
    <li class="nav-item" role="presentation">
        <a class="nav-link active" id="tab-login" data-mdb-toggle="pill" href="#pills-login" role="tab"
           aria-controls="pills-login" aria-selected="true">Login</a>
    </li>
    <li class="nav-item" role="presentation">
        <a class="nav-link" id="tab-register" data-mdb-toggle="pill" href="register.jsp" role="tab"
           aria-controls="pills-register" aria-selected="false">Register</a>
    </li>
</ul>
<!-- Pills navs -->

<!-- Pills content -->
<div style="margin-top: 200px" class="tab-content">
    <div class="tab-pane fade show active" id="pills-login" role="tabpanel" aria-labelledby="tab-login">
        <form method="post" action="Login">



            <!-- Email input -->
            <div class="form-outline mb-4">
                <input type="text" id="loginName" class="form-control" name="username" />
                <label class="form-label" for="loginName">Email or username</label>
            </div>

            <!-- Password input -->
            <div class="form-outline mb-4">
                <input type="password" id="loginPassword" class="form-control" name="password" />
                <label class="form-label" for="loginPassword">Password</label>
            </div>

            <!-- 2 column grid layout -->
            <div class="row mb-4">
                <div class="col-md-6 d-flex justify-content-center">
                    <!-- Checkbox -->
                    <div class="form-check mb-3 mb-md-0">
                        <input class="form-check-input" type="checkbox" value="" id="loginCheck" checked />
                        <label class="form-check-label" for="loginCheck"> Remember me </label>
                    </div>
                </div>

                <div class="col-md-6 d-flex justify-content-center">
                    <!-- Simple link -->
                    <a href="#!">Forgot password?</a>
                </div>
            </div>

            <!-- Submit button -->
            <button type="submit" class="btn btn-primary btn-block mb-4">Sign in</button>

            <!-- Register buttons -->
            <div class="text-center">
                <p>Not a member? <a href="#!">Register</a></p>
            </div>
        </form>
    </div>
    <div class="tab-pane fade" id="pills-register" role="tabpanel" aria-labelledby="tab-register">
        <form method="post" action="Login">
            <div class="text-center mb-3">

            <!-- Name input -->
            <div class="form-outline mb-4">
                <input type="text" id="registerName" class="form-control" name="username" />
                <label class="form-label" for="registerName">Name</label>
            </div>

            <!-- Password input -->
            <div class="form-outline mb-4">
                <input type="password" id="registerPassword" class="form-control" name="password"/>
                <label class="form-label" for="registerPassword">Password</label>
            </div>



            <!-- Checkbox -->
            <div class="form-check d-flex justify-content-center mb-4">
                <input class="form-check-input me-2" type="checkbox" value="" id="registerCheck" checked
                       aria-describedby="registerCheckHelpText" />
                <label class="form-check-label" for="registerCheck">
                    I have read and agree to the terms
                </label>
            </div>

            <!-- Submit button -->
            <input type="submit" class="btn btn-primary btn-block mb-3"value="Sign-in"/>
        </form>
    </div>
</div>
<!-- Pills content -->
<!-- end of container -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>

