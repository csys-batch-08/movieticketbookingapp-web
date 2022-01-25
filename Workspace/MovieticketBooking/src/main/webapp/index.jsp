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
        margin: 100px;  
        padding: 0;  
        background-color:#6abadeba;  
        font-family: 'Arial';  
    }  
    .login{  
            
            width: 350px;  
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
   
    input{
        width: 250px;  
        height: 30px;  
        border: none;  
        border-radius: 3px;  
        padding-left: 8px;  
    }
      label {
       color:black;
    }
    #fe{
        position: relative;
        right: 20px;
    }

    #ot{
        position: relative;
        right: 5px;
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

<div class="login"> 

<form action="login" method="post">
        <h1>Register page</h1> 
       
        <label for ="User Name">Username</label><br>    
        <input type="text" name="User" id="User" placeholder="Username"><br><br>  

        <label for="Gender">Gender</label><br>
        <label for="" class="radio">Male</label>  <input type="radio" name="gender" value="male"> 
        <label class="radio">Female</label> <input type="radio" id="fe" name="gender" class="radio" value="female">
        <label class="radio" for="">Other</label>   <input type="radio" id="ot" class="radio" name="gender" value="other">
       <br>     
    
           
        <label for ="Email">Email Id</label><br>    
        <input type="text" name="Email" id="Email" placeholder="Email-Id"><br><br>  

        <label for="Mobilenumber">Mobile number</label><br>    
        <input type="number" name="number" id="number" placeholder="Mobile number"><br><br> 

        <label for="Password">Password</label><br>    
        <input type="text" name="Pass" id="Pass" placeholder="Password"><br><br> 

         
        <button type="submit">Submit</button>       
        
    </div>
    </form> 
</body>
</html>