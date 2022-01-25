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
    margin: 150px;  
    padding: 0;  
    background-color:#6abadeba;  
    font-family: 'Arial';  
}  
.login{  
        
        width: 250px;  
        overflow: hidden;  
        margin: auto;  
        margin: 20 0 0 450px;  
        padding: 30px;  
        background: #23463f;  
        border-radius: 15px ;  
          
}  
h1{  
    text-align: center;  
    color: #277582;  
    padding: 20px;  
}  
label{  
    color: #08ffd1;  
    font-size: 17px;  
}  
#Email{  
    width: 250px;  
    height: 30px;  
    border: none;  
    border-radius: 3px;  
    padding-left: 8px;  
}  
#Pass{  
    width: 250px;  
    height: 30px;  
    border: none;  
    border-radius: 3px;  
    padding-left: 8px;  
      
}  
#Sign{  
    width: 250px;  
    height: 30px;  
    border: none;  
    border-radius: 17px;  
    padding-left: 8px;  
    color: blue;  
  
  
}  
a{  
    float: right;  
    background-color: grey;  
    padding-left: 10px;
}  
</style>
 <style>
body {
  background-image: url('https://safra-resources.azureedge.net/media-library/images/default-source/default-album/nsf-tuesday-movie-special-overview.jpg?sfvrsn=9a877534_2');
  background-repeat: no-repeat;
  background-size:cover;
}
</style>
</head>
<body>
 <h1>Login page</h1> 
 <form action="login1" method="get">
 
     <div class="login"> 
       
        <label for ="Email">Email Id</label><br>    
        <input type="text" name="Email" id="Email" placeholder="Email-Id" required><br><br>  

        <label for="Password">Password</label><br>    
        <input type="Password" name="Pass" id="Pass" placeholder="Password" required><br><br> 

       <button type="submit">Submit</button>
       </form> 
</div>
</body>
</html>