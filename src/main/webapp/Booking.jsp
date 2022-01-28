<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.MovieTicketBookingDaoImpl.*" %>
    <%@page import=" java.util.List" %>
    <%@page import="com.MovieticketBookingModel.*" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>




<style>


html,body{
    background-image: linear-gradient(rgba(0,0,0,0.7),rgba(0,0,0,0.6)),url(https://www.vetbossel.in/wp-content/uploads/2020/08/movie-ticketing-768x576.jpg);
     background-repeat: no-repeat;
     background-size: 100% 700px;
     position: absolute;  
     width: 100%;
     color:white;
}

.log1
{
  position:absolute;
  top:90px;
  left:1200px;
  text-decoration:none;
  color:white;
}  

.log
{
  position:absolute;
  top:1px;
  left:1250px;
  text-decoration:none;
  color:white;
}   
   
.one
{
textalign:center;
position:absolute;
left:300px;
top:-50px;
}

.five
{
position:relative;
margin-left:550px;
}

img
{
 width:600px;
 position:absolute;
 top:120px;
 left:-500px;
}


ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
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
}

.active {

  font-size:x-large;
}

.border{
	border: 1px solid black;
	position: relative;
	top: 200px;
}

.border{
	border: 1px solid black;
	position: relative;
	top: 200px;
}

input[type:number]
{
   background:black;
}


</style>  
</head>
<body> 

          <ul>

          <div class="top">
     
               <li><a class="active" href="ShowServlet">Home</a></li>
               <li><a href="News.jsp">News</a></li>
               <li><a href="UserServlet">Profile</a></li>
               <li><a href="Wallet.jsp">Recharge Wallet</a></li>
               <li><a href="ShowServlet">Movie List</a></li>
               <li><a href="MybookingServlet">MyBooking</a></li>
               <li><a href="CancelBooking.jsp">Cancel Booking</a></li>
         </div>
   
         <div class="log">
   
               <li><a href="Login1.jsp">Logout</a></li>
               
        </div>
   
        <div class="log1">
   
              <button type="submit" ><a href="TheatreServlet" class="btn btn-primary">Back</a></button>  
   
        </div>
  
  
    
        </ul>



                                 <div class="five">
                                  <c:set var="count" value="1"/>
                                  <c:forEach items="${BookListObj}" var="BookList">   
                                       
                              
	 
             
           <img src="Rakki.jpg">        
          <marquee>Book Your Ticket Like Myshow</marquee>
              <div class="one">
              
          
               
                
                    
          
               <span style="visibility:hidden "> Movie id :<input type="text" name="theatre" value=" ${BookList.movieid }"><br><br></span>
               <span style="visibility:hidden ">  Theatre id:<input type="text" name="movie" value="${BookList.theatreid } "><br></span>
               <span style="visibility:hidden "> Movie date:<input type="text" name="theatre" value=" ${BookList.moviedatetime }"><br></span>
                 
               <p> Theatre Details</p><br>
            
               Theatre name:<br>
              <input type="text" name="movie" value="${BookList.theatrename }" readonly="readonly"><br><br>
              <label for ="Movie Id">Total Seat:</label><br>
              <input type="text" name="Movie" id="Movie" value=100 readonly="readonly" ><br><br>
              Available Seats :<br>
              <input type="text" name="seat" value="${BookList.numberseats }" readonly="readonly"><br><br>
              <c:set var="theatres" scope="session" value="${BookList.getTheatreid() }" />  
              <c:set var="movie" scope="session" value="${BookList.getMovieid() }" />
            
            
        </c:forEach>
        <c:out value="${theaterid}"/>
        <form action="bookmov" method="post" >


       

                            <p>BooKing your Ticket<p>
       

        <label for ="Movie Id"> Movie Id:</label><br>
        <input type="number" name="Movie" id="Movie" value = "${theatres}" readonly="readonly" ><br><br>
        <label for ="Movie Theatre Id"> Theatre Id</label><br>
        <input type="number" name="theatre" id="theatre" value= "${ movie}" readonly="readonly"><br><br>
        <label for ="Number of seats">Choose number of seats</label><br>    
        <input type="Number" name="Seats" id="Seats" min=1><br><br>
        <button type="submit"   >Book Ticket</button>
        <a href="BookingSuccess.jsp" ></a>
        <button><a href ="ShowServlet">Cancel Booking</a></button>
        
        
              
        
         
</form>
</div>
</div>
</body>
</html>