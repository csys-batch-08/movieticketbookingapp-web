package com.MovieticketBookingModel;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import com.MovieTicketBookingDaoImpl.BookingDaoImpl;

public class Bookingdetail {
	private int booking_id;
	private int user_id ;
	private int theatre_id;
	private int no_seat;
	private int total_amount;
	private String booking_status;
	private String movie_name;
	private Date Booking_date;
	
	public Date getBooking_date() {
		return Booking_date;
	}
	public void setBooking_date(Date booking_date) {
		Booking_date = booking_date;
	}
	public int getBooking_id() {
		return booking_id;
	}
	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getTheatre_id() {
		return theatre_id;
	}
	public void setTheatre_id(int theatre_id) {
		this.theatre_id = theatre_id;
	}
	public int getNo_seat() {
		return no_seat;
	}
	public void setNo_seat(int no_seat) {
		this.no_seat = no_seat;
	}
	public int getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(int total_amount) {
		this.total_amount = total_amount;
	}
	public String getBooking_status() {
		return booking_status;
	}
	public void setBooking_status(String booking_status) {
		this.booking_status = booking_status;
	}

	
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	@Override
	public String toString() {
		return "Bookingdetail \nbooking_id=" + booking_id + "\n user_id=" + user_id + "\n theatre_id=" + theatre_id
				+ "\n no_seat=" + no_seat + "\n total_amount=" + total_amount + "\n booking_status=" + booking_status
				+ "\n\n";
	}
	public Bookingdetail( int user_id, int theatre_id, int no_seat, int total_amount,
			String booking_status,String movie_name) {
		super();
		
		this.user_id = user_id;
		this.theatre_id = theatre_id;
		this.no_seat = no_seat;
		this.total_amount = total_amount;
		this.booking_status = booking_status;
		this.movie_name=movie_name;
	}
	public Bookingdetail( int user_id, int theatre_id, int no_seat, int total_amount,
			String movie_name) {
		super();
		
		this.user_id = user_id;
		this.theatre_id = theatre_id;
		this.no_seat = no_seat;
		this.total_amount = total_amount;
		
		this.movie_name=movie_name;
	}
	
	public Bookingdetail(int theatre_id) {
		super();
		
		
		this.theatre_id = theatre_id;
	}
	
	public Bookingdetail(int booking,String ticket) {
		// TODO Auto-generated constructor stub
		this.booking_id=booking;
		this.booking_status=ticket;
		
	}
	public Bookingdetail(int Booking_id,int user_id, int theatre_id, int no_seat, int total_amount,String Booking_status,String movie_name,Date Booking_date) {
		// TODO Auto-generated constructor stub
        this.booking_id= Booking_id; 
		this.user_id = user_id;
		this.theatre_id = theatre_id;
		this.no_seat = no_seat;
		this.total_amount = total_amount;
		this.booking_status = Booking_status;
		this.movie_name=movie_name;
		this.Booking_date=Booking_date;
	}
//	public Bookingdetail(int booking1, String ticket1) {
//		// TODO Auto-generated constructor stub
//		
//		this.booking_id=booking1;
//		this.booking_status=ticket1;
//	}

	
}

		
	





