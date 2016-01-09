package com.vinod.vinod_rest_examples;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/MyFirstRest")
public class MyFirstRest {

   @GET
   @Path("helloworld")
   @Produces(MediaType.APPLICATION_JSON)
   public String test() {
       return "Hello world";
   }
}