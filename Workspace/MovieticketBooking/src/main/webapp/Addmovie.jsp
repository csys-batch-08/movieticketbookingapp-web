<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <div class="topnav" id="myTopnav">
    <a href="#Home" class="active">Home</a>
    <a href="#news">News</a>
    <a href="#Contact">Contact</a>
    <div class="dropdown">
    <button class="dropbtn">Dropdown
    <i class="fa-fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
    <a href="#">Add movie</a>
    <a href="#">Update movie</a> 
    <a href="#">Delete movie</a>   
    </div>
    </div>
    <a href="#about">About</a>
    </div>
    <br>
    
    <form action="Addmovie" method="post">
    <label>Enter your movie name:</label>
    <input type="text" name="movie name"><br><br>
    <label>Enter your movie id:</label>
    <input type="text" name="Move id"><br><br>
     <label>Enter your movie type:</label>
    <input type="text" name="Move type"><br><br>
     <label>Enter your movie ratings:</label>
    <input type="text" name="Move ratings"><br><br>
    <label>Enter your movie duration:</label>
    <input type="text" name="Move duration"><br><br>
    <label>Enter your Director:</label>
    <input type="text" name="Director"><br><br>
    <label>Enter your music director:</label>
    <input type="text" name="Music director"><br><br>
    <label>Enter your Hero name:</label>
    <input type="text" name="Hero name"><br><br>
    <button type="submit">Add movie</button>
    
    </form>
    
    <form action="updateMovie" method="post">
    <label>Enter your movie name:</label>
    <input type="text" name="movie name"><br><br>
    <label>Enter your movie id:</label>
    <input type="text" name="Move id"><br><br>
     <label>Enter your movie type:</label>
    <input type="text" name="Move type"><br><br>
     <label>Enter your movie ratings:</label>
    <input type="text" name="Move ratings"><br><br>
    <label>Enter your movie duration:</label>
    <input type="text" name="Move duration"><br><br>
    <label>Enter your Director:</label>
    <input type="text" name="Director"><br><br>
    <label>Enter your music director:</label>
    <input type="text" name="Music director"><br><br>
    <label>Enter your Hero name:</label>
    <input type="text" name="Hero name"><br><br>
    <button type="submit">Update movie</button>
    
    </form>
    
    <form action="DeleteMovie1"  method="post">
    <label>Enter your movie id:</label>
    <input type="text" name="Move id"><br><br>
    <button type="submit">Delete movie</button>
    </form>
    
</body>
</html>