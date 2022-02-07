<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Add Movies</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<style>
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
}

li:last-child {
	border-right: none;
	text-decoration: none;
}

li a {
	display: block;
	color: white;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
	font-size: 18px;
}

li a:hover:not(.active) {
	background-color: #111;
}

.ones1 {
	position: absolute;
	top: 80px;
	left: 50px;
	text-decoration: none;
	color: Block;
	text-decoration: none;
}

.one {
	position: absolute;
	top: 80px;
	left: 600px;
	text-decoration: none;
	color: Block;
	text-decoration: none;
}

.ones {
	position: absolute;
	top: 80px;
	left: 1100px;
	text-decoration: none;
	color: Block;
	text-decoration: none;
}

Label {
	color: white;
}

h1 {
	color: white;
}

h2 {
	color: white;
}

h3 {
	color: white;
}

.Logs {
	position: absolute;
	top: 1px;
	left: 1250px;
	text-decoration: none;
	color: white;
}

body {
	background-image: linear-gradient(rgba(0, 0, 0, 0.6), rgba(0, 0, 0, 0.6)),
		url('Rohini Sliver Screen.jpg');
	background-repeat: no-repeat;
	background-size: cover;
	background-attachment: fixed;
	font-weight: bold;
}
</style>
</head>
</body>
<body>
<ul>

  <li><a class="active" href="#home">Home</a></li>
  <li><a href="adminProfile.jsp">Profile</a></li>
  <li><a href="addTheatre.jsp">AddTheatre</a></li>
  <li><a href="ShowServlet">ShowMovie</a>
  <li><a href="UserHistoryServlet">UserList</a>
  <li><a href="BookingHistoryServlet">BookingList</a>
  <li><a href="login.jsp" class="Logs">Logout</a></li>

</ul>
</head>
<body>
<br>

    <div class ="ones1">
    <h1>Add New Movies</h1>
    <form action="Addmovie" method="post">
    <label for="movie name">Enter your movie name:</label><br>
    <input type="text" name="movie name" id="movie name"><br><br>
    <label for="Move id">Enter your movie id:</label><br>
    <input type="text" name="Move id" id="Move id"><br><br>
    <label for="Move type">Enter your movie type:</label><br>
    <input type="text" name="Move type" id="Move type"><br><br>
    <label for="Move ratings">Enter your movie ratings:</label><br>
    <input type="text" name="Move ratings" id="Move ratings"><br><br>
    <label for="Move duration">Enter your movie duration:</label><br>
    <input type="text" name="Move duration" id="Move duration"><br><br>
    <label for="Director">Enter your Director:</label><br>
    <input type="text" name="Director" id="Director"><br><br>
    <label for="Music director">Enter your music director:</label><br>
    <input type="text" name="Music director" id="Music director"><br><br>
    <label for="Hero name">Enter your Hero name:</label><br>
    <input type="text" name="Hero name" id="Hero name"><br><br>
    <label- for="images">Enter your Image:</label><br>
    <input type="file" name="images" id="images"><br><br>
     <label for="number">Enter your Number:</label><br>
    <input type="text" name="number" id="number"><br><br>
    
    <button type="submit" class="btn btn-primary" >Add movie</button>
    
    </form>
    </div>
   
   <div class="one">
   <h2>Update Movies</h2>
   
    <form action="updateMovie" method="post">
    <label for="movie name">Enter your movie name:</label><br>
    <input type="text" name="movie name" id="movie name"><br><br>
     <label for="Move type">Enter your movie type:</label><br>
    <input type="text" name="Move type" id="Move type"><br><br>
    <label for="Move duration">Enter your movie duration:</label><br>
     <input type="text" name="Move duration" id="Move duration"><br><br>
    <label for="Move id">Enter your movie id:</label><br>
    <input type="text" name="Move id" id="Move id"><br><br>
   
    
    <button type="submit" class="btn btn-primary">Update movie</button>
     
    </form>
     </div>
    <div class="ones">
    <h3>Delete Movies</h3>
    
    <form action="DeleteMovie1"  method="post">
    <label for="Move id">Enter your movie id:</label><br>
    <input type="text" name="Move id" id="Move id"><br><br>
    <button type="submit" class="btn btn-primary">Delete movie</button>
  
</form>
</div>   
</body>
</html>