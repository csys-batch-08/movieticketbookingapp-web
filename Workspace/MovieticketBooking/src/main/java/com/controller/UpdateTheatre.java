package com.controller;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.MovieTicketBookingDaoImpl.TheatreDaoImpl;
import com.MovieticketBookingModel.Theatreinformation;


@WebServlet("/Updatetheatre")
public class UpdateTheatre extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		DateTimeFormatter formatter =
			    DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
				String theatrename=request.getParameter("theatrename");
				String movieid=request.getParameter("movieid");
				int theatreid=Integer.parseInt(request.getParameter("theatre Id"));
				int numberseats=Integer.parseInt(request.getParameter("Numberseats"));
				String theatreaddress=request.getParameter("theatre Address");
				int theatreratings=Integer.parseInt(request.getParameter("theatre Ratings"));
				String theatreDate =request.getParameter(" Movie date and time"); //"2021-12-21 05:30";
		        int price=Integer.parseInt(request.getParameter("Price"));
		
			    LocalDateTime mvTimeDate = LocalDateTime.parse(theatreDate);
			
				Theatreinformation dao=new Theatreinformation(theatrename,movieid,theatreid,numberseats,theatreaddress,theatreratings,price,theatreDate);
				TheatreDaoImpl theatre1=new TheatreDaoImpl();
			    theatre1.update(dao);
				response.sendRedirect("AddTheatre.jsp");
				
	}

}
