<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="com.movieticketbookingdaoimpl.*" %>
    <%@ page import="java.util.*" %>
    <%@ page import="com.movieticketbookingmodel.User" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">

<title>User Profile</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>


<style>
body {
	background-image: linear-gradient(rgba(0, 0, 0, 0.7), rgba(0, 0, 0, 0.7)),
		url("images/Rohini Sliver Screen.jpg");
	background-repeat: no-repeat;
	background-size: cover;
	background-attachment: fixed;
	font-weight: bold;
}
.one {
	position: relative;
	margin-left: 550px;
	border: 4px solid black;
	top: 90px;
	padding: 20px;
	color: white;
	background-color: rgba(180, 228, 230, 0.2);
	font-size: bold;
}

h2 {
	color: white;
}

.ones {
	position: absolute;
	top: 50px;
	left: 1250px;
	text-decoration: none;
	color: white;
}


</style>
</head>

<body>


        
                                    <table border=0 >
                                       <tbody>
                                 
                                       <c:set var="count" value="1"/>
                                       <c:forEach items="${listproduct}" var="Bookinglist">
               
              
                                       <td>
                                       <table id="movie">
                                       <tbody>
                                       <tr>
                                        
                                      
                                        <td class="viewall">
                                         
                                        <div class="one">
                                          
                                        <img src="profile1.png" style="margin-left:20px;margin-top:20px;width:130px;"alt="img">  	
                                     
                                             
                                          
                                        <h2 class="Userdetail">User Profile</h2>
                                    
                                        <span>UserID: ${Bookinglist.userid } </span><br>
                                        <span>Name :   ${Bookinglist.username } </span><br>
                                        <span>Gender : ${Bookinglist.gender }  </span><br>
                                        <span>Email ID: ${Bookinglist.emailid } </span><br>
                                        <span>Mobile number: ${Bookinglist.mobilenum }</span><br>
                                        <span>Password: ${Bookinglist.epassword }</span><br>
                                        <span>Wallet Amount: ${Bookinglist.wallet } rs </span><br>
                                          
                                         </div> 
                                           
                                            <c:set var="WalletAmount"
											value="${Bookinglist.wallet}" scope="session" />    
                                           
                                         <div class="ones">

                                        <a href="ShowServlet"  class="btn btn-primary"><button>Back</button></a>  

                                         </div>
                                           
                                            
                                       
                                     </td>
                                     </tr>
                                     </tbody>
                                     </table>  
                            
                                     </td>
                                    
                                     <c:choose>
                                    
                                     <c:when test="${count==5}">
                                     <c:set var="count" value="1"/>
                                     
                                 
                    	           
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