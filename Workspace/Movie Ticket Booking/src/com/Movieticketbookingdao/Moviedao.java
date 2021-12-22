package com.Movieticketbookingdao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Movieticketbookingpojo.Movie;
import com.connection.Connectionmv4;

public class Moviedao {
	 private static final String Movie = null;

	public void insert(Movie M1 )  {
	       String  query="insert into Movie(Movie_name,Movie_id,Movie_type,movie_ratings,movie_duration,director,music_director,hero_name) values (?,?,?,?,?,?,?,?)";
			Connection con;
			try {
				con = Connectionmv4.DBConnection();
				PreparedStatement pstmt = con.prepareStatement(query);
				pstmt.setString(1,M1.getMovie_name());
				pstmt.setInt(2,M1.getMovie_id());
				pstmt.setString(3,M1.getMovie_type());
				pstmt.setInt(4,M1.getMovie_ratings() );
				pstmt.setInt(5,M1.getMovie_duration());
				pstmt.setString(6,M1.getDirector());
				pstmt.setString(7,M1.getMusic_director());
				pstmt.setString(8,M1.getHero_name());
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
			
	public List<Movie> showMovie() throws ClassNotFoundException, SQLException {
			
				List<Movie> movieList=new ArrayList<Movie>();
				Movie mvproduct=null;
				
				String showQuery="select * from movie";
				Connectionmv4 connection =new Connectionmv4();
				Connection con=connection.DBConnection();
			    Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery(showQuery);
				while(rs.next()) {
			    mvproduct=new  Movie(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getInt(5),rs.getString(6),rs.getString(7),rs.getString(8));
//					System.out.println(rs.getString(3));
			    movieList.add(mvproduct);
			  
				}
				 return movieList;
	}
				
    
		public static void searchmovie(Movie M1) throws SQLException, ClassNotFoundException {
			String showQuery="select * from movie where movie_id=? and movie_name=?";
			Connectionmv4 connection =new Connectionmv4();
			Connection con=connection.DBConnection();
		    PreparedStatement pstmt=con.prepareStatement( showQuery);
		    pstmt.setInt(1,M1.getMovie_id());
		    pstmt.setString(2,M1.getMovie_name());
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getInt(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getInt(5)+"\t"+rs.getString(6)+"\t"+rs.getString(7)+"\t"+rs.getString(8));
			}
		}


			
			
		
		
		public static void update(Movie M1 ) {
			
			String query="update Movie set Movie_type=? where Movie_id=?";
			Connection con;
			try {
				con = Connectionmv4.DBConnection();
				PreparedStatement pstmt = con.prepareStatement(query);
				pstmt.setString(1, M1.getMovie_type());
				pstmt.setInt(2,M1.getMovie_id());
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
		
	    public static void delete(Movie M1 )  {
			
		String query="delete from Movie where movie_id=? ";
			Connection con;
			try {
				con = Connectionmv4.DBConnection();
				PreparedStatement pstmt = con.prepareStatement(query);
				pstmt.setInt(1,M1.getMovie_id());
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


