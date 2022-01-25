<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.*"%>
<%@page import="com.MovieticketBookingModel.Movie"%>
<%@page import="com.MovieTicketBookingDaoImpl.MovieDaoImpl"%>
<%@page import="java.sql.ResultSet" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.one
{
Top:40px;
position:relative;
margin-left:520px;
}
.movie{

}



html,body{
    background-image: linear-gradient(rgba(0,0,0,0.7),rgba(0,0,0,0.6)),url(https://www.vetbossel.in/wp-content/uploads/2020/08/movie-ticketing-768x576.jpg);
     background-repeat: no-repeat;
     background-size: 100% 1500px;
     position: absolute;  
     width: 100%;
     color:white;
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
   <li><a class="active" href="Show.jsp">Home</a></li>
   <li><a href="News.jsp">News</a></li>
   <li><a href="UserProfile.jsp">Profile</a></li>
   <li><a href="Wallet.jsp">Recharge Wallet</a></li>
    <li><a href="MyBooking.jsp">MyBooking</a></li>
    <li><a href="CancelBooking.jsp">Cancel Booking</a></li>
   </div>
   
   <div class="log">
   
   <li><a href="Login1.jsp">Logout</a></li>
   </div>
  
    
</ul>
</style>





</head>
<body>

<%String bookedmovie=(String)session.getAttribute("moviefortoday"); 
ResultSet rs=(ResultSet)session.getAttribute("ResultSet");
Date bookingdate=(Date) (session.getAttribute("bookingdate"));

%>
     
      <%int userid=Integer.parseInt(session.getAttribute("userid").toString());
   
      %>
  <div class="one">
     
      <table>
          <h1>Booking Details</h1>
      <%while(rs.next()){ %>
      <tr>
      <td>

      
  
      User Id: <%=userid %><br>
<!---  <%int movieid= Integer.parseInt(session.getAttribute("movieid").toString());
   //System.out.println(movieid+"Movwheuwh");
%>


      Movie Id : <%=movieid %><br>  ------>
      
      Booking Id :<%=rs.getInt(1) %><br>
  <!----    Movie Id : <%=movieid %><br>   ---->
      <%String movie_name=bookedmovie; %>


      Movie name:<%=movie_name %><br>
 <!-- -   <% int theatreid=Integer.parseInt(session.getAttribute("theaterid").toString()); %>
       Theatre Id : <%=theatreid %><br>  ---->
       
      <%int seatsno=Integer.parseInt(session.getAttribute("Seats").toString()); %>
       Number of Seats  : <%=rs.getInt(4) %><br>
       
      <%String date=session.getAttribute("moviedate").toString(); %>
       Movie date  : <%=date %><br>
       
      <%int price=Integer.parseInt(session.getAttribute("totalprice").toString()); %>
      Total Price : <%=price %><br>
      
       Booking date :<%=rs.getDate(8) %><br><br><br>
    
   
      
      </div>



      </td>
</tr>
<%} %>
      </table>
      
      </div>
      
</body>
</html>