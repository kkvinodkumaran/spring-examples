package com.vinod.vinod_rest_examples;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
@Path("/request")
public class MyhttpHeaders {
	/**
	 * http://localhost:8080/request/httpHeaders
	 * @param headers
	 * @return
	 */
	@GET
	   @Path("httpHeaders")
	   @Produces(MediaType.APPLICATION_JSON)
	   public String test(@Context HttpHeaders headers) {
	       return headers.getHeaderString("user-agent");
	   }
}
