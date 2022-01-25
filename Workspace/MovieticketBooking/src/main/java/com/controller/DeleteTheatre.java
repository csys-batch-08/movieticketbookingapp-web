package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.MovieTicketBookingDaoImpl.TheatreDaoImpl;
import com.MovieticketBookingModel.Theatreinformation;

@WebServlet("/Deletetheatre")
public class DeleteTheatre extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		int theatreid=Integer.parseInt(request.getParameter("theatre Id"));
		Theatreinformation dao=new Theatreinformation(theatreid);
		TheatreDaoImpl theatre1=new TheatreDaoImpl();
	    theatre1.update(dao);
		response.sendRedirect("AddTheatre.jsp");
		
	}

}
