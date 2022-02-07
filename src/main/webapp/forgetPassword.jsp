<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Forgot Password</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<style>
.one {
	margin-top: 150px;
	position: relative;
	margin-left: 500px;
	border: 3px solid black;
	padding: 10px;
	width: 280px;
	color: white
}
.ones {
	position: absolute;
	top: 50px;
	margin-left:1200px;
	text-decoration: none;
	color: white
}
p{
color:white;
}

.label{ 
text color:white ;
}
body {
	background-image: linear-gradient(rgba(0, 0, 0, 0.7), rgba(0, 0, 0, 0.7)),
		url('Rohini Sliver Screen.jpg');
	background-repeat: no-repeat;
	background-size: cover;
	background-attachment: fixed;
}

</style>
</head>
<body>

	          
	             
                 <div class="ones">
                 <a href="login.jsp" class="btn btn-primary"><button>Back</button></a>
		         </div>

	             <div class="one">
                 <p>
			      Change your Password
		         </p>
		         <form action="Forget" method="post">
			     <label for="forget">Enter your Email:</label><br> <input type="text"
				 name="forget" id="forget"><br>
			     <br> <label for="password">Enter your new password:</label><br> <input
				 type="text" name="password" id="password"><br>
			     <br>
			     <button type="submit" class="btn btn-primary">Submit</button>
	


</form>
</div>
</body>
</html>