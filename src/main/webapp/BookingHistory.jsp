<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ page import="com.MovieTicketBookingDaoImpl.*" %>
    <%@ page import="java.util.*" %>
    <%@ page import="com.MovieticketBookingModel.Bookingdetail" %>
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
.class{

color:white;
}

h2
{
 color:white;
}
table
{
   width:100%;
   
}

.one6{
  position:absolute;
  top:20px;
  left:1250px;
  text-decoration:none;
  color:white

}


 body {
 background:linear-gradient(rgba(0,0,0,0.5),rgba(0,0,0,0.5)),url('Rohini Sliver Screen.jpg');
  background-image: url('Rohini Sliver Screen.jpg');
  background-repeat: no-repeat;
  background-size:cover;
}
</style>





</head>





                     <div class="one6">

                      <button><a href="Addmovie.jsp"  class="btn btn-primary">Back</a></button>  

                      </div>
        
<body>
  <% BookingDaoImpl dao= new BookingDaoImpl();
  List<Bookingdetail> showBooking;
	showBooking=dao.showBooking();
	%>
	
	
          <h2 class="Bookingdetail">Booking Detail</h2>
          
        
        <div class="Booking list">
        <table border=1 >
            <tbody>
                <tr>
                <%int count=0;
                for(Bookingdetail bookingdetail: showBooking){
                	%>
                    <td>
                    <table id="booking">
                     <tbody>
                     <tr>
                                     
                                   <td class="viewall">
                                    
                                   <div class="class">
                                    
                                        <span>Booking Id: <%=bookingdetail.getBooking_id()%> </span><br>
                                        <span>Theatre Id : <%=bookingdetail.getTheatre_id()%>  </span><br>
                                        <span>User Id: <%=bookingdetail.getUser_id()%> </span><br>
                                        <span>Booked seats : <%=bookingdetail.getNo_seat()%> </span><br>
                                         <span>Total Amount : <%=bookingdetail.getTotal_amount()%> </span><br>
                                        <span>Status: <%=bookingdetail.getBooking_status()%></span><br>
                                         <span>Movie Name: <%=bookingdetail.getMovie_name()%></span><br>  
                                    </div>
                                    
                                    
                                </td>
                                </tr>
                        </tbody>
                        </table>  
                            
                        </td>
                       <% count ++;
                       if(count==7){ %> 
                    	   </tr>
                    	   <tr>              
                     <%count=0; }}%>  
                       
                </tr>
            </tbody>
        </table>
         
        </div>
    </div>
   </div>
</body>
</html>