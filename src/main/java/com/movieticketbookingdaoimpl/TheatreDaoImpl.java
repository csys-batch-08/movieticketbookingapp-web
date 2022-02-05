package com.movieticketbookingdaoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.Movieticketbooking.util.Connectionutil;
import com.movieticketbookingmodel.Theatreinformation;

public class TheatreDaoImpl {
	private static final PreparedStatement Pstmt = null;
	private static final Logger logger = LoggerFactory.getLogger(TheatreDaoImpl.class);

	/*
	 * Insert Theater
	 */
	public void insert(Theatreinformation theatre) {

		String query = "insert into theatre(theatre_name, movie_id,number_seats,theatre_address,theatre_rating,price,movie_date_time,images) values (?,?,?,?,?,?,?,?)";
		Connection con = null;
		PreparedStatement statement = null;
		try {
			con = Connectionutil.DBConnection();
			statement = con.prepareStatement(query);
			statement.setString(1, theatre.getTheatrename());
			statement.setInt(2, theatre.getMovieid());
			statement.setInt(3, theatre.getNumberseats());
			statement.setString(4, theatre.getTheatreaddress());
			statement.setInt(5, theatre.getTheatrerating());
			statement.setInt(6, theatre.getPrice());
			statement.setTimestamp(7, java.sql.Timestamp.valueOf(theatre.getMoviedatetime()));
			statement.setString(8, theatre.getImages());

			int i = statement.executeUpdate();

		//	logger.info(i + "rows inserted successfully");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
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

		List<Theatreinformation> movietheatre = new ArrayList<>();
		Theatreinformation mvtheatre = null;
		Connection con = null;
		PreparedStatement statement = null;
		ResultSet resultset = null;
		String showQuery = "select * from theatre where movie_id =? ";

		try {
			con = Connectionutil.DBConnection();
			statement = con.prepareStatement(showQuery);
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

			e.printStackTrace();
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

		List<Theatreinformation> movietheatre = new ArrayList<>();
		Theatreinformation mvtheatre = null;
		Connection con = null;
		PreparedStatement statement = null;
		ResultSet resultset = null;
		String showQuery = "select * from theatre where theatre_id =? ";

		try {
			con = Connectionutil.DBConnection();
			statement = con.prepareStatement(showQuery);
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

			e.printStackTrace();
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
	public void update1(Theatreinformation theatres) {

		String query = "update theatre set number_seats=? where movie_id=? ";
		Connection con = null;
		PreparedStatement statement = null;

		try {
			con = Connectionutil.DBConnection();
			statement = con.prepareStatement(query);
			statement.setInt(1, theatres.getNumberseats());
			statement.setInt(2, theatres.getMovieid());
			int i = statement.executeUpdate();

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
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
			int i = statement.executeUpdate();
			
		} catch (Exception e) {
			
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
		String query = "update theatre set theatre_name=?, price=? where theatre_id=?  ";

		try {
			con = Connectionutil.DBConnection();
			statement = con.prepareStatement(query);
			statement.setString(1, theatre.getTheatrename());
			statement.setInt(2, theatre.getPrice());
			statement.setInt(3, theatre.getTheatreid());
			int i = statement.executeUpdate();

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (Exception e) {

			e.printStackTrace();
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
	public void delete(Theatreinformation theatre3) {
		Connection con = null;
		PreparedStatement statement = null;
		String query = "delete from theatre where theatre_id=? ";

		try {
			con = Connectionutil.DBConnection();
			statement = con.prepareStatement(query);
			statement.setInt(1, theatre3.getTheatreid());
			int i = statement.executeUpdate();

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (Exception e) {

			e.printStackTrace();
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

	public static ResultSet moviedetail() {
		String query = "select * from theatre";
		ResultSet resultset = null;
		Statement statement = null;
		Connection con = null;
		try {
			con = Connectionutil.DBConnection();
			statement = con.createStatement();
			resultset = statement.executeQuery(query);

		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		} catch (SQLException e) {

			e.printStackTrace();
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
		return resultset;
	}

	/*
	 * Theatreinformation
	 */
	public int fetch(Theatreinformation theatres1) {

		Connection con = null;
		PreparedStatement statement = null;
		ResultSet resultset = null;

		String query = "Select  number_seats from theatre  where theatre_id=? ";
		try {
			con = Connectionutil.DBConnection();
			statement = con.prepareStatement(query);
			statement.setInt(1, theatres1.getTheatreid());
			resultset = statement.executeQuery();
			while (resultset.next()) {
            return resultset.getInt(1);
			}
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
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
			int i = statement.executeUpdate();
		
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (Exception e) {

			e.printStackTrace();
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
