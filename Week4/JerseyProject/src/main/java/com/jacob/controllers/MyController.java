package com.jacob.controllers;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Path("/controller")
public class MyController {

	@Path("/hello")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String helloWorld() {
		return "Hello!";
	}
	
	@Path("{id}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getId(@PathParam("id") int id) {
		return "Your ID: " + id;
	}
	
	@Path("/user")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getUser() {
		User u = new User();
		u.name = "Jacob";
		u.age = 100;
		u.email = "jacob@site.com";
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.writeValueAsString(u);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "";
		}
	}
	
	@Path("/user_easy")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void postUserEasy(User user) {
		System.out.println("User name: " + user.name);
	}
	
	@Path("/user_easy")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public User getUserEasy() {
		User u = new User();
		u.name = "Jacob";
		u.age = 100;
		u.email = "jacob@site.com";
		
		return u;
	}
}
