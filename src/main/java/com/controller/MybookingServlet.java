package com.controller;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.movieticketbookingdaoimpl.BookingDaoImpl;
import com.movieticketbookingmodel.Bookingdetail;

/**
 * Servlet implementation class MybookingServlet
 */
@WebServlet("/MybookingServlet")
public class MybookingServlet extends HttpServlet {

	
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String error=request.getParameter("errorMessage");
		 request.setAttribute("errorMessage", error);
		 BookingDaoImpl dao= new BookingDaoImpl();
         List<Bookingdetail> myBooking;
         HttpSession session = request.getSession(); 
         int userid=(int)session.getAttribute("userid");
         myBooking=dao.myBooking(userid);
		 request.setAttribute("BookingObj", myBooking);
		 RequestDispatcher requestDispatcher = request.getRequestDispatcher("myBooking.jsp");
		 requestDispatcher.forward(request, response);
	}

}
