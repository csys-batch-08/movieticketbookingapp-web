<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Admin Profile</title>
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
	padding: 10px;
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


        
       <div>
                                       <c:set var="count" value="1"/>
                                       <c:forEach items="${listproduct}" var="profile">
                                       
                                       <c:set var="count" value="${count+1}"/>
                                       
                                     
                                         
                                        <div class="one">
                                          
                                        <img src="profile1.png" style="margin-left:20px;margin-top:20px;width:130px;">  	
                                     
                                             
                                          
                                        <h2 class="Userdetail">User Profile</h2>
                                    
                                        
                                        <span>Name :  ${profile.username} </span><br>
                                        <span>Gender : ${profile.gender }  </span><br>
                                        <span>Email ID: ${profile.emailid } </span><br>
                                        <span>Mobile number: ${profile.mobilenum }</span><br>
                                        <span>Password: ${profile.epassword }</span><br>
                                      
                                          
                                         </div> 
                                           
                                           
                                           
                                         <div class="ones">

                                         <a href="ShowServlet"  class="btn btn-primary"><button>Back</button> </a>

                                         </div>
                             
                                    </c:forEach>
                      
   
</div>
</body>
</body>
</html>