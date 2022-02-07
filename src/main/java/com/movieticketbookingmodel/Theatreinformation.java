package com.movieticketbookingmodel;

import java.time.LocalDateTime;
import java.util.Objects;

public class Theatreinformation {
	private String theatrename;
	private int movieid;
	private int theatreid;
	private int numberseats;
	private String theatreaddress;
	private int theatrerating;
	private int price;
	private LocalDateTime moviedatetime;
	private String images;

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public Theatreinformation(String theatrename, int movieid2, int theatreid, int numberseats, String theatreaddress,
			int theatrerating, LocalDateTime moviedatetime, int price, String images) {
		super();
		this.theatrename = theatrename;
		this.movieid = movieid2;
		this.theatreid = theatreid;
		this.numberseats = numberseats;
		this.theatreaddress = theatreaddress;
		this.theatrerating = theatrerating;
		this.price = price;
		this.moviedatetime = moviedatetime;
		this.images = images;
	}

	public Theatreinformation(String theatrename, int movieid, int numberseats, String theatreaddress,
			int theatrerating, int price, LocalDateTime moviedatetime, String images) {
		super();
		this.theatrename = theatrename;
		this.movieid = movieid;
		this.numberseats = numberseats;
		this.theatreaddress = theatreaddress;
		this.theatrerating = theatrerating;
		this.price = price;
		this.moviedatetime = moviedatetime;
		this.images = images;
	}

	@Override
	public int hashCode() {
		return Objects.hash(moviedatetime, movieid, numberseats, price, theatreaddress, theatreid, theatrename,
				theatrerating);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Theatreinformation other = (Theatreinformation) obj;
		return Objects.equals(moviedatetime, other.moviedatetime) && movieid == other.movieid
				&& numberseats == other.numberseats && price == other.price
				&& Objects.equals(theatreaddress, other.theatreaddress) && theatreid == other.theatreid
				&& Objects.equals(theatrename, other.theatrename) && theatrerating == other.theatrerating;
	}

	@Override
	public String toString() {
		return "Theatreinformation \ntheatrename=" + theatrename + "\n movieid=" + movieid + "\n theatreid=" + theatreid
				+ "\n numberseats=" + numberseats + "\n theatreaddress=" + theatreaddress + "\n theatrerating="
				+ theatrerating + "\n price=" + price + "\n moviedate_time=" + moviedatetime + "\n\n";
	}

	public String getTheatrename() {
		return theatrename;
	}

	public void setTheatrename(String theatrename) {
		this.theatrename = theatrename;
	}

	public int getMovieid() {
		return movieid;
	}

	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}

	public int getTheatreid() {
		return theatreid;
	}

	public void setTheatreid(int theatreid) {
		this.theatreid = theatreid;
	}

	public int getNumberseats() {
		return numberseats;
	}

	public void setNumberseats(int numberseats) {
		this.numberseats = numberseats;
	}

	public String getTheatreaddress() {
		return theatreaddress;
	}

	public void setTheatreaddress(String theatreaddress) {
		this.theatreaddress = theatreaddress;
	}

	public int getTheatrerating() {
		return theatrerating;
	}

	public void setTheatrerating(int theatrerating) {
		this.theatrerating = theatrerating;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public LocalDateTime getMoviedatetime() {
		return moviedatetime;
	}

	public void setMoviedatetime(LocalDateTime moviedatetime) {
		this.moviedatetime = moviedatetime;
	}

	public Theatreinformation(String theatrename1, int theatreid1) {

		this.theatrename = theatrename1;
		this.theatreid = theatreid1;
	}

	public Theatreinformation(int theatreid) {

		this.theatreid = theatreid;
	}

	public Theatreinformation(String theatrename, int movieid, int numberseats, String theatreaddress,
			int theatreratings, int price2, LocalDateTime mvTimeDate) {

		this.theatrename = theatrename;
		this.movieid = movieid;
		this.numberseats = numberseats;
		this.theatreaddress = theatreaddress;
		this.theatrerating = theatreratings;
		this.price = price2;
		this.moviedatetime = mvTimeDate;
	}

	public Theatreinformation(int theatreid, String n) {

		this.theatreid = theatreid;

	}

	public Theatreinformation(String theatrename, int movieid, int theatreid, int numberseats, String theatreaddress,
			int theatreratings, int price2, LocalDateTime mvTimeDate) {

		this.theatrename = theatrename;
		this.movieid = movieid;
		this.numberseats = numberseats;
		this.theatreaddress = theatreaddress;
		this.theatrerating = theatreratings;
		this.price = price2;
		this.moviedatetime = mvTimeDate;
	}

	public Theatreinformation(String theatrename, int movieid2, int theatreid, int numberseats, String theatreaddress,
			int theatrerating, int price, LocalDateTime moviedatetime, String images) {

		this.theatrename = theatrename;
		this.movieid = movieid2;
		this.theatreid = theatreid;
		this.numberseats = numberseats;
		this.theatreaddress = theatreaddress;
		this.theatrerating = theatrerating;
		this.price = price;
		this.moviedatetime = moviedatetime;

		this.images = images;
	}

	public Theatreinformation(String theatrename, int price2, int theatreid) {

		this.theatrename = theatrename;
		this.price = price2;
		this.theatreid = theatreid;
	}
}
