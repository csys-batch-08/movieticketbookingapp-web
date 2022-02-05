package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movieticketbookingdaoimpl.MovieDaoImpl;
import com.movieticketbookingmodel.Movie;


@WebServlet("/Addmovie")
public class AddMovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String moviename=request.getParameter("movie name");
		int movieid=Integer.parseInt(request.getParameter("Move id"));
		String movietype=request.getParameter("Move type");
		int movieratings=Integer.parseInt(request.getParameter("Move ratings"));
		int movieduration=Integer.parseInt(request.getParameter("Move duration"));
		String director=request.getParameter("Director");
		String musicdirector=request.getParameter("Music director");
		String heroname=request.getParameter("Hero name");
		String images=request.getParameter("images");
		String movie=request.getParameter("number");
		Movie add=new Movie(moviename, movieid,movietype,movieratings,movieduration,director,musicdirector, heroname,images,movie);
		MovieDaoImpl addmovie=new MovieDaoImpl();
		addmovie.insert(add);
		response.sendRedirect("addMovie.jsp");
	}

}
