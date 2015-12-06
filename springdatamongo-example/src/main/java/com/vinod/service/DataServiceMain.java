package com.vinod.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.google.gson.Gson;

public class DataServiceMain {

	public static void main(String[] args) {
		Gson gson = new Gson();

		// convert the jsonstring back to java Object
		Location loc = new Location("Vinod", "Kariyathungal");
		String obj = gson.toJson(loc);
		System.out.println(obj);

	String configLocation = "classpath:activemq-applicationContext.xml";	
		new ClassPathXmlApplicationContext(configLocation);
	}

}
