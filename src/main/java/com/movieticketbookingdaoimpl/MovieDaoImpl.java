package com.movieticketbookingdaoimpl;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Movieticketbooking.util.Connectionutil;
import com.movieticketbookingmodel.Movie;

public class MovieDaoImpl {
	private static final String Movie = null;

	/*
	 * Insert Movie
	 */
	public void insert(Movie movie) {
		String query = "insert into Movie(Movie_name,Movie_id,Movie_type,movie_ratings,movie_duration,director,music_director,hero_name,images,movielink) values (?,?,?,?,?,?,?,?,?,?)";
		Connection con = null;
		PreparedStatement statement = null;
		try {
			con = Connectionutil.DBConnection();
			statement = con.prepareStatement(query);
			statement.setString(1, movie.getMoviename());
			statement.setInt(2, movie.getMovieid());
			statement.setString(3, movie.getMovietype());
			statement.setInt(4, movie.getMovieratings());
			statement.setInt(5, movie.getMovieduration());
			statement.setString(6, movie.getDirector());
			statement.setString(7, movie.getMusicdirector());
			statement.setString(8, movie.getHeroname());
			statement.setString(9, movie.getImages());
			statement.setString(10, movie.getMovielink());
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
	 * SearchMovie
	 */

	public List<Movie> search(String moviename) {
		Connection con = null;
		PreparedStatement statement = null;
		ResultSet resultset = null;

		List<Movie> viewmoviess = new ArrayList<>();
		Movie mvproduct = null;
		String showQuery = "Select Movie_name,Movie_id,Movie_type,Movie_duration,Director,Music_director,Hero_name,Images from  Movie where Movie_name = ?";
		try {
			con = Connectionutil.DBConnection();
			statement = con.prepareStatement(showQuery);
			statement.setString(1, moviename);
			resultset = statement.executeQuery();
			while (resultset.next()) {

				mvproduct = new Movie(resultset.getString(1), resultset.getInt(2), resultset.getString(3),
						resultset.getInt(4), resultset.getString(5), resultset.getString(6), resultset.getString(7),
						resultset.getString(8));
				viewmoviess.add(mvproduct);

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
				if (resultset != null) {
					try {
						resultset.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}

			}

		}

		return viewmoviess;
	}

	/*
	 * Update Movie
	 */

	public void update(Movie movie2) {

		String query = "update Movie set Movie_name=?,Movie_type=?,movie_duration=? where Movie_id=?";
		Connection con = null;
		PreparedStatement statement = null;
		try {
			con = Connectionutil.DBConnection();
			statement = con.prepareStatement(query);
			statement.setString(1, movie2.getMoviename());
			statement.setString(2, movie2.getMovietype());
			statement.setInt(3, movie2.getMovieduration());
			statement.setInt(4, movie2.getMovieid());

			int i = statement.executeUpdate();
			System.out.println(i + "rows update successfully");
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
	 * Delete Movie
	 */

	public void delete(Movie movie) {

		String query = "delete from Movie where movie_id=? ";
		Connection con = null;
		PreparedStatement statement = null;
		try {
			con = Connectionutil.DBConnection();
			statement = con.prepareStatement(query);
			statement.setInt(1, movie.getMovieid());
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
	 * ShowMovie
	 */

	public List<Movie> showMovie() {

		List<Movie> movieList = new ArrayList<>();
		Movie mvproduct = null;
		Connection con = null;
		Statement statement = null;
		ResultSet resultset = null;
		String showQuery = "select movie_name,movie_id,movie_type,movie_ratings,movie_duration,director,music_director,hero_name,images,movielink from movie";

		try {
			con = Connectionutil.DBConnection();
			statement = con.createStatement();
			resultset = statement.executeQuery(showQuery);
			while (resultset.next()) {
				mvproduct = new Movie(resultset.getString(1), resultset.getInt(2), resultset.getString(3),
						resultset.getInt(4), resultset.getInt(5), resultset.getString(6), resultset.getString(7),
						resultset.getString(8), resultset.getString(9), resultset.getString(10));
				movieList.add(mvproduct);

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
				if (resultset != null) {
					try {
						resultset.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}

			}

		}

		return movieList;
	}

	/*
	 * Movie
	 */
	public ResultSet getmovie() {
		String query = "Select movie_name,movie_id,movie_type,movie_ratings,movie_duration,director,music_director,hero_name  from Movie";
		Connection con = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			con = Connectionutil.DBConnection();
			statement = con.prepareStatement(query);
			resultSet = statement.executeQuery();

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return resultSet;
	}

	public String movie(Movie movie) {
		String query = "Select Movie_name from Movie where Movie_id=? ";
		Connection con = null;
		PreparedStatement statement = null;
		ResultSet resultset = null;
		try {
			con = Connectionutil.DBConnection();
			statement = con.prepareStatement(query);
			statement.setInt(1, movie.getMovieid());
			resultset = statement.executeQuery();
			while (resultset.next()) {
				return resultset.getString(1);
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
}