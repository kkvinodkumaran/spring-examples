package com.vinod.service;

import java.util.Iterator;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.data.document.mongodb.MongoOperations;

import com.vinod.model.Customer;

public class SpringDataInsert {
	public static void main(String args[]) {
		ApplicationContext ctx = new GenericXmlApplicationContext("application-context.xml");
		MongoOperations mongoOperation = (MongoOperations) ctx.getBean("customermongoTemplate");
		Customer customer = new Customer("Vinod", "Bangalore");
		mongoOperation.save("customerDetails", customer);
		// List
		List<Customer> listCustomer = mongoOperation.getCollection("customerDetails", Customer.class);
		Iterator<Customer> iterator = listCustomer.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
