package com.vinod.vinod_rest_examples;

import java.io.IOException;

import javax.annotation.Priority;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;

@Provider
@Priority(value = 1)
public class MyRequestFilter implements ContainerRequestFilter {

	public void filter(ContainerRequestContext requestContext) throws IOException {
		System.out.println("Executing request filter" + requestContext.getUriInfo().getPath());
	}

}
