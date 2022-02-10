package com.movieticketbookingdaoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;

import com.Movieticketbooking.util.Connectionutil;
import com.movieticketbookingmessage.Mailer;
import com.movieticketbookingmodel.Bookingdetail;

public class BookingDaoImpl {

	/*
	 * Insert Bookingdetail
	 */
	public void insert(Bookingdetail booking) {
		StringBuilder query = new StringBuilder();
		query.append("insert into booking_detail(user_id,theatre_id,no_insert into booking_detail");
		query.append("(userseats,total_amount,movie_name,booking_Date) values (?,?,?,?,?,sysdate)");
		Connection con = null;
		PreparedStatement statement = null;

		try {
			con = Connectionutil.DBConnection();
			statement = con.prepareStatement(query.toString());
			statement.setInt(1, booking.getUserid());
			statement.setInt(2, booking.getTheatreid());
			statement.setInt(3, booking.getNoseat());
			statement.setInt(4, booking.getTotalamount());
			statement.setString(5, booking.getMoviename());

			boolean flag = statement.executeUpdate() > 0;
			if (flag) {
				Mailer.send("sachinraj6878@gmail.com", "sachinraj@089", "sachinraj64979@gmail.com", "Movie Booking",
						"Your Ticket Booking Confirmed");
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

		}
	}

	/*
	 * Booking Cancel
	 */
	public void update(Bookingdetail booking) {

		Connection con = null;
		PreparedStatement statement = null;
		String query = "update booking_detail set booking_status=? where booking_id=? ";

		try {
			con = Connectionutil.DBConnection();
			statement = con.prepareStatement(query);
			statement.setString(1, booking.getBookingstatus());
			statement.setInt(2, booking.getBookingid());
			boolean flag = statement.executeUpdate() > 0;
			if (flag) {
				Mailer.send("sachinraj6878@gmail.com", "sachinraj@089", "sachin64979@gmail.com", "Movie Booking",
						"Your Ticket Booking Cancelled");
			}

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
	 * BookingDelete
	 */
	public int delete(Bookingdetail booking) {
		Connection con = null;
		PreparedStatement statement = null;
		String query = "delete from theatre where Booking_id=? ";

		try {
			con = Connectionutil.DBConnection();
			statement = con.prepareStatement(query);
			statement.setInt(1, booking.getBookingid());
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

		return 0;
	}

	/*
	 * BookingHistory Admin
	 */

	public List<Bookingdetail> showBooking() {
		StringBuilder showQuery = new StringBuilder();
		showQuery.append("select  booking_id,user_id,theatre_id,No_seats,Total_amount,booking_status,");
		showQuery.append("movie_name,booking_date  from booking_detail");

		Connection con = null;
		Statement statement = null;
		ResultSet resultset = null;
		List<Bookingdetail> booking = new ArrayList<>();
		Bookingdetail mvtheatre1 = null;

		try {
			con = Connectionutil.DBConnection();
			statement = con.createStatement();
			resultset = statement.executeQuery(showQuery.toString());
			while (resultset.next()) {
				mvtheatre1 = new Bookingdetail(resultset.getInt(1), resultset.getInt(2), resultset.getInt(3),
						resultset.getInt(4), resultset.getInt(5), resultset.getString(6), resultset.getString(7),
						resultset.getDate(8));
				booking.add(mvtheatre1);

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
		return booking;

	}

	/*
	 * BookingStatus
	 */
	public void book(int booking) {

		String query = "Update booking_detail set booking_status='Cancel' where booking_id=? ";
		Connection con = null;
		PreparedStatement statement = null;

		try {
			con = Connectionutil.DBConnection();
			statement = con.prepareStatement(query);

			statement.setInt(1, booking);
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

//Booking

	public List<Bookingdetail> getbookingdate(int thid, int userid) {
		StringBuilder query = new StringBuilder();
		query.append("select booking_id,user_id,theatre_id,no_seats,total_amount,booking_status,");
		query.append("movie_name,booking_date from booking_detail where theatre_id =? and user_id=? ");
		query.append("order by booking_id desc");
		List<Bookingdetail> bookingdetails = new ArrayList<>();

		ResultSet resultset = null;
		Connection con = null;
		PreparedStatement statement = null;

		try {
			con = Connectionutil.DBConnection();
			statement = con.prepareStatement(query.toString());
			statement.setInt(1, thid);
			statement.setInt(2, userid);
			resultset = statement.executeQuery();
			while (resultset.next()) {
				bookingdetails.add(new Bookingdetail(resultset.getInt(1), resultset.getInt(2), resultset.getInt(3),
						resultset.getInt(4), resultset.getInt(5), resultset.getString(7), resultset.getDate(8)));
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

		return bookingdetails;
	}

	public String checkBookingStatus(int bookingid) {

		String query = "Select booking_status from booking_detail where booking_id=? ";
		Connection con = null;
		PreparedStatement statement = null;
		ResultSet resultset = null;
		try {
			con = Connectionutil.DBConnection();
			statement = con.prepareStatement(query);
			statement.setInt(1, bookingid);
			resultset = statement.executeQuery();
			while (resultset.next()) {
				return resultset.getString(1);
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
				if (resultset != null) {
					try {

						resultset.close();

					} catch (SQLException e) {

						e.printStackTrace();
					}
				}
			}

		}
		return null;
	}

	/*
	 * Mybooking
	 */

	public List<Bookingdetail> myBooking(int userId) {
		StringBuilder showQuery = new StringBuilder();
		showQuery.append("select booking_id,user_id,theatre_id,No_seats,Total_amount,booking_status,");
		showQuery.append("movie_name,booking_date from booking_detail where user_id='"+userId+"'");
		List<Bookingdetail> bookinglist = new ArrayList<>();
		Bookingdetail mvtheatre1 = null;
		ResultSet resultset = null;
		Connection con = null;
		Statement statement = null;

		try {
			con = Connectionutil.DBConnection();
			statement = con.createStatement();
			resultset = statement.executeQuery(showQuery.toString());
			while (resultset.next()) {
				mvtheatre1 = new Bookingdetail(resultset.getInt(1), resultset.getInt(2), resultset.getInt(3),
						resultset.getInt(4), resultset.getInt(5), resultset.getString(6), resultset.getString(7),
						resultset.getDate(8));

				bookinglist.add(mvtheatre1);

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

		return bookinglist;

	}

}
