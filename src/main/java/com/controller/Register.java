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
import com.MovieTicketBookingDaoImpl.*;
import com.MovieticketBookingModel.User;

@WebServlet("/registerpage")
public class Register extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		System.out.println("Hello");
		String username=request.getParameter("User");
		String gender=request.getParameter("gender");
		String email=request.getParameter("Email");
		Long mobilenumber=Long.parseLong(request.getParameter("number"));
		String password=request.getParameter("Pass");
		
		
		UserDaoImpl use1=new UserDaoImpl();
		User use=new User(email,mobilenumber);
		User use2=new User(username,gender,email,mobilenumber,password);
		ResultSet rs=use1.getEmail(use);
		   ResultSet rs1=use1.getmobile(use);
try { 
		   if(rs.next())
		   {
			   if(email.equals(rs.getString(4)))
			   {
				   throw new ExistEmailIdException();
			   }
		   }  
		   if(rs1.next())
		   {
			   if(mobilenumber.equals(rs1.getLong(5)))
			   {
				   throw new ExistMobileNoException();
			   }
		   }
	

		
		    
		//	System.out.println("hello");
	         int i=use1.insert(use2);
		   if(i==1)
		   {
		   response.sendRedirect("Login1.jsp");
		   }

}
catch (ExistMobileNoException e)
{
//TODO Auto-generated catch block
	  String invalidmobile = e.getMessage();
	   response.sendRedirect("MovieBooking.jsp?message="+e.getMessage()+"&url=Register.jsp");
 } 
catch (ExistEmailIdException e)
{
 String invalidemail = e.getMessage();
 response.sendRedirect("MovieBooking.jsp?message="+e.getMessage()+"&url=Register.jsp");
}
catch (IOException | SQLException e) 
         {
			// TODO Auto-generated catch block
			e.printStackTrace();
		   }
	   }
		

		
}

		
		
		
		
		