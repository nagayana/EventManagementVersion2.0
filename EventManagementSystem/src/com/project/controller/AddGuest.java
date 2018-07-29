package com.project.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Collectors;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project.pojo.Designation;
import com.project.pojo.GuestList;
import com.project.service.DesignationServiceImp;
import com.project.service.GuestListServiceImp;


public class AddGuest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ArrayList<Designation> allDesignations = new ArrayList<>();
		ArrayList<GuestList> guestList = new ArrayList<>();
		HashSet<Integer> guestDesignationIds = new HashSet<>(); 
		HttpSession session = request.getSession();
		session.setAttribute("eventId", 100);
		try {
			allDesignations = new DesignationServiceImp().getDesignationList();
			guestList = new GuestListServiceImp().generateGuestList(Integer.parseInt(request.getSession().getAttribute("eventId").toString()));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<Integer> temp = (ArrayList<Integer>) guestList.stream().map(GuestList::getDesignationId).collect(Collectors.toList());
		for(int id: temp) {
			guestDesignationIds.add(id);
		}
		
		ArrayList<Designation> designationList = new ArrayList<>();
		
		for(Designation d:allDesignations) {
			if(!guestDesignationIds.contains(d.getDesignationId())){
				designationList.add(d);
			}
			
		}
		
		session.setAttribute("designations",designationList);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("AddGuest.jsp");
		requestDispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
