package com.controller;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.MovieticketBookingModel.Movie;
import com.movieticketbookingdaoimpl.MovieDaoImpl;

/**
 * Servlet implementation class ShowServlet
 */
@WebServlet("/ShowServlet")
public class ShowServlet extends HttpServlet {

	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	 MovieDaoImpl movieDaoImpl = new MovieDaoImpl();
        List<Movie> showmovie;
        showmovie = movieDaoImpl.showMovie();
		request.setAttribute("Movielist", showmovie);
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("showMovie.jsp");
		requestDispatcher.forward(request, response);
	}

	
	
}
