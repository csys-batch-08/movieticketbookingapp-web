package com.controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Exception.InvalidUserException;
import com.MovieTicketBookingDaoImpl.UserDaoImpl;
import com.MovieticketBookingModel.User;













@WebServlet("/login1")

public class Login extends HttpServlet {
	


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		 HttpSession session = request.getSession();
		String email=request.getParameter("Email");
		String password=request.getParameter("Pass");
	//	System.out.println(email);
	//	System.out.println(password);
		User use2=new User(email, password);
		UserDaoImpl ud1=new UserDaoImpl();
		User user1 = new User(email,null);
		int uid = ud1.user(user1);
		if(uid > 0) {
			session.setAttribute("userid", uid);
		}
		
	
		
         String user_role= ud1.validateUser(email,password);
         
//		System.out.println(rs.toString());
  //        System.out.println(user_role);
			if(user_role.equals("admin")) {
   //System.out.println("hello");
				response.sendRedirect("Addmovie.jsp");
				
			}else if(user_role.equals("user"))
			{	
			 response.sendRedirect("Show.jsp");
			
			}
	  
	else 
		
		{
			try
			{
			   throw new InvalidUserException();	
			}catch(InvalidUserException e)
			{
			   String invaliduser = e.getMessage();
			   response.sendRedirect("MovieBooking.jsp?message="+e.getMessage()+"&url=Login1.jsp");
			}
		}


	}
	  
	   
		
       
	}


