package com.vinod.test;

import com.google.gson.Gson;

public class GsonExample {

	public static void main(String args[]) {
		Gson gson = new Gson();

		// convert java object to JSON format,
		Customer customer = new Customer("vinod", "Bangalore");
		String customerJson = gson.toJson(customer);
		System.out.println(customer);
		// convert json to java object
		Customer cust = gson.fromJson(customerJson, Customer.class);
		System.out.println(cust);

	}
}
