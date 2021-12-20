package com.Movieticketbookingpojo;

public class Bookingdetail {
	private int booking_id;
	private int user_id ;
	private int booked_seats ;
	private int amount;
	private String booking_status ;
	private String seat_type;
	private String payment_status;
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
	public int getBooked_seats() {
		return booked_seats;
	}
	public void setBooked_seats(int booked_seats) {
		this.booked_seats = booked_seats;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getBooking_status() {
		return booking_status;
	}
	public void setBooking_status(String booking_status) {
		this.booking_status = booking_status;
	}
	public String getSeat_type() {
		return seat_type;
	}
	public void setSeat_type(String seat_type) {
		this.seat_type = seat_type;
	}
	public String getPayment_status() {
		return payment_status;
	}
	public void setPayment_status(String payment_status) {
		this.payment_status = payment_status;
	}
	@Override
	public String toString() {
		return "Mv5project [booking_id=" + booking_id + ", user_id=" + user_id + ", booked_seats=" + booked_seats
				+ ", amount=" + amount + ", booking_status=" + booking_status + ", seat_type=" + seat_type
				+ ", payment_status=" + payment_status + "]";
	}
	public Bookingdetail(int booking_id, int user_id, int booked_seats, int amount, String booking_status,
			String seat_type, String payment_status) {
		super();
		this.booking_id = booking_id;
		this.user_id = user_id;
		this.booked_seats = booked_seats;
		this.amount = amount;
		this.booking_status = booking_status;
		this.seat_type = seat_type;
		this.payment_status = payment_status;
	}
	public Bookingdetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}



