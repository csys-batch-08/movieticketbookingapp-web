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

import com.MovieTicketBookingDaoImpl.TheatreDaoImpl;
import com.MovieticketBookingModel.Theatreinformation;





@WebServlet("/Addtheatre")

public class AddTheatre extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		HttpSession session=request.getSession();
		DateTimeFormatter formatter =
	    DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		String theatrename=request.getParameter("theatrename");
		System.out.println(theatrename);
		int movieid=Integer.parseInt(request.getParameter("movieid"));
		System.out.println(movieid);
//		int theatreid=Integer.parseInt(request.getParameter("theatre Id"));
//		System.out.println(theatreid);
		int numberseats=Integer.parseInt(request.getParameter("Numberseats"));
		System.out.println(numberseats);
		String theatreaddress=request.getParameter("theatre Address");
		System.out.println(theatreaddress);
		int theatreratings=Integer.parseInt(request.getParameter("theatre Ratings"));
		System.out.println(theatreratings);
	    String theatreDate =request.getParameter(" Movie date and time"); //"2021-12-21 05:30";
	    System.out.println(theatreDate);
	    int price=Integer.parseInt(request.getParameter("Price"));
		System.out.println(price);
	    LocalDateTime mvTimeDate = LocalDateTime.parse(theatreDate);
	    String images=request.getParameter("images");
		System.out.println(mvTimeDate);
		
		Theatreinformation dao=new Theatreinformation(theatrename,movieid,numberseats,theatreaddress,theatreratings,price,mvTimeDate,images );
		TheatreDaoImpl theatre1=new TheatreDaoImpl();
	    theatre1.insert(dao);
	    
	    session.setAttribute("seats",numberseats );
		response.sendRedirect("AddTheatre.jsp");
		System.out.println("theatrename");
		
	}

}
