package com.jacob.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		String path = request.getRequestURI();
		// e.g. "/MyArtifact//MyServlet/5"
		String[] pathElements = path.split("/");
		// e.g. [ "/MyArtifact/MyServlet", "5" ]
		
		// Visualize the URL we have
		System.out.println(path);
		
		for (int i = 0; i < pathElements.length; ++i) {
			System.out.println(i + ": " + pathElements[i]);
		}
		
		// Branch our logic based on URL elements
		switch (pathElements[2]) {
		case "account": {
			int id = Integer.parseInt(pathElements[3]);
			
			try {
				response.getWriter().println("Your ID is "+ id);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		break;
		
		case "submission": {
			String name = request.getParameter("name");
			String gender = request.getParameter("gender");
			
			String[] colors = request.getParameterValues("favColors");
			
			try {
				PrintWriter pw = response.getWriter();
				
				pw.println("Name: " + name);
				pw.println("Gender: " + gender);
				for (String color : colors) {
					pw.print(color + ", ");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		break;
		
		case "html": {
			try {
				response.getWriter().println("<html><body><title>Hello there.</title><h1>Written from my Java IDE</h1></body></html>");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		break;
		}
	}
}
