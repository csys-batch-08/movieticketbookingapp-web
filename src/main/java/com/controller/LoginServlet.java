package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Exception.InvalidUserException;
import com.movieticketbookingdaoimpl.UserDaoImpl;
import com.movieticketbookingmodel.User;



@WebServlet("/login")

public class LoginServlet extends HttpServlet {
	

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out=response.getWriter();
       
	    HttpSession session = request.getSession();
		String email=request.getParameter("Email");
		String password=request.getParameter("password");
		UserDaoImpl userDaoImpl = new UserDaoImpl();
		User user = new User(email,null);
		int uid = userDaoImpl.user(user);
		if(uid > 0) {
			session.setAttribute("userid", uid);
		}
		
         String userrole= userDaoImpl.validateUser(email,password);
         
        
         if(userrole.equals("admin")) {
        	
		      response.sendRedirect("adminHomepage.jsp");
				
		 }else if(userrole.equals("user"))
				
		{	
			 response.sendRedirect("ShowServlet");
			
		}
	     
	    else 
		
		     {
			  try
			 {
			   throw new InvalidUserException();	
			 } catch (InvalidUserException e) {
                out.println("<script type=\"text/javascript\">");
				out.println("alert('Invalid  password');");
				out.println("location='login.jsp';");
				out.println("</script>");

			}

	   
		
       
	}

	}}


