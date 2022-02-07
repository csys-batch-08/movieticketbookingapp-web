package com.controller;

import java.io.IOException;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movieticketbookingdaoimpl.UserDaoImpl;
import com.movieticketbookingmodel.User;

@WebServlet("/Forget")
public class ForgetPassServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		
		
		try {
			String names=request.getParameter("forget");
			String pass=request.getParameter("password");
			User use=new User( names, pass);
		    UserDaoImpl impl=new UserDaoImpl();
			impl.updateUser(use);
			response.sendRedirect("login.jsp");
		} catch (IOException |NumberFormatException e) {
	
			e.printStackTrace();
		}
	}

}
