<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="com.movieticketbookingdaoimpl.*" %>
    <%@ page import="java.util.*" %>
    <%@ page import="com.MovieticketBookingModel.User" %>
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

.one
{
position:relative;
margin-left:550px;
border:4px solid black;
top:90px;
padding:20px;
color:white;
}

h2{
color:white;

}
.ones{
  position:absolute;
  top:50px;
  left:1250px;
  text-decoration:none;
  color:white;

}

 body {
  background-image:linear-gradient(rgba(0,0,0,0.3),rgba(0,0,0,0.3)),url('Rohini Sliver Screen.jpg');
  background-repeat: no-repeat;
  background-size:cover;
  background-attachment: fixed;
  font-weight: bold;
}

</style>
</head>

<body>


        
          
        
      
                                       <table border=0 >
                                       <tbody>
                                       <tr>
                                       <c:set var="count" value="1"/>
                                       <c:forEach items="${listproduct}" var="Bookinglist">
               
              
                                       <td>
                                       <table id="movie">
                                       <tbody>
                                       <tr>
                                        
                                      
                                        <td class="viewall">
                                         
                                        <div class="one">
                                          
                                        <img src="profile1.png" style="margin-left:20px;margin-top:20px;width:130px;">  	
                                     
                                             
                                          
                                        <h2 class="Userdetail">User Profile</h2>
                                    
                                        <span>UserID: ${Bookinglist.userid } </span><br>
                                        <span>Name :   ${Bookinglist.username } </span><br>
                                        <span>Gender : ${Bookinglist.gender }  </span><br>
                                        <span>Email ID: ${Bookinglist.emailid } </span><br>
                                        <span>Mobile number: ${Bookinglist.mobilenum }</span><br>
                                        <span>Password: ${Bookinglist.epassword }</span><br>
                                        <span>Wallet Amount: ${Bookinglist.wallet } </span><br>
                                          
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
         
     
  


</body>
</html>