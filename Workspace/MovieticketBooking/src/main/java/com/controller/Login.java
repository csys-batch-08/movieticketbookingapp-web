package com.controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.MovieTicketBookingDaoImpl.userDao;
import com.MovieticketBookingModel.User;








@WebServlet("/login1")

public class Login extends HttpServlet {
	


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		
		String email=request.getParameter("Email");
		String password=request.getParameter("Pass");
		System.out.println(email);
		System.out.println(password);
		User use2=new User(email, password);
		userDao ud1=new userDao();
          String user_role= ud1.validateUser(email,password);
//		System.out.println(rs.toString());
			if(user_role.equals("admin")) {
				System.out.println("hello");
				response.sendRedirect("Show.jsp");
			}
			else {
				response.sendRedirect("Show.jsp");

		
		} 
	}
		
       
	}


