<!DOCTYPE html>
<html>
<meta charset="UTF-8" />
<title>Ecomm Project</title>
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
<!--Carousel begin -->
<div class="container">
    <div class="row">
        <div class="col-xl-8">
            <div class="card">
                <div class="card-body">
                    <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
                        <ol class="carousel-indicators">
                            <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                            <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                            <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                        </ol>
                        <div class="carousel-inner" role="listbox">
                            <div class="carousel-item active">
                                <img class="d-block w-100" src="https://i.ibb.co/8dz9sv6/caroussel-1.jpg" alt="First slide" width="720" height="350">
                                <div class="carousel-caption">
                                    <h4>First Label</h4>
                                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s</p>
                                </div>
                            </div>
                            <div class="carousel-item">
                                <img class="d-block w-100" src="https://i.ibb.co/p4Xjdrp/caroussel-2.jpg" alt="Second slide" width="720" height="350">
                                <div class="carousel-caption">
                                    <h4>Second Label</h4>
                                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s</p>
                                </div>
                            </div>
                            <div class="carousel-item">
                                <img class="d-block w-100" src="https://i.ibb.co/9H2yXyK/caroussel-3.jpg" alt="Third slide" width="720" height="350">
                                <div class="carousel-caption">
                                    <h4>Third Label</h4>
                                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s</p>
                                </div>
                            </div>
                        </div>
                        <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                            <span class="sr-only">Previous</span>
                        </a>
                        <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                            <span class="carousel-control-next-icon" aria-hidden="true"></span>
                            <span class="sr-only">Next</span>
                        </a>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-xl-4">
            <img src="https://i.ibb.co/YRtKMT9/logo.png"  width="307" height="240"/>
        </div>
    </div>
    <hr/>
    <div class="row">
        <div class="col-xl-4">
            <div class="panel panel-default">
                <div class="panel-body">
                    <img src="https://i.ibb.co/KznYtxq/bestseller.jpg"  width="350" height="247.05"/>
                </div>
            </div>
        </div>
        <div class="col-xl-4">
            <div class="panel panel-default">
                <div class="panel-body">
                    <img src="https://i.ibb.co/Y24L66X/hours.png"  width="350" height="247.05"/>
                </div>
            </div>
        </div>
        <div class="col-xl-4">
            <div class="panel panel-default">
                <div class="panel-body">
                    <img src="https://i.ibb.co/rMr36g6/FAQ.jpg" width="350" height="247.05"/>
                </div>
            </div>
        </div>
    </div>
    <div>
        <center>
            <div class="home-headline"><span class="badge badge-pill badge-info">Featured Books</span></div>
            <hr style="margin-top: -12px;" />
        </center>
    </div>
    <div class="row">
        <div id="books" class="carousel slide" data-ride="carousel">
            <ol class="carousel-indicators">
                <li data-target="#books" data-slide-to="0" class="active"></li>
                <li data-target="#books" data-slide-to="1"></li>
                <li data-target="#books" data-slide-to="2"></li>
            </ol>
            <div class="carousel-inner" role="listbox">
                <div class="carousel-item active">
                    <img src="img/shelf.png" class="img-fluid"/>
                    <div class="carousel-caption">
                        <div class="row" >
                            <div class="col-xl-2"><img class="img-fluid" src="https://i.ibb.co/stSWS1z/book1.jpg"/></div>
                            <div class="col-xl-2"><img class="img-fluid" src="https://i.ibb.co/gD6Lc39/book2.jpg"/></div>
                            <div class="col-xl-2"><img class="img-fluid" src="https://i.ibb.co/TwpK6Ns/book3.jpg"/></div>
                            <div class="col-xl-2"><img class="img-fluid" src="https://i.ibb.co/KLwT4tP/book4.jpg"/></div>
                            <div class="col-xl-2"><img class="img-fluid" src="https://i.ibb.co/G3z3Xvt/book5.jpg"/></div>
                            <div class="col-xl-2"><img class="img-fluid" src="https://i.ibb.co/nkBXgZK/book6.jpg/"></div>
                        </div>
                    </div>
                </div>
                <div class="carousel-item">
                    <img src="img/shelf.png" class="img-fluid"/>
                    <div class="carousel-caption">
                        <div class="row" >
                            <div class="col-xl-2"><img class="img-fluid" src="https://i.ibb.co/stSWS1z/book1.jpg"/></div>
                            <div class="col-xl-2"><img class="img-fluid" src="https://i.ibb.co/gD6Lc39/book2.jpg"/></div>
                            <div class="col-xl-2"><img class="img-fluid" src="https://i.ibb.co/TwpK6Ns/book3.jpg"/></div>
                            <div class="col-xl-2"><img class="img-fluid" src="https://i.ibb.co/KLwT4tP/book4.jpg"/></div>
                            <div class="col-xl-2"><img class="img-fluid" src="https://i.ibb.co/G3z3Xvt/book5.jpg"/></div>
                            <div class="col-xl-2"><img class="img-fluid" src="https://i.ibb.co/nkBXgZK/book6.jpg/"></div>
                        </div>
                    </div>
                </div>
                <div class="carousel-item">
                    <img src="img/shelf.png" class="img-fluid"/>
                    <div class="carousel-caption">
                        <div class="row" >
                            <div class="col-xl-2"><img class="img-fluid" src="https://i.ibb.co/stSWS1z/book1.jpg"/></div>
                            <div class="col-xl-2"><img class="img-fluid" src="https://i.ibb.co/gD6Lc39/book2.jpg"/></div>
                            <div class="col-xl-2"><img class="img-fluid" src="https://i.ibb.co/TwpK6Ns/book3.jpg"/></div>
                            <div class="col-xl-2"><img class="img-fluid" src="https://i.ibb.co/KLwT4tP/book4.jpg"/></div>
                            <div class="col-xl-2"><img class="img-fluid" src="https://i.ibb.co/G3z3Xvt/book5.jpg"/></div>
                            <div class="col-xl-2"><img class="img-fluid" src="https://i.ibb.co/nkBXgZK/book6.jpg/"></div>
                        </div>
                    </div>
                </div>
            </div>
            <a class="carousel-control-prev" href="#books" role="button" data-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="carousel-control-next" href="#books" role="button" data-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
        </div>
    </div>
</div>
<!--Carousel end -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>