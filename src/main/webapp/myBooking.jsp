<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.movieticketbookingdaoimpl.*" %>
    <%@ page import="java.util.*" %>
    <%@ page import="com.movieticketbookingmodel.Bookingdetail" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>MyBookings</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>


<style>
body {
	background-image: linear-gradient(rgba(0, 0, 0, 0.8), rgba(0, 0, 0, 0.8)),
		url("images/Rohini Sliver Screen.jpg");
	background-repeat: no-repeat;
	background-size: cover;
	background-attachment: fixed;
	color:white;
}

.one {
	color: white
}

h2 {
	color: white;
	text-align: center;
}
table{
border-style: solid;
border-color:silver;
margin-left: 270px;
padding:18px 18px;
background-color: rgba(0,0,0, 0.7);
}
th{
padding-right: 15px;
padding-bottom: 15px;
font-size: 17px;
}
td{
padding-right: 15px;
padding-bottom: 10px;
}

.ones {
	position: absolute;
	top: 20px;
	left: 1250px;
	text-decoration: none;
	color: white
}


</style>

</head>
<body>

    

	
	
	
                                   <h2 class="Userdetail">Booking Details</h2>
 <div class = "user">
<table id="allusers">
<caption></caption>
<thead>
<tr>
<th id = "sno">S.no</th>
<th id = "Booking Id">Booking Id</th>
<th id = "User Id">User Id</th>
<th id = "BookedSeats">Booked Seats</th>
<th id = "TotalAmount">Total Amount</th>
<th id = "status">Status</th>
<th id = "cancel">Movie name</th>
<th id = "cancel">Booking Date</th>
<th id = "MovieDateandTime">MovieDateandTime</th>
</tr>
</thead>
<tbody>

    <%String errorMessage = (String)request.getAttribute("errorMessage");
         if(errorMessage !=null)
         {%>
<center><font color="red" style="font:bold; size:20"><%=errorMessage%></font></center>
<%}%>
     
    
<c:set var="count" value="0"/>
<c:forEach items="${BookingObj}" var="BookingList">
<c:set var="count" value="${count+1}"/>

<tr>


<td>${count}</td>

<td>${BookingList.bookingid}</td>
<td>${BookingList.userid }</td>
<td> ${BookingList.noseat }</td>
<td> ${BookingList.totalamount }</td>
<td>${BookingList.bookingstatus }</td>
 <td>${BookingList.getMoviename() }</td>
<td><fmt:parseDate value="${BookingList.bookingdate}" pattern="yyyy-MM-dd" var="bookingdate" type="date" />
<fmt:formatDate pattern="dd-MM-yyyy" value="${bookingdate}"/></td>
<td><fmt:parseDate value="${movietime}" pattern="yyyy-MM-dd'T'HH:mm" var="moviedatetime" type="date" />
<fmt:formatDate pattern="dd-MM-yyyy HH:mm" value="${moviedatetime}"/></td>

<td><a href="bookcancel?bookingid=${BookingList.bookingid}"><button type="submit">Cancel</button></a></td>                                 
    <c:set var="price" value="${BookingList.totalamount}" scope="session" /> 
	 <c:set var="seat" value="${BookingList.noseat}" scope="session" /> 	
	 <c:set var="Theatreidd" value="${BookingList.theatreid}" scope="session" /> 
       			 
</c:forEach>


</tbody>
          </table>


</div><br><br>
        
 </body>                               
</html>