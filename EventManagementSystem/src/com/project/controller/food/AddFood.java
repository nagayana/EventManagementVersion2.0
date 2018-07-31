package com.project.controller.food;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Collectors;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project.pojo.Food;
import com.project.pojo.FoodDatabase;
import com.project.service.FoodDatabaseServiceImp;
import com.project.service.FoodServiceImp;
import com.sun.crypto.provider.AESParameters;


public class AddFood extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int eventId = 100;
		HttpSession session = request.getSession();
		session.setAttribute("eventId", eventId);
		ArrayList<FoodDatabase> foodList = null;
		ArrayList<Food> eventFoodList = null; 
		try {
			foodList = new FoodDatabaseServiceImp().generateFoodList();
			eventFoodList = new FoodServiceImp().searchFoodList(eventId);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		HashSet<Integer> eventFoodIds = eventFoodList.stream().map(Food::getFoodId).collect(Collectors.toCollection(HashSet::new));
		ArrayList<FoodDatabase> validFoodList= new ArrayList<>(); 
		for(FoodDatabase food:foodList) {
			if(!eventFoodIds.contains(food.getFoodId())) {
				validFoodList.add(food);
			}
		}
		
		RequestDispatcher requestDispatcher = null;
		if(validFoodList.isEmpty()) {
			requestDispatcher = request.getRequestDispatcher("ShowNoFood.jsp");
		}
		else {
			requestDispatcher = request.getRequestDispatcher("AddFood.jsp");
			session.setAttribute("validFoodList", validFoodList);
		}
		
		requestDispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				doGet(request, response);
	}

}
