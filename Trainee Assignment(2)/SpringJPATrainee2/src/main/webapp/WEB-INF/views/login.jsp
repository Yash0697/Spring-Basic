<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ page isELIgnored="false" %>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container mt-4">
<div class="bg-info text-white rounded">
<h3 class="text-center">
Login Before you proceed</h3><hr/></div><br>
<div class="col-6 offset-2">
<div class="jumbotron bg-dark text-white text-center rounded">
<form action="loginAdmin" class="form-horizontal" method="post">
<div class="form-group">
<label for="name" class="control-label">Username</label>
<input type="text" id="name" name="name" class="form-control" required />
</div>

<div class="form-group">
<label for="pwd" class="control-label">Password</label>
<input type="password" id="pwd" name="pwd" class="form-control" required/>
<input type="submit" value="Login" class="mt-4 btn btn-success btn-md rounded">
</div>


</form>
</div>
</div>
</div> 

</body>