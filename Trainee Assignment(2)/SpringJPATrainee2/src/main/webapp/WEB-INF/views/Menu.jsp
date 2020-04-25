<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
   <%@ page isELIgnored="false" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Menu</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

</head>
<body>
<div class="Container" style="margin-top:70px;">
<div class="col-8 offset-2">
<div class="bg-info text-white rounded-bottom shadow-lg">
<h3 class="text-center">
Trainee Management System
</h3><hr/></div>
<div class="jumbotron bg-dark text-white text-center rounded">
<h3 class="text-center">
Welcome ${ user1 }</h3><hr/>
<table class="table table-bordered">
   
      <tr scope="col" style="margin-top:40px;"><input type="button" value="Add a Trainee" onclick="window.location.href='showForm'" 
      class="btn btn-primary btn-md btn-block" /></tr>
      <tr scope="col"><input type="button" value="Delete a Trainee" onclick="window.location.href='showFormForDelete'" 
      class="btn btn-primary btn-md btn-block" /></tr>
      <tr scope="col"><input type="button" value="Update a Trainee" onclick="window.location.href='showFormForUpdate'" 
      class="btn btn-primary btn-md btn-block" /></tr>
      <tr scope="col"><input type="button" value="Retrieve a Trainee" onclick="window.location.href='showFormForRetrieve'" 
      class="btn btn-primary btn-md btn-block" /></tr>
      <tr scope="col"><input type="button" value="Retrieve all Trainees" onclick="window.location.href='list'" 
      class="btn btn-primary btn-md btn-block" /></tr>
    </table>
    </div>
    </div>
    </div>
    
</body>
</html>