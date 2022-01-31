package com.controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.MovieticketBookingModel.User;
import com.movieticketbookingdaoimpl.UserDaoImpl;

@WebServlet("/Forget")
public class ForgetPass extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String names=request.getParameter("forget");
		String pass=request.getParameter("password");
		User use=new User( names, pass);
	    UserDaoImpl impl=new UserDaoImpl();
		impl.updateUser(use);
		response.sendRedirect("login.jsp");
	}

}
