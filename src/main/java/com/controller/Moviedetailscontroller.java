package com.controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.movieticketbookingdaoimpl.MovieDaoImpl;
@WebServlet("/Moviedetails")
public class Moviedetailscontroller extends HttpServlet {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	HttpSession session = req.getSession();
	int id = Integer.parseInt(req.getParameter("movlink"));
	String moviename=req.getParameter("mvname");
	
	session.setAttribute("movienames",moviename );

	

	session.setAttribute("movieid", id);
	MovieDaoImpl mdi=new MovieDaoImpl();
	ResultSet rs = null;
	try {
		rs = mdi.getmovie();
		rs.next();
		session.setAttribute("todaymovie",rs.getString(1));

		resp.sendRedirect("TheatreServlet");
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	
	
}
}
