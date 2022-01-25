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
}

li {
  float: left;
  border-right:1px solid #bbb;
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
}
.one{
  position:absolute;
  top:80px;
  left:600px;
  text-decoration:none;
  color:Block;
}
.ones{
  position:absolute;
  top:80px;
  left:1100px;
  text-decoration:none;
  color:Block;
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
  background-size:cover;
}

.one6{
  position:absolute;
  top:50px;
  left:1250px;
  text-decoration:none;
  color:white

}

</style>
</head>

</body>
<body>
<ul>
  <li><a class="active" href="home">Home</a></li>
  <li><a href="News.jsp">News</a></li>
  <li><a href="Show.jsp">ShowMovie</a>
  <li><a href="UserdetailHistory.jsp">UserList</a>
  <li><a href="BookingHistory.jsp">BookingList</a>
  <li><a href="AddTheatre.jsp">AddTheatre</a></li>
    <li><a href="Login1.jsp">logout</a></li>
 
</ul>

 
</head>

<body>

                      <div class="one6">

                      <button><a href="Addmovie.jsp"  class="btn btn-primary">Back</a></button>  

                      </div>
        

 
            
     <div class="ones1">
    <h1>Add Theatre</h1>
    
    <form action="Addtheatre" method="post">
    <label>Enter your Theatre Name:</label><br>
    <input type="text" name="theatrename"><br><br>
    <label>Enter your movie Id:</label> <br>
     <input type="text" name="movieid"><br><br>
 
    <label>Enter your Number Seats:</label> <br>
    <input type="text" name="Numberseats"><br><br>
    <label>Enter your Theatre Address:</label> <br>
    <input type="text" name="theatre Address"><br><br>
    <label>Enter your Theatre Ratings:</label> <br>
    <input type="text" name="theatre Ratings"><br><br>
    <label>Enter your Movie date and time:</label> <br>
    <input type="datetime-local" name=" Movie date and time" id="datefield"><br><br>
    <label>Enter your Price:</label> <br>
    <input type="Number" name="Price"><br><br>
    <label>Enter your Image:</label><br>
    <input type="file" name="images"><br><br>
     <button type="submit">Add Theatre</button><br>
     
     
   </form>
   </div>
   
   
   <div class="one">
   
    <h2>Update Theatre</h2>

     <form action="Updatetheatre1" method="post">
    <label>Enter your Theatre Name:</label><br>
    <input type="text" name="theatrename"><br><br>
    <label>Enter your Price:</label> <br>
    <input type="Number" name="Price"><br><br>
     <label>Enter your Theatre Id:</label> <br>
    <input type="text" name="theatre Id"><br><br>
     <button type="submit">Update Theatre</button><br>
    
    </form>
    </div>
    
    
    <div class="ones">
    <h3>Delete Theatre</h3>
    
    <form action="Deletetheatre4" method="post">
    <label>Enter your Theatre Id:</label> <br>
    <input type="text" name="theatre Id"><br><br>
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