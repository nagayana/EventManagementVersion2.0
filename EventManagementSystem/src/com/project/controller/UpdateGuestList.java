package com.project.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.service.GuestListServiceImp;

public class UpdateGuestList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String[] designationIds = request.getParameterValues("designationIds");
		ArrayList<Integer> ids = (ArrayList<Integer>) Arrays.asList(designationIds).stream().map(Integer::parseInt).collect(Collectors.toList());
		
		int eventId = Integer.parseInt(request.getSession().getAttribute("eventId").toString());
		
		GuestListServiceImp guestListServiceImp = new GuestListServiceImp();
		try{
			for(int id: ids){
				guestListServiceImp.insertGuestList(id, eventId);
			}
		}
		catch(Exception e){
			
		}
	
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("tempRedirect.jsp");
		requestDispatcher.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
