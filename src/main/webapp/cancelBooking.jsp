<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Cancel Booking</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<style>
.one {
	padding: 30px;
	position: relative;
	margin-left: 500px;
	top: 90px;
	width: fit-content;
}

.mar {
	color: white;
}

label {
	color: white;
}

h1 {
	color: white;
}

body {
	background-image: linear-gradient(rgba(0, 0, 0, 0.7), rgba(0, 0, 0, 0.7)),
		url('Rohini Sliver Screen.jpg');
	background-repeat: no-repeat;
	background-size: cover;
	background-attachment: fixed;
	font-weight: bold;
}

p {
	color: white;
}

.ones {
	top: 50px;
	margin-left: 1250px;
	margin-tp: 20px;
	text-decoration: none;
	color: white;
}
</style>
</head>
<body>

     <marquee class="mar">Please Enter the Valid Booking ID</marquee>
     
     <div class="ones"><button><a href="ShowServlet"  class="btn btn-primary">Back</a></button></div>
     
     <div class="one">
    <form action="CancelMovieServlet" method="post">

 
      <h1>Cancel Ticket</h1>
  
    <label> Enter Booking ID:</label><br><br>
    <input type="text" name="cancel" id="cancel" required><br><br>
    <label> Enter Booking Status:</label><br><br>
    <input type="text" name="status" id="status" required><br><br>
    
    <button type="submit"  class="btn btn-primary">Cancel Ticket</a></button><br><br>
    
    <p>Note:Booking Status Will Be <br> Enter Cancelled.</p>
    
    </div>
    
    
                     
                                           
    </form>
    
</body>
</html>