package com.project.controller;

import java.io.IOException;
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


//Login page
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession();
		Authentication as=new AuthenticationService();
		int n=Integer.parseInt(request.getParameter("uname"));
		String p=request.getParameter("pwd");
		
		
		
		try {
			if(as.authenticate(n, request.getParameter("pwd"))==null){
				session.setAttribute("errorMessage","Please enter the credentials again");
     	        response.sendRedirect("./Login.jsp"); 
			}
			else if(as.authenticate(n, request.getParameter("pwd")).getType()=="user"){
				
			   response.sendRedirect("./UserHomePage.jsp");
			}
			else if(as.authenticate(n, request.getParameter("pwd")).getType()=="admin")
			{
				 response.sendRedirect("./Organiser.jsp");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
