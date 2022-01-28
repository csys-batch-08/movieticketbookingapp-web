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
import javax.servlet.http.HttpSession;

import com.MovieticketBookingModel.Theatreinformation;
import com.MovieTicketBookingDaoImpl.TheatreDaoImpl;

/**
 * Servlet implementation class TheatreServlet
 */
@WebServlet("/TheatreServlet")
public class TheatreServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		TheatreDaoImpl theatreDaoImpl = new TheatreDaoImpl();
		
	    HttpSession session = request.getSession();
		int id = (int)session.getAttribute("movieid");

		try {
			List<Theatreinformation> showtheatre = theatreDaoImpl.showtheatre(id);
			request.setAttribute("theatreListObj", showtheatre);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("TheatreMovie1.jsp");
			requestDispatcher.forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	


	}

	

}
