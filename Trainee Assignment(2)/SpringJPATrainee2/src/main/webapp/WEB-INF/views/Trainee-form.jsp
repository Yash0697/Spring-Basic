<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Trainee</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

</head>
<body>
<div class="container mt-4">
<div class="offset-2 col-md-8">
<h3 class="bg-info text-white rounded text-center text-blue">
Add a Trainee
</h3>
<div class="jumbotron bg-dark text-white text-center rounded">
<div class="panel panel-default">
<br>
<div class="panel-title"><b><h4> Add Trainee </h4></b> <hr>
</div>

<div class="panel-body">
<form:form action="saveTrainee" class="form-horizontal" method="post" modelAttribute="trainee">
<div class="form-group">
<label for="Id" class="col-md-3 control-label">ID</label>
<form:input path="traineeId" id="Id" class="form-control" />
</div>
<div class="form-group">
<label for="Name" class="col-md-3 control-label">Name</label>
<form:input path="traineeName" id="Name" class="form-control" />
</div>

<div class="form-group">
<label for="Domain" class="col-md-3 control-label">Domain</label>
<form:select path="traineeDomain" class="custom-select custom-select-sm">
  <form:option value="0">Choose Your Domain</form:option>
  <form:option value="Angular">Angular</form:option>
  <form:option value="Hibernate">Hibernate</form:option>
  <form:option value="Spring">Spring</form:option>
  <form:option value="JUnit">JUnit</form:option>
</form:select>
</div>
<div class="form-group">
<label for="loc" class="col-md-3 control-label">Location</label>
<div class="custom-control custom-radio custom-control-inline">
<form:radiobutton path="traineeLocation" id="traineeLocation" value="Chennai" class="mr-2 custom-control-label" />Chennai

</div>
<div class="custom-control custom-radio custom-control-inline">
<form:radiobutton path="traineeLocation" id="traineeLocation2" value="Bangalore" class="mr-2 custom-control-label" />Bangalore
</div>
<div class="custom-control custom-radio custom-control-inline">
<form:radiobutton path="traineeLocation" id="traineeLocation3" value="Pune" class="mr-2 custom-control-label" />Pune
</div>
<div class="custom-control custom-radio custom-control-inline">
<form:radiobutton path="traineeLocation" id="traineeLocation4" value="Mumbai" class="mr-2 custom-control-label"/>Mumbai
</div>
</div>

<div class="form-group">
<div class="col-md-offset-3 col-md-9">
<form:button class="btn btn-primary mt-4" style="margin-left:150px;" >Submit</form:button>
<input type="button" value="Go To Home" onclick="window.location.href='Home'" 
      class="btn btn-primary btn-md mt-4" />
</div>
</div>
</form:form>
</div>
</div>
</div>
</div>
</div>
</body>
</html>