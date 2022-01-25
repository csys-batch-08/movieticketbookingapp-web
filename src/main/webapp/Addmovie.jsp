<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
  border-right:1px solid #bbb;
    text-decoration: none;
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
}

li a:hover:not(.active) {
  background-color: #111;
}

.active {
  background-color: #04AA6D;
}
.ones1{
  position:absolute;
  top:80px;
  left:50px;
  text-decoration:none;
  color:Block;
   text-decoration: none;
}
.one{
  position:absolute;
  top:80px;
  left:600px;
  text-decoration:none;
  color:Block;
   text-decoration: none; 
}
.ones{
  position:absolute;
  top:80px;
  left:1100px;
  text-decoration:none;
  color:Block;
  text-decoration: none;
}
Label{
color:white;

}
h1{
color:white;
}

h2{
color:white;
}

h3{
color:white;
}



 body {
  background-image: url('Rohini Sliver Screen.jpg');
  background-repeat: no-repeat;
  background-size:100% 1200px;
}

</style>
</head>
<body style="background-color:red;">
</body>
<body>
<ul>
  <li><a class="active" href="#home">Home</a></li>
  <li><a href="News.jsp">News</a></li>
  <li><a href="AddTheatre.jsp">AddTheatre</a></li>
    <li><a href="Show.jsp">ShowMovie</a>
  <li><a href="UserdetailHistory.jsp">UserList</a>
  <li><a href="BookingHistory.jsp">BookingList</a>
  <li><a href="Login1.jsp">logout</a></li>
    
  
 
</ul>
</style>
</head>
<body>

    

    <br>
    <div class ="ones1">
    <h1>Add New Movies</h1>
    <form action="Addmovie" method="post">
    <label>Enter your movie name:</label><br>
    <input type="text" name="movie name"><br><br>
    <label>Enter your movie id:</label><br>
    <input type="text" name="Move id"><br><br>
     <label>Enter your movie type:</label><br>
    <input type="text" name="Move type"><br><br>
     <label>Enter your movie ratings:</label><br>
    <input type="text" name="Move ratings"><br><br>
    <label>Enter your movie duration:</label><br>
    <input type="text" name="Move duration"><br><br>
    <label>Enter your Director:</label><br>
    <input type="text" name="Director"><br><br>
    <label>Enter your music director:</label><br>
    <input type="text" name="Music director"><br><br>
    <label>Enter your Hero name:</label><br>
    <input type="text" name="Hero name"><br><br>
    <label>Enter your Image:</label><br>
    <input type="file" name="images"><br><br>
     <label>Enter your Number:</label><br>
    <input type="text" name="number"><br><br>
    
    <button type="submit" class="btn btn-primary" >Add movie</button>
    
    </form>
    </div>
   
   <div class="one">
   <h2>Update Movies</h2>
   
    <form action="updateMovie" method="post">
    <label>Enter your movie name:</label><br>
    <input type="text" name="movie name"><br><br>
     <label>Enter your movie type:</label><br>
    <input type="text" name="Move type"><br><br>
    <label>Enter your movie duration:</label><br>
     <input type="text" name="Move duration"><br><br>
    <label>Enter your movie id:</label><br>
    <input type="text" name="Move id"><br><br>
   
    
    <button type="submit" class="btn btn-primary">Update movie</button>
      </div>
    </form>
  
    <div class="ones">
    <h3>Delete Movies</h3>
    
    <form action="DeleteMovie1"  method="post">
    <label>Enter your movie id:</label><br>
    <input type="text" name="Move id"><br><br>
    <button type="submit" class="btn btn-primary">Delete movie</button>
    </div>
    </form>
    
</body>
</html>