<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ page import="com.movieticketbookingdaoimpl.*" %>
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
.class{

color:white;
}

h2
{
 color:white;
}
table
{
   width:100%;
   border:2px solid; 
   
}

.one6{
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
</style>





</head>





                     <div class="one6">

                      <button><a href="Addmovie.jsp"  class="btn btn-primary">Back</a></button>  

                      </div>
        
<body>
  
	
	
                         <h2 class="Bookingdetail">Booking Detail</h2>
          
        
                          <div class="Booking list">
                          <table border=1 >
                          <tbody>
                          <tr>
                          <c:set var="count" value="1"/>
                                         
                          <c:forEach items="${Bookslist}" var="List">
               
                          <td>
                          <table id="booking">
                          <tbody>
                          <tr>
                                     
                                   <td class="viewall">
                                    
                                   <div class="class">
                                    
                                        <span>Booking Id: ${List.bookingid } </span><br>
                                        <span>Theatre Id : ${List.theatreid }  </span><br>
                                        <span>User Id: ${List.userid } </span><br>
                                        <span>Booked seats : ${List.noseat } </span><br>
                                        <span>Total Amount : ${List.totalamount } </span><br>
                                        <span>Status: ${List.bookingstatus }</span><br>
                                        <span>Movie Name: ${List.moviename }</span><br>  
                                    </div>
                                    
                                    
                                    </td>
                                    </tr>
                                    </tbody>
                                    </table>  
                            
                                    </td>
                                    <c:choose>
                                    
                                    <c:when test="${count==4}">
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
    </div>
   </div>
</body>
</html>