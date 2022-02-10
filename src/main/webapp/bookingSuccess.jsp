<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.*"%>
<%@page import="com.movieticketbookingmodel.Movie"%>
<%@page import="com.movieticketbookingdaoimpl.MovieDaoImpl"%>
<%@page import="java.sql.ResultSet" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Booking Conform</title>

<style>
.one {
	Top: 40px;
	position: relative;
	margin-left: 520px;
}

.movie {
	
}

html, body {
	background-image: linear-gradient(rgba(0, 0, 0, 0.7), rgba(0, 0, 0, 0.7)),
		url(https://www.vetbossel.in/wp-content/uploads/2020/08/movie-ticketing-768x576.jpg);
	background-repeat: no-repeat;
	background-size: 100% 1500px;
	position: absolute;
	width: 100%;
	color: white;
}

.five {
	position: relative;
	margin-left: 550px;
}

img {
	width: 600px;
	position: absolute;
	top: 120px;
	left: -500px;
}

ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
	background-color: #333;
}

li {
	float: left;
}

li:last-child {
	border-right: none;
}

li a {
	display: block;
	color: white;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
}

li a:hover:not(.active) {
	background-color: #111;
}

.active {
	font-size: x-large;
}

.border {
	border: 1px solid black;
	position: relative;
	top: 200px;
}

.border {
	border: 1px solid black;
	position: relative;
	top: 200px;
}

input[type :number] {
	background: black;
}
</style>
</head>
<body>

<ul>
               
			<li><a class="active" href="Show.jsp">Home</a></li>
			<li><a href="News.jsp">News</a></li>
			<li><a href="UserProfile.jsp">Profile</a></li>
			<li><a href="Wallet.jsp">ReCharge Wallet</a></li>
			<li><a href="MyBooking.jsp">MyBooking</a></li>
			<li><a href="CancelBooking.jsp">Cancel Booking</a></li>
	        <li><a href="login.jsp" class="log">Logout</a></li>
	       
</ul>
</head>
<body>

        
        <c:if test="${errorMessage} != null">
        <h1>${errorMessage}</h1>
        </c:if>
     
        <div class="one">
        <c:set var="count" value="1"/>
        <c:forEach items="${bookinglist}" var="usersList">
         
        <h1>Booking Details</h1>
        <table>
      
         <caption></caption> 
         <tr>
         <th id="user"></th>
         <td>
	
         Booking ID: ${usersList.bookingid }<br> 
         User Id: ${usersList.userid }<br>  
         Movie name:${usersList.moviename }<br> 
         Number of Seats: ${Seats}<br>
         <fmt:parseDate value="${movietime}" pattern="yyyy-MM-dd'T'HH:mm" var="moviedatetime" type="date" />
         MovieDateandtime:<fmt:formatDate pattern="dd-MM-yyyy HH:mm" value="${moviedatetime}"/><br>     
         Total Price : ${totalprice } rs<br>  


</c:forEach>
</div>
</div>
</td>
</tr>

</table>
</div>
      
</body>
</html>