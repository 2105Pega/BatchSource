package com.kyle.controllers;

import java.net.URI;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kyle.user.User;
import com.kyle.user.UserService;

@Path("/c")
public class MyController {
	UserService us = new UserService();

	@Path("/hello")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String helloWorld() {
		return "Hello World! This is a jersey thing.";
	}
	
	@Path("{id}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getId(@PathParam("id") int id) {
		return "Your id is: " + id;
	}
	
	// look into FormParam
	/*
	@Path("/query")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getQuery(@QueryParam("name") String name) {
		return "Your name: " + name;
	}
	*/
	
	@Path("/form")
	@POST
	public Response getForm(@FormParam("username") String username, @FormParam("password") String password) {
		URI bazinga = URI.create("http://localhost:8080/JerseyProject/api/c/hello");
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
		User user = us.checkUser(username, password);
		if(user != null) {
			bazinga = URI.create("http://localhost:8080/JerseyProject/api/c/"+user.getId());
		}
		return Response.seeOther(bazinga).build();
	}
	
	@Path("/user")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getUser() {
		User u = new User();
		u.setName("Kyle");
		u.setUsername("kmaxc");
		
		ObjectMapper om = new ObjectMapper();
		try {
			return om.writeValueAsString(u);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "";
		}
	}
	
	@Path("/user_easy")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public User getUserEasy() {
		User u = new User();
		u.setName("Kyle Easy");
		u.setUsername("kmaxc");
		
		return u;
	}

	@Path("/user_easy")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void postUserEasy(User user) {
		System.out.println("User's name: " + user.getName());
	}

}
