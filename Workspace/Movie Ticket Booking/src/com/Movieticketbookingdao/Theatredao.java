package com.Movieticketbookingdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Movieticketbookingpojo.Movie;
import com.Movieticketbookingpojo.Theatreinformation;
import com.connection.Connectionmv4;

public class Theatredao {
	public void insert(Theatreinformation M2 ) {
	       String  query="insert into theatre(theatre_name, movie_id,theatre_id,number_seats,theatre_address,theatre_rating) values (?,?,?,?,?,?)";
			Connection con;
			try {
				Connection 	con1 = Connectionmv4.DBConnection();
				PreparedStatement Pstmt1 = con1.prepareStatement(query);
			    Pstmt1.setString(1,M2.getTheatre_name());
			    Pstmt1.setInt(2,M2.getMovie_id());
			    Pstmt1.setInt(3,M2.getTheatre_id());
			    Pstmt1.setInt(4,M2.getNumber_seats());
			    Pstmt1.setString(5,M2.getTheatre_address());
			    Pstmt1.setInt(6,M2.getTheatre_rating());
			    
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
			
			
			
			
			public List<Theatreinformation> showTheatre() throws ClassNotFoundException, SQLException {
				
				List<Theatreinformation> theatreList=new ArrayList<Theatreinformation>();
				
				String showQuery="select * from Theatre";
				Connectionmv4 connection =new Connectionmv4();
				Connection con=connection.DBConnection();
			    Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery(showQuery);
				while(rs.next()) {
					System.out.format("%-7s%-20s%-3s%-8s%-5s%-8s%-7s",rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5),rs.getString(6));
//					System.out.println(rs.getString(3));
				}
				
				return theatreList;
			
	}
	
	public void update(Theatreinformation M2 ) {
		
		String query="update theatre set threatre_name='?' where  threatre_id='?'  ";
		
		try {
		Connection	con = Connectionmv4.DBConnection();
        PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setString(1,M2.getTheatre_name());
		int i = pstmt.executeUpdate();
		
		System.out.println(i+"rows inserted successfully");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
public void delete(Theatreinformation M2 )  {
		
		String query="delete from theatre where threatre_id='?' ";
	
		try {
		Connection	con = Connectionmv4.DBConnection();
         PreparedStatement pstmt = con.prepareStatement(query);
		 pstmt.setInt(1,M2.getTheatre_id());
		 int i = pstmt.executeUpdate();
		
		System.out.println(i+"rows deleted successfully");


		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		    
		    
}
}