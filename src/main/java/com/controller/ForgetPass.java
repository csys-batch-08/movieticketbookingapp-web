package com.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.MovieTicketBookingDaoImpl.UserDaoImpl;
import com.MovieticketBookingModel.User;

@WebServlet("/Forget")
public class ForgetPass extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String names=request.getParameter("forget");
		String pass=request.getParameter("password");
		User use=new User( names, pass);
		System.out.println(use);
	    UserDaoImpl impl=new UserDaoImpl();
		try {
			impl.updateUser(use);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("Login1.jsp");
	}

}
