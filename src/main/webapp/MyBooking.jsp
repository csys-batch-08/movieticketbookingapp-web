<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.MovieTicketBookingDaoImpl.*" %>
    <%@ page import="java.util.*" %>
    <%@ page import="com.MovieticketBookingModel.Bookingdetail" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

.one{

color:white

}

h2
{
 color:white;
}

.ones{
 position:absolute;
 top:20px;
 left:1250px;
 text-decoration:none;
 color:white

}


 body {
  background-image:linear-gradient(rgba(0,0,0,0.3),rgba(0,0,0,0.3)), url('Rohini Sliver Screen.jpg');
  background-repeat: no-repeat;
  background-size:cover;
  background-attachment: fixed;
}
table
{
   width:100%;
   border:2px solid 
}

</style>

</head>
<body>

    

	
	
	
                                   <h2 class="Userdetail">Booking Details</h2>
          
        
      -                            <div class="recentlyaddedlist">
                                   <table border=1 >
                                   <tbody>
                                   <tr>
                                   <c:set var="count" value="1"/>
                                   <c:forEach items="${BookingObj}" var="BookingList">
                                       
             
                                    <td>
                                    <table id="user">
                                    <tbody>
                                    <tr>
                                     
                                    <td class="viewall">
                                    
                                    <div class="one">
                                        <span>Booking Id: ${BookingList.booking_id} </span><br>
                                        <span>User Id: ${BookingList.user_id } </span><br>
                                        <span>Booked seats : ${BookingList.no_seat } </span><br>
                                        <span>Total Amount : ${BookingList.total_amount } </span><br>
                                        <span>Status: ${BookingList.booking_status }</span><br>
                                        <span>Movie Name: ${BookingList.getMovie_name() }</span><br>  
                                        <span>BookingDate : ${BookingList.getBooking_date() } </span><br> 
                                         <span> Date: ${moviedate}</span><br><br>
                                         
                                         </div>   
                                         
                                        
                                     <div class="ones">

                                     <button><a href="ShowServlet"  class="btn btn-primary">Back</a></button>  

                                    </div>
         
                                         
                                         
                                         
                                         
                                         
                                       
                                   </td>
                                   </tr>
                                   </tbody>
                                   </table>  
                            
                                   </td>
                                   <c:choose>
                                    
                                   <c:when test="${count==5}">
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