<%@page import="com.MovieticketBookingModel.*"%>
<%@page import="com.MovieTicketBookingDaoImpl.*"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page import="java.util.*"%>
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
body{
	font-weight: bold;
}
img{
width: 380px;
padding:20px;
position:absolute;
top:-100px;
left:10px;	
}
h1{
color:white;

}
span{
position : relative;
top:240px;
left: -200px;

}
.name{
position: relative;left:200px;
}
.movie
{
  position:absolute;
  left:1000px;
  top:-160px;
  color:Block;
}
#thimg
{
  position:relative;
  left:200px;
}


 body {
  background-image: url('web_3.jpg');
  background-repeat: no-repeat;
  background-size:cover;
}

img{
top:20px
width: 280px;
padding:20px;
}

span{
position : relative;
top:240px;
left: -200px;

}
.movieid
{
visibility:hidden;
}
.searchbtn
{
  position:absolute;
  top:15px;
  left:700px;
  text-decoration:none;
  color:white;
}
.log1
{
  position:absolute;
  top:90px;
  left:1200px;
  text-decoration:none;
  color:white;
}
.log1
{
  position:absolute;
  top:70px;
  left:1200px;
  text-decoration:none;
  color:white;
}
.log
{
  position:absolute;
  top:1px;
  left:1250px;
  text-decoration:none;
  color:white;
}

p{
margin-top:10px;
margin-left:10px;
color:white;
font-size:24px;
}

.movie
{
  color:block;
  position:relative;
  right:50px;
}

.top{
  list-style-type: none;
  text-decoration:none;


}

ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
  text-decoration:none;
}

li {
  float: left;
  padding-top:5px;
}

li:last-child {
  border-right: none;
  text-decoration:none;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size:18px; 
}

li a:hover:not(.active) {
  background-color: #111;
  text-decoration:none;
}



html,body{
    background-image: linear-gradient(rgba(0,0,0,0.7),rgba(0,0,0,0.6)),url(https://www.vetbossel.in/wp-content/uploads/2020/08/movie-ticketing-768x576.jpg);
     background-repeat: no-repeat;
     background-size: 100% 700px;
     position: absolute;  
     width: 100%;
}


</style>
</head>
</body>


<body>
<ul>

<div class="top">
   <li><a  class="active" href="ShowServlet">Home</a></li>
   <li><a href="News.jsp">News</a></li>
   <li><a href="UserServlet">Profile</a></li>
   <li><a href="Wallet.jsp">Recharge Wallet</a></li>
   <li><a href="ShowServlet">Movie List</a></li>
   <li><a href="MybookingServlet">My Bookings</a></li>
   <li><a href="CancelBooking.jsp">Cancel Booking</a></li>
    
   <div class="log">
   
   <li><a href="Login1.jsp">Logout</a></li>
   
   </div>
   
   
     
</ul>
</style>

</body>
<body>



<table>
<tbody>
                                 <tr>
                                 <p>Movie Theatre</p>
                                 <c:set var="count" value="1"/>
                                 <c:forEach  items="${theatreListObj }" var="theatrelist">
                               
                                 <td>
                                 <table id="theatretable">
                                 <tbody>
                                 <tr>
                                   
                                   
                              
                                     
                              <td><img src="images/${theatrelist.images }" width=100px alt="img" style="margin-left:100px;margin-top:240px;width:600px;"></td>
                                      
                                         
                                     <td class="movie">
                                         
                              <span><button type="button" class="btn btn-light"> Theatre name: ${theatrelist.theatrename } </button></span><br>
                              <span style="visibility:hidden"> Movie id: ${theatrelist.movieid }  </span>
                                      
                              <span style="visibility:hidden"> Theatre id: ${theatrelist.theatreid }</button> </span><br>
                              <span><button type="button" class="btn btn-light">Available Number seats: ${theatrelist.numberseats } </button></span><br><br>
                              <span><button type="button" class="btn btn-light">Theatre Address: ${theatrelist.theatreaddress }</button></span><br><br>
                              <span><button type="button" class="btn btn-light">Theatre Ratings: ${theatrelist.theatrerating }</button></span><br><br>
                              <span><button type="button" class="btn btn-light">price: ${theatrelist.price }</button></span><br><br>     
                              <fmt:parseDate value="${theatrelist.moviedatetime}" pattern="yyyy-MM-dd" var="moviedatetime" type="date" />
                              <span><button type="button" class="btn btn-light">  Moviedatetime :<fmt:formatDate pattern="dd-MM-yyyy" value="${moviedatetime}"/></button></span><br><br>

                                      
                              
                                 
                               <span><a href="BookingServlet?movieid=${theatrelist.movieid }&theatreid=${theatrelist.theatreid}" >
                                    
                               <button type="button" class="btn btn-primary">Booking Ticket</button>
                                        
                                     
                                </td>
                                </tr>
                                </tbody>
                                </table>  
                            
                                </td>
                                <c:choose>
                                    
                                <c:when test="${count==3}">
                                <c:set var="count" value="1"/>
                                     
                                 
                    	         </tr>
                    	         <tr> 
                    	         </c:when>
                    	         <c:otherwise>
                    	         <c:set var="count" value="${count+1}"/>
                    	         </c:otherwise>             
                                 </c:choose>
                                 </c:forEach>                 
                                   
                                
                                  </tr> 
                                  </tbody>
                                  </table>
                                  </div>

</body>
</html>