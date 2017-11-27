package com.bridgeit.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/publish")
public class RestHello {

	  @GET
	    @Path("/{message}")
	    public Response publishMessage(@PathParam("message") String msgStr){
	         
	        String responseStr = "Received message: "+msgStr;
	        return Response.status(200).entity(responseStr).build();
	    }
}
