package com.movieticketbookingdaoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.Movieticketbooking.util.Connectionutil;
import com.movieticketbookingmessage.Mailer;
import com.movieticketbookingmodel.Bookingdetail;
import com.movieticketbookingmodel.Movie;
import com.movieticketbookingmodel.Theatreinformation;
import com.movieticketbookingmodel.User;

public class BookingDaoImpl {
	
/*
 * Insert Bookingdetail	
 */
	public void insert(Bookingdetail booking) {
		Connection con=null;
		PreparedStatement statement=null;
	       String  query="insert into booking_detail(user_id,theatre_id,no_seats,total_amount,movie_name,booking_Date) values (?,?,?,?,?,sysdate)";

	    try {
			  	con = Connectionutil.DBConnection();			
				statement = con.prepareStatement(query);
				statement.setInt(1,booking.getUserid());
				statement.setInt(2,booking.getTheatreid());
				statement.setInt(3,booking.getNoseat());
				statement.setInt(4,booking.getTotalamount());
				statement.setString(5, booking.getMoviename());
				
				boolean flag = statement.executeUpdate()>0;
				if(flag) {
				Mailer.send("sachinraj6878@gmail.com", "sachinraj@089", "sachinraj64979@gmail.com", "Movie Booking", "Your Ticket Booking Confirmed");
		    }
				
			} catch (ClassNotFoundException e) {
			
				e.printStackTrace();
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
	    finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
				
					e.printStackTrace();
				}
			}
			
		}
	}

/*
 * Booking Cancel	
 */
	public void update(Bookingdetail booking)  {
		

		    Connection con=null;
		    PreparedStatement statement=null;
		    String query="update booking_detail set booking_status=? where booking_id=? ";

		try {
		    con = Connectionutil.DBConnection();
		    statement = con.prepareStatement(query);
			statement.setString(1, booking.getBookingstatus());
			statement.setInt(2, booking.getBookingid());
			boolean flag  = statement.executeUpdate()>0;
			if(flag) {
				Mailer.send("sachinraj6878@gmail.com", "sachinraj@089", "sachin64979@gmail.com", "Movie Booking", "Your Ticket Booking Cancelled");
		}

		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		 finally {
				if (statement != null) {
					try {
						statement.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				if(con != null) {
					try {
						con.close();
					} catch (SQLException e) {
					
						e.printStackTrace();
					}
				}
				
			}
	}
/*
 * BookingDelete	
 */
      public int delete(Bookingdetail booking )  {
    	    Connection con=null;
		    PreparedStatement statement=null;
	        String query="delete from theatre where Booking_id=? ";
		
		try {
		     con = Connectionutil.DBConnection();
             statement = con.prepareStatement(query);
		     statement.setInt(1,booking.getBookingid());
	         int i = statement.executeUpdate();
		
   		   
		  } catch (ClassNotFoundException e) {
		
			  e.printStackTrace();
		  } catch (SQLException e) {
		
			  e.printStackTrace();
		  }
		 finally {
				if (statement != null) {
					try {
						statement.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				if(con != null) {
					try {
						con.close();
					} catch (SQLException e) {
					
						e.printStackTrace();
					}
				}
				
			}
		
		    return 0; 
      }
		  
		
		  
		  
/*
 * BookingHistory Admin	
 */
		  
	 public List<Bookingdetail> showBooking()  {
	       	 Connection con=null;
	         Statement statement=null;
	         ResultSet resultset=null;
		      List<Bookingdetail> booking=new ArrayList<Bookingdetail>();
	           Bookingdetail mvtheatre1=null;
	        	String showQuery="select  booking_id,user_id,theatre_id,No_seats,Total_amount,booking_status,movie_name,booking_date  from booking_detail";
		
		    try {  
		       con=Connectionutil.DBConnection();
		       statement=con.createStatement();
		       resultset=statement.executeQuery(showQuery);
		       while(resultset.next()) {
               mvtheatre1=new  Bookingdetail(resultset.getInt(1),resultset.getInt(2),resultset.getInt(3),resultset.getInt(4),resultset.getInt(5),resultset.getString(6),resultset.getString(7),resultset.getDate(8));
               booking.add(mvtheatre1);
	  
		        }
		       
			  } catch (ClassNotFoundException e) {
			
				  e.printStackTrace();
			  } catch (SQLException e) {
			
				  e.printStackTrace();
			  }
		    finally {
				if (statement != null) {
					try {
						statement.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				if(con != null) {
					try {
						con.close();
					} catch (SQLException e) {
					
						e.printStackTrace();
					}
				}
				if (resultset != null) {
					try {
						resultset.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				
			}
		       return booking;
			
		  }
		  
/*
 * BookingStatus		  
 */
	   public void book(int booking) {
		   
		 
		   
				String query="Update booking_detail set booking_status='Cancel' where booking_id=? ";
				Connection con=null;
				PreparedStatement statement =null;
				
		try {
			    con = Connectionutil.DBConnection();
			    statement = con.prepareStatement(query);
			    
				statement.setInt(1,booking);
				int i = statement.executeUpdate();
									
		    } catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			} catch (SQLException e) {
					
				e.printStackTrace();
			}
		finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
				
					e.printStackTrace();
				}
			}
			
		}	
		
			}
			
			
//Booking
	   
		  public List<Bookingdetail> getbookingidanddate(int thid,int userid)  {
			  List<Bookingdetail> bookingdetails = new ArrayList<>();
			  String query="select  *  from booking_detail where theatre_id =? and user_id=? order by booking_id desc";
			  ResultSet resultset=null;
			  Connection con=null;
			  PreparedStatement statement=null;
			  
			  try {
				con = Connectionutil.DBConnection();
				statement = con.prepareStatement(query);
			    statement.setInt(1, thid);
	      		statement.setInt(2, userid);
				resultset=statement.executeQuery();
				  while(resultset.next()) {
					  bookingdetails.add(new Bookingdetail(resultset.getInt(1),resultset.getInt(2),resultset.getInt(3),resultset.getInt(4),resultset.getInt(5),resultset.getString(7),resultset.getDate(8)));
				  }
			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			} catch (SQLException e) {

				e.printStackTrace();
			}
			  finally {
					if (statement != null) {
						try {
							statement.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
					if(con != null) {
						try {
							con.close();
						} catch (SQLException e) {
						
							e.printStackTrace();
						}
					}
					if (resultset != null) {
						try {
							resultset.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
					
				}
			
			  return bookingdetails;
		  }
		  
		  
		  
		  

		  
		  
/*
 * Mybooking	
 */
		  
		  public List<Bookingdetail> MyBooking(int userId)  {
			   List<Bookingdetail> bookinglist=new ArrayList<Bookingdetail>();
	           Bookingdetail mvtheatre1=null;
	           ResultSet resultset=null;
	           Connection con=null;
	           Statement statement=null;
	           
		       String showQuery="select booking_id,user_id,theatre_id,No_seats,Total_amount,booking_status,movie_name,booking_date  from booking_detail where user_id='"+userId+"'";
		       
		       try {
				con=Connectionutil.DBConnection();
				statement=con.createStatement();
			    resultset=statement.executeQuery(showQuery);
			    while(resultset.next()) {
	            mvtheatre1=new  Bookingdetail(resultset.getInt(1),resultset.getInt(2),resultset.getInt(3),resultset.getInt(4),resultset.getInt(5),resultset.getString(6),resultset.getString(7),resultset.getDate(8));

	             bookinglist.add(mvtheatre1);
		  
			  }
			} catch (ClassNotFoundException e) {
			
				e.printStackTrace();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		       finally {
					if (statement != null) {
						try {
							statement.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
					if(con != null) {
						try {
							con.close();
						} catch (SQLException e) {
						
							e.printStackTrace();
						}
					}
					if (resultset != null) {
						try {
							resultset.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
					
				}
			
		       
		       return bookinglist;
			
		  } 
		  
		  
	      }
