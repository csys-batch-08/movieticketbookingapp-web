package com.Testmain;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.Movieticketbookingdao.Admindao;

import com.Movieticketbookingdao.Moviedao;
import com.Movieticketbookingdao.Theatredao;
import com.Movieticketbookingdao.userdao;
import com.Movieticketbookingpojo.Admin;
import com.Movieticketbookingpojo.Movie;
import com.Movieticketbookingpojo.User;
import com.connection.Connectionmv4;

public class usertestmain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Scanner sc = new Scanner(System.in);
		Connection con = Connectionmv4.DBConnection();
		// System.out.println("Connection established");
		userdao uDao = new userdao();
		System.out.println("welcome Like myshow");
		System.out.println("\n1.Register \n2.Login \n3.Update password\n4.Admin login");
		int choice = sc.nextInt();
		sc.nextLine();
		switch (choice) {
		case 1:

			String user_name;

			do {
				System.out.println("Enter the user_name");
				user_name = sc.nextLine();

				if (user_name.isEmpty()) {
					System.out.println("user_name is empty");
				}

				if (!user_name.matches("[A-Za-z]{3,}")) {
					System.out.println("Invalid user_name");
				}
			}

			while (!user_name.matches("[A-Za-z]{3,}"));

			String gender;

			do {
				System.out.println("Enter the Gender");
				gender = sc.nextLine();

				if (gender.isEmpty()) {
					System.out.println("gender is empty");
				} else if (!gender.matches("[A-Za-z]")) {
					System.out.println("Invalid gender");
				}
			}

			while (!gender.matches("[A-Za-z]"));

			String emailid1 = null;
			do {
				System.out.println("Enter email ID:");
				emailid1 = sc.nextLine();

				if (emailid1.isEmpty()) {
					System.out.println("email_id is empty");
				} else if (!emailid1.matches("[a-z0-9]+[@][a-z]+[.][a-z]+")) {
					System.out.println("Invalid email_id");
				}
			}

			while (!emailid1.matches("[a-z0-9]+[@][a-z]+[.][a-z]+"));

			String mobile_num;
			do {
				System.out.println("Enter Phone mobile_number:");
				mobile_num = sc.nextLine();

				if (mobile_num.isEmpty()) {
					System.out.println("mobile_num is empty");
				}

				else if (!mobile_num.matches("[6-9]{1}[0-9]{9}")) {
					System.out.println("invalid mobile_num");
				}
			} while (!mobile_num.matches("[6-9]{1}[0-9]{9}"));
			long mobile_num1 = Long.parseLong(mobile_num);

			String e_password;
			do {
				System.out.println("Enter password:");
				e_password = sc.nextLine();

				if (emailid1.isEmpty()) {
					System.out.println("email_id is empty");
				}

				else if (!e_password.matches("[A-Za-z0-9-@]{8,}")) {
					System.out.println("invalid password");
				}
			}

			while (!e_password.matches("[A-Za-z0-9-@]{8,}"));

			User udao = new User(user_name, gender, emailid1, mobile_num1, e_password);
			uDao.insert(udao);
			// login
		case 2:

			User user = null;
			do {
				System.out.println("login");
				System.out.println("\nenter the register emailid");
				String emailid = sc.nextLine();
				System.out.println("\nenter the current password");
				String password1 = sc.nextLine();
				userdao currentUser = new userdao();
				user = currentUser.validateUser(emailid, password1);
				if (user != null) {
					System.out.println("Login success " + user.getUser_name());
				} else {
					System.out.println("invalid entry");
				}
			} while (user == null);

			// showquery
			
			Moviedao product=new Moviedao();
			List<Movie> Products1=product.showMovie();
			for(int i=0;i<Products1.size();i++)
			{
				System.out.println(Products1.get(i));
				
			}

			break;

		// update emailid
		case 3:

			System.out.println("1.forgot emailid\n2.forgot password");
			int forgotemailchoice = Integer.parseInt(sc.nextLine());

			switch (forgotemailchoice) {

			case 1:
				System.out.println("Enter your Register mobilenum");
				long mobile = Long.parseLong(sc.nextLine());
				System.out.println("Enter new emailid");
				String email = sc.nextLine();
				User user1 = new User(mobile, email);
				user = uDao.updateUser(user1);
				if (user != null) {
					System.out.println("Update success ");
				} else {

					System.out.println("invalid entry");
				}
				break;
			case 2:
				

				System.out.println("Enter your Register emailid");
				String email1 = sc.nextLine();
				System.out.println("Enter new password");
				String password = sc.nextLine();
				User user2=new User(email1, password);
				user = uDao.updateUser1(user2);
				if (user != null) {
					System.out.println("Update success ");
				} else {

					System.out.println("invalid entry");
				}
				break;
			}

           case 4:
        	   System.out.println("1.Admin login\n2.insert\n3.update\n4.delete\n5.showmovie");
   			    int admin = Integer.parseInt(sc.nextLine());

   			switch (admin) {
   			case 1:
        	   
        	   Admindao user1=new Admindao();
        	   do
        	   {
        	   System.out.println("Admin");
        	   System.out.println("\nenter the admin emailid");
        	   String emailid2=sc.nextLine();
        	   System.out.println("\nenter the admin password");
        	   String password2=sc.nextLine();
        	   Admindao adminuser=new Admindao();
//        	  user1= adminuser.validate(emailid2, password2);
        	  if(user1!=null) {
        		  System.out.println("admin success");
        	  }
        	  else {
        		  System.out.println("admin notsuccess");
        	  }
           }while(user1==null); 
        	   break;
        case 2:

        	 System.out.println("Enter the moviedetails");
        	 System.out.println("Enter the movename");
        	 String mvname=sc.nextLine();
        	 System.out.println("movieid");
        	 int mvid=Integer.parseInt(sc.nextLine());
        	 System.out.println("Enter the movietype");
        	 String mvtype=sc.nextLine();
        	 System.out.println("Enter the movierating");
        	 int mvrating=Integer.parseInt(sc.nextLine());
        	 System.out.println("Enter the movieduration");
        	 int mvduration=Integer.parseInt(sc.nextLine());
        	 System.out.println("Enter the director");
        	 String mvdirector=sc.nextLine();
        	 System.out.println("Enter the musicdirector");
        	 String mvmusic=sc.nextLine();
        	 System.out.println("Enter the Heroname");
        	 String mvhero=sc.nextLine();
        	 Moviedao uDao2=new Moviedao();
        	 Movie udao1 = new Movie( mvname,mvid,mvtype,mvrating,mvduration,
        				mvdirector,mvmusic,mvhero);
        	 uDao2.insert(udao1);
        	   break;
        	 
        	   
        	   
        case 3:
        	System.out.println("Update movieid");
        	int movieid=Integer.parseInt(sc.nextLine());
        	System.out.println("movietype");
        	String movietype=sc.nextLine();
        	Moviedao uDao3=new Moviedao();
        	Movie udao2=new Movie(movietype,movieid);
        	uDao3.update(udao2);
        	
            break;
            
        case 4:
        	System.out.println("delete movieid1");
        	int movieid1=Integer.parseInt(sc.nextLine());
        	Moviedao uDao4=new Moviedao();
        	Movie udao3=new Movie(movieid1);
        	uDao4.delete(udao3);
        	 
        	break;
        	
        	
        case 5:
        	
        	Moviedao product1=new Moviedao();
			List<Movie> Products11=product1.showMovie();
			for(int i=0;i<Products11.size();i++)
			{
				System.out.println(Products11.get(i));
				
			}

        	
   			}
   			
   			
   			
   			
   			
   			
   			
        
		}
		
		
		
		
		
	}}
	 	 
	
		
	


//}