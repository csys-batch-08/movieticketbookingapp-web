package com.movieticketbookingmodel;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;



public class Bookingdetail {
	private int bookingid;
	private int userid ;
	private int theatreid;
	private int noseat;
	private int totalamount;
	private String bookingstatus;
	private String moviename;
	private Date bookingdate;
	
	public Date getBookingdate() {
		return bookingdate;
	}
	public void setBookingdate(Date bookingdate) {
	  this.bookingdate = bookingdate;
	}
	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getTheatreid() {
		return theatreid;
	}
	public void setTheatreid(int theatreid) {
		this.theatreid = theatreid;
	}
	public int getNoseat() {
		return noseat;
	}
	public void setNoseat(int noseat) {
		this.noseat = noseat;
	}
	public int getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(int totalamount) {
		this.totalamount = totalamount;
	}
	public String getBookingstatus() {
		return bookingstatus;
	}
	public void setBookingstatus(String bookingstatus) {
		this.bookingstatus = bookingstatus;
	}

	
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	@Override
	public String toString() {
		return "Bookingdetail \nbookingid=" + bookingid + "\n userid=" + userid + "\n theatreid=" + theatreid
				+ "\n noseat=" + noseat + "\n totalamount=" + totalamount + "\n bookingstatus=" + bookingstatus
				+ "\n\n";
	}
	public Bookingdetail( int userid, int theatreid, int noseat, int totalamount,
			String bookingstatus,String moviename) {
		super();
		
		this.userid = userid;
		this.theatreid = theatreid;
		this.noseat = noseat;
		this.totalamount = totalamount;
		this.bookingstatus = bookingstatus;
		this.moviename=moviename;
	}
	public Bookingdetail( int bookingid,int userid, int theatreid, int noseat, int totalamount,
			String moviename,Date bookingdate) {
		super();
		this.bookingid= bookingid; 
		this.userid = userid;
		this.theatreid = theatreid;
		this.noseat = noseat;
		this.totalamount = totalamount;
		this.moviename=moviename;
		this.bookingdate=bookingdate;
	}
	
	public Bookingdetail(int theatreid) {
		super();
		
		
		this.theatreid = theatreid;
	}
	
	public Bookingdetail(int booking,String ticket) {
		
		this.bookingid=booking;
		this.bookingstatus=ticket;
		
	}
	public Bookingdetail(int bookingid,int userid, int theatreid, int noseat, int totalamount,String bookingstatus,String moviename,Date bookingdate) {
	
        this.bookingid= bookingid; 
		this.userid = userid;
		this.theatreid = theatreid;
		this.noseat = noseat;
		this.totalamount = totalamount;
		this.bookingstatus = bookingstatus;
		this.moviename=moviename;
		this.bookingdate=bookingdate;
	}

	public Bookingdetail(int userid, int thid, int seat, int totalprice, String mvname) {
		
	
		this.userid = userid;
		this.theatreid = thid;
		this.noseat = seat;
		this.totalamount = totalprice;
		this.moviename=mvname;
	}
	

	
}	
	





