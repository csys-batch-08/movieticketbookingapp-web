<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Wallet</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>


<style>
.one {
	position: relative;
	margin-left: 510px;
	margin-top: 90px;
	top: 60px;
	border: 3px solid;
	padding: 10px;
	width: 280px;
	background-color: rgba(180, 228, 230, 0.2);
}

.ones {
	position: absolute;
	top: 50px;
	left: 1250px;
	text-decoration: none;
	color: white
}

a {
	color: white;
}

h1 {
	color: white;
}

p {
	color: white;
}

label {
	color: white;
	font-size: 20px;
}
.log{
margin-left:1200px;
}
body {
	background-image: linear-gradient(rgba(0, 0, 0, 0.7), rgba(0, 0, 0, 0.7)),
		url('Rohini Sliver Screen.jpg');
	background-repeat: no-repeat;
	background-size: cover;
	background-attachment: fixed;
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
}

li a {
	display: block;
	color: white;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
	font-size: 18px;
}



.active {
	font-size: x-large;
}

.border {
	border: 1px solid black;
	position: relative;
	top: 200px;
}

.border {
	border: 1px solid black;
	position: relative;
	top: 200px;
}

input[type :number] {
	background: black;
}
</style>
</head>
<body> 

          <ul>

          <div class="top">
     
               <li><a class="active" href="ShowServlet">Home</a></li>
               <li><a href="UserServlet">Profile</a></li>
               <li><a href="ShowServlet">Movie List</a></li>
               <li><a href="MybookingServlet">My Bookings</a></li>
             
         </div>
   
         <div class="log">
   
               <li><a href="login.jsp">Logout</a></li>
               
       
      </div>
    
     </ul>




<%
if(session.getAttribute("lowbal") != null){%>
<h1 id = "lowbalhead">Low Balance Please Top Up!!</h1>
<% 	
}
session.removeAttribute("lowbal");
%>
     <div class="one">
     <h1>Wallet Update</h1>
     
 <form action="WalletAmountServlet" method="post">
     
    <label> Enter your Amount:</label><br>
     <input type="number" name="amount" id="number" min = "1" pattern="[1-9]+"
><br><br>
    
     
      <button type="submit"  class="btn btn-primary">Wallet Recharge</button><br><br>
     <p> Note:Wallet Amount Check Your Profile</p>
        
      </div>
        
   
        
        
     </form>
           
      <div class="ones">

       <button><a href="ShowServlet"  class="btn btn-primary">Back</a></button>  

       </div>
</body>
</html>