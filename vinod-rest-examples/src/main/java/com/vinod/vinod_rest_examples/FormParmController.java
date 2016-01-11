package com.vinod.vinod_rest_examples;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.POST;

@Path("/stateform")
public class FormParmController {
	@POST
	@Path("/state")
	@Produces("application/xml")
	public Response getMsg(@FormParam("country") String country, @FormParam("state") String state) {
		String stateDetails = null;
		if (country.equals("India") & state.equals("KL")) {
			stateDetails = "<State><name>KERALA</name><shortname>KL</shortname>"
					+ "<headq>TRIVANDRUM</headq><language>MALAYALAM</language></State>";
		} else {
			stateDetails = "Data not found";
		}
		return Response.ok().entity(stateDetails).build();

	}
}
