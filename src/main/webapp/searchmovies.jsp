<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*"%>
<%@page import="com.MovieticketBookingModel.Movie"%>
<%@page import="com.MovieTicketBookingDaoImpl.MovieDaoImpl"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        
    
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
  font-size: bold;
}

</style>

</head>
<body>

                     <div class="one">
     
      
  
                     <h1><b>Search By Movie List:</b></h1>

                      
                         
                                         
                    <c:forEach items="${moviename}" var="SearchList">
                                       
                    <tr>
                    <td><img src="images/${SearchList.getImages()}" width=300px alt="img"></td><br><br><br>

                    <td>Movie Name: ${SearchList.getMoviename()}</td><br><br>
                    <td>Movie Type:${SearchList.getMovietype()}</td><br><br>
                    <td>Movie Duration:${SearchList.getMovieduration()}</td><br><br>
                    <td>Director:${SearchList.getDirector()}</td><br><br>
                    <td>Music Director:${SearchList.getMusicdirector() }</td><br><br>
                    <td>Hero Name:${SearchList.getHeroname() }</td><br><br>


                    <td><button type = "submit"  value="theatre"> <a href="TheatreServlet">Theatre</button></a></td>
   
      
                    </tr>

                    </c:forEach>             
                    </tbody>
                    </table>
      
                    </div>   
  
</body>
</html>