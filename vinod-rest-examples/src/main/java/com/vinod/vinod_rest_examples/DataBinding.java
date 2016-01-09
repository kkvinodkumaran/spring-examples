package com.vinod.vinod_rest_examples;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/DataBinding")

public class DataBinding {

	/**
	 * http://localhost:8080/DataBinding/queryParam?name=vinod
	 * 
	 * @param name
	 * @return
	 */
	@GET
	@Path("queryParam")
	@Produces(MediaType.APPLICATION_JSON)
	public String queryParam(@QueryParam("name") String name) {
		return "Hello world " + name;
	}

	/**
	 * http://localhost:8080/DataBinding/vinod/pathParam
	 * 
	 * @param name
	 * @return
	 */
	@GET
	@Path("{name}/pathParam")
	@Produces(MediaType.APPLICATION_JSON)
	public String pathParam(@PathParam("name") String name) {
		return "Hello world " + name;
	}

	/**
	 * http://localhost:8080/DataBinding/headerParam
	 * 
	 * @param userAgent
	 * @return
	 */
	@Path("headerParam")
	@GET
	@Produces(MediaType.APPLICATION_JSON)

	public String headerParam(@HeaderParam("user-agent") String userAgent) {
		return "Hello world " + userAgent;
	}

	/**
	 * http://localhost:8080/DataBinding/matrixParam;name=vinod;address=
	 * bangalore
	 * 
	 * @param name
	 * @param address
	 * @return
	 */
	@Path("matrixParam")
	@GET
	@Produces(MediaType.APPLICATION_JSON)

	public String matrixParam(@MatrixParam("name") String name, @MatrixParam("address") String address) {
		return "Hello world " + name + "  " + address;
	}

	/**
	 * http://localhost:8080/DataBinding/formParam pass the name in the form
	 * request
	 * 
	 * @param name
	 * @return
	 */
	@Path("formParam")
	@POST
	public String formParam(@FormParam("name") String name) {
		return "Hello world " + name;
	}
}
