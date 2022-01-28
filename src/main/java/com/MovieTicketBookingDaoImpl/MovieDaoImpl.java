package com.MovieTicketBookingDaoImpl;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.MovieticketBookingModel.Movie;
import com.MovieticketBookingModel.User;
import com.Movieticketbooking.util.Connectionmv4;

public class MovieDaoImpl {
	 private static final String Movie = null;

	public void insert(Movie Movie )  {
	           String  query="insert into Movie(Movie_name,Movie_id,Movie_type,movie_ratings,movie_duration,director,music_director,hero_name,images,movielink) values (?,?,?,?,?,?,?,?,?,?)";
			    Connection con;
		try {
				con = Connectionmv4.DBConnection();
				PreparedStatement pstmt = con.prepareStatement(query);
				pstmt.setString(1, Movie.getMoviename());
				pstmt.setInt(2, Movie.getMovieid());
				pstmt.setString(3, Movie.getMovietype());
				pstmt.setInt(4, Movie.getMovieratings() );
				pstmt.setInt(5, Movie.getMovieduration());
				pstmt.setString(6, Movie.getDirector());
				pstmt.setString(7, Movie.getMusicdirector());
				pstmt.setString(8, Movie.getHeroname());
				pstmt.setString(9, Movie.getImages());
				pstmt.setString(10, Movie.getMovielink());
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
			
	public List<Movie> Search( String moviename) throws ClassNotFoundException, SQLException 
	{
			
				List<Movie> viewmoviess=new ArrayList<Movie>();
				Movie mvproduct=null;
			//	System.out.println("1");
				String showQuery="Select Movie_name,Movie_id,Movie_type,Movie_duration,Director,Music_director,Hero_name,Images from  Movie where Movie_name = ?";
				Connectionmv4 connection =new Connectionmv4();
				Connection con=connection.DBConnection();
				 PreparedStatement ps =con.prepareStatement(showQuery);
				 ps.setString(1, moviename);
				 ResultSet rs=ps.executeQuery();
				//	System.out.println("2");

				while(rs.next()) 
				{
					System.out.println("3");

			    mvproduct=new  Movie(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
			    viewmoviess.add(mvproduct);
			     System.out.println(rs.getInt(2));
				}
				return viewmoviess;        
	}		
    
 	public  void searchmovie(Movie Movie1)  {
 		
			String showQuery="Select * from movie where movie_id=? and movie_name=?";
			Connectionmv4 connection =new Connectionmv4();
			Connection con;
			try {
				con = connection.DBConnection();
				PreparedStatement pstmt=con.prepareStatement( showQuery);
			    pstmt.setInt(1,Movie1.getMovieid());
			    pstmt.setString(2,Movie1.getMoviename());
				ResultSet rs=pstmt.executeQuery();
				while(rs.next()) {
				System.out.println("movie name : "  + rs.getString(1)+"\t"+"movie id :" +rs.getInt(2)+ "\t" +"movietype:"+rs.getString(3)+"\t"+"movieratings:"+rs.getInt(4)+"\t"+"movie duration:"+rs.getInt(5)+"\t"+"Director:"+rs.getString(6)+"\t"+"music director:"+rs.getString(7)+"\t"+"Hero name:"+rs.getString(8));
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		}


			
			
		
	public  void update(Movie Movie2 ) {
			
			    String query="update Movie set Movie_name=?,Movie_type=?,movie_duration=? where Movie_id=?";
		     	Connection con;
	   try {
				con = Connectionmv4.DBConnection();
				PreparedStatement pstmt = con.prepareStatement(query);
				pstmt.setString(1, Movie2.getMoviename());
				pstmt.setString(2, Movie2.getMovietype());
				//pstmt.setInt(3, Movie2.getMovie_ratings());
				pstmt.setInt(3, Movie2.getMovieduration());
				//pstmt.setString(5, Movie2.getDirector());
				//pstmt.setString(6, Movie2.getMusic_director());
				//pstmt.setString(7,Movie2.getHero_name());
				
				pstmt.setInt(4,Movie2.getMovieid());
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
	
	
	
	 public void delete(Movie Movie3 )  {
			
		        String query="delete from Movie where movie_id=? ";
			    Connection con;
		try {
				con = Connectionmv4.DBConnection();
				PreparedStatement pstmt = con.prepareStatement(query);
				pstmt.setInt(1,Movie3.getMovieid());
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
		public List<Movie> showMovie() throws ClassNotFoundException, SQLException {
			
			List<Movie> movieList=new ArrayList<Movie>();
			Movie mvproduct=null;
			
			String showQuery="select * from movie";
			Connectionmv4 connection =new Connectionmv4();
			Connection con=connection.DBConnection();
		    Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(showQuery);
			while(rs.next()) {
		    mvproduct=new  Movie(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getInt(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10));
			System.out.println(rs.getString(1));
			//System.out.println();
		    movieList.add(mvproduct);
		  
			}
			 return movieList;		
	 }
		public ResultSet getmovie() throws SQLException, ClassNotFoundException {
			String query="Select * from Movie";
			Connection con;
			con = Connectionmv4.DBConnection();
			PreparedStatement pstmt=con.prepareStatement(query);
			ResultSet rs=pstmt.executeQuery();
			return rs;
			
		}
		
		
		public String movie(Movie movie5) {
			String query="Select Movie_name from Movie where Movie_id=? ";
			Connection con;
			try {
				con = Connectionmv4.DBConnection();
				PreparedStatement Pstmt1 = con.prepareStatement(query);
				
				Pstmt1.setInt(1, movie5.getMovieid());

				ResultSet rs = Pstmt1.executeQuery();
				while(rs.next()) {
					return rs.getString(1);
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
}


