package com.vinod.vinod_rest_examples;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
		context.setContextPath("/");

		Server jettyServer = new Server(8080);
		jettyServer.setHandler(context);

		ServletHolder jerseyServlet = context.addServlet(org.glassfish.jersey.servlet.ServletContainer.class, "/*");
		jerseyServlet.setInitOrder(0);

		// Setting pacakge name over here to load services
		jerseyServlet.setInitParameter("jersey.config.server.provider.packages", "com.vinod.vinod_rest_examples");
		try {
			jettyServer.start();
			jettyServer.join();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			jettyServer.destroy();
		}
	}
}
