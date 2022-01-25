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
.one{

color:white

}
h2
{
 color:white;
}

.ones{
  position:absolute;
  top:20px;
  left:1250px;
  text-decoration:none;
  color:white

}


 body {
  background-image: url('Rohini Sliver Screen.jpg');
  background-repeat: no-repeat;
  background-size:cover;
}
table
{
   width:100%;
   
}

</style>




</head>
<body>
<%!
       BookingDaoImpl dao= new BookingDaoImpl();
               List<Bookingdetail> MyBooking;%>
       <!-- -- HttpSession session = req.getSession();      ---> 
               <%int userid=(int)session.getAttribute("userid");
               MyBooking=dao.MyBooking(userid);
               %>
     <!---         Bookingdetail book=new  Bookingdetail(userid)  ----->

	
	
	
        <h2 class="Userdetail">Booking Details</h2>
          
        
        <div class="recentlyaddedlist">
        <table border=1 >
        <tbody>
        <tr>
                <%int count=0;
                for(Bookingdetail bookingdetail: MyBooking){
                	%>
                    <td>
                        <table id="user">
                            <tbody>
                                <tr>
                                     
                                    <td class="viewall">
                                    
                                    <div class="one">
                                        <span>Booking Id: <%=bookingdetail.getBooking_id()%> </span><br>
                                        <span>User Id: <%=bookingdetail.getUser_id()%> </span><br>
                                        <span>Booked seats : <%=bookingdetail.getNo_seat()%> </span><br>
                                        <span>Total Amount : <%=bookingdetail.getTotal_amount()%> </span><br>
                                        <span>Status: <%=bookingdetail.getBooking_status()%></span><br>
                                        <span>Movie Name: <%=bookingdetail.getMovie_name()%></span><br>  
                                        <span>BookingDate : <%=bookingdetail.getBooking_date()%> </span><br> 
                                        <%String date=session.getAttribute("moviedate").toString(); %>
                                          Movie date  : <%=date %><br>
                                         </div>   
                                         
                                        
                     <div class="ones">

                      <button><a href="Show.jsp"  class="btn btn-primary">Back</a></button>  

                      </div>
         
                                         
                                         
                                         
                                         
                                         
                                       
                                    </td>
                                </tr>
                            </tbody>
                        </table>  
                            
                    </td>
                       <% count ++;
                       if(count==5){ %> 
                    	   </tr>
                    	   <tr>              
                     <%count=0; }}%>  
                       
                </tr>
            </tbody>
        </table>        
        </div>
</body>
</html>