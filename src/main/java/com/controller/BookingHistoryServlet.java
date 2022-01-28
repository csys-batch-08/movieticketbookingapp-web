package com.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.MovieTicketBookingDaoImpl.BookingDaoImpl;
import com.MovieticketBookingModel.Bookingdetail;

/**
 * Servlet implementation class BookingHistoryServlet
 */
@WebServlet("/BookingHistoryServlet")
public class BookingHistoryServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		  BookingDaoImpl dao= new BookingDaoImpl();
		  List<Bookingdetail> showBooking;
			try {
				showBooking=dao.showBooking();
				request.setAttribute("Bookslist", showBooking);
				RequestDispatcher requestDispatcher=request.getRequestDispatcher("BookingHistory.jsp");
				requestDispatcher.forward(request, response);
				
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
	}

	

}
