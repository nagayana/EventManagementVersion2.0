package com.project.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project.pojo.Employee;
import com.project.pojo.Event;
import com.project.service.EventServiceImp;

/**
 * Servlet implementation class UpdateRegisteration
 */
public class UpdateRegisteration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(false);
		Employee emp=(Employee)session.getAttribute("Employee");
		EventServiceImp es= new EventServiceImp();
		ArrayList<Event> unRegisterdEvents=new ArrayList<>();
		try {
			 unRegisterdEvents = es.getUnregisteredEventsByEmployeeId(emp.getEmployeeId());
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		session.setAttribute("unRegisterdEvents",unRegisterdEvents);
		response.sendRedirect("unregistered.jsp");	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
