package com.project.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project.pojo.Employee;
import com.project.service.Authentication;
import com.project.service.AuthenticationService;
import com.project.service.EventServiceImp;


//Login page
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(true);
		session.setMaxInactiveInterval(21*60);
		//int n;
		AuthenticationService as=new AuthenticationService();
		//n=Integer.parseInt(request.getParameter("user"));
		String no1=request.getParameter("user");
		String p=request.getParameter("password");
		 response.setContentType("text/html");
	      PrintWriter out = response.getWriter();
	     
		EventServiceImp es= new EventServiceImp();
	
		try {
			
			if(as.authenticate(Integer.parseInt(no1), p)==null){
				session.setAttribute("errorMessage","Please enter the credentials again");
     	        response.sendRedirect("SignIn.jsp"); 
			   //response.sendRedirect("Login.jsp"); 
     	       

			}
			

			else if(as.authenticate(Integer.parseInt(no1), p).getType().equals("user")){
				
			   session.setAttribute("Employee",as.authenticate(Integer.parseInt(no1), p));
			  // out.println("<h1>" +as.authenticate(Integer.parseInt(no1), p) + "</h1>");
			   response.sendRedirect("UserHomePage.jsp");

			}

			else if(as.authenticate(Integer.parseInt(no1), p).getType().equals("admin"))
			{    session.setAttribute("Employee",as.authenticate(Integer.parseInt(no1), p));
				 response.sendRedirect("OrganiserHomePage.jsp");

			}
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		} 
	}

}
