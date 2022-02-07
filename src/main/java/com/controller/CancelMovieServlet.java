//package com.controller;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//import com.movieticketbookingdaoimpl.BookingDaoImpl;
//import com.movieticketbookingdaoimpl.TheatreDaoImpl;
//import com.movieticketbookingdaoimpl.UserDaoImpl;
//
///**
// * Servlet implementation class CancelMovieServlet
// */
//@WebServlet("/CancelMovieServlet")
//public class CancelMovieServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
//	@Override
//	protected void service(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		int booking = Integer.parseInt(request.getParameter("cancel"));
//		String ticket = request.getParameter("status");
//		HttpSession session = request.getSession();
//		int total = (int) session.getAttribute("totalprice");
//		int userid = (int) session.getAttribute("userid");
//		int seatno = (int) session.getAttribute("Seats");
//		int theatreid = (int) session.getAttribute("theaterid");
//
////refund amount     
//		UserDaoImpl obj = new UserDaoImpl();
//		TheatreDaoImpl book = new TheatreDaoImpl();
//		BookingDaoImpl book1 = new BookingDaoImpl();
//
////refund
//
//		obj.refundwallet(userid, total);
//		book.seatupdate(seatno, theatreid);
//		PrintWriter out = response.getWriter();
//        response.sendRedirect("showMovie.jsp");
//	}


