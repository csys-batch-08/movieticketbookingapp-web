package com.MovieTicketBookingDao;

import java.sql.ResultSet;
import java.util.List;



public interface Movie {

	public void insert(Movie movie) ;
	
    public List<Movie> search(String moviename) ;
 
	public void update(Movie movie) ;
	
	public void delete(Movie movie);
	
	public String movie(Movie movie);
	
	public List<Movie> showMovie();
	 
	public ResultSet getmovie() ;
	 
	 
}
