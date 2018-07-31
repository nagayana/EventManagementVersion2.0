package com.project.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project.pojo.Designation;
import com.project.service.DesignationServiceImp;
import com.project.service.GuestListServiceImp;


public class DeleteGuest extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			 
		//int eventId = Integer.parseInt(request.getSession().getAttribute("eventId").toString());
		int eventId = 100;
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("eventId", eventId);
		GuestListServiceImp guestListServiceImp = new GuestListServiceImp();
		ArrayList<Integer> guestDesignationIds = null;
		try {
			guestDesignationIds = guestListServiceImp.DesignationByEventId(eventId);
		} catch (Exception  e) {
			e.printStackTrace();
		}
		
		DesignationServiceImp designationServiceImp = new DesignationServiceImp();
		ArrayList<Designation> designations = new ArrayList<>();
		try{
			for(int designationId: guestDesignationIds){
				designations.add(designationServiceImp.getDesignationById(designationId));
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		httpSession.setAttribute("designations", designations);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("DeleteGuest.jsp");
		requestDispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
