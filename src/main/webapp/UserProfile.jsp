<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="com.MovieTicketBookingDaoImpl.*" %>
    <%@ page import="java.util.*" %>
    <%@ page import="com.MovieticketBookingModel.User" %>
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

.one
{
position:relative;
margin-left:550px;
border:4px solid black;
top:90px;
padding:20px;
color:white;
}

h2{
color:white;

}
.ones{
  position:absolute;
  top:50px;
  left:1250px;
  text-decoration:none;
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

<% 
   int userid=(int)session.getAttribute("userid");     
   
   User san=new User(userid);
   UserDaoImpl dao= new UserDaoImpl();
   List<User> listproduct=dao.currentUser1(san);
   
   
	%>
        
          
        
      
        <table border=0 >
            <tbody>
                <tr>
                 
                <%int count=0;
                for(User  user1: listproduct){
                	%>
                 <td>
                 <table id="movie">
                 <tbody>
                 <tr>
                                        
                                      
                                         <td class="viewall">
                                         
                                          <div class="one">
                                          
                                        <img src="profile1.png" style="margin-left:20px;margin-top:20px;width:130px;">  	
                                     
                                             
                                          
                                            <h2 class="Userdetail">User Profile</h2>
                                    
                                        <span>UserID: <%=user1.getUser_id()%> </span><br>
                                        <span>Name : <%=user1.getUser_name()%> </span><br>
                                        <span>Gender : <%=user1.getGender()%>  </span><br>
                                        <span>Email ID: <%=user1.getEmail_id()%> </span><br>
                                        <span>Mobile number: <%=user1.getMobile_num()%></span><br>
                                         <span>Password:<%= user1.getE_password() %></span><br>
                                         <span>Wallet Amount: <%=user1.getwallet()%> </span><br>
                                          
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
         
     
  


</body>
</html>