<%@page import="com.MovieticketBookingModel.*"%>
<%@page import="com.MovieTicketBookingDaoImpl.*"%>


<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Movie Booking</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<style>
body{
	font-weight: bold;
}
img{
width: 380px;
padding:20px;
position:absolute;
top:-100px;
left:10px;	
}
h1{
color:white;

}
span{
position : relative;
top:240px;
left: -200px;

}
.name{
position: relative;left:200px;
}
.movie
{
  position:absolute;
  left:1000px;
  top:-160px;
  color:Block;
}
#thimg
{
  position:relative;
  left:200px;
}


 body {
  background-image: url('web_3.jpg');
  background-repeat: no-repeat;
  background-size:cover;
}

img{
top:20px
width: 280px;
padding:20px;
}

span{
position : relative;
top:240px;
left: -200px;

}
.movieid
{
visibility:hidden;
}
.searchbtn
{
  position:absolute;
  top:15px;
  left:700px;
  text-decoration:none;
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
.log1
{
  position:absolute;
  top:70px;
  left:1200px;
  text-decoration:none;
  color:white;
}


.movie
{
  color:block;
  position:relative;
  right:50px;
}

.top{
  list-style-type: none;
  text-decoration:none;


}

ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
  text-decoration:none;
}

li {
  float: left;
 
}

li:last-child {
  border-right: none;
  text-decoration:none;
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
  text-decoration:none;
}

.active {
  background-color: #04AA6D;
}

html,body{
    background-image: linear-gradient(rgba(0,0,0,0.7),rgba(0,0,0,0.6)),url(https://www.vetbossel.in/wp-content/uploads/2020/08/movie-ticketing-768x576.jpg);
     background-repeat: no-repeat;
     background-size: 100% 700px;
     position: absolute;  
     width: 100%;
}


</style>
</head>
</body>


<body>
<ul>

<div class="top">
   <li><a  class="active" href="Show.jsp">Home</a></li>
   <li><a href="News.jsp">News</a></li>
   <li><a href="UserProfile.jsp">Profile</a></li>
   <li><a href="Wallet.jsp">Recharge Wallet</a></li>
   <li><a href="Show.jsp">Movie List</a></li>
   <li><a href="MyBooking.jsp">My Bookings</a></li>
   <li><a href="CancelBooking.jsp">Cancel Booking</a></li>
    
   <div class="log">
   
   <li><a href="Login1.jsp">Logout</a></li>
   
   </div>
   
   
   
     
  
  
    
</ul>
</style>

</body>
<body>


<%!
TheatreDaoImpl theatreDaoImpl = new TheatreDaoImpl();
List<Theatreinformation> showtheatre;
%>

<%
int id = (int)session.getAttribute("movieid");


showtheatre = theatreDaoImpl.showtheatre(id);
%>

<table>
<tbody>
                                 <tr>
                                 <h1><b>Movie Theatre</b></h1>
                                 <%int count=0;
                                 for(Theatreinformation theatreinformation: showtheatre){
                           	%>
                                   <td>
                                   <table id="theatretable">
                                   <tbody>
                                   <tr>
                                   
                                   
                              
                                     
                                   <td><img src="images/<%=theatreinformation.getImages()%>" width=100px alt="img" style="margin-left:100px;margin-top:240px;width:600px;"></td>
                                      
                                     
                                                      
                                     
                                     
                                     
                                <!--    <img src="https://media-cdn.tripadvisor.com/media/photo-m/1280/14/20/b6/93/screen.jpg" style="margin-left:100px;margin-top:240px;width:600px;">  	--->
                                     
                                      
                                     <td class="movie">
                                         
                              <span><button type="button" class="btn btn-light"> Theatre name: <%=theatreinformation.getTheatre_name() %> </button></span><br>
                                        <span style="visibility:hidden"> Movie id:<%=theatreinformation.getMovie_id() %>  </span>
                                      
                                        <span style="visibility:hidden"> Theatre id: <%=theatreinformation.getTheatre_id()%></button> </span><br>
                              <span><button type="button" class="btn btn-light">Available Number seats:<%=theatreinformation.getNumber_seats() %> </button></span><br><br>
                              <span><button type="button" class="btn btn-light">Theatre Address:<%=theatreinformation.getTheatre_address() %></button></span><br><br>
                              <span><button type="button" class="btn btn-light">Theatre Ratings:<%=theatreinformation.getTheatre_rating() %></button></span><br><br>
                              <span><button type="button" class="btn btn-light">price:<%=theatreinformation.getPrice() %></button></span><br><br>
                              <span><button type="button" class="btn btn-light">Movie date and Time:<%=theatreinformation.getMovie_date_time() %></button></span><br><br>
                                         
                                        
                                 <% session.setAttribute("movieid", theatreinformation.getMovie_id());%>
                                          
                                 <% session.setAttribute("theaterid", theatreinformation.getTheatre_id()); %>
                                 <%session.setAttribute("moviedate", theatreinformation.getMovie_date_time()); %>
                                 <span><a href="Booking.jsp?movieid=<%=theatreinformation.getMovie_id()%>&theatreid=<%=theatreinformation.getTheatre_id()%>" >
                                    
                                  <button type="button" class="btn btn-primary">Booking Ticket</button>
                                        
                                     
                                   </td>
                                   </tr>
                                   </tbody>
                                   </table>  
                            
                                  </td>
                                  <% count ++;
                                  if(count==3){ %> 
                    	          </tr>
                    	          <tr>              
                                  <%count=0; }}%>  
                       
                                  </tr>
                                  </tbody>
                                  </table>
</div>

</body>
</html>