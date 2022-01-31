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

import com.MovieticketBookingModel.Movie;
import com.movieticketbookingdaoimpl.MovieDaoImpl;

/**
 * Servlet implementation class Search
 */
@WebServlet("/Search")

public class Search extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try {
			
			 MovieDaoImpl search = new MovieDaoImpl();
			 String moviename = request.getParameter("moviename");
	       

			  List<Movie> searchlist = search.search(moviename);
			      
			           
			   HttpSession session = request.getSession();
			   session.setAttribute("moviename",searchlist );
			         
			   session.setAttribute("bookedmovie", moviename);
			   
			//   request.setAttribute("searchlist", searchlist);
				RequestDispatcher requestDispatcher=request.getRequestDispatcher("searchMovies.jsp");
				requestDispatcher.forward(request, response);      
			           
			           
	

              		       
			  response.getWriter().print("Search Suceessfully");


			} catch (Exception e) {
		

			}

		

			}
			



	}


