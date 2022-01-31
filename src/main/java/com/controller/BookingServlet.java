package com.controller;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.MovieticketBookingModel.Theatreinformation;
import com.movieticketbookingdaoimpl.TheatreDaoImpl;

/**
 * Servlet implementation class BookingServlet
 */
@WebServlet("/BookingServlet")
public class BookingServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		int mvid = Integer.parseInt(request.getParameter("movieid"));
		String moviedate=request.getParameter("moviedate");
	
		TheatreDaoImpl theatreDao=new TheatreDaoImpl();
		List<Theatreinformation> movieList;
	
		movieList = theatreDao.showtheatre(mvid);
	
		request.setAttribute("BookListObj", movieList);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("booking.jsp");
		requestDispatcher.forward(request, response);
		
	}

	

}
