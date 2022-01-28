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
	       

			  List<Movie> searchlist = search.Search(moviename);
			    System.out.println(searchlist);       
			           
			   HttpSession session = request.getSession();
			   session.setAttribute("moviename",searchlist );
			         
			   session.setAttribute("bookedmovie", moviename);
			   
			//   request.setAttribute("searchlist", searchlist);
				RequestDispatcher requestDispatcher=request.getRequestDispatcher("searchmovies.jsp");
				requestDispatcher.forward(request, response);      
			           
			           
		//	   response.sendRedirect("searchmovies.jsp");

              		       
			  response.getWriter().print("Search Suceessfully");


			} catch (Exception e) {
			System.out.println(e);

			}

			System.out.println("welcome");

			}
			



	}


