package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;

import com.MovieTicketBookingDaoImpl.AdminDaoImpl;

import com.MovieticketBookingModel.Admin;



/**
 * Servlet implementation class Adminlogin
 */
public class Adminlogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String email=request.getParameter("Email");
		String password=request.getParameter("Pass");
		
		Admin adlog=new Admin(email,password);
		AdminDaoImpl log=new AdminDaoImpl();
		
		
	}

}
