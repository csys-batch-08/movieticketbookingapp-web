package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.movieticketbookingdaoimpl.BookingDaoImpl;
import com.movieticketbookingdaoimpl.TheatreDaoImpl;
import com.movieticketbookingdaoimpl.UserDaoImpl;

/**
 * Servlet implementation class CancelMovieServlet
 */
@WebServlet("/CancelMovieServlet")
public class CancelMovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CancelMovieServlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int booking=Integer.parseInt(request.getParameter("cancel"));
        String ticket=request.getParameter("status");
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
	     
//book1.book(booking,ticket);
	    
	    obj.refundwallet(userid,total );
	    book.seatupdate(seatno,theatreid);
	    System.out.println("hspppppppppppppppppppppppppppp");
	 
	     

	    
	    PrintWriter out  =  response.getWriter();
	    
	     response.sendRedirect("showMovie.jsp"); 
	}

}
