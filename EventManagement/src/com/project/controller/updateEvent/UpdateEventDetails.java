package com.project.controller.updateEvent;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project.pojo.Event;
import com.project.service.EventServiceImp;


public class UpdateEventDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(false);
		Event event=(Event) session.getAttribute("event");
		event.setEventName(request.getParameter("name"));
		event.setEventLocation( request.getParameter("location"));
		event.setEventTime( LocalDateTime.parse(request.getParameter("time")));
		event.setEventRegistrationDeadline( LocalDateTime.parse(request.getParameter("deadline")));
		PrintWriter p=response.getWriter();
		EventServiceImp eventservice=new EventServiceImp();
		try {
			eventservice.updateEventLocation(event.getEventID(), event.getEventLocation());
			eventservice.updateEventName(event.getEventID(), event.getEventName());
			eventservice.updateEventRegistrationDeadline(event.getEventID(), event.getEventRegistrationDeadline());
			eventservice.updateEventTime(event.getEventID(), event.getEventTime());
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
