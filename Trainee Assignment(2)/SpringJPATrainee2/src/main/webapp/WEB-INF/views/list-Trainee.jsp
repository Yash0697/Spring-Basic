<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ page isELIgnored="false" %>
<title>List Of Trainees</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<div class="col-md-offset-2 col-md-12">
<div class="bg-info text-white rounded-bottom">
<h3 class="text-center">
List of Trainees</h3><hr/></div><br>
<div class="panel panel-info">
<div class="panel-heading">
<div class="panel-title bg-dark text-white col-3 offset-4 rounded" >
<h3 class="mr-3 ml-4">Trainee List </h3>
</div>
</div>
<div class="panel-body">
<table class="table table-stripped table-bordered rounded table-dark rounded">
<tr>
<th>ID</th>
<th>Name</th>
<th>Domain</th>
<th>Location</th>
<th>DB Action</th>
</tr>

<c:forEach var="tempTrainee" items="${ trainees }">
<c:url var="updateLink" value="/Trainee/updateForm" >
<c:param name="traineeId" value="${ tempTrainee.traineeId }"></c:param>
</c:url>


<c:url var="deleteLink" value="/Trainee/delete">
<c:param name="traineeId" value="${ tempTrainee.traineeId }"></c:param>
</c:url>

<tr>
<td>${tempTrainee.traineeId}</td>
<td>${tempTrainee.traineeName}</td>
<td>${tempTrainee.traineeDomain}</td>
<td>${tempTrainee.traineeLocation}</td>

<td>

<a href="${ updateLink }" class="btn btn-warning">Update</a>
<a href="${ deleteLink }" onclick="if (!(confirm('Are you sure you want to delete this item?'))) return false" class="btn btn-danger">Delete</a>
</td>
</tr>
</c:forEach>


</table>
<input type="button" value="Add Trainee" onclick="window.location.href='showForm'" class="btn btn-primary rounded float-right mt-3" /><br>
<input type="button" value="Go To Home" onclick="window.location.href='Home'" 
      class="btn btn-primary btn-md" />
</div>
</div>

</div>
</div>
</body>
</html>