package com.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.MovieTicketBookingDaoImpl.*;
import com.MovieticketBookingModel.User;

@WebServlet("/login")
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
		
		User use=new User(username,gender,email,mobilenumber,password);
		
		userDao use1=new userDao();
		System.out.println("hello");
         int i=use1.insert(use);
         System.out.println(i);
         if(i>0) {
        	 response.sendRedirect("login.jsp");
         }
         else
        	 System.out.println("value of i "+i);
         
         
	}
}
		