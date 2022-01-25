<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <form action="Addtheatre" method="post">
    <label>Enter your Theatre Name:</label>
    <input type="text" name="theatrename"><br><br>
    <label>Enter your movie Id:</label> 
     <input type="text" name="movieid"><br><br>
    <label>Enter your Theatre Id:</label> 
    <input type="text" name="theatre Id"><br><br>
    <label>Enter your Number Seats:</label> 
    <input type="text" name="Numberseats"><br><br>
    <label>Enter your Theatre Address:</label> 
    <input type="text" name="theatre Address"><br><br>
    <label>Enter your Theatre Ratings:</label> 
    <input type="text" name="theatre Ratings"><br><br>
    <label>Enter your Movie date and time:</label> 
    <input type="datetime-local" name=" Movie date and time"><br><br>
    <label>Enter your Price:</label> 
    <input type="text" name="Price"><br><br>
     <button type="submit">Add Theatre</button>
     
   </form>


<form action="Updatetheatre" method="post">
    <label>Enter your Theatre Name:</label>
    <input type="text" name="theatrename"><br><br>
    <label>Enter your movie Id:</label> 
     <input type="text" name="movieid"><br><br>
    <label>Enter your Theatre Id:</label> 
    <input type="text" name="theatre Id"><br><br>
    <label>Enter your Number Seats:</label> 
    <input type="text" name="Numberseats"><br><br>
    <label>Enter your Theatre Address:</label> 
    <input type="text" name="theatre Address"><br><br>
    <label>Enter your Theatre Ratings:</label> 
    <input type="text" name="theatre Ratings"><br><br>
    <label>Enter your Movie date and time:</label> 
    <input type="datetime-local" name=" Movie date and time"><br><br>
    <label>Enter your Price:</label> 
    <input type="text" name="Price"><br><br>
     <button type="submit">Update Theatre</button>
    
    </form>
    
    <form action="Deletetheatre" method="post">
    <label>Enter your Theatre Id:</label> 
    <input type="text" name="theatre Id"><br><br>
    <button type="submit">DeleteTheatre</button>
    
</body>
</html>