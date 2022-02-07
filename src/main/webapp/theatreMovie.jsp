<%@page import="com.movieticketbookingmodel.*"%>
<%@page import="com.movieticketbookingdaoimpl.*"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Movie Booking</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">


<style>
body {
	background-image: linear-gradient(rgba(0, 0, 0, 0.7), rgba(0, 0, 0, 0.7)),
		url('Rohini Sliver Screen.jpg');
	background-repeat: no-repeat;
	background-size: cover;
	background-attachment: fixed;
	}
	
.card{
 left:200px;

}
.log{
margin-left:430px;
}
.contact {
	position: absolute;
	top: 1px;
	left: 1000px;
	text-decoration: none;
	color: white;
}

.contacts {
	position: absolute;
	top: 1px;
	left: 1100px;
	text-decoration: none;
	color: white;
}

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
	padding-top: 5px;
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
	text-decoration: none;
}

	
</style>
</head>
</body>

<ul>

			<li><a class="active" href="ShowServlet">Home</a></li>
			<li><a href="UserServlet">Profile</a></li>
			<li><a href="wallet.jsp">ReCharge Wallet</a></li>
			<li><a href="ShowServlet">Movie List</a></li>
			<li><a href="MybookingServlet">My Bookings</a></li>
		    <li><a href="about Us.jsp">About Us</a></li>
			<li><a href="contact Us.jsp">Contact Us</a></li>
			<li><a href="login.jsp" class="log">Logout</a></li>			
</ul>
	
</body>
<body>
<table>
<caption></caption>
<tbody>
                 <tr>
                 <c:set var="count" value="1"/>
                 <c:forEach  items="${theatreListObj }" var="theatrelist">
                 <th id="theatre"></th>
                 <td>
                 <table id="theatretable">
                 <caption></caption>
                 <tbody>
                 <tr>
                  <th id="theatres"></th>                     
                 <td class="movie">
                 <div class="col">
                 <div class="card" style="width: 18rem;"> 
                 <img src="images/${theatrelist.images }" class="card-img-top" height="",width="", alt="img"><br> 
                 <p class="card-text">
                 
                              <span class="btn btn-success btn-sm">Theater name: ${theatrelist.theatrename }</span></p>
                              <%-- <span style="visibility:hidden"> Movie id: ${theatrelist.movieid }  </span>
                              <span style="visibility:hidden"> Theater id: ${theatrelist.theatreid }</button> </span>
                               --%><span><button type="button" class="btn btn-light" name="Seats" >Available Number seats: ${theatrelist.numberseats } </button></span></p>
                              <span><button type="button" class="btn btn-light">Theater Address: ${theatrelist.theatreaddress }</button></span></p>
                              <span><button type="button" class="btn btn-light">Theater Ratings: ${theatrelist.theatrerating }</button></span></p>
                              <span><button type="button" class="btn btn-light">price: ${theatrelist.price }</button></span>
                              <fmt:parseDate value="${theatrelist.moviedatetime}" pattern="yyyy-MM-dd'T'HH:mm" var="moviedatetime" type="date"/></p>
                              <span><button type="button" class="btn btn-light">  MovieDatetime :<fmt:formatDate pattern="dd-MM-yyyy HH:mm" value="${moviedatetime}"/></button></span></p>   
</select>

                                            
                             <c:set var="movietime"
											value="${theatrelist.moviedatetime}" scope="session" /> 
											<span><a href="BookingServlet?theatreid=${theatrelist.theatreid}" >
 						        &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;
                               <button type="button" class="btn btn-danger">Book Ticket</button></a></span>
                                      
                                </div>  
                                </div> 
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