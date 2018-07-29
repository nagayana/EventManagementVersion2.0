package com.project.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.pojo.Food;
import com.project.pojo.FoodDatabase;
import com.project.service.FoodServiceImp;


public class UpdateFoodList extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		ArrayList<Integer> selectedFoodIds = (ArrayList<Integer>) request.getSession().getAttribute("selectedFoodIds");
		ArrayList<FoodDatabase> selectedFood = (ArrayList<FoodDatabase>) request.getSession().getAttribute("selectedFood");
		HashMap<Integer, Integer> idQuantity = new HashMap<>();
		
		for(int id: selectedFoodIds) {
			idQuantity.put(id, Integer.parseInt(request.getParameter(String.valueOf(id))));
		}
		
		FoodServiceImp foodServiceImp = new FoodServiceImp();
		try {
			for (FoodDatabase food : selectedFood) {
				int quantity = idQuantity.get(food.getFoodId());
				int price = foodServiceImp.calulateFoodPrice((int) food.getPrice(), quantity);

				Food newFood = new Food(food.getFoodId(), food.getFoodName(), price, quantity,
						Integer.parseInt(request.getSession().getAttribute("eventId").toString()));
				foodServiceImp.insertFood(newFood);

			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("tempRedirect.jsp");
		requestDispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
