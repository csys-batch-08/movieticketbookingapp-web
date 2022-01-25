<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*"%>
<%@page import="com.MovieticketBookingModel.Movie"%>
<%@page import="com.MovieTicketBookingDaoImpl.MovieDaoImpl"%>
        
    
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






<style >

.one
{
position:relative;
margin-left:500px;
color:white;
}

 body {
  background-image: url('Rohini Sliver Screen.jpg');
  background-repeat: no-repeat;
  background-size:cover;
}

</style>

</head>
<body>

<div class="one">
      <%
      
      List<Movie> searchList =(List<Movie>) session.getAttribute("moviename");
      %>
      
  
     <h1><b>Search By Movie List:</b></h1>

<%

for (Movie list : searchList) {
int i=0;
i++;


%>
<tr>
<td><img src="images/<%=list.getImages()%>" width=300px alt="img"></td><br><br><br>

<td>Movie Name:<%=list.getMovie_name()%></td><br><br>
<td>Movie Type:<%=list.getMovie_type()%></td><br><br>
<td>Movie Duration:<%=list.getMovie_duration()%></td><br><br>
<td>Director:<%=list.getDirector()%></td><br><br>
<td>Music Director:<%=list.getMusic_director() %></td><br><br>
<td>Hero Name:<%=list.getHero_name() %></td><br><br>


 <td>  <button type = "submit"  value="theatre"> <a href="TheatreMovie1.jsp">Theatre</button></a></td>
   
     
</tr>


<%
}

%>
      </tbody>
      </table>
      
   </div>   
  
</body>
</html>