package com.kyle.servlets;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlets extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse resp) {
		try {
			resp.getWriter().println("Hello! Finally!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
