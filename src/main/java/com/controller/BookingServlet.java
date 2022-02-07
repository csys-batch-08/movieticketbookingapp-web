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

import com.movieticketbookingdaoimpl.TheatreDaoImpl;
import com.movieticketbookingmodel.Theatreinformation;


@WebServlet("/BookingServlet")
public class BookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		 HttpSession session =request.getSession();
		 String errorMessage = request.getParameter("errorMessage");
	     request.setAttribute("errorMessage", errorMessage);
	     int theatreid = Integer.parseInt(request.getParameter("theatreid"));	 
		 TheatreDaoImpl theatreDao=new TheatreDaoImpl();
		 List<Theatreinformation> movieList;
	     movieList = theatreDao.showtheatredetails(theatreid);
	     request.setAttribute("BookListObj", movieList);
		 RequestDispatcher requestDispatcher = request.getRequestDispatcher("booking.jsp");
		 requestDispatcher.forward(request, response);
		
	}

	

}
