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

@WebServlet("/bookcancel")
public class CancelTicketServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int bookingid = Integer.parseInt(request.getParameter("bookingid"));
		HttpSession session = request.getSession();
        int total = (int) session.getAttribute("price");
		int userid = (int) session.getAttribute("userid");
		int seatno = (int) session.getAttribute("seat");
		int theatreid = (int) session.getAttribute("Theatreidd");

// refund amount
		UserDaoImpl obj = new UserDaoImpl();
        TheatreDaoImpl book = new TheatreDaoImpl();
        BookingDaoImpl book1 = new BookingDaoImpl();
		String status=book1.checkBookingStatus(bookingid);
	    book1.book(bookingid);
	    String error=null;
	    if(!status.equalsIgnoreCase("cancel")) {
        obj.refundwallet(userid, total);
        book.seatupdate(seatno, theatreid);
        error="Cancel Successfully";
		
        }
        else {
        	  error="Already Cancelled";
         }
		PrintWriter out = response.getWriter();
        response.sendRedirect("MybookingServlet?errorMessage="+error);
          
	

	}

}
