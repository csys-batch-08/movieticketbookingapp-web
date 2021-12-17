package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.connection.Connectionmv4;
import com.pojo.Movie;
import com.pojo.User;



public class userdao {
	public void insert(User M4) throws ClassNotFoundException, SQLException {
	       String  query="insert into user_details(user_name,gender,email_id,mobile_num,e_password) values (?,?,?,?,?)";
			Connection con=Connectionmv4.DBConnection();
			PreparedStatement Pstmt1 = con.prepareStatement(query);
			Pstmt1.setString(1,M4.getUser_name());
			Pstmt1.setString(2,M4.getGender());
			Pstmt1.setString(3,M4.getEmail_id());
			Pstmt1.setLong(4,M4.getMobile_num());
			Pstmt1.setString(5,M4.getE_password());
				
			int i = Pstmt1.executeUpdate();

			System.out.println("Registration Completed");
			
			
	}
	

  public  boolean validateuser(String useremail,String userpassword  ) throws ClassNotFoundException, SQLException {
	String  validate="select * from user_details where email_id = ? and e_password = ?";
	Connection con=Connectionmv4.DBConnection();
    PreparedStatement Pstmt1 = con.prepareStatement(validate);
    Pstmt1.setString(1, useremail);
    Pstmt1.setString(2, userpassword);
	ResultSet rs = Pstmt1.executeQuery();
	if(rs.next()) {
		return true;
	}
	return false;
}
  public void update(Movie M1 ) throws SQLException, ClassNotFoundException {
		
		String query="update Movie set Movie_id=? where Movie_type=?";
		Connection con=Connectionmv4.DBConnection();
		PreparedStatement pstmt = con.prepareStatement(query);
		
		pstmt.setString(1, M1.getMovie_type());
		
       int i = pstmt.executeUpdate();
		
		System.out.println(i+"rows inserted successfully");
	}
	
public void delete(Movie M1 ) throws SQLException, ClassNotFoundException {
		
	String query="delete from theatre where movie_id='?' ";
		Connection con=Connectionmv4.DBConnection();
		PreparedStatement pstmt = con.prepareStatement(query);
		
		pstmt.setInt(1,M1.getMovie_id());
		
       int i = pstmt.executeUpdate();
		
		System.out.println(i+"rows deleted successfully");



		
		
}
}






			


