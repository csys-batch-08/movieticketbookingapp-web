package com.MovieTicketBookingDaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.MovieticketBookingModel.Admin;
import com.MovieticketBookingModel.Bookingdetail;
import com.MovieticketBookingModel.Movie;
import com.MovieticketBookingModel.User;
import com.Movieticketbooking.util.Connectionmv4;

public class AdminDaoImpl {

	public Admin validate(String email_id, String password) {
		Statement stmt =null;
		Admin ob1=null; 		
		Connection con = null;
	    
		String query="select * from admin where email_id='"+email_id+"' and password='"+password+"'";
		try {
			
			try {
				con = Connectionmv4.DBConnection();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			stmt= con.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			if(rs.next()) {
			ob1=new Admin(rs.getString(1),email_id, password);
			 System.out.println(rs.getString(1));
			 return ob1;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ob1;
		
	
	}
}
	