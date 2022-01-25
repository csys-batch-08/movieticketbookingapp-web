<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>




<style>
.one
{
position:relative;
margin-left:500px;
}
 body {
  background-image: url('web_3.jpg');
  background-repeat: no-repeat;
  background-size:cover;
}

</style>

</head>
<body>
     <div class="one">
     
  <h1>Search Movie</h1>
  
    <form action="Search" method = "post">

    <input type="text" name="moviename" id="moviename"><br><br>
 
    <input type="submit" class="btn btn-primary" value="Search">
    
    
</div>
</form>
</body>
</html>