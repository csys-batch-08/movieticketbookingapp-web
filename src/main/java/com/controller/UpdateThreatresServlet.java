package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movieticketbookingdaoimpl.TheatreDaoImpl;
import com.movieticketbookingmodel.Theatreinformation;

@WebServlet("/Updatetheatre1")
public class UpdateThreatresServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		  String theatrename=request.getParameter("theatrename");
	
		 int price=Integer.parseInt(request.getParameter("Price"));
		 int theatreid=Integer.parseInt(request.getParameter("theatre Id"));
		 

			Theatreinformation dao=new Theatreinformation(theatrename,price,theatreid );
			TheatreDaoImpl theatre1=new TheatreDaoImpl();
		    theatre1.update(dao);;
		    response.sendRedirect("addmovie.jsp");
	}  

}
