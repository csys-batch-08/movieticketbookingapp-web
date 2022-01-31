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
.one{

  color:white;
}
h2
{
 color:white;
}


.one6{
  position:absolute;
  top:20px;
  left:1250px;
  text-decoration:none;
  color:white

}

body {
  
  background-image:linear-gradient(rgba(0,0,0,0.6),rgba(0,0,0,0.6)),url('Rohini Sliver Screen.jpg');
  background-repeat: no-repeat;
  background-size:cover;
  background-attachment: fixed;
  font-weight: bold;
}

table
{
   width:100%;
   border:2px solid;
}

</style>
   



</head>
<body>

                      <div class="one6">

                      <button><a href="Addmovie.jsp"  class="btn btn-primary">Back</a></button>  

                      </div>
        


 

	
	
	
                                    <h2 class="Userdetail">User Details</h2>
          
        
                                    <div class="recentlyaddedlist">
                                    <table border=1 >
                                    <tbody>
                                    <tr>
        
                                    <c:set var="count" value="1"/>
                                         
                                    <c:forEach items="${UserListObj}" var="userList">
                                       
              
                                    <td>
                                    <table id="user">
                                    <tbody>
                                    <tr>
                                     
                                    <td class="viewall">
                                    
                                    <div class="one">
                                        <span>User Id : ${userList.userid} </span><br>
                                        <span>User name : ${userList.username} </span><br>
                                        <span>User name : ${userList.gender} </span><br>
                                        <span>Email Id: ${userList.emailid} </span><br>
                                        <span>Mobile Number : ${userList.mobilenum} </span><br>
                                        <span>Password: ${userList.epassword}</span><br>
                                        <span>Wallet : ${userList.wallet}</span><br>
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
</body>
</html>