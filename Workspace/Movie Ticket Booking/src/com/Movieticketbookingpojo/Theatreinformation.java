package com.Movieticketbookingpojo;

public class Theatreinformation {
	private String theatre_name;
    private int movie_id;
    private int theatre_id;
    private int  number_seats;
    private String theatre_address;
    private int  theatre_rating;
    private int price;
	public String getTheatre_name() {
		return theatre_name;
	}
	public void setTheatre_name(String theatre_name) {
		this.theatre_name = theatre_name;
	}
	public int getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	public int getTheatre_id() {
		return theatre_id;
	}
	public void setTheatre_id(int theatre_id) {
		this.theatre_id = theatre_id;
	}
	public int getNumber_seats() {
		return number_seats;
	}
	public void setNumber_seats(int number_seats) {
		this.number_seats = number_seats;
	}
	public String getTheatre_address() {
		return theatre_address;
	}
	public void setTheatre_address(String theatre_address) {
		this.theatre_address = theatre_address;
	}
	public int getTheatre_rating() {
		return theatre_rating;
	}
	public void setTheatre_rating(int theatre_rating) {
		this.theatre_rating = theatre_rating;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Theatreinformation [theatre_name=" + theatre_name + ", movie_id=" + movie_id + ", theatre_id="
				+ theatre_id + ", number_seats=" + number_seats + ", theatre_address=" + theatre_address
				+ ", theatre_rating=" + theatre_rating + ", price=" + price + "]";
	}
	public Theatreinformation(String theatre_name, int movie_id, int theatre_id, int number_seats,
			String theatre_address, int theatre_rating, int price) {
		super();
		this.theatre_name = theatre_name;
		this.movie_id = movie_id;
		this.theatre_id = theatre_id;
		this.number_seats = number_seats;
		this.theatre_address = theatre_address;
		this.theatre_rating = theatre_rating;
		this.price = price;
	}
	public Theatreinformation() {
		super();
		// TODO Auto-generated constructor stub
	}
}