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

import com.MovieTicketBookingDaoImpl.MovieDaoImpl;
import com.MovieticketBookingModel.Movie;

/**
 * Servlet implementation class ShowServlet
 */
@WebServlet("/ShowServlet")
public class ShowServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("sssssssssssssssssssssssssssssssssssssssssssss");
		  MovieDaoImpl movieDaoImpl = new MovieDaoImpl();
          List<Movie> showmovie;
          try {
			showmovie = movieDaoImpl.showMovie();
			request.setAttribute("Movielist", showmovie);
			RequestDispatcher requestDispatcher=request.getRequestDispatcher("Show.jsp");
			requestDispatcher.forward(request, response);
			
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	
	
}
