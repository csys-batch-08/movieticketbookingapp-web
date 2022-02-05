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

import com.movieticketbookingdaoimpl.UserDaoImpl;
import com.movieticketbookingmodel.User;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		int userid = (int) session.getAttribute("userid");
        User san = new User(userid);
		UserDaoImpl dao = new UserDaoImpl();
		List<User> listproduct = dao.currentUser1(san);
		request.setAttribute("listproduct", listproduct);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("userProfile.jsp");
		requestDispatcher.forward(request, response);

	}

}
