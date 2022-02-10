package com.movieticketbookingdaoimpl;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Movieticketbooking.util.Connectionutil;
import com.movieticketbookingmodel.User;

public class UserDaoImpl {
	
/*
 User Register	
 */
	public int insert(User use) {
		int i = 0;
		StringBuilder query=new StringBuilder();
		query.append("insert into user_details(user_name,gender,email_id,mobile_num,e_password)");
		query.append("values (?,?,?,?,?)");
	
		Connection con = null;
		PreparedStatement statement = null;
		try {
			con = Connectionutil.DBConnection();
			statement = con.prepareStatement(query.toString());
			statement.setString(1, use.getUsername());
			statement.setString(2, use.getGender());
			statement.setString(3, use.getEmailid());
			statement.setLong(4, use.getMobilenum());
			statement.setString(5, use.getEpassword());
			i = statement.executeUpdate();

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

		return i;
	}

/*
 Validate User	
 */
	
	public String validateUser(String email, String password) {
		Connection con = null;
		PreparedStatement statement = null;
		ResultSet resultset = null;

		try {
			con = Connectionutil.DBConnection();

			String query = "select user_role from user_details where email_id=? and e_password=?";
			statement = con.prepareStatement(query);
			statement.setString(1, email);
			statement.setString(2, password);
			resultset = statement.executeQuery();
			while(resultset.next()) {
			return resultset.getString(1);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.getMessage();
		} finally {
			
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
		return "invalid";

	}

/*
 Email Validate	
 */
	public String getEmail(User email) {
		String query = "select * from user_details where email_id = ?";
		Connection con = null;
		PreparedStatement statement = null;
		ResultSet resultset = null;
		String useremail=null;
		try {
			con = Connectionutil.DBConnection();
			statement = con.prepareStatement(query);
			statement.setString(1, email.getEmailid());
			resultset = statement.executeQuery();
			while(resultset.next()) {
				useremail=resultset.getString("Email_id");
			}
		} catch (SQLException | ClassNotFoundException e) {

			e.printStackTrace();
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
		
		return useremail;
	}

	public Long getmobile(User mobile) {
		String query = "select * from user_details where mobile_num = ?";
		Connection con = null;
		PreparedStatement statement = null;
		ResultSet resultset = null;
		Long usermobile=-1l;
		try {
			con = Connectionutil.DBConnection();
			statement = con.prepareStatement(query);
			statement.setLong(1, mobile.getMobilenum());
			resultset = statement.executeQuery();
			while(resultset.next()) {
	
				usermobile=resultset.getLong("mobile_num");
			}
		} catch (SQLException | ClassNotFoundException e) {

			e.printStackTrace();
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
		return usermobile;
	}

/*
 Password Validate	
 */
	
	public String fetch(User userpasscheck) {
		String query = "select Email_id,e_password from user_details where Email_id = ? and e_password = ?";
		Connection con = null;
		ResultSet resultset = null;
		PreparedStatement statement = null;
		try {
			con = Connectionutil.DBConnection();

			statement = con.prepareStatement(query);
			statement.setString(1, userpasscheck.getEmailid());
			statement.setString(2, userpasscheck.getEpassword());
			resultset = statement.executeQuery();
			return "correct";
		} catch (SQLException | ClassNotFoundException e) {

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
		return "incorrect";
	}

/*
 Update Password	
 */
	
	public void updateUser(User user) {

		PreparedStatement statement = null;
		Connection con = null;

		try {
			con = Connectionutil.DBConnection();
			String updateQuery = "update user_details set e_password=? where email_id=?";
			statement = con.prepareStatement(updateQuery);
			statement.setString(1, user.getEpassword());
			statement.setString(2, user.getEmailid());
			statement.executeUpdate();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.getMessage();
		}

		finally {
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

	public User updateUser1(User User) {
		Connection con = null;
		PreparedStatement statement = null;
		ResultSet resultset = null;
		try {

			con = Connectionutil.DBConnection();
			String updateQuery = "update user_details set e_password=? where email_id=?";
			statement = con.prepareStatement(updateQuery);
			statement.setString(2, User.getEmailid());
			statement.setString(1, User.getEpassword());
			resultset = statement.executeQuery();
			while (resultset.next()) {

	        User user = new User(resultset.getString(3),resultset.getString(5));
				return user;

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
  get wallet:
 */
	public void getwallet(User user) {
		String query = "update user_details set wallet=wallet - ? where user_id = ?";
		Connection con = null;
		PreparedStatement statement = null;
        
		try {
			con = Connectionutil.DBConnection();
			statement = con.prepareStatement(query);
			statement.setInt(1, user.getwallet());
			statement.setInt(2, user.getUserid());
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
* refundwallet	
 */
	
	public void refundwallet(int userid, int totalprice) {
		String query = "update user_details set wallet=wallet + ? where user_id = ?";
		Connection con = null;
		PreparedStatement statement = null;

		try {
			con = Connectionutil.DBConnection();
			statement = con.prepareStatement(query);
			statement.setInt(1, totalprice);
			statement.setInt(2, userid);
		    statement.executeUpdate();

		

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (Exception e) {

			  e.getMessage();
		} 
	   finally {
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
		}}

	}

	
/*
 * update wallet:
 */
	public int updatewallet(User user) {
		String query = "update user_details set wallet =wallet + ? where user_id = ?";
		
		 
		Connection con = null;
		PreparedStatement statement = null;
		try {
			con = Connectionutil.DBConnection();
			statement = con.prepareStatement(query);
			statement.setInt(1, user.getwallet());
			statement.setInt(2, user.getUserid());

			int rs = statement.executeUpdate();
			statement.executeUpdate();

			return rs;

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (Exception e) {

			  e.getMessage();
		} 
		 finally {
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

		return -1;
	}

/*
 * low wallet:
 */
	public int walletbalance(int userid) {
		String query = "Select Wallet from user_details where user_id = ?";
		Connection con = null;
		ResultSet resultset = null;
		PreparedStatement statement = null;
		try {
			con = Connectionutil.DBConnection();
			statement = con.prepareStatement(query);
			statement.setInt(1, userid);

			resultset = statement.executeQuery();
			while (resultset.next()) {
				return resultset.getInt(1);
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
				if (resultset != null) {
					try {
						resultset.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}

			}

		}
		return -1;
	}
/*
 * Showuser
 */
	public List<User> showUser()  {
        StringBuilder showQuery=new StringBuilder();
        showQuery.append("select  user_name,user_id,gender,email_id,mobile_num,e_password,wallet");
        showQuery.append("from user_details");
		List<User> userList = new ArrayList<>();
		User userproducts = null;
		Connection con = null;
		Statement statement = null;
		ResultSet resultset = null;

		try {
			con = Connectionutil.DBConnection();
			statement = con.createStatement();
			resultset = statement.executeQuery(showQuery.toString());
			while (resultset.next()) {
			userproducts = new User(resultset.getString(1), resultset.getInt(2), resultset.getString(3), resultset.getString(4), resultset.getLong(5),
			resultset.getString(6), resultset.getInt(7));
            userList.add(userproducts);

			}

		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		} catch (SQLException e) {

			  e.getMessage();
		}
		finally {
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
		
		return userList;

	}

	public int user(User user) {
		String query = "Select user_id from user_details where email_id=? ";
		Connection con = null;
		PreparedStatement statement = null;
		ResultSet resultset = null;
		try {
			con = Connectionutil.DBConnection();
			statement = con.prepareStatement(query);
			statement.setString(1, user.getEmailid());
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
				if (resultset != null) {
					try {
						resultset.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}

		}
		return -1;
	}

/*
 * CurrentUser	
 */
	public List<User> currentUser1(User obj) {
        StringBuilder showuser=new StringBuilder();
        showuser.append("select user_name,user_id,gender,email_id,mobile_num,e_password,wallet");
        showuser.append("from user_details where user_id= ?");
		List<User> userList = new ArrayList<>();
		Connection con = null;
		PreparedStatement statement = null;
		ResultSet resultset = null;

		try {
			con = Connectionutil.DBConnection();
			statement = con.prepareStatement(showuser.toString());
			statement.setInt(1, obj.getUserid());
			resultset = statement.executeQuery();
			while (resultset.next()) {

			  

		   userList.add(new User(resultset.getString(1), resultset.getInt(2), resultset.getString(3),
					resultset.getString(4), resultset.getLong(5), resultset.getString(6), resultset.getInt(7)));

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
		return userList;
	}
}
