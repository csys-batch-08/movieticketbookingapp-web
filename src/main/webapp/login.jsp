<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>



<style>

    body  
{  
    margin:.150px;  
    padding:12px;  
    background-color:#6abadeba;  
    font-family:'Arial';  
}  
.login{  
        
        width:300px;  
        overflow:hidden;  
        margin:auto;  
        margin:20 0 0 450px;  
        padding:40px;  
        background:#23463f;  
        border-radius:15px ; 
        background-color: rgba(180, 228, 230, 0.4); 
          
}  
h1{  
    text-align:center;  
    color:#277582;  
    padding:20px;  
}  
label{  
    color:#08ffd1;  
    font-size:17px;  
}  
#Email{  
    width:223px;  
    height:30px;  
    border:none;  
    border-radius:3px;  
    padding-left:8px;  
}  
#Pass{  
    width:223px;  
    height:30px;  
    border:none;  
    border-radius:3px;  
    padding-left:8px;  
      
}  
p{
    width:250px;  
    height:10px;  
    border:none;  
    border-radius:3px;  
    padding-left:0px;  
    color:white;
      

} 
  
button a{
text-decoration:none;

}
.button1{
padding:5px;
margin-right:50px;
text-decoration:none;

}
.button2{
padding:6px;
margin-right:50px;
color:block;
background-color:white;
border-radius:4px;
text-decoration:none;

}
    
a{  
    float: right;  
    padding-left: 2px;
    text-decoration:none;
    color:white;
}  

p{
 color:white;
}


html,body{
    background-image: linear-gradient(rgba(0,0,0,0.5),rgba(0,0,0,0.5)),url(https://www.vetbossel.in/wp-content/uploads/2020/08/movie-ticketing-768x576.jpg);
     background-repeat: no-repeat;
     background-size: 100% 1000px;
     position: absolute;  
     width: 100%;
     color:white;
}


</style>
</head>
<body>
    
    
    <h1>Login Page</h1> 
      
    <form action="login" method="get">
 
    <div class="login"> 
       
          <label for ="Email">Email Id</label><br>    
          <input type="email" name="Email" id="Email" placeholder="Email-Id" required><br><br>  

          <label for="Password">Password</label><br>    
          <input type="password" name="Pass" id="Pass" placeholder="Password" required><br><br> 

          <button type="submit" class="button1">Submit</button>
       
          <a href= "ForgetPassword.jsp">Forgot password</a><br>
          
          
     <p>Create new account<a href="Register.jsp">Sign up</a></p>
          
          
      </div>
          
          
     
          
       </form> 
</body>
</html>