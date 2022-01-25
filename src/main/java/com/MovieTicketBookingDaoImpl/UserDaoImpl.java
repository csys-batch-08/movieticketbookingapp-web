package com.MovieTicketBookingDaoImpl;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.MovieTicketBookingDao.*;
import com.MovieticketBookingModel.Movie;
import com.MovieticketBookingModel.User;
import com.Movieticketbooking.util.Connectionmv4;



public class UserDaoImpl {
	public int insert(User use) {
		int i = 0;
		String query = "insert into user_details(user_name,gender,email_id,mobile_num,e_password) values (?,?,?,?,?)";

		try {
			Connection con = Connectionmv4.DBConnection();
			PreparedStatement Pstmt1 = con.prepareStatement(query);
			Pstmt1.setString(1, use.getUser_name());
			Pstmt1.setString(2, use.getGender());
			Pstmt1.setString(3, use.getEmail_id());
			Pstmt1.setLong(4, use.getMobile_num());
			Pstmt1.setString(5, use.getE_password());
			 i = Pstmt1.executeUpdate();

			System.out.println("Registration Completed");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	public String validateUser(String email,String password) {
//		Statement stmt = null;
//		User ob = null;
//		Connection con = null;
		ResultSet rs=null;
		
		try {
			Connection con = Connectionmv4.DBConnection();
			
			String query = "select user_role from user_details where email_id=? and e_password=?";
//			stmt = con.createStatement();
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setString(1, email);
			pstmt.setString(2, password);
		//	System.out.println("hi");
		//	System.out.println(email);
		//	System.out.println(password);
			rs=pstmt.executeQuery();
			rs.next();
			return rs.getString(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "invalid";

	}
	
//	public ResultSet validation(String email,int mobile) {
//          ResultSet rs=null;
//		
//		try {
//			Connection con = Connectionmv4.DBConnection();
//			
//			String query = "select * from user_details where email_id=? and e_password=?";
//			PreparedStatement pstmt=con.prepareStatement(query);
//			pstmt.setString(1, email);
//			pstmt.setInt(2, mobile);
//			rs=pstmt.executeQuery();
//			
//			return rs;
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		return rs;
//
//	}
	public ResultSet getEmail(User email)
	   {
		   String query="select * from user_details where email_id = ?";  
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				 con = Connectionmv4.DBConnection();
			    pstmt = con.prepareStatement(query);
				pstmt.setString(1, email.getEmail_id());
				 rs = pstmt.executeQuery();
			} catch (SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return rs;
	   }
  
	public ResultSet getmobile(User mobile)
	   {
		   String query="select * from user_details where mobile_num = ?";  
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				 con = Connectionmv4.DBConnection();
			    pstmt = con.prepareStatement(query);
				pstmt.setLong(1, mobile.getMobile_num());
				 rs = pstmt.executeQuery();
			} catch (SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return rs;
	   }

	public String fetch(User userpasscheck) 
	   {	
			String query="select Email_id,e_password from user_details where Email_id = ? and e_password = ?";
			Connection con = null;
			try {
				 con = Connectionmv4.DBConnection();
			PreparedStatement pstmt = null;
				pstmt = con.prepareStatement(query);
				pstmt.setString(1, userpasscheck.getEmail_id());
				pstmt.setString(2, userpasscheck.getE_password());
			ResultSet rs = null;
			
				rs = pstmt.executeQuery();
				return "correct";
			} catch (SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "incorrect";	
		}
	

	public void updateUser(User user1) throws SQLException, ClassNotFoundException  {

		Connectionmv4 conect = new Connectionmv4();
		Connection con;
		
			con = conect.DBConnection();
		String updateQuery = "update user_details set e_password=? where email_id=?";
		PreparedStatement pstmt = con.prepareStatement(updateQuery);
		pstmt.setString(1, user1.getE_password());
		pstmt.setString(2, user1.getEmail_id());
		pstmt.executeUpdate();
//		while (rs.next()) {
//
//			System.out.println("Updated");
//			User user = new User(rs.getString(1), rs.getString(3));
//			return user;
//
//		}}
//		catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return null;
		}
	

	public User updateUser1(User user2)  {
		// System.out.println(user2.getEmail_id());
		// System.out.println(user2.getE_password());
 try {
		Connectionmv4 conect = new Connectionmv4();

		Connection con = conect.DBConnection();
		String updateQuery = "update user_details set e_password=? where  email_id=?";
		PreparedStatement pstmt = con.prepareStatement(updateQuery);
		pstmt.setString(2, user2.getEmail_id());
		pstmt.setString(1, user2.getE_password());
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {

			System.out.println("Updated");
			User user = new User(rs.getString(3), rs.getString(5));
			return user;

		}}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void deleteUser2(User user3) {
		Connectionmv4 conect = new Connectionmv4();
		Connection con;
		try {
			con = conect.DBConnection();
			String deleteQuery = "delete from user_details where user_name=?";
			PreparedStatement pstmt = con.prepareStatement(deleteQuery);
			pstmt.setString(1, user3.getUser_name());
			int rs = pstmt.executeUpdate();

			System.out.println("deleted");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// get wallet:
	public void getwallet(User user) {
		String query = "update user_details set wallet=wallet - ? where user_id = ?";

		try {
			Connection con = Connectionmv4.DBConnection();
			PreparedStatement Pstmt1 = con.prepareStatement(query);
			Pstmt1.setInt(1, user.getwallet());
			Pstmt1.setInt(2, user.getUser_id());
			
			int i=Pstmt1.executeUpdate();
			System.out.println("wallet reduce");
//			ResultSet rs = Pstmt1.executeQuery();
//			while (rs.next()) {
//				System.out.println(rs.getInt(1));
//				return rs.getInt(1);
//			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	public void Refundwallet(int userid, int totalprice) {
		String query = "update user_details set wallet=wallet + ? where user_id = ?";

		
//		public void Refundwallet(int  user, int totalprice) {

		
		
		try {
			Connection con = Connectionmv4.DBConnection();
			PreparedStatement Pstmt1 = con.prepareStatement(query);
			
			System.out.println("vdnkvgvdhjvdgfdgsjvcdsghdcv come insideee");
			Pstmt1.setInt(1, totalprice);
           Pstmt1.setInt(2, userid);
			
			int i=Pstmt1.executeUpdate();
			
			System.out.println("Row Up[dated"+i);
			System.out.println("wallet reduce");
//			ResultSet rs = Pstmt1.executeQuery();
//			while (rs.next()) {
//				System.out.println(rs.getInt(1));
//				return rs.getInt(1);
//			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	



//update wallet:
	public int updatewallet(User user) {
		String query = "update user_details set wallet =wallet + ? where user_id = ?";

		try {
			Connection con = Connectionmv4.DBConnection();
			PreparedStatement Pstmt1 = con.prepareStatement(query);
			Pstmt1.setInt(1, user.getwallet());
			Pstmt1.setInt(2, user.getUser_id());

			int rs = Pstmt1.executeUpdate();
			Pstmt1.executeUpdate("commit");

			return rs;

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}
	
	
	//low wallet:
		public int walletbalance(int userid) {
			String query = "Select Wallet from user_details where user_id = ?";

			try {
				Connection con = Connectionmv4.DBConnection();
				PreparedStatement Pstmt1 = con.prepareStatement(query);
				Pstmt1.setInt(1, userid);
				

				ResultSet rs = Pstmt1.executeQuery();
         while (rs.next()) {
				return rs.getInt(1);
         }
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return -1;
		}
	
	public List<User> showUser() throws ClassNotFoundException, SQLException {
		
		List<User> userList=new ArrayList<User>();
		User userproducts=null;
		
		String showQuery="select * from user_details";
		Connectionmv4 connection =new Connectionmv4();
		Connection con=connection.DBConnection();
	    Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(showQuery);
		while(rs.next()) {
			
	    userproducts=new  User(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getLong(5),rs.getString(6),rs.getInt(7));
//		System.out.println(rs.getString(3));
	    userList.add(userproducts);
	  
		}
		
		 return userList;
		
		
	}

	public int user(User user5) {
		String query="Select user_id from user_details where email_id=? ";
		Connection con;
		try {
			con = Connectionmv4.DBConnection();
			PreparedStatement Pstmt1 = con.prepareStatement(query);
			
			Pstmt1.setString(1, user5.getEmail_id());

			ResultSet rs = Pstmt1.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				return rs.getInt(1);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}

	
	public List<User> currentUser1(User obj) throws ClassNotFoundException, SQLException {
		
		List<User> userList=new ArrayList<User>();
		User userproducts=null;
	
		String showuser="select * from user_details where user_id= ?";
		Connectionmv4 connection =new Connectionmv4();
		Connection con=connection.DBConnection();
		
	    PreparedStatement stmt=con.prepareStatement(showuser);
	    stmt.setInt(1, obj.getUser_id());
	    System.out.println(obj.getUser_id());
		ResultSet rs=stmt.executeQuery();
		while(rs.next()) {
			
	    userproducts=new  User(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getLong(5),rs.getString(6),rs.getInt(7));
//		System.out.println(rs.getString(3));
	    userList.add(userproducts);
	  
		}
		
		 return userList;
}
}
