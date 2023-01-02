<%@ page import="com.example.demo.Model.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<form action="addBook" method="post">
    <!-- Title start -->
    <div class="form-group">
        <label for="title">Title *</label>
        <input type="text" class="form-control" id="title" placeholder="Title" name="title" required="required">
        <span class="help-block">Title of Book</span>
    </div>
    <!-- Title end -->
    <!-- Author start -->
    <div class="form-group">
        <label for="author">Author *</label>
        <input type="text" class="form-control" id="author"  name="author" placeholder="Author" required="required">
        <span class="help-block">Author of Book</span>
    </div>
    <!-- Author end -->
    <!-- qte start -->
    <div class="form-group">
        <label for="qte">qte </label>
        <input type="number" class="form-control" id="qte" name="qte" placeholder="qte">
        <span class="help-block">Stock of Book</span>
    </div>
    <!-- qte end -->
    <!-- Category start -->
    <div class="form-group">
        <select id="category" class="form-control" name="category">
            <option value="" selected="selected" disabled="disabled">Please Select a Category :</option>
            <option value="1" >Comedy</option>
            <option value="2" >History</option>
            <option value="3" >Programming Language</option>
            <option value="4">Arts</option>
        </select>
    </div>
    <!-- Category end -->
    <!-- Number Of Pages start -->
    <div class="form-group">
        <label for="numberOfPages">Number Of Pages </label>
        <input type="number" class="form-control" id="numberOfPages" name="pagess">
        <span class="help-block">Number Of Pages of The Book</span>
    </div>
    <!-- Number Of Pages end -->
    <!-- img start -->
    <div class="form-group">
        <label for="img">Example file input</label>
        <input type="file" class="form-control-file" id="img" name="bookimg">
    </div>
    <!-- img end -->
    <div class="form-group">
        <label for="Price">Price </label>
        <input type="number" class="form-control" id="Price" name="price">
        <span class="help-block">Price of The Book</span>
    </div>



    <button type="submit" class="btn btn-primary">Submit</button>

</form>


<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>

</html>