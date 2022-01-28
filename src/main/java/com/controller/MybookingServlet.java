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
import javax.servlet.http.HttpSession;

import com.MovieTicketBookingDaoImpl.BookingDaoImpl;
import com.MovieticketBookingModel.Bookingdetail;

/**
 * Servlet implementation class MybookingServlet
 */
@WebServlet("/MybookingServlet")
public class MybookingServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 BookingDaoImpl dao= new BookingDaoImpl();
         List<Bookingdetail> MyBooking;
         HttpSession session = request.getSession(); 
         int userid=(int)session.getAttribute("userid");
         try {
			MyBooking=dao.MyBooking(userid);
			request.setAttribute("BookingObj", MyBooking);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("MyBooking.jsp");
			requestDispatcher.forward(request, response);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
