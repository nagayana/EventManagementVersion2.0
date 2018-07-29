package com.project.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project.pojo.FoodDatabase;
import com.project.service.FoodDatabaseServiceImp;


public class AddFood extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<FoodDatabase> foodList = null;
		try {
			foodList = new FoodDatabaseServiceImp().generateFoodList();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		HttpSession session = request.getSession();
		session.setAttribute("foodList", foodList);
		session.setAttribute("eventId", 100);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("AddFood.jsp");
		requestDispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				doGet(request, response);
	}

}
