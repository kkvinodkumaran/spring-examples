package com.vinod.vinod_rest_examples;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("/state")
public class JaxRsJaxBController {
	//http://localhost:8080/state/KL
	@GET
	@Path("/{param}")
	@Produces(MediaType.APPLICATION_XML)
	public State getStateXML(@PathParam("param") String code) {
		State state = new State();
		state.setCode("KL");
		if (code.equals("KL")) {
			state.setName("KERALA");
		}
		return state;
	}
}
