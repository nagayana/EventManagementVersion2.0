package com.project.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project.service.GuestListServiceImp;


public class DeleteGuestList extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession httpSession = request.getSession();
		int eventId = Integer.parseInt(httpSession.getAttribute("eventId").toString());
		String[] selectedIds = request.getParameterValues("selectedIds");
		ArrayList<Integer> deleteIds = (ArrayList<Integer>) Arrays.asList(selectedIds).stream().map(Integer::parseInt).collect(Collectors.toList());
		GuestListServiceImp guestListServiceImp = new GuestListServiceImp();
		for(int id: deleteIds){
			try {
				guestListServiceImp.deleteGuestList(id, eventId);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("tempRedirect.jsp");
		requestDispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
