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


<style >
.one
{
position:relative;
margin-left:510px;
margin-top:90px;
top:60px;
border:3px solid ;
padding:10px;
width:280px;
background:FAEBD7;  
}

.ones{
  position:absolute;
  top:50px;
  left:1250px;
  text-decoration:none;
  color:white

}
h1{
  color:white;
  }
p{

  color:white;
}
label{
  color:white;

}

 body {
  background-image:linear-gradient(rgba(0,0,0,0.3),rgba(0,0,0,0.3)),url('Rohini Sliver Screen.jpg');
  background-repeat: no-repeat;
  background-size:cover;
  background-attachment: fixed;
  font-weight: bold;
}

</style>
</head>
  
<body>




<%
if(session.getAttribute("lowbal") != null){%>
<h1 id = "lowbalhead">Low Balance Please Top Up!!</h1>
<% 	
}
session.removeAttribute("lowbal");
%>
     <div class="one">
     <h1>Wallet Update</h1>
     <form  action="Wallet" method="post">
     
    <label> Enter your Amount:</label><br>
     <input type="number" name="amount" id="number" min=1><br><br>
    
     
     <button type="submit"  class="btn btn-primary">Wallet Recharge</button><br><br>
     <p> Note:Wallet Amount Check Your Profile</p>
        
      </div>
        
         
      <div class="ones">

       <button><a href="ShowServlet"  class="btn btn-primary">Back</a></button>  

       </div>
        
        
     </form>
</body>
</html>