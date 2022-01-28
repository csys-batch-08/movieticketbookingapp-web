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
import com.MovieticketBookingModel.Theatreinformation;
import com.MovieTicketBookingDaoImpl.TheatreDaoImpl;

/**
 * Servlet implementation class BookingServlet
 */
@WebServlet("/BookingServlet")
public class BookingServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		int mvid = Integer.parseInt(request.getParameter("movieid"));
		String moviedate=request.getParameter("moviedate");
		System.out.println(mvid);
		System.out.println(moviedate);
		TheatreDaoImpl theatreDao=new TheatreDaoImpl();
		List<Theatreinformation> movieList;
	
		try {
			movieList = theatreDao.showtheatre(mvid);
			System.out.println(movieList);
			request.setAttribute("BookListObj", movieList);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("Booking.jsp");
			requestDispatcher.forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

	

}
