package com.project.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project.pojo.Employee;
import com.project.service.RegisterService;
import com.project.service.RegisterServiceImp;


public class Registrationadded extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(false);
		Employee emp=(Employee)session.getAttribute("Employee");
		RegisterService rs=new  RegisterServiceImp();
		int id=Integer.parseInt(request.getParameter("eventid"));
		//rs.insertRegister(emp.getEmployeeId(),)
		try {
			rs.insertRegister(emp.getEmployeeId(),id);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("UserHomePage.jsp");	
		

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		doGet(request, response);
	}

}
