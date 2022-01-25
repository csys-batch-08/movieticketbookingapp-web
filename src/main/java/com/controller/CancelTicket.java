package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.MovieTicketBookingDaoImpl.BookingDaoImpl;
import com.MovieTicketBookingDaoImpl.TheatreDaoImpl;
import com.MovieTicketBookingDaoImpl.UserDaoImpl;
import com.MovieticketBookingModel.Bookingdetail;
import com.MovieticketBookingModel.User;

@WebServlet("/bookcancel")
public class CancelTicket extends HttpServlet{

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
         int booking=Integer.parseInt(request.getParameter("cancel"));
         String ticket=request.getParameter("status");
         System.out.println(ticket);
         System.out.println("fkjgfhfsjfsgjksdff");
         
         HttpSession session = request.getSession();
         
         
	   int total = (int)  session.getAttribute("totalprice");
	     
	   System.out.println("totalpriociasdhbcjbc:"+total);
	     
	     int userid=(int)session.getAttribute("userid");
	     
		

	int seatno = (int)session.getAttribute("Seats");
	System.out.println("setatdtdt"+seatno);
	int theatreid = (int)session.getAttribute("theaterid");

	
	
		   
	//refund amount     
	     UserDaoImpl obj = new UserDaoImpl();
	     
	     TheatreDaoImpl book = new TheatreDaoImpl();
	     
	     BookingDaoImpl book1=new BookingDaoImpl();
	     
	     book1.book(booking,ticket);
	    
	     obj.Refundwallet(userid,total );
	     
	     book.seatupdate(seatno,theatreid);
	     
	     System.out.println("hspppppppppppppppppppppppppppp");
	 
	     
           

         
         PrintWriter out  =  response.getWriter();
         
          response.sendRedirect("Show.jsp");    
          
          
         
}
}