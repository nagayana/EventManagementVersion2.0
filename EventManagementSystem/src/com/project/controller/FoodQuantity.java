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

import com.project.pojo.FoodDatabase;
import com.project.service.FoodDatabaseServiceImp;

public class FoodQuantity extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	
		String[] foodIds = request.getParameterValues("foods");
		ArrayList<Integer> Ids = (ArrayList<Integer>)Arrays.asList(foodIds).stream().map(Integer::parseInt).collect(Collectors.toList());
		
		
		ArrayList<FoodDatabase> selectedFood = new ArrayList<>();
		try {
			for(int id: Ids) {
				selectedFood.add(new FoodDatabaseServiceImp().getFoodById(id));
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		HttpSession session = request.getSession(false);
		session.setAttribute("selectedFoodIds", Ids);
		session.setAttribute("selectedFood", selectedFood);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("AddFoodQuantity.jsp");
		requestDispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
