package com.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.MovieticketBookingModel.User;
import com.movieticketbookingdaoimpl.UserDaoImpl;

/**
 * Servlet implementation class UserHistoryServlet
 */
@WebServlet("/UserHistoryServlet")
public class UserHistoryServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	    HttpSession session = request.getSession();
		 int usen=(int)session.getAttribute("userid");
		 User usew=new User(usen);
		 UserDaoImpl dao=new UserDaoImpl();
		 List<User> showUser=dao.showUser();
		request.setAttribute("UserListObj", showUser);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("userdetailHistory.jsp");
		requestDispatcher.forward(request, response);
		 
	}

	

}
