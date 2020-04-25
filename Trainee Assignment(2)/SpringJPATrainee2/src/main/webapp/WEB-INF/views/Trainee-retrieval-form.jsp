<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Trainee</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</head>
<body>
<div class="Container mt-4">
<div class="col-4 offset-3">
<div class="container bg-dark text-white text-center rounded">

<form action="retrieve" class="form-horizontal" method="Post" modelAttribute="trainee">
  <div class="form-group">
    <label for="traineeId">Trainee ID</label>
    <input type="text" class="form-control" id="traineeId" name="traineeId" placeholder="Enter Trainee ID">
  </div>
  <input type="submit" class="btn btn-primary mb-3 mt-3" value="Retrieve">
  <input type="button" value="Go To Home" onclick="window.location.href='Home'" 
      class="btn btn-primary btn-md" />
  </form>


</div>


</div>


</div>



</body>
</html>