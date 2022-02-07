package com.MovieTicketBookingDao;

import java.util.List;

import com.movieticketbookingmodel.Bookingdetail;

public interface Booking {

	public void insert(Bookingdetail booking);
	
	public void update(Bookingdetail booking);
	
	public int delete(Bookingdetail booking);
	
	public List<Bookingdetail> showBooking();
	
	public void book(int booking) ;
	
	public List<Bookingdetail> getbookingidanddate(int thid, int userid);
	
	public String checkBookingStatus(int bookingid);
	
	public List<Bookingdetail> myBooking(int userId) ;
	 
	
	  
}
