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

/**
 * Servlet implementation class TheatreServlet
 */
@WebServlet("/TheatreServlet")
public class TheatreServlet extends HttpServlet {
	

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		TheatreDaoImpl theatreDaoImpl = new TheatreDaoImpl();
		
	    HttpSession session = request.getSession();
		int id = (int)session.getAttribute("movieid");

		List<Theatreinformation> showtheatre = theatreDaoImpl.showtheatre(id);
		request.setAttribute("theatreListObj", showtheatre);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("theatreMovie.jsp");
		requestDispatcher.forward(request, response);
	


	}

	

}
