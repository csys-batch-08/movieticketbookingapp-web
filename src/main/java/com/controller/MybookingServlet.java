package com.controller;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.MovieticketBookingModel.Bookingdetail;
import com.movieticketbookingdaoimpl.BookingDaoImpl;

/**
 * Servlet implementation class MybookingServlet
 */
@WebServlet("/MybookingServlet")
public class MybookingServlet extends HttpServlet {

	
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 BookingDaoImpl dao= new BookingDaoImpl();
         List<Bookingdetail> MyBooking;
         HttpSession session = request.getSession(); 
         int userid=(int)session.getAttribute("userid");
         MyBooking=dao.MyBooking(userid);
		request.setAttribute("BookingObj", MyBooking);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("myBooking.jsp");
		requestDispatcher.forward(request, response);
	}

}
