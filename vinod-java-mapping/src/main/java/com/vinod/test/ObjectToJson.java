package com.vinod.test;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;

public class ObjectToJson {
	public static void main(String[] args) {
		Customer customer = new Customer("vinod", "bangalore");
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		try {
			// Object to JSON String
			String customerJson = ow.writeValueAsString(customer);
			System.out.println(customerJson);

			// Json String to object
			ObjectMapper mapper = new ObjectMapper();

			Customer cus = mapper.readValue(customerJson, Customer.class);
			System.out.println(cus);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}