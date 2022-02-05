package com.controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.movieticketbookingdaoimpl.TheatreDaoImpl;
import com.movieticketbookingmodel.Theatreinformation;

@WebServlet("/Updatetheatre")
public class UpdateTheatreServlet extends HttpServlet {

	
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String theatrename = request.getParameter("theatrename");
		int movieid = Integer.parseInt(request.getParameter("movieid"));
		int theatreid = Integer.parseInt(request.getParameter("theatre Id"));
		int numberseats = Integer.parseInt(request.getParameter("Numberseats"));
		session.setAttribute("numberseats", numberseats);
		String theatreaddress = request.getParameter("theatre Address");
		int theatreratings = Integer.parseInt(request.getParameter("theatre Ratings"));
		String theatreDate = request.getParameter(" Movie date and time"); 
		int price = Integer.parseInt(request.getParameter("Price"));
		session.setAttribute("moviedate", theatreDate);
		LocalDateTime mvTimeDate = LocalDateTime.parse(theatreDate);
    	Theatreinformation dao = new Theatreinformation(theatrename, movieid, theatreid, numberseats, theatreaddress,
				theatreratings, price, mvTimeDate);
		TheatreDaoImpl theatre1 = new TheatreDaoImpl();
		theatre1.update(dao);
		ResultSet rs = TheatreDaoImpl.moviedetail();
		try {
			session.setAttribute("noofseats", rs.getInt(4));
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		response.sendRedirect("addTheatre.jsp");

	}

}
