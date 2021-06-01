package com.jacob.servlets;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConfiguredServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		
		ServletConfig config = getServletConfig();
		ServletContext context = getServletContext();
		
		try {
			response.getWriter().println(config.getInitParameter("ConfiguredParam"));
			response.getWriter().println(context.getInitParameter("ContextParam"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
