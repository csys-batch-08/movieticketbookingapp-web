package com.MovieTicketBookingDao;

import java.sql.ResultSet;
import java.util.List;

public interface User {
	public void insert(User use);
	
	public  User validateUser(String useremail, String userpassword);
	
	public ResultSet getEmail(User email);
	
	public String fetch(User userpasscheck) ;
	
	public void updateUser(User user) ;
	
	public User updateUser1(User user2);
	
	public void getwallet(User user);
	
	public void refundwallet(int userid, int totalprice);
	
	public int updatewallet(User user);
	
	public int walletbalance(int userid);
	
	public List<User> showUser();

	public int user(User user);
	
	public List<User> currentUser1(User obj);


}
