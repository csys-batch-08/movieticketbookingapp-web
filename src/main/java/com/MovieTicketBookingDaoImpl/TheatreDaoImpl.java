package com.MovieTicketBookingDaoImpl;

import java.security.Timestamp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.MovieticketBookingModel.Movie;
import com.MovieticketBookingModel.Theatreinformation;
import com.Movieticketbooking.util.Connectionmv4;

public class TheatreDaoImpl {
	private static final PreparedStatement Pstmt = null;

	public void insert(Theatreinformation theatre ) {
		    System.out.println(theatre.getMovie_date_time());
	        String  query="insert into theatre(theatre_name, movie_id,number_seats,theatre_address,theatre_rating,price,movie_date_time,images) values (?,?,?,?,?,?,?,?)";
			Connection con;
			try {
				Connection 	con1 = Connectionmv4.DBConnection();
				PreparedStatement Pstmt1 = con1.prepareStatement(query);
			    Pstmt1.setString(1,theatre.getTheatre_name());
			    Pstmt1.setInt(2,theatre.getMovie_id());
			    Pstmt1.setInt(3,theatre.getNumber_seats());
			    Pstmt1.setString(4,theatre.getTheatre_address());
			    Pstmt1.setInt(5,theatre.getTheatre_rating());
			   //ava.sql.Timestamp mvDateTime = java.sql.Timestamp.valueOf(theatre.getMovie_date_time());
			    Pstmt1.setInt(6,theatre.getPrice());
			    Pstmt1.setTimestamp(7,java.sql.Timestamp.valueOf(theatre.getMovie_date_time()));
			    Pstmt1.setString(8,theatre.getImages());

			    
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
			
			
			
			
	public  List<Theatreinformation> showtheatre(int id) throws ClassNotFoundException, SQLException {
		
		       List<Theatreinformation> movietheatre=new ArrayList<Theatreinformation>();
	           Theatreinformation mvtheatre=null;
		
		       String showQuery="select * from theatre where movie_id=? ";
		       Connectionmv4 connection =new Connectionmv4();
		       Connection con=connection.DBConnection();
	           PreparedStatement preparedStatement = con.prepareStatement(showQuery);
	           preparedStatement.setInt(1, id);
	         //  preparedStatement.setInt(1, mvid);
		       ResultSet rs=preparedStatement.executeQuery();
		       while(rs.next()) {
               mvtheatre=new  Theatreinformation(rs.getString(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getString(5),rs.getInt(6),rs.getInt(7),rs.getTimestamp(8).toLocalDateTime(),rs.getString(9));
			   System.out.println(rs.getInt(3));
               movietheatre.add(mvtheatre);
	  
		        }
		       System.out.println(movietheatre);
		       return movietheatre;
			
	}

	public void update1(Theatreinformation theatres) {
		String query="update theatre set number_seats=? where movie_id=? ";
		 Connection con;
		try {
			 con = Connectionmv4.DBConnection();
			 PreparedStatement pstmt = con.prepareStatement(query);
			 pstmt.setInt(1, theatres.getNumber_seats());
			  pstmt.setInt(2, theatres.getMovie_id());
			 int i = pstmt.executeUpdate();
		     System.out.println(i+"rows update successfully");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
	public void seatupdate(int seat , int thid) {
		String query="update theatre set number_seats= number_seats+? where Theatre_id=? ";
		 Connection con;
		try {
			 con = Connectionmv4.DBConnection();
			 PreparedStatement pstmt = con.prepareStatement(query);
			  System.out.println("seatupdate");
			 pstmt.setInt(1, seat);
			  pstmt.setInt(2, thid);
			 int i = pstmt.executeUpdate();
			
		     System.out.println(i+"rows update successfully");
		} 
		catch (Exception e) {
			System.out.println(e);
		}	
        
	}


	public void update(Theatreinformation theatre2 ) {
		
		       
		        
		        String query="update theatre set theatre_name=?, price=? where theatre_id=?  ";
		
		try {
		        Connection	con = Connectionmv4.DBConnection();
                PreparedStatement pstmt = con.prepareStatement(query);
		        pstmt.setString(1,theatre2.getTheatre_name());
		       // pstmt.setInt(2, theatre2.getMovie_id());
		       // pstmt.setInt(3, theatre2.getNumber_seats());
	          //  pstmt.setString(4,theatre2.getTheatre_address());
	           // pstmt.setInt(5, theatre2.getTheatre_rating());
              
//				java.sql.Timestamp mvDateTime = java.sql.Timestamp.valueOf(theatre.getMovie_date_time());
			    //pstmt.setTimestamp(6,java.sql.Timestamp.valueOf(theatre2.getMovie_date_time()));
			    pstmt.setInt(2,theatre2.getPrice());
	        
	        	pstmt.setInt(3,theatre2.getTheatre_id());
	        	int i = pstmt.executeUpdate();
		        System.out.println(i+"rows update successfully");
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			    e.printStackTrace();
		} catch (Exception e) {
			    // TODO Auto-generated catch block
			    e.printStackTrace();
		}
		
	}
      
	
    public void delete(Theatreinformation theatre3 )  {
		
	        	 String query="delete from theatre where theatre_id=? ";
	         
		try {
		         Connection	con = Connectionmv4.DBConnection();
                 PreparedStatement pstmt = con.prepareStatement(query);
	        	 pstmt.setInt(1,theatre3.getTheatre_id());
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
 
   public  void findmytheatre(Theatreinformation M1)  {
			String showQuery="select * from theatre where movie_id=?";
			Connectionmv4 connection =new Connectionmv4();
			Connection con;
			try {
				con = connection.DBConnection();
				PreparedStatement pstmt=con.prepareStatement( showQuery);
			    pstmt.setInt(1,M1.getMovie_id());
				ResultSet rs=pstmt.executeQuery();
				while(rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getInt(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getInt(5)+"\t"+rs.getString(6)+"\t"+rs.getString(7)+"\t"+rs.getString(8));
				}
			    
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
}
   public static ResultSet moviedetail() {
	   String query="select * from theatre";
	   ResultSet rs=null;
	   Connectionmv4 connection =new Connectionmv4();
		Connection con;
		try {
			con = connection.DBConnection();
			Statement st=con.createStatement();
			rs=st.executeQuery(query);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
						return rs;
   }
	public int fetch(Theatreinformation theatres1) throws ClassNotFoundException, SQLException {
	String query = "Select  number_seats from theatre  where theatre_id=? ";
	Connection	con = Connectionmv4.DBConnection();
   PreparedStatement pstmt = con.prepareStatement(query);
   System.out.println(theatres1.getTheatre_id() + "jfdhn");
   pstmt.setInt(1, theatres1.getTheatre_id());
ResultSet rs = pstmt.executeQuery();
while(rs.next()) {
	System.out.println(rs.getInt(1)+"gchj");
	return rs.getInt(1);
}
return -1;
}




public void updateseat(int seat,int thid) {
	
    
    
    String query="update theatre set number_seats= ? where  theatre_id=? ";
    
    System.out.println("ckvcghcdghczghcghzcx");

try {
    Connection	con = Connectionmv4.DBConnection();
    PreparedStatement pstmt = con.prepareStatement(query);
    pstmt.setInt(1,seat);
    pstmt.setInt(2, thid);
    
   
	int i = pstmt.executeUpdate();
    System.out.println(i+"rows update successfully");
}catch (ClassNotFoundException e) {
// TODO Auto-generated catch block
    e.printStackTrace();
} catch (Exception e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}

}
}


