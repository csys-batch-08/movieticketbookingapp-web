<%@page import="java.sql.ResultSet"%>
<%@page import="com.MovieticketBookingModel.Movie"%>
<%@page import="com.movieticketbookingdaoimpl.MovieDaoImpl"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page import="java.util.*"%>
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


img{
width: 320px;
padding:20px;
}

span{
position : relative;
top:240px;
left: -270px;
font-size:15px;

}

.movieid
{
visibility:hidden;
}

.searchbtn
{
  position:absolute;
  top:15px;
  left:600px;
  text-decoration:none;
  color:Block;
  text-decoration: none;
}

.log
{
  position:absolute;
  top:1px;
  left:1250px;
  text-decoration:none;
  color:white;
}

.contact{

  position:absolute;
  top:1px;
  left:1000px;
  text-decoration:none;
  color:white;

}

.contact1{

  position:absolute;
  top:1px;
  left:1100px;
  text-decoration:none;
  color:white;

}

p{
margin-top:10px;
margin-left:10px;
color:white;
font-size:24px;
}


.movie
{
   position:relative;
  left:8px;
  color:white;
}

ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color:#333;
}

li {
  float: left;
  padding-top:5px;
 
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
  font-size:18px; 
}

li a:hover:not(.active) {
  background-color: #111;
  text-decoration: none;
}

.active {

  font-size:x-large;
}

 body {
  
  background-image:linear-gradient(rgba(0,0,0,0.3),rgba(0,0,0,0.3)),url('Rohini Sliver Screen.jpg');
  background-repeat: no-repeat;
  background-size:cover;
  background-attachment: fixed;
  font-weight: bold;
}
.border{
	border: 1px solid black;
	position: relative;
	top: 200px;
}

table td{
padding-bottom:120px;

} 

</style>

</head>
</body>

<body>
<ul>
<!-- -- 1300px 1500px ---->

           <div class="top">
             
             <li><a class="active" href="Show.jsp">Home</a></li>
             <li><a href="News.jsp">News</a></li>
             <li><a href="UserServlet">Profile</a></li>
             <li><a href="Wallet.jsp">Recharge Wallet</a></li>
             <li><a href="MybookingServlet">My Bookings</a></li>

           </div>
   
          <div class="log">
   
            <li><a href="login.jsp">Logout</a></li>
            
          </div>
   
         
          <div class="contact">
   
            <li><a href="About Us.jsp">About Us</a></li>
            
          </div>
   
          <div class="contact1">
   
            <li><a href="Contact Us.jsp">Contact Us</a></li>
    
          </div>
   
 </ul>        
    

              <table>
              <tbody>
              <tr>
   
                                        
                                         
                 <div class="searchbtn">
          
                 <form action="Search" method = "post">

                 <input type="text" name="moviename" id="moviename">
 
                 <input type="submit" class="btn btn-primary" value="Search">
                  
                                        
                 </div>
                 </form>
                                      <tr>  
                                        <p>Movie List<p>
                                       <c:set var="count" value="1"/>
                                         
                                       <c:forEach items="${Movielist}" var="MovieList">
                                            
                                         <td>
                                        <table id="movietable">
                                        <tbody>
                                        
                                         <tr>
                                        
                                         <td> <img src="images/${MovieList.getImages()}" width=100px alt="img"></td> 
                                         
                                         
                                         
                                        <td class="movie">
                                        
                                        
                                        <span id="movie name">Movie name: ${MovieList.getMoviename() } </span><br>
                                       
       
                              
                                        <span>Movie type: ${MovieList.getMovietype() } </span><br>
                                        <span>Movie ratings:${MovieList.getMovieratings() } </span><br>
                                        <span>Movie duration:${MovieList.getMovieduration() }</span><br>
                                        <span>Movie director:${MovieList.getDirector() }</span><br>
                                        <span>Music director:${MovieList.getMusicdirector() }</span><br>
                                        <span>Hero name:${MovieList.getHeroname() }</span><br>
                                        
                                       
                                        
                                        <input type = "text" value = ${MovieList.getMovielink() } name = "movlink" class="movieid">
                                   <button><a href="Moviedetails?mvname=${MovieList.getMoviename()}&movlink=${MovieList.getMovielink()}" class="btn btn-primary">Theatre</a></button> </span></div>
                                      
                                        </form>
                                        </div>
                                       
                                        </td>
                                        </tr>
                                        </tbody>
                                        </table>  
                            
                                        </td>
                                        <c:choose>
                                    
                                        <c:when test="${count==3}">
                                        <c:set var="count" value="1"/>
                                     
                                 
                    	                </tr>
                    	                <tr> 
                    	                </c:when>
                    	                <c:otherwise>
                    	                <c:set var="count" value="${count+1}"/>
                    	                </c:otherwise>             
                                        </c:choose>
                                        </c:forEach>   
                       
                                        </tr>
                                        </tbody>
                                        </table>
                                 
                                   <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

                                   
                                 
</body>
</html>