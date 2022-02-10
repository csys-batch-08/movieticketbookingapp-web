package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.movieticketbookingdaoimpl.UserDaoImpl;
import com.movieticketbookingmodel.User;

/**
 * Servlet implementation class WalletAmountServlet
 */
@WebServlet("/WalletAmountServlet")
public class WalletAmountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		int userid=(int)session.getAttribute("userid");
		String amu=request.getParameter("number");
		int wallet=Integer.parseInt(amu);
        User use=new User(userid,wallet);
		UserDaoImpl dao=new UserDaoImpl();
		dao.updatewallet(use);
		response.sendRedirect("showMovie.jsp");
	}

}
