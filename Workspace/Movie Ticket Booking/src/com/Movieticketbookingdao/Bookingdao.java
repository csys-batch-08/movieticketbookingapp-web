package com.Movieticketbookingdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.Movieticketbookingpojo.Bookingdetail;
import com.connection.Connectionmv4;

public class Bookingdao {
	public void insert(Bookingdetail M5) {
	       String  query="insert into booking_detail(booking_id,user_id,booked_seats,amount,booking_status,seat_type, payment_status) values (?,?,?,?,?,?,?)";
		
			try {
			Connection	con = Connectionmv4.DBConnection();
				PreparedStatement Pstmt1 = con.prepareStatement(query);
				Pstmt1.setInt(1,M5.getBooking_id());
				Pstmt1.setInt(2,M5.getUser_id());
				Pstmt1.setInt(3,M5.getBooked_seats());
				Pstmt1.setInt(4,M5.getAmount());
				Pstmt1.setString(5,M5.getSeat_type());
				Pstmt1.setString(6,M5.getPayment_status());
				
				int i = Pstmt1.executeUpdate();

				System.out.println(i+"rows inserted successfully");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	
	public void update(Bookingdetail M5)  {
		
		String query="update theatre set Booked_seats=? where user_id=? ";

		try {
			Connection con = Connectionmv4.DBConnection();
			PreparedStatement pstmt = con.prepareStatement(query);
			
			pstmt.setInt(1, M5.getBooked_seats());
	         int i = pstmt.executeUpdate();
			
			System.out.println(i+"rows update successfully");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
public void delete(Bookingdetail M5 )  {
		
	String query="delete from theatre where Booking_id='?' ";
		
		try {
		Connection	con = Connectionmv4.DBConnection();
         PreparedStatement pstmt = con.prepareStatement(query);
		 pstmt.setInt(1,M5.getBooking_id());
	     int i = pstmt.executeUpdate();
		
   		System.out.println(i+"rows deleted successfully");



		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		    
		    
}
}
			
			
              
