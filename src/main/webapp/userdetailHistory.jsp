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
<title>User History</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<style>
body {
	background-image:url("images/Backimages.jpg");
	background-repeat: no-repeat;
	background-size: 1390px 700px;
	background-attachment: fixed;
	
	color:white;
}
.one {
	color: white;
}

h2 {
	color: white;
    text-align: center;
}
user{
	color: white;
}

table{
border-style: solid;
border-color:silver;
margin-left: 340px;
padding:18px 18px;
background-color: rgba(0,0,0, 0.4);
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
.color {
	position: absolute;
	top: 20px;
	left: 1250px;
	text-decoration: none;
	color: white
}


</style>




</head>
<body>

                      <div class="color">

                      <button><a href="adminHomepage.jsp"  class="btn btn-primary">Back</a></button>  

                      </div>
        


 

	
	
	
                                    <h2 class="Userdetail">User Details</h2>
                         <div class = "user">
<table id="allusers">
<caption></caption>
<thead>
<tr>
<th id = "sno">S.no</th>
<th id = "User Id">User Id</th>
<th id = "User name ">User name </th>
<th id = "Gender">Gender</th>
<th id = "Email Id">Email Id</th>
<th id = "Mobile Number">Mobile Number</th>
</tr>
</thead>
<tbody>


<c:set var="count" value="0"/>
 <c:forEach items="${UserListObj}" var="userList">
<c:set var="count" value="${count+1}"/>

<tr>


<td>${count}</td>

<td>${userList.userid} </td>
<td> ${userList.username}</td>
<td> ${userList.gender}</td>
<td> ${userList.emailid}</td>
<td> ${userList.mobilenum} </td>


</c:forEach>


</tbody>
          </table>


</div><br><br>  
        
                                 
</body>
</html>