package com.controller;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movieticketbookingdaoimpl.BookingDaoImpl;
import com.movieticketbookingmodel.Bookingdetail;

/**
 * Servlet implementation class BookingHistoryServlet
 */
@WebServlet("/BookingHistoryServlet")
public class BookingHistoryServlet extends HttpServlet {

	
	private static final long serialVersionUID = 1L;
@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		    BookingDaoImpl dao= new BookingDaoImpl();
		    List<Bookingdetail> showBooking;
			showBooking=dao.showBooking();
			request.setAttribute("Bookslist", showBooking);
			RequestDispatcher requestDispatcher=request.getRequestDispatcher("bookingHistory.jsp");
			requestDispatcher.forward(request, response);
			
	}

	

}
