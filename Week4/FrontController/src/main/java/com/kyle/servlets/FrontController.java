package com.kyle.servlets;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		String path = request.getRequestURI();
		// e.g. "/MyArtifact/MyServlet/5"
		String[] pathElements = path.split("/");
		// e.g. ["","MyArtifact","MyServlet","5"]
		
		switch (pathElements[2]) {
			case "Account": {
				int id = Integer.parseInt(pathElements[3]);
				try {
					response.getWriter().println("Your id is: " + id);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} break;
			case "submission": {
				// Week4 -> HTML -> Forms -> index.html
				String name = request.getParameter("name");
				String gender = request.getParameter("gender");
				String[] favColors = request.getParameterValues("favColors");
				try {
					PrintWriter pw = response.getWriter();
					
					pw.println("Name: " + name);
					pw.println("Gender: " + gender);
					pw.println("Fav Colors:");
					for (String color : favColors) {
						pw.print(color + ", ");
					}
					pw.println();
					
					//THIS IS GARBAGE
					/*
					String filePath = "C:\\Users\\Kyle\\Documents\\GitHub\\Revature\\BatchSource\\Week3\\HTML\\index.html";
					String content = Files.lines(Paths.get(filePath)).collect(Collectors.joining(System.lineSeparator()));
					pw.println(content);
					*/
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} break;
		}
	}
	
	/*public void doPost(HttpServletRequest request, HttpServletResponse response) {
		String path = request.getRequestURI();
		// e.g. "/MyArtifact/MyServlet/5"
		String[] pathElements = path.split("/");
		// e.g. ["","MyArtifact","MyServlet","5"]
		
		switch (pathElements[2]) {
		case "submission": {
			int id = Integer.parseInt(pathElements[3]);
			try {
				response.getWriter().println("Your id is: " + id);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} break;
		}
	}*/

}
