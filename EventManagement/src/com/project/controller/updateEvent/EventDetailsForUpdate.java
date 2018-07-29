package com.project.controller.updateEvent;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project.pojo.Event;
import com.project.service.EventServiceImp;

/**
 * Servlet implementation class EventDetailsForUpdate
 */
public class EventDetailsForUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(false);
		int eventId=Integer.parseInt(request.getParameter("id"));
		EventServiceImp eventservice=new EventServiceImp(); 
		Event event=new Event();
		try {
			event=eventservice.getEvent(eventId);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		session.setAttribute("event", event);
		response.sendRedirect("UpdateEvent.jsp");
		
	}

}
