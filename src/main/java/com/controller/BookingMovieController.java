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


import com.MovieticketBookingModel.Bookingdetail;
import com.MovieticketBookingModel.Movie;
import com.MovieticketBookingModel.User;
import com.movieticketbookingdaoimpl.BookingDaoImpl;
import com.movieticketbookingdaoimpl.MovieDaoImpl;
import com.movieticketbookingdaoimpl.TheatreDaoImpl;
import com.movieticketbookingdaoimpl.UserDaoImpl;
@WebServlet("/bookmov")
public class BookingMovieController extends HttpServlet{

	private static final long serialVersionUID = 1L;

@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    
	
	     MovieDaoImpl movieDaoImpl = new MovieDaoImpl();
	     HttpSession session = req.getSession();
	     int userid=(int)session.getAttribute("userid");
	     
	     String mvname1=(String)session.getAttribute("moviename");
	     System.out.println(mvname1+"fthdjydhhchcfkjhghghkfhrhrfdf");
//	     System.out.println("session issue "+userid);
	     int mvid=Integer.parseInt(req.getParameter("Movie"));
	     int thid=Integer.parseInt(req.getParameter("theatre"));
	     
	     session.setAttribute("theaterid", thid);
	     int seat=Integer.parseInt(req.getParameter("Seats"));
	     session.setAttribute("Seats",seat);
	     Movie movie = new Movie(mvid);
	     BookingDaoImpl bdi=new BookingDaoImpl();
	     
         System.out.println(thid+"theatreeeeeeid");
           
           
           
           
           
	     String mvname=movieDaoImpl.movie(movie);
	    
	     session.setAttribute("moviefortoday", mvname1);
	     int totalprice = 180 * seat;
	     session.setAttribute("totalprice",totalprice);
	     String movieName = session.getAttribute("movienames").toString();
	     System.out.println("hi sachin");
	     
	    System.out.println(""+userid +mvid+thid+seat+mvname+totalprice + "");
	    System.out.println(mvname);
	     
	    System.out.println(thid);  

	     BookingDaoImpl bookingDaoImpl = new BookingDaoImpl();
	     Bookingdetail bookingdetail = new Bookingdetail(userid,thid,seat,totalprice,movieName);
	    
	     bookingDaoImpl.insert(bookingdetail);



	    List<Bookingdetail> bookingdetails = bdi.getbookingidanddate(thid,userid);
		

		session.setAttribute("bookinglist", bookingdetails);
//	session.setAttribute("bookingdate", rs.getDate(8));
//	System.out.println(rs.getInt(1)+""+rs.getDate(8));
	    
	    
	   
	     
	     
	     
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
  	    System.out.println(theatreDaoImpl.fetch(theatreinformation));
		int dedseat = theatreDaoImpl.fetch(theatreinformation)-seat;
		theatreDaoImpl.updateseat(dedseat, thid);
		RequestDispatcher rd=req.getRequestDispatcher("bookingSuccess.jsp");
		rd.forward(req, resp);
        }else {
        	session.setAttribute("lowbal", true);
        	resp.sendRedirect("wallet.jsp");
        }
	    
	    
	    
	    

	   
	     
}
                   
}
         
