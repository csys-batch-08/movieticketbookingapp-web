package com.controller;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.MovieticketBookingModel.Theatreinformation;
import com.movieticketbookingdaoimpl.TheatreDaoImpl;





@WebServlet("/Addtheatre")

public class AddTheatre extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session=request.getSession();
		DateTimeFormatter formatter =
	    DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		String theatrename=request.getParameter("theatrename");
	
		int movieid=Integer.parseInt(request.getParameter("movieid"));

		int numberseats=Integer.parseInt(request.getParameter("Numberseats"));
	
		String theatreaddress=request.getParameter("theatre Address");
	
		int theatreratings=Integer.parseInt(request.getParameter("theatre Ratings"));

	    String theatreDate =request.getParameter(" Movie date and time"); //"2021-12-21 05:30";

	    int price=Integer.parseInt(request.getParameter("Price"));
	
	    LocalDateTime mvTimeDate = LocalDateTime.parse(theatreDate);
	    String images=request.getParameter("images");
	
		
		Theatreinformation dao=new Theatreinformation(theatrename,movieid,numberseats,theatreaddress,theatreratings,price,mvTimeDate,images );
		TheatreDaoImpl theatre1=new TheatreDaoImpl();
	    theatre1.insert(dao);
	    
	    session.setAttribute("seats",numberseats );
		response.sendRedirect("addTheatre.jsp");
		
		
	}

}
