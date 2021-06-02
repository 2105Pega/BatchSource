package com.jacob.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/controller")
public class MyController {

	@Path("/hello")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String helloWorld() {
		return "Hello!";
	}
}
