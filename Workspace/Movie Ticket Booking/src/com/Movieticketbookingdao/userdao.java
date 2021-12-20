package com.Movieticketbookingdao;

import java.sql.Statement;

import javax.naming.spi.DirStateFactory.Result;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Movieticketbookingpojo.Movie;
import com.Movieticketbookingpojo.User;
import com.connection.Connectionmv4;

public class userdao {
	public void insert(User M4) {
		String query = "insert into user_details(user_name,gender,email_id,mobile_num,e_password) values (?,?,?,?,?)";

		try {
			Connection con = Connectionmv4.DBConnection();
			PreparedStatement Pstmt1 = con.prepareStatement(query);
			Pstmt1.setString(1, M4.getUser_name());
			Pstmt1.setString(2, M4.getGender());
			Pstmt1.setString(3, M4.getEmail_id());
			Pstmt1.setLong(4, M4.getMobile_num());
			Pstmt1.setString(5, M4.getE_password());
			int i = Pstmt1.executeUpdate();

			System.out.println("Registration Completed");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static User validateUser(String useremail, String userpassword) {
		Statement stmt = null;
		User ob = null;
		Connection con = null;
		try {
			con = Connectionmv4.DBConnection();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String query = "select * from user_details where email_id='" + useremail + "' and e_password='" + userpassword
				+ "'";
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			if (rs.next()) {
				ob = new User(rs.getString(1), useremail, userpassword);
				System.out.println(rs.getString(1));
				return ob;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ob;

	}

	public User updateUser(User user1) throws ClassNotFoundException, SQLException {
		
		Connectionmv4 conect = new Connectionmv4();
		Connection con = conect.DBConnection();
		String updateQuery = "update user_details set email_id=? where mobile_num=?";
		PreparedStatement pstmt = con.prepareStatement(updateQuery);
		pstmt.setString(1, user1.getEmail_id());
		pstmt.setLong(2, user1.getMobile_num());
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {

			System.out.println("Updated");
			User user=new User (rs.getString(1),rs.getString(3));
			return user;

			
		}
		return null;
		
	}
		
		public User updateUser1(User user2) throws ClassNotFoundException, SQLException {
		//	System.out.println(user2.getEmail_id());
		//	System.out.println(user2.getE_password());
			
			Connectionmv4 conect = new Connectionmv4();
			
			Connection con = conect.DBConnection();
			String updateQuery = "update user_details set e_password=? where  email_id=?";
			PreparedStatement pstmt = con.prepareStatement(updateQuery);
			pstmt.setString(2, user2.getEmail_id());
			pstmt.setString(1, user2.getE_password());
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {

				System.out.println("Updated");
				User user=new User (rs.getString(3),rs.getString(5));
				return user;

				
			}
			return null;
		}
			
			public void deleteUser2(User user3) throws SQLException, ClassNotFoundException {
				Connectionmv4 conect = new Connectionmv4();
				Connection con = conect.DBConnection();
				String deleteQuery = "delete from user_details where user_name=?";
				PreparedStatement pstmt = con.prepareStatement(deleteQuery);
				pstmt.setString(1,user3.getUser_name());
				int rs=pstmt.executeUpdate();
					
				System.out.println("deleted");
	
			}



		
		

	}


