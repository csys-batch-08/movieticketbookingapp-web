package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.MovieTicketBookingDaoImpl.MovieDaoImpl;
import com.MovieticketBookingModel.Movie;

/**
 * Servlet implementation class Search
 */
@WebServlet("/Search")

public class Search extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try {
			
			 MovieDaoImpl search = new MovieDaoImpl();
			 String moviename = request.getParameter("moviename");
				System.out.println("movie" +moviename);

			           List<Movie> searchlist = search.Search(moviename);
			           
			           
			           HttpSession session = request.getSession();
			           session.setAttribute("moviename",searchlist );
			         // session.setAttribute("bookedmovie", searchlist.get(1));
			          session.setAttribute("bookedmovie", moviename);
			           
			           //System.out.println(searchlist.get(1));
			           
			           response.sendRedirect("searchmovies.jsp");

              		       
			  response.getWriter().print("Search Suceessfully");


			} catch (Exception e) {
			System.out.println(e);

			}

			System.out.println("welcome");

			}
			



	}


