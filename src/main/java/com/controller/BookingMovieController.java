package com.controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.Request;

import com.MovieTicketBookingDao.Theatreinformation;
import com.MovieTicketBookingDaoImpl.BookingDaoImpl;
import com.MovieTicketBookingDaoImpl.MovieDaoImpl;
import com.MovieTicketBookingDaoImpl.TheatreDaoImpl;
import com.MovieTicketBookingDaoImpl.UserDaoImpl;
import com.MovieticketBookingModel.Bookingdetail;
import com.MovieticketBookingModel.Movie;
import com.MovieticketBookingModel.User;
@WebServlet("/bookmov")
public class BookingMovieController extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	MovieDaoImpl movieDaoImpl = new MovieDaoImpl();


	HttpSession session = req.getSession();
	     int userid=(int)session.getAttribute("userid");
	     String mvname1=(String)session.getAttribute("moviename");
	     
//	     System.out.println("session issue "+userid);
	     int mvid=Integer.parseInt(req.getParameter("Movie"));
	     int thid=Integer.parseInt(req.getParameter("theatre"));
	     session.setAttribute("theaterid", thid);
	     int seat=Integer.parseInt(req.getParameter("Seats"));
	     session.setAttribute("Seats",seat);
	     Movie movie = new Movie(mvid);
	     BookingDaoImpl bdi=new BookingDaoImpl();
	     

	     String mvname=movieDaoImpl.movie(movie);
	    
	     session.setAttribute("moviefortoday", mvname);
	     int totalprice = 180 * seat;
	     session.setAttribute("totalprice",totalprice);

	  //   System.out.println(""+userid +mvid+thid+seat+mvname+totalprice + "");
	     
	     
	       

	     BookingDaoImpl bookingDaoImpl = new BookingDaoImpl();
	     Bookingdetail bookingdetail = new Bookingdetail(userid,thid,seat,totalprice,mvname);

	    bookingDaoImpl.insert(bookingdetail);
	    
	//    System.out.println("pothi");
	    try {
			ResultSet rs= bdi.getbookingidanddate(thid,userid);
			

			session.setAttribute("ResultSet", rs);
			session.setAttribute("bookingdate", rs.getDate(8));
		//	System.out.println(rs.getInt(1)+""+rs.getDate(8));
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    
	    
	   
	     
	     
	     
//low	      
	      UserDaoImpl dao2=new UserDaoImpl();
        int wallet=dao2.walletbalance(userid);
    //    System.out.println(wallet + "aaaaaaaa");
        if(wallet >= 180) {
        	 User users=new User(userid,totalprice); 
     	    
       	  //  System.out.println(users);
       	    UserDaoImpl dao1=new UserDaoImpl();
       	    
       	     dao1.getwallet(users);
       	  com.MovieticketBookingModel.Theatreinformation theatreinformation = new com.MovieticketBookingModel.Theatreinformation(thid, mvname);
  	    TheatreDaoImpl theatreDaoImpl = new TheatreDaoImpl();
  	    try {
  	    	System.out.println(theatreDaoImpl.fetch(theatreinformation));
  			int dedseat = theatreDaoImpl.fetch(theatreinformation)-seat;
  			theatreDaoImpl.updateseat(dedseat, thid);
  			resp.sendRedirect("BookingSuccess.jsp");

  		} catch (ClassNotFoundException | SQLException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
        }else {
        	session.setAttribute("lowbal", true);
        	resp.sendRedirect("Wallet.jsp");
        }
	    
	    
	    
	    

	   
	     
}
                   
}
         
