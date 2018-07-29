package com.project.controller;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.project.pojo.Event;
import com.project.service.EventServiceImp;

public class createEventController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int Id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String location = request.getParameter("location");
		LocalDateTime time = LocalDateTime.parse(request.getParameter("time"));
		LocalDateTime deadline = LocalDateTime.parse(request.getParameter("deadline"));
		int maxRegistration = Integer.parseInt(request.getParameter("maxRegistration"));
		
		Event event = new Event(Id,name,location,time,deadline,maxRegistration,0); 
		boolean result = false;
		
		try{
			result = new EventServiceImp().insertEvent(event);
		}
		catch(Exception e){
			
		}
		
		RequestDispatcher requestDispatcher = null;
		if(result==true){
			requestDispatcher = request.getRequestDispatcher("JSP/eventInsertionSuccessful.jsp");
			
		}
		else{
			requestDispatcher = request.getRequestDispatcher("JSP/eventInsertionFailed.jsp");
		}
		
		requestDispatcher.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
