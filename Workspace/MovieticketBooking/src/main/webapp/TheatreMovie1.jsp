<%@page import="com.MovieticketBookingModel.*"%>
<%@page import="com.MovieTicketBookingDaoImpl.*"%>


<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
img{
width: 270px;
padding:20px;
}
span{
position : relative;
top:240px;
left: -200px;

}

</style>
</head>
<body style="background-color:brown;">
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
                <p>Movie Theatre</p>
                <%int count=0;
                for(Theatreinformation theatreinformation: showtheatre){
                	%>
                    <td>
                        <table id="theatretable">
                            <tbody>
                                <tr>
                               
                                    <td><img src=<%=theatreinformation.getImages()%> alt="sachin"></td>    
                                    <td class="movie">
                                        <span>Theatre name: <%=theatreinformation.getTheatre_name() %> </span><br>
                                        <span> Movie id:<%=theatreinformation.getMovie_id() %>  </span><br>
                                        <span>Theatre id: <%=theatreinformation.getTheatre_id()%> </span><br>
                                        <span>Number seats:<%=theatreinformation.getNumber_seats() %> </span><br>
                                        <span>Theatre Address:<%=theatreinformation.getTheatre_address() %></span><br>
                                         <span>Theatre Ratings:<%=theatreinformation.getTheatre_rating() %></span><br>
                                         <span>Movie date and Time:<%=theatreinformation.getMovie_date_time() %></span><br>
                                         <span>price:<%=theatreinformation.getPrice() %></span><br>
                                        <span> <button>Booking Ticket</button></span>
                                     
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


</body>
</html>