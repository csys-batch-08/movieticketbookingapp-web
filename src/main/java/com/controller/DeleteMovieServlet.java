package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movieticketbookingdaoimpl.MovieDaoImpl;
import com.movieticketbookingmodel.Movie;

@WebServlet("/DeleteMovie1")
public class DeleteMovieServlet extends HttpServlet {

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		int movieid=Integer.parseInt(request.getParameter("Move id"));
		Movie add1=new Movie(movieid);
		MovieDaoImpl deletemovie1=new MovieDaoImpl();
		deletemovie1.delete(add1);
		response.sendRedirect("addMovie.jsp");
	}

}
