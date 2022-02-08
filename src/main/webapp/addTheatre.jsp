<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Add Theatres</title>

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
}

li {
	float: left;
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

li a:hover:not(.active) {
	background-color: #111;
}

.ones1 {
	position: absolute;
	top: 80px;
	left: 50px;
	text-decoration: none;
	color: Block;
}

.one {
	position: absolute;
	top: 80px;
	left: 600px;
	text-decoration: none;
	color: Block;
}

.ones {
	position: absolute;
	top: 80px;
	left: 1100px;
	text-decoration: none;
	color: Block;
}

.Log {
	position: absolute;
	top: 1px;
	left: 1250px;
	text-decoration: none;
	color: white;
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

body {
	background-image: linear-gradient(rgba(0, 0, 0, 0.6), rgba(0, 0, 0, 0.6)),
		url('Rohini Sliver Screen.jpg');
	background-repeat: no-repeat;
	background-size: cover;
	background-attachment: fixed;
	font-weight: bold;
}

.list {
	position: absolute;
	top: 58px;
	left: 1250px;
	text-decoration: none;
	color: white
}
</style>
</head>

</body>
<body>
<ul>
  <li><a class="active" href="home">Home</a></li>
  <li><a href="addTheatre.jsp">AddTheater</a></li>
  <li><a href="showMovie.jsp">ShowMovie</a>
  <li><a href="UserdetailHistory.jsp">UserList</a>
  <li><a href="bookingHistory.jsp">BookingList</a> 
  <li><a href="login.jsp" class="log">Logout</a></li>
    
</ul>
</head>
<body>

                      <div class="list">

                     <a href="adminHomepage.jsp"  class="btn btn-primary"> <button>Back</button></a>  

                      </div>
        

 
            
     <div class="ones1">
    <h1>Add Theater</h1>
    
    <form action="Addtheatre" method="post">
    <label for="theatrename">Enter your Theater Name:</label><br>
    <input type="text" name="theatrename" id="theatrename"><br><br>
    <label for="movieid">Enter your movie Id:</label> <br>
    <input type="text" name="movieid" id="movieid"><br><br>
 
    <label for="Numberseats">Enter your Number Seats:</label> <br>
    <input type="text" name="Numberseats" id="Numberseats"><br><br>
    <label for="theatre Address">Enter your Theater Address:</label> <br>
    <input type="text" name="theatre Address" id="theatre Address"><br><br>
    <label for="theatre Ratings">Enter your Theater Ratings:</label> <br>
    <input type="text" name="theatre Ratings" id="theatre Ratings"><br><br>
    <label for=" Movie date and time">Enter your Movie date and time:</label> <br>
    <input type="datetime-local" name=" Movie date and time" id="Movie date and time"><br><br>
    <label for="Price">Enter your Price:</label> <br>
    <input type="Number" name="Price" id="Price"><br><br>
    <label for="images">Enter your Image:</label><br>
    <input type="file" name="images" id="images"><br><br>
     <button type="submit">Add Theater</button><br>
     
     
   </form>
   </div>
   
   
   <div class="one">
   
    <h2>Update Theater</h2>

     <form action="Updatetheatre1" method="post">
    <label for="theatrename">Enter your Theater Name:</label><br>
    <input type="text" name="theatrename" id="theatrename"><br><br>
    <label for="Price">Enter your Price:</label> <br>
    <input type="Number" name="Price" id="Price"><br><br>
     <label for="theatre Id">Enter your Theater Id:</label> <br>
    <input type="text" name="theatre Id" id="theatre Id"><br><br>
     <button type="submit">Update Theater</button><br>
    
    </form>
    </div>
    
    
    <div class="ones">
    <h3>Delete Theater</h3>
    
    <form action="Deletetheatre4" method="post">
    <label for="theatre Id">Enter your Theater Id:</label> <br>
    <input type="text" name="theatre Id" id="theatre Id"><br><br>
    <button type="submit">DeleteTheatre</button>
    </form>
    </div>
    
    
</body>
<script type="text/javascript">
var today = new Date();
var dd = today.getDate();
var mm = today.getMonth()+1; 
var yyyy = today.getFullYear();
if(dd<10){
  dd='0'+dd
} 
if(mm<10){
  mm='0'+mm
} 

today = yyyy+'-'+mm+'-'+dd;
document.getElementById("datefield").setAttribute("min", today);
</script>
</html>