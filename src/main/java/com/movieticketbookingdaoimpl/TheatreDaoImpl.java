package com.movieticketbookingdaoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



import com.Movieticketbooking.util.Connectionutil;
import com.movieticketbookingmodel.Theatreinformation;

public class TheatreDaoImpl {
	private static final PreparedStatement Pstmt = null;
	/*
	 * Insert Theater
	 */
	public void insert(Theatreinformation theatre) {
        StringBuilder query=new StringBuilder();
        query.append("insert into theatre(theatre_name, movie_id,number_seats,");
        query.append("theatre_address,theatre_rating,price,movie_date_time,images)");
        query.append(" values (?,?,?,?,?,?,?,?)");
        
		Connection con = null;
		PreparedStatement statement = null;
		try {
			con = Connectionutil.DBConnection();
			statement = con.prepareStatement(query.toString());
			statement.setString(1, theatre.getTheatrename());
			statement.setInt(2, theatre.getMovieid());
			statement.setInt(3, theatre.getNumberseats());
			statement.setString(4, theatre.getTheatreaddress());
			statement.setInt(5, theatre.getTheatrerating());
			statement.setInt(6, theatre.getPrice());
			statement.setTimestamp(7, java.sql.Timestamp.valueOf(theatre.getMoviedatetime()));
			statement.setString(8, theatre.getImages());
            statement.executeUpdate();
		
            
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			  e.getMessage();

		} finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}

		}
	}

	/*
	 * Show Theatre
	 */

	public List<Theatreinformation> showtheatre(int id) {
		
		StringBuilder showQuery=new StringBuilder();
		showQuery.append("select theatre_name,movie_id,theatre_id,number_seats,");
		showQuery.append("theatre_address,theatre_rating,price,movie_date_time,images");
		showQuery.append(" from theatre where movie_id =? ");
		
		List<Theatreinformation> movietheatre = new ArrayList<>();
		Theatreinformation mvtheatre = null;
		Connection con = null;
		PreparedStatement statement = null;
		ResultSet resultset = null;
		
		try {
			con = Connectionutil.DBConnection();
			statement = con.prepareStatement(showQuery.toString());
			statement.setInt(1, id);

			resultset = statement.executeQuery();
			while (resultset.next()) {
				mvtheatre = new Theatreinformation(resultset.getString("theatre_name"), resultset.getInt("movie_id"), resultset.getInt("theatre_id"),
						resultset.getInt("number_seats"), resultset.getString("theatre_address"), resultset.getInt("theatre_rating"), resultset.getInt("price"),
						resultset.getTimestamp("movie_date_time").toLocalDateTime(), resultset.getString("images"));
				        movietheatre.add(mvtheatre);

			}

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			  e.getMessage();
		} finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
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

		return movietheatre;

	}

	/*
	 * ShowTheatreDetails
	 */

	public List<Theatreinformation> showtheatredetails(int id) {
		
		StringBuilder showQuery=new StringBuilder();
		showQuery.append("select theatre_name,movie_id,theatre_id,number_seats,");
		showQuery.append("theatre_address,theatre_rating,price,movie_date_time,images");
		showQuery.append(" from theatre where theatre_id =? ");
	
		List<Theatreinformation> movietheatre = new ArrayList<>();
		Theatreinformation mvtheatre = null;
		Connection con = null;
		PreparedStatement statement = null;
		ResultSet resultset = null;
		
		try {
			con = Connectionutil.DBConnection();
			statement = con.prepareStatement(showQuery.toString());
			statement.setInt(1, id);

			resultset = statement.executeQuery();
			while (resultset.next()) {
				mvtheatre = new Theatreinformation(resultset.getString(1), resultset.getInt(2), resultset.getInt(3),
						resultset.getInt(4), resultset.getString(5), resultset.getInt(6), resultset.getInt(7),
						resultset.getTimestamp(8).toLocalDateTime(), resultset.getString(9));
				movietheatre.add(mvtheatre);

			}

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			  e.getMessage();
		} finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
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

		return movietheatre;

	}

	/*
	 * UpdateSeat
	 */
	public void updates(Theatreinformation theatres) {

		String query = "update theatre set number_seats=? where movie_id=? ";
		Connection con = null;
		PreparedStatement statement = null;

		try {
			con = Connectionutil.DBConnection();
			statement = con.prepareStatement(query);
			statement.setInt(1, theatres.getNumberseats());
			statement.setInt(2, theatres.getMovieid());
		    statement.executeUpdate();

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			  e.getMessage();
		} finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}

		}
	}
	/*
	 * Seatupdate
	 */

	public void seatupdate(int seat, int mvid) {
		String query = "update theatre set number_seats= number_seats+? where Theatre_id=? ";
		Connection con = null;
		PreparedStatement statement = null;
		try {
			con = Connectionutil.DBConnection();
			statement = con.prepareStatement(query);
			statement.setInt(1, seat);
			statement.setInt(2, mvid);
		    statement.executeUpdate();
			
		} catch (Exception e) {
			  e.getMessage();
		} finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}

		}
	}

	/*
	 * UpdateTheatre
	 */

	public void update(Theatreinformation theatre) {

		Connection con = null;
		PreparedStatement statement = null;
		String query = "update theatre set theatre_name=?, price=? where theatre_id=?";

		try {
			con = Connectionutil.DBConnection();
			statement = con.prepareStatement(query);
			statement.setString(1, theatre.getTheatrename());
			statement.setInt(2, theatre.getPrice());
			statement.setInt(3, theatre.getTheatreid());
		    statement.executeUpdate();

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (Exception e) {

			  e.getMessage();
		} finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}

		}
	}

	/*
	 * DeleteTheatre
	 */
	public void delete(Theatreinformation theatre) {
		Connection con = null;
		PreparedStatement statement = null;
		String query = "delete from theatre where theatre_id=? ";

		try {
			con = Connectionutil.DBConnection();
			statement = con.prepareStatement(query);
			statement.setInt(1, theatre.getTheatreid());
		    statement.executeUpdate();

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (Exception e) {

			  e.getMessage();
		} finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}

		}
	}

	/*
	 * Moviedetail
	 */

	public static List<Theatreinformation> moviedetail() {
		StringBuilder query=new StringBuilder();
		query.append("select theatre_name,movie_id,theatre_id,number_seats,theatre_adddress,theatre_rating,");
		query.append("movie_date_time,price,images from theatre");
		List<Theatreinformation> moviedetail = new ArrayList<>();
		ResultSet resultset = null;
		Statement statement = null;
		Connection con = null;
		try {
			con = Connectionutil.DBConnection();
			statement = con.createStatement();
			resultset = statement.executeQuery(query.toString());
            while(resultset.next()) {
            	 
            	moviedetail.add(new Theatreinformation(resultset.getString(1), resultset.getInt(2), resultset.getInt(3),
						resultset.getInt(4), resultset.getString(5), resultset.getInt(6), resultset.getInt(7),
						resultset.getTimestamp(8).toLocalDateTime(), resultset.getString(9)));	
            }
		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		} catch (SQLException e) {

			  e.getMessage();
		} 
		 finally {
				
				if (resultset != null) {
					try {
						resultset.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}

				if (statement != null) {
					try {
						statement.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				if (con != null) {
					try {
						con.close();
					} catch (SQLException e) {

						e.printStackTrace();
					}
				}
				
			}
		return moviedetail;
	}
    
	
	
	/*
	 * Theatreinformation
	 */
	public int fetch(Theatreinformation theatres) {

		Connection con = null;
		PreparedStatement statement = null;
		ResultSet resultset = null;

		String query = "Select  number_seats from theatre  where theatre_id=? ";
		try {
			con = Connectionutil.DBConnection();
			statement = con.prepareStatement(query);
			statement.setInt(1, theatres.getTheatreid());
			resultset = statement.executeQuery();
			while (resultset.next()) {
            return resultset.getInt(1);
			}
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			  e.getMessage();
		} finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
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

		return -1;
	}

	/*
	 * Updateseat
	 */

	public void updateseat(int seat, int thid) {
		Connection con = null;
		PreparedStatement statement = null;
        String query = "update theatre set number_seats= ? where  theatre_id=? ";

		try {
			con = Connectionutil.DBConnection();
			statement = con.prepareStatement(query);
		    statement.setInt(1, seat);
			statement.setInt(2, thid);
		    statement.executeUpdate();
		
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (Exception e) {

			  e.getMessage();
		} finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}

		}
	}
}
