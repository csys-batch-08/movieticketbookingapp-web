<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
	background-color: #333;
	text-decoration: none;
}

li {
	float: left;
}

li:last-child {
	border-right: none;
	text-decoration: none;
}

li a {
	display: block;
	color: white;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
	font-size: 18px;
}

li a:hover:not(.active) {
	background-color: #111;
}

.ones1 {
	position: absolute;
	top: 80px;
	left: 50px;
	text-decoration: none;
	color: Block;
	text-decoration: none;
}

.one {
	position: absolute;
	top: 80px;
	left: 600px;
	text-decoration: none;
	color: Block;
	text-decoration: none;
}

.ones {
	position: absolute;
	top: 80px;
	left: 1100px;
	text-decoration: none;
	color: Block;
	text-decoration: none;
}

Label {
	color: white;
}

h1 {
	color: white;
}

h2 {
	color: white;
}

h3 {
	color: white;
}

.Logs {
	position: absolute;
	top: 1px;
	left: 1250px;
	text-decoration: none;
	color: white;
}
p1{
color:white;
margin-top:20px;
margin-left:440px;
text-size:30px;
font-size:30px
}

body {
	background-image: linear-gradient(rgba(0, 0, 0, 0.7), rgba(0, 0, 0, 0.7)),
		url('Rohini Sliver Screen.jpg');
	background-repeat: no-repeat;
	background-size: cover;
	background-attachment: fixed;
	font-weight: bold;
}
</style>
</head>

</body>


<body>
<ul>
  <li><a class="active" href="#home">Home</a></li>
  <li><a href="AdminServlet">Profile</a></li>
  <li><a href="addMovie.jsp">AddMovie</a></li>
  <li><a href="addTheatre.jsp">AddTheatre</a></li>
   <li><a href="ShowServlet">Show Movie</a>
  <li><a href="UserHistoryServlet">User List</a>
  <li><a href="BookingHistoryServlet">User Booking List</a>
       
  <div class="Logs">
  
   <a href="login.jsp">Logout</a></li>
  
  </div>  
  
 
</ul>
</style>
</head>
<body>
               <p1>Welcome Admin Like MyShow</p1>
</body>
</html>