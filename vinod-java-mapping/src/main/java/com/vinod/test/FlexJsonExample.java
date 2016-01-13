package com.vinod.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;

public class FlexJsonExample {

	public static void main(String[] args) {

		// Java object to Json
		JSONSerializer serializer = new JSONSerializer();
		serializer.prettyPrint(true);
		Customer customer = new Customer("Vinod", "Bangalore");
		String flexJsonString = serializer.serialize(customer);
		System.out.println(flexJsonString);

		// Java Map key value pair to Json

		Map<String, Object> data = new HashMap<String, Object>();
		data.put("NAME", "vinod");
		data.put("LOCATION", "Bangalore");
		data.put("ADDRESS", customer);
		String mapstring = serializer.serialize(data);
		System.out.println(mapstring);

		// Java list of object to Json String
		Customer customer1 = new Customer("Vinod", "Bangalore");
		Customer customer2 = new Customer("Raghava", "Bangalore");
		Customer customer3 = new Customer("Krishna", "Bangalore");

		List<Customer> pcs = Arrays.asList(customer1, customer2, customer3);
		String listString = serializer.serialize(pcs);
		System.out.println(listString);

		// Deserialization

		Customer custo = (Customer) new JSONDeserializer().use(null, Customer.class).deserialize(flexJsonString);
		System.out.println(custo);

	}

}
