<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Movie Booking</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<style>

html,body{
    background-image: linear-gradient(rgba(0,0,0,0.5),rgba(0,0,0,0.5)),url(https://www.vetbossel.in/wp-content/uploads/2020/08/movie-ticketing-768x576.jpg);
     background-repeat: no-repeat;
     background-size: 100% 1000px;
     position: absolute;  
     width: 100%;
     color:white;
}
.one{
margin-left:450px;
margin-top:150px;


}
a{
margin-left:180px;
}
</style>



</head>
<body>
<% %>
       <div class="one">
	<%String message=request.getParameter("message");
       String url=request.getParameter("url");
       %>
       <h1 class="finish"><%=message %></h1>
    <a href="<%=url%>"><button class="btn btn-dark">Retry</button></a>
    
    </div>
</body>
</html>