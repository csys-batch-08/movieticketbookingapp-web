package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.MovieTicketBookingDaoImpl.TheatreDaoImpl;
import com.MovieticketBookingModel.Theatreinformation;

@WebServlet("/Updatetheatre1")
public class UpdateThreatre1 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	doGet(request, response);
		
		  String theatrename=request.getParameter("theatrename");
	
		 int price=Integer.parseInt(request.getParameter("Price"));
		 int theatreid=Integer.parseInt(request.getParameter("theatre Id"));
		 

			Theatreinformation dao=new Theatreinformation(theatrename,price,theatreid );
			TheatreDaoImpl theatre1=new TheatreDaoImpl();
		    theatre1.update(dao);;
		    response.sendRedirect("Addmovie.jsp");
	}  

}
