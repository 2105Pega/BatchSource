package com.jacob.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MenuServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		RequestDispatcher rd = request.getRequestDispatcher("/optiona");
		try {
			//rd.forward(request, response);
			response.sendRedirect("http://localhost:8080/ForwardAndRedirect/optiona");
			
		} /*catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/ catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
