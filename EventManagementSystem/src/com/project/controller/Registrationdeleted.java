package com.project.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project.pojo.Employee;
import com.project.service.RegisterService;
import com.project.service.RegisterServiceImp;


public class Registrationdeleted extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(false);
		response.setContentType("text/html");
	     PrintWriter out = response.getWriter();
		Employee emp=(Employee)session.getAttribute("Employee");
		RegisterService rs=new  RegisterServiceImp();
		int id=Integer.parseInt(request.getParameter("regisdel"));
		try {
			rs.deleteRegister(emp.getEmployeeId(),id);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		response.sendRedirect("UserHomePage.jsp");
		//RequestDispatcher rd = request.getRequestDispatcher("UserHomePage.jsp");
		//rd.include(request, response);
		//out.print("<h1>"+"registration deleted"+"</h1>");
	}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
