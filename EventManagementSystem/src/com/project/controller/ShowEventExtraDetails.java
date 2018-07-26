package com.project.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project.pojo.Attraction;
import com.project.pojo.Food;
import com.project.pojo.GuestList;
import com.project.service.AttractionServiceImp;
import com.project.service.FoodServiceImp;
import com.project.service.GuestListServiceImp;

/**
 * Servlet implementation class ShowEventExtraDetails
 */
public class ShowEventExtraDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int eventId=Integer.parseInt(request.getParameter("id"));
		GuestListServiceImp gs=new GuestListServiceImp();
		FoodServiceImp fs=new FoodServiceImp();
		AttractionServiceImp as=new AttractionServiceImp();
		
		
		ArrayList<GuestList> guest=new ArrayList<>();
		 try {
			   guest=gs.generateGuestList(eventId);
	    } catch (ClassNotFoundException | SQLException e) {  
		       e.printStackTrace(); 
	    }
		 
		 HttpSession session=request.getSession(true);
		 session.setAttribute("guest", guest);
		
		 ArrayList<Food> food=new ArrayList<>();
		    try {
				  food=fs.searchFoodList(eventId);
		    } catch (ClassNotFoundException | SQLException e) {
			       e.printStackTrace();
		    }
		    session.setAttribute("food", food); 
		    ArrayList<Attraction> attraction=new ArrayList<>();
			 try {
		    	   attraction = as.getAttractionList(eventId);
		    } catch (ClassNotFoundException | SQLException e) {
			       e.printStackTrace();
		    }
			 session.setAttribute("attraction", attraction);
			response.sendRedirect("ShowExtraDetailEvent.jsp");
			 //out.println("hello"+eventId);
	}

}
