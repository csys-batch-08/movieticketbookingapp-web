package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.movieticketbookingdaoimpl.BookingDaoImpl;
import com.movieticketbookingdaoimpl.TheatreDaoImpl;
import com.movieticketbookingdaoimpl.UserDaoImpl;


@WebServlet("/bookcancel")
public class CancelTicketServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
		
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
//		System.out.println("bookcancel");
//		
//		
//		
//		
//		
//	    int booking=Integer.parseInt(request.getParameter("cancel"));
//	    String ticket=request.getParameter("status");
//	  
//
//
//	    
//	    HttpSession session = request.getSession();
//	    int total = (int)  session.getAttribute("totalprice");
//	    int userid=(int)session.getAttribute("userid");
//	    int seatno = (int)session.getAttribute("Seats");
//	     
//	    int theatreid= (int)session.getAttribute("theaterid");
//
//	  
//
//
//
//		   
//	//refund amount   
//	     
//	     UserDaoImpl obj = new UserDaoImpl();
//	     
//	     TheatreDaoImpl book = new TheatreDaoImpl();
//	     
//	     BookingDaoImpl book1=new BookingDaoImpl();
//	     
//	     book1.book(booking,ticket);
//	    
//	     obj.refundwallet(userid,total );
//	     
//	     book.seatupdate(seatno,theatreid);
//	     
//	     
//	 
//	     
		//int booking=Integer.parseInt(request.getParameter("cancel"));
       // String ticket=request.getParameter("status");
      //  System.out.println(ticket);
        System.out.println("fkjgfhfsjfsgjksdff");
        int bookingid=Integer.parseInt(request.getParameter("bookingid"));
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
	     
	     book1.book(bookingid);
	    
	    obj.refundwallet(userid,total );
	     
	     book.seatupdate(seatno,theatreid);
	     
	     System.out.println("hspppppppppppppppppppppppppppp");
	 
	     

	    
	    PrintWriter out  =  response.getWriter();
	    
	     response.sendRedirect("mybooking.jsp"); 
	 //    RequestDispatcher req = request.getRequestDispatcher("showMovie.jsp");
	     
	    
	    
	}
	
		
}
	
