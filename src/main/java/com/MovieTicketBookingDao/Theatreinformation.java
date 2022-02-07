package com.MovieTicketBookingDao;

import java.util.List;


public interface Theatreinformation {
	public void insert(Theatreinformation theatre ) ;
	
	public void updates(Theatreinformation theatres)  ;
	
	public void update(Theatreinformation theatre);
	
	public void delete(Theatreinformation theatre); 
	
	public void seatupdate(int seat, int mvid); 
	
	public int fetch(Theatreinformation theatres);
	
	public void updateseat(int seat, int thid) ;
	 
    public  void findmytheatre(Theatreinformation m1) ;
	 
    public List<Theatreinformation> showtheatre(int id); 
	
	public List<Theatreinformation> showtheatredetails(int id) ;
	 

}
