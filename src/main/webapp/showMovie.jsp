<%@page import="java.sql.ResultSet"%>
<%@page import="com.movieticketbookingmodel.Movie"%>
<%@page import="com.movieticketbookingdaoimpl.MovieDaoImpl"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">


<head>
<meta charset="ISO-8859-1">
<title>View All Movies</title>




<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>


<style>
*style {
	margin: 0;
	padding: 0;
}

span {
	position: relative;
	top: 260px;
	left: -230px;
	font-size: 15px;
}

.movieid {
	visibility: hidden;
}


.log {
    margin-top:10px;
	padding-left: 850px;
}

button {
	position: relative;
	top: 240px;
	left: -220px;
}

.contact {
	position: absolute;
	top:1px;
	left:1000px;
	text-decoration: none;
	color: white;
}

.contacts {
	position: absolute;
	top:1px;
	left:1100px;
	text-decoration: none;
	color: white;
}

table {
	margin-left: 30px;
}

p {
	margin-top:10px;
	margin-left:10px;
	color: white;
	font-size: 24px;
}

.movie {
	position:relative;
	left:8px;
	color: white;
}

ul {
	list-style-type: none;
	margin:0;
	padding:0;
	overflow:hidden;
	background-color:#333;
}

li {
	float:left;
	padding-top:5px;
}

li:last-child {
	border-right:none;
}

li a {
	display:black;
	color:white;
	text-align:center;
	padding: 16px 16px;
	text-decoration:none;
	font-size:18px;
}

li a:hover:not(.active) {
	background-color: #111;
	text-decoration: none;
}

.active {
	font-size: x-large;
}

body {
	background-image: linear-gradient(rgba(0, 0, 0, 0.7), rgba(0, 0, 0, 0.7)),
		url('Rohini Sliver Screen.jpg');
	background-repeat: no-repeat;
	background-size: cover;
	background-attachment: fixed;
	font-weight: bold;
}

.border {
	border: 1px solid black;
	position: relative;
	top: 200px;
}

table td {
	padding-bottom: 120px;
}

h1 {
	color: white;
}

</style>
</head>
<body>

	        <form action="SearchServlet" method="post">
<ul>
			<li><a class="active" href="Show.jsp">Home</a></li>
			<li><a href="UserServlet">Profile</a></li>
			<li><a href="wallet.jsp">ReCharge Wallet</a></li>
			<li><a href="MybookingServlet" class="log1">My Bookings</a></li>
			<li><input type="text" name="moviename" id="moviename" class="log1" required>
		    <input type="submit" class="btn btn-primary" value="Search"required></li>
			<li><a href="about Us.jsp" class="log">About Us</a></li>
			<li><a href="contact Us.jsp">Contact Us</a></li>
			<li><a href="login.jsp">Logout</a></li>
</ul>
</form>
	        <h1>Movie List</h1>
	        <table>
		    <caption></caption> 
		    <tbody>
            <tr>
			

            <c:set var="count" value="1" />
            <c:forEach items="${Movielist}" var="MovieList">
<td>
			<table id="movietable">
			<tbody>
			<tr>

			<td><img src="images/${MovieList.getImages()}" width=250px height=250px alt="img"></td>
			<td class="movie"><span id="movie name">Movie Name:	${MovieList.getMoviename() }
			</span><br> <span>Movie Type: ${MovieList.getMovietype() } </span><br> 
			<span>Movie Ratings:${MovieList.getMovieratings() } </span><br>
			<span>Movie Duration:${MovieList.getMovieduration()}Hours</span><br>
		    <span>Director:${MovieList.getDirector() }</span><br>
		    <span>Music Director:${MovieList.getMusicdirector() }</span><br> 
			<span>Hero Name:${MovieList.getHeroname() }</span><br> 
			<input type="text"value=${MovieList.getMovielink() } name="movlink"class="movieid">
			 <a
			href="Moviedetails?mvname=${MovieList.getMoviename()}&movlink=${MovieList.getMovielink()}"><button>Theater</button></a>

			</td>
			</tr>
			</tbody>
			</table>
            </td>
			<c:choose>
            <c:when test="${count==3}">
			<c:set var="count" value="1" />
			</tr>
			<tr>
			</c:when>
			<c:otherwise>
			<c:set var="count" value="${count+1}" />
			</c:otherwise>
			</c:choose>
			</c:forEach>

			</tr>
		    </tbody>
	        </table>

	   <link rel="stylesheet"
		href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">



</body>
</html>