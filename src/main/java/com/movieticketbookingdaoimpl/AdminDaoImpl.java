package com.movieticketbookingdaoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.Movieticketbooking.util.Connectionutil;
import com.movieticketbookingmodel.Admin;
import com.movieticketbookingmodel.Bookingdetail;
import com.movieticketbookingmodel.Movie;
import com.movieticketbookingmodel.User;

public class AdminDaoImpl {

	public Admin validate(String emailid, String password) {
		Statement stmt =null;
		Admin ob1=null; 		
		Connection con = null;
	    
		String query="select * from admin where email_id='"+emailid+"' and password='"+password+"'";
		try {
			
			try {
			  con = Connectionutil.DBConnection();
			    stmt= con.createStatement();
				ResultSet rs=stmt.executeQuery(query);
				if(rs.next()) {
				ob1=new Admin(rs.getString(1),emailid, password);
			   
				return ob1;
				}
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
			
			
		    } catch (SQLException e) {
			
			   e.printStackTrace();
		}
		     return ob1;
		
	
	}
}
	