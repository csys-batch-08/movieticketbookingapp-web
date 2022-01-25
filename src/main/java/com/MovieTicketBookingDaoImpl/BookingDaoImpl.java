package com.MovieTicketBookingDaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.MovieTicketBookingMessage.Mailer;
import com.MovieticketBookingModel.Bookingdetail;
import com.MovieticketBookingModel.Movie;
import com.MovieticketBookingModel.Theatreinformation;
import com.MovieticketBookingModel.User;
import com.Movieticketbooking.util.Connectionmv4;

public class BookingDaoImpl {
	public void insert(Bookingdetail Booking) {
	       String  query="insert into booking_detail(user_id,theatre_id,no_seats,total_amount,movie_name,Booking_Date) values (?,?,?,?,?,sysdate)";
//		   String updatewallet ="update user_details set wallet=wallet - ? where user_id=? ";
			try {
			Connection	con = Connectionmv4.DBConnection();			
				PreparedStatement Pstmt1 = con.prepareStatement(query);
			
				Pstmt1.setInt(1,Booking.getUser_id());
				
				Pstmt1.setInt(2,Booking.getTheatre_id());
				Pstmt1.setInt(3,Booking.getNo_seat());
				Pstmt1.setInt(4,Booking.getTotal_amount());
				
				Pstmt1.setString(5, Booking.getMovie_name());
				
				boolean flag = Pstmt1.executeUpdate()>0;
				if(flag) {
				Mailer.send("sachinraj6878@gmail.com", "Sachinraj@089", "sachin64979@gmail.com", "Movie Booking", "Your Ticket Booking Confirmed");
				}
				//System.out.println("Booking Success");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	
	public void update(Bookingdetail Booking)  {
		
		    String query="update booking_detail set booking_status=? where booking_id=? ";

		try {
			Connection con = Connectionmv4.DBConnection();
			PreparedStatement pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, Booking.getBooking_status());
			pstmt.setInt(2, Booking.getBooking_id());
			boolean flag  = pstmt.executeUpdate()>0;
			if(flag) {
				Mailer.send("sachinraj6878@gmail.com", "Sachinraj@089", "sachin64979@gmail.com", "Movie Booking", "Your Ticket Booking Cancelled");
				}
			
		//	System.out.println("Booking Cancel Success");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
      public int delete(Bookingdetail Booking )  {
		
	        String query="delete from theatre where Booking_id=? ";
		
		try {
		     Connection	con = Connectionmv4.DBConnection();
             PreparedStatement pstmt = con.prepareStatement(query);
		     pstmt.setInt(1,Booking.getBooking_id());
	         int i = pstmt.executeUpdate();
		
   		     System.out.println(i+"rows deleted successfully");



		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		  return 0; 
      }
		  
		  public ResultSet Showbooking (int bookingid) throws ClassNotFoundException, SQLException {
			  String query="select * from booking_detail where booking_id=? ";
			  Connection	con = Connectionmv4.DBConnection();
			  PreparedStatement pstmt = con.prepareStatement(query);
			  pstmt. setInt(1,bookingid);
			  ResultSet rs =pstmt.executeQuery();
			  return rs;
			  
		  }
//BookingHistory Admin		    
		  public List<Bookingdetail> showBooking() throws ClassNotFoundException, SQLException {
			  List<Bookingdetail> booking=new ArrayList<Bookingdetail>();
	           Bookingdetail mvtheatre1=null;
		
		       String showQuery="select * from booking_detail";
		       Connectionmv4 connection =new Connectionmv4();
		       Connection con=connection.DBConnection();
	           Statement stmt=con.createStatement();
		       ResultSet rs=stmt.executeQuery(showQuery);
		       while(rs.next()) {
               mvtheatre1=new  Bookingdetail(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getInt(5),rs.getString(6),rs.getString(7),rs.getDate(8));
               booking.add(mvtheatre1);
	  
		        }
		       return booking;
			
		  }
		  public void book(int booking,String status) {
				String query="Update booking_detail set booking_status=? where booking_id=? ";
				Connection con;
				
					try {
						con = Connectionmv4.DBConnection();
						PreparedStatement Pstmt1 = con.prepareStatement(query);
					//	System.out.println(booking.getBooking_status()+ "aaaa");
					//	System.out.println(booking.getBooking_id() + "bbbbb");
						
						
						Pstmt1.setString(1,status );
						Pstmt1.setInt(2,booking);
						int i = Pstmt1.executeUpdate();
						System.out.println( "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
						
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
		
				}
			
			
//Booking			
		  public ResultSet getbookingidanddate(int thid,int userid) throws ClassNotFoundException, SQLException {
			  String query="select * from booking_detail where theatre_id =? and user_id=? order by booking_id desc";
			  ResultSet rs=null;
			  Connection	con = Connectionmv4.DBConnection();
			  PreparedStatement pstmt = con.prepareStatement(query);
			  pstmt.setInt(1, thid);
      		  pstmt.setInt(2, userid);
			  rs=pstmt.executeQuery();
			  return rs;
		  }
//mybooking		  
		  public List<Bookingdetail> MyBooking(int userId) throws ClassNotFoundException, SQLException {
			  List<Bookingdetail> bookinglist=new ArrayList<Bookingdetail>();
	           Bookingdetail mvtheatre1=null;
		
		       String showQuery="select * from booking_detail where user_id='"+userId+"'";
		       Connectionmv4 connection =new Connectionmv4();
		       Connection con=connection.DBConnection();
	           Statement stmt=con.createStatement();
		       ResultSet rs=stmt.executeQuery(showQuery);
		       while(rs.next()) {
              mvtheatre1=new  Bookingdetail(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getInt(5),rs.getString(6),rs.getString(7),rs.getDate(8));
//			   System.out.println(rs.getString(3));
              bookinglist.add(mvtheatre1);
	  
		        }
		       return bookinglist;
			
		  } 
		  
		  
			}
