package com.controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Exception.ExistEmailIdException;
import com.Exception.ExistMobileNoException;
import com.movieticketbookingdaoimpl.UserDaoImpl;
import com.movieticketbookingmodel.User;

@WebServlet("/registerpage")
public class Register extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
		String username=request.getParameter("User");
		String gender=request.getParameter("Gender");
		String email=request.getParameter("Email");
		Long mobilenumber=Long.parseLong(request.getParameter("number"));
		String password=request.getParameter("Pass");
		UserDaoImpl use1=new UserDaoImpl();
		User use=new User(email,mobilenumber);
		User use2=new User(username,gender,email,mobilenumber,password);
		String useremail=use1.getEmail(use);
		long usermobile=use1.getmobile(use);
		
       try { 
		  
		   
			   if(email.equals(useremail))
		   {
				   throw new ExistEmailIdException();
		   }
		    
		  
			   if(mobilenumber.equals(usermobile))
			   {
				   throw new ExistMobileNoException();
			   }
		   
			  
           int i=use1.insert(use2);
		   if(i==1)
		   {
		   response.sendRedirect("login.jsp");
		   }

}
         catch (ExistMobileNoException e)
        {
       String invalidmobile = e.getMessage();
	   response.sendRedirect("ErrorServlet?message="+e.getMessage()+"&url=Register.jsp");
 } 
        catch (ExistEmailIdException e)
{
       String invalidemail = e.getMessage();
        response.sendRedirect("ErrorServlet?message="+e.getMessage()+"&url=Register.jsp");
}
       catch (IOException e) 
         {
         e.printStackTrace();
		 }
	   }
		

		
}

		
		
		
		
		