<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.movieticketbookingdaoimpl.*" %>
    <%@page import=" java.util.List" %>
    <%@page import="com.movieticketbookingmodel.*" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Booking</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">

<style>
html, body {
	background-image: linear-gradient(rgba(0, 0, 0, 0.7), rgba(0, 0, 0, 0.6)),
		url(https://www.vetbossel.in/wp-content/uploads/2020/08/movie-ticketing-768x576.jpg);
	background-repeat: no-repeat;
	background-size: 100% 900px;
	position: absolute;
	width: 100%;
	color: white;
}

.log1 {
	position: absolute;
	top: 90px;
	left: 120px;
	text-decoration: none;
	color: white;
}

.log {
	position: absolute;
	top: 1px;
	left: 1250px;
	text-decoration: none;
	color: white;
}
.one {
	textalign: center;
	position: absolute;
	left: 300px;
	top: -50px;
}
.balance{
   margin-left:-230px; 
   margin-top:10px;
   color:blue;
}
.five {
	position: relative;
	margin-left:260px;
	top:-15px
}

img {
	width: 700px;
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
	padding-top: 5px;
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
	font-size: 18px;
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
               <li><a class="active" href="ShowServlet">Home</a></li>
               <li><a href="UserServlet">Profile</a></li>
               <li><a href="wallet.jsp">ReCharge Wallet</a></li>
               <li><a href="ShowServlet">Movie List</a></li>
               <li><a href="MybookingServlet">My Booking</a></li>  
               <li><a href="login.jsp" class="log">Logout</a></li>    
</ul>
              
              <c:if test="${errorMessage} != null">
              <h1>${errorMessage}</h1>
              </c:if>
     
             <div class="five">
             <c:set var="count" value="1"/>
             <c:forEach items="${BookListObj}" var="BookList">   
           
              <div class="balance">
              <h1>Wallet Balance:${WalletAmount} Rs</h1>  
              </div>                   
            
          
              <div class="one">
              <label for=" Movie id"> </label> 
              <span style="visibility:hidden "><input type="text" name="Movie id" id=" Movie id" value=" ${BookList.movieid }"><br><br></span>
              <label for="Theater id"></label>
              <span style="visibility:hidden "> <input type="text" name="movie" id="Theater id" value="${BookList.theatreid } "><br></span>
              <label for="Movie date"></label>
              <span style="visibility:hidden "><input type="text" name="theatre" id="Movie date" value=" ${BookList.moviedatetime }"><br></span>
                 
              <p> Theater Details</p><br>
            
              <label for="movie"> Theater name:</label><br>
              <input type="text" name="movie" id="movie" value="${BookList.theatrename }" readonly="readonly"><br><br>
              <label for ="Movie Id">Total Seat In Theater:</label><br>
              <input type="text" name="Movie" id="Movie Id" value=100 readonly="readonly" ><br><br>
              <label for="seat"> Available Seats :</label><br>
              <input type="text" name="seat" id="seat" id="seat" value="${BookList.numberseats }" readonly="readonly"><br><br>
              <c:set var="theatres" scope="session" value="${BookList.getTheatreid() }" />  
              <c:set var="movie" scope="session" value="${BookList.getMovieid() }" />
            
            
              </c:forEach> 
         
              <form action="bookmov" method="post" >  
              <p>BooKing your Ticket<p>
     
              <label for ="Movie Id"> Movie Id:</label><br>
              <input type="number" name="Movie" id="Movie Id" value = "${movie}" readonly="readonly" ><br><br>
              <label for ="theatre"> Theater Id</label><br>
              <input type="number" name="theatre" id="theatre" value= "${ theatres}" readonly="readonly"><br><br>
              <label for ="Seats">Choose number of seats</label><br>    
              <input type="Number" name="Seats" id="Seats" min="1"pattern="[1-150]+" required><br><br>
              <button type="submit" Class="btn btn-success">Book Ticket</button>
               <a href="ShowServlet"><button type="submit" class="btn btn-danger">Cancel</button></a>       
             

 </div>
         
             
 </form>       
</body>
</html>