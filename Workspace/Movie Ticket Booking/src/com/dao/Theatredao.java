package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.connection.Connectionmv4;
import com.pojo.Theatreinformation;

public class Theatredao {
	public void insert(Theatreinformation M2 ) throws ClassNotFoundException, SQLException {
	       String  query="insert into theatre(theatre_name, movie_id,theatre_id,number_seats,theatre_address,theatre_rating) values (?,?,?,?,?,?)";
			Connection con=Connectionmv4.DBConnection();
			PreparedStatement Pstmt1 = con.prepareStatement(query);
		    Pstmt1.setString(1,M2.getTheatre_name());
		    Pstmt1.setInt(2,M2.getMovie_id());
		    Pstmt1.setInt(3,M2.getTheatre_id());
		    Pstmt1.setInt(4,M2.getNumber_seats());
		    Pstmt1.setString(5,M2.getTheatre_address());
		    Pstmt1.setInt(6,M2.getTheatre_rating());
		    
			int i = Pstmt1.executeUpdate();

			System.out.println(i+"rows inserted successfully");
			
	}
	
	public void update(Theatreinformation M2 ) throws SQLException, ClassNotFoundException {
		
		String query="update theatre set threatre_name='?' where  threatre_id='?'  ";
		Connection con=Connectionmv4.DBConnection();
		PreparedStatement pstmt = con.prepareStatement(query);
		
		pstmt.setString(1,M2.getTheatre_name());
		
         int i = pstmt.executeUpdate();
		
		System.out.println(i+"rows inserted successfully");
	}
	
public void delete(Theatreinformation M2 ) throws SQLException, ClassNotFoundException {
		
		String query="delete from theatre where threatre_id='?' ";
		Connection con=Connectionmv4.DBConnection();
		PreparedStatement pstmt = con.prepareStatement(query);
		
		pstmt.setInt(1,M2.getTheatre_id());
		
         int i = pstmt.executeUpdate();
		
		System.out.println(i+"rows deleted successfully");



		    
		    
}
}