package com.kyle.servlets;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp) {
		
		ServletConfig config = getServletConfig();
		ServletContext cont = getServletContext();
		
		try {
			resp.getWriter().println(config.getInitParameter("SecondParam"));
			resp.getWriter().println(cont.getInitParameter("ContextParam"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
