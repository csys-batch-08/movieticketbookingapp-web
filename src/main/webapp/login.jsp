<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style>
body {
	margin: .150px;
	padding: 12px;
	font-family: 'Arial';
	background-image: linear-gradient(rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0.5)),
		url(https://www.vetbossel.in/wp-content/uploads/2020/08/movie-ticketing-768x576.jpg);
	background-repeat: no-repeat;
	background-size: 100% 1000px;
}

.login {
	width: 300px;
	overflow: hidden;
	margin: auto;
	margin: 20 0 0 450px;
	padding: 40px;
	background: #23463f;
	border-radius: 15px;
	background-color: rgba(180, 228, 230, 0.4);
}

.button1 {
	padding: 5px 15px;
	margin-right: 50px;
	background: linear-gradient(to right, #33ccff 0%, #ff99cc 100%);
	border-radius: 4px;
	font-weight: bold;
}
label {
	color: white;
	font-size: 17px;
}

#Email {
	width: 223px;
	height: 30px;
	border: none;
	border-radius: 3px;
	padding-left: 8px;
}

#Pass {
	width: 223px;
	height: 30px;
	border: none;
	border-radius: 3px;
	padding-left: 8px;
}

p {
	width: 250px;
	height: 10px;
	border: none;
	border-radius: 3px;
	padding-left: 0px;
	color: white;
}
h2{
	padding-left:60px;
}
h1{
	padding-left:470px;
	color: white;
}
form a{
	text-decoration: none;
	link-style: none;
	color: Navy;
	font-weight: bold;
}
p a{
	padding-left: 15px;
	font-weight: bold;
}

</style>
</head>
<body>
    
         <h1>WelCome To LikeMyShow</h1>
    
         <form action="login" method="get">
         <div class="login"> 
         <h2>Login Page</h2>
         <label for ="Email">Email ID</label><br>    
         <input type="email" name="Email" id="Email" placeholder="Email-Id" required><br><br>  
         <label for="Password">Password</label><br>    
         <input type="password" name="Pass" id="Pass" placeholder="Password" required><br><br> 
         <button type="submit" class="button1">Submit</button>
         <a href= "forgetPassword.jsp">Forgot password</a><br>
         <p>Create new account<a href="Register.jsp">Sign up?</a></p>
          
          
</div>
          
</form> 
</body>
</html>