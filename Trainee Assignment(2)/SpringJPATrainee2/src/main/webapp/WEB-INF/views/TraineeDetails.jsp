<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Trainee Details</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

</head>
<body>
<div class="container mt-4">
<div class="col-md-offset-3 col-md-12">
<h3 class="bg-info text-white roundedtext-center text-blue">
Trainee Details
</h3>
<div class="jumbotron bg-dark text-white text-center rounded">
<div class="panel panel-default">
<div class="panel-heading">
<br>
<div class="panel-title"><b><h4>  Trainee Details </h4></b></div><hr>

</div>
<div class="panel-body">
<div class="col-md-5 offset-3">
<label for="Id" class="control-label"><b>ID</b></label>

 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${ trainee.traineeId }
</div>
<div class="col-md-5 offset-3">
<label for="Id" class="control-label"><b>Name</b></label>
 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${ trainee.traineeName }
 </div>
<div class="col-md-5 offset-3">
<label for="Id" class="control-label"><b>Domain</b></label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${ trainee.traineeDomain }
</div>
<div class="col-md-5 offset-3">
<label for="Id" class="control-label"><b>Location</b></label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${ trainee.traineeLocation }
</div>
<input type="button" value="Go To Home" onclick="window.location.href='Home'" 
      class="btn btn-primary btn-md mt-4" />
</div>
</div>
</div>
</div>
</div>

</body>
</html>