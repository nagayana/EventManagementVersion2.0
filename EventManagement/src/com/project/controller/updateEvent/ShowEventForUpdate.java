package com.project.controller.updateEvent;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project.pojo.Event;
import com.project.service.EventServiceImp;


public class ShowEventForUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(false);
		String flag="3";
		ServletContext context=request.getServletContext();
		context.setAttribute("flag", flag);
		EventServiceImp eventservice=new EventServiceImp();
		ArrayList<Event> eventList = new ArrayList<>();
		try {
		       eventList = eventservice.getAllEvents();
	       } catch (ClassNotFoundException | SQLException e) {
		       e.printStackTrace();
	       }
		 session.setAttribute("eventList", eventList);
		 response.sendRedirect("ShowEvent.jsp");
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
