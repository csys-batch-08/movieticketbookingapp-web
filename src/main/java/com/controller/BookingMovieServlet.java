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

import com.movieticketbookingdaoimpl.BookingDaoImpl;
import com.movieticketbookingdaoimpl.MovieDaoImpl;
import com.movieticketbookingdaoimpl.TheatreDaoImpl;
import com.movieticketbookingdaoimpl.UserDaoImpl;
import com.movieticketbookingmodel.Bookingdetail;
import com.movieticketbookingmodel.Movie;
import com.movieticketbookingmodel.Theatreinformation;
import com.movieticketbookingmodel.User;

@WebServlet("/bookmov")
public class BookingMovieServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("hiiiiiiiiiiiiiiiiiiiiiiiiiii");

		MovieDaoImpl movieDaoImpl = new MovieDaoImpl();
		HttpSession session = req.getSession();
		int userid = (int) session.getAttribute("userid");
		String mvname1 = (String) session.getAttribute("moviename");
		int mvid = Integer.parseInt(req.getParameter("Movie"));
		int thid = Integer.parseInt(req.getParameter("theatre"));
		session.setAttribute("theaterid", thid);
		int seat = Integer.parseInt(req.getParameter("Seats"));
		session.setAttribute("Seats", seat);
		Movie movie = new Movie(mvid);
		BookingDaoImpl bdi = new BookingDaoImpl();

// amount

		String mvname = movieDaoImpl.movie(movie);
		session.setAttribute("moviefortoday", mvname1);
		int totalprice = 180 * seat;
		session.setAttribute("totalprice", totalprice);
		String movieName = session.getAttribute("movienames").toString();

		// System.out.println(""+userid +mvid+thid+seat+mvname+totalprice + "");

//User Booking 

		BookingDaoImpl bookingDaoImpl = new BookingDaoImpl();
		Bookingdetail bookingdetail = new Bookingdetail(userid, thid, seat, totalprice, movieName);
		bookingDaoImpl.insert(bookingdetail);

		List<Bookingdetail> bookingdetails = bdi.getbookingidanddate(thid, userid);
		session.setAttribute("bookinglist", bookingdetails);

		
//low Balance
		
		   UserDaoImpl dao2 = new UserDaoImpl();
		   int wallet = dao2.walletbalance(userid);
		   if (wallet > 180) {
		User users = new User(userid, totalprice);

//wallet
		

			UserDaoImpl dao1 = new UserDaoImpl();
			dao1.getwallet(users);
			com.movieticketbookingmodel.Theatreinformation theatreinformation = new com.movieticketbookingmodel.Theatreinformation(
					thid, mvname);

			TheatreDaoImpl theatreDaoImpl = new TheatreDaoImpl();
			//System.out.println(theatreDaoImpl.fetch(theatreinformation));
// cancel ticket
			
			int dedseat = theatreDaoImpl.fetch(theatreinformation) - seat;
			Theatreinformation theater = new Theatreinformation(seat);

			if (dedseat >= 0) {
				theatreDaoImpl.updateseat(dedseat, thid);
				req.setAttribute("errorMessage", "Ticket Booked successfully!!!...");
				RequestDispatcher rd = req.getRequestDispatcher("bookingSuccess.jsp");
				rd.forward(req, resp);

			} else {

		
				resp.sendRedirect("BookingServlet?errorMessage=Booking Failed !!!Seat Not Available...&theatreid=" + thid);

			}
		} else {
			session.setAttribute("lowbal", true);
			resp.sendRedirect("wallet.jsp");
		}

	}

}
