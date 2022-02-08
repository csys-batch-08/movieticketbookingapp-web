<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<meta charset="ISO-8859-1">
<head>
<title>Register</title>
<style>
body {
	margin: 50px;
	padding: 0;
	background-color: #6abadeba;
	font-family: 'Arial';
	font-weight: bold;
	background-image:url('https://inc42.com/wp-content/uploads/2019/04/movie-ticketing.jpg');
	background-repeat: no-repeat;
	background-size: cover;
}

h1 {
	
	color: #277582;
	padding: 20px;
}
form{
	border: 1px solid transparent;
	margin-left: 380px;
	background-color: rgba(180, 228, 230, 0.6);
	margin-right:380px;
	padding-left:110px;
	border-radius: 5px;
}
.text{
	border-top:0;
	background-color: transparent;
	border-left:0;
	border-right:0;
	border-color:black;
}

label {
	color: black;
	font-size: 17px;
}

.button1 {
	padding:5px 15px;
	margin-right: 50px;
	background: linear-gradient(to right, #33ccff 0%, #ff99cc 100%);
	border-radius:4px;
	font-weight:bold;
}

input {
	padding-right: 10px;
	padding-top: 5px;
}
p a{
	link-style:none;
	text-decoration:none;
	padding-left: 15px;
}

</style>
</head>
<body>
     
<div class="login"> 

<form action="registerpage" method="post">
        <h1>Register page</h1> 
       
        <label for ="User">Username</label><br>   
        <input type="text" class="text" name="User" id="User" placeholder="Username" pattern="[A-Za-z]{3,}"title="minimum 3 characters should be there"><br><br>  

        <label for="Gender">Gender</label><br>
        <input type="radio" name="Gender" value="male" id="Gender"><label for="" class="radio">Male</label><br>
        <input type="radio" id="Gender" name="Gender" class="radio" value="female">  <label class="radio">Female</label><br>
        <input type="radio" id="Gender" class="radio" name="Gender" value="other">   <label class="radio" for="">Others</label> 
        <br>     
    
           
        <label for ="Email">Email Id</label><br>    
        <input type="text" class="text" name="Email" id="Email" pattern="[a-z0-9]+[@][a-zA-Z]+[.][a-z]+" title="You have to insert @ and . in the username ex.abc@gmail.com" placeholder="Enter your email" onkeydown="validation()"required> <br><br>  

        <label for="number">Mobile number</label><br>  
        <input type="number" class="text" name="number" id="number" pattern="[6-9]{1}[0-9]{9}" placeholder="Enter your number"minlength="10" maxlength="10" ><br><br> 

        <label for="Pass">Password</label><br>  
        <input type="password" class="text" name="Pass" id="Pass" pattern="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&?/*$^]).{8,16}$"
         title="Minimum 8 characters should be there.There should be atleast one numeric,special character,capital letter and small letter." placeholder="Enter your password" minlength="8" maxlength="16" required><br><br> 

         
         <button class="button1">Register</button>      
         <button class="button1">Reset</button>
         <p>Already have a account? <a href="login.jsp">Login page</a></p>
    </form> 
     </div>
</body>
</html>