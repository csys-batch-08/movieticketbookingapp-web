package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movieticketbookingdaoimpl.TheatreDaoImpl;
import com.movieticketbookingmodel.Theatreinformation;

@WebServlet("/Deletetheatre4")
public class DeleteTheatreServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
		int theatreid=Integer.parseInt(request.getParameter("theatre Id"));
		Theatreinformation dao=new Theatreinformation(theatreid);
		TheatreDaoImpl theatre1=new TheatreDaoImpl();
	    theatre1.delete(dao);
		response.sendRedirect("addTheatre.jsp");
	}

}
