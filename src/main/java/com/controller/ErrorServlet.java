package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ErrorServlet
 */
@WebServlet("/ErrorServlet")
public class ErrorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
		String message=request.getParameter("message");
        String url=request.getParameter("url");
        request.setAttribute("message", message);
        request.setAttribute("url", url);
    	RequestDispatcher rd=request.getRequestDispatcher("MovieBooking.jsp");
	    rd.forward(request, response);
	}

}
