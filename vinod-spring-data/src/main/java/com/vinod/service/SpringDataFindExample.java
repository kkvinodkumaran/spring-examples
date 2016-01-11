package com.vinod.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.data.document.mongodb.MongoOperations;
import org.springframework.data.document.mongodb.query.Criteria;
import org.springframework.data.document.mongodb.query.Query;

import com.vinod.model.Customer;

public class SpringDataFindExample {
	public static void main(String args[]) {
		ApplicationContext ctx = new GenericXmlApplicationContext("application-context.xml");
		MongoOperations mongoOperation = (MongoOperations) ctx.getBean("customermongoTemplate");
		Customer customer = new Customer("Vinod", "Bangalore");
		mongoOperation.save("customerDetails", customer);

		// findone
		Customer savedCustomer = mongoOperation.findOne("customerDetails",
				new Query(Criteria.where("name").is("Vinod")), Customer.class);
		System.out.println("savedCustomer : " + savedCustomer);

		// findall

		List<Customer> savedCustomerList = mongoOperation.find("customerDetails",
				new Query(Criteria.where("name").is("Vinod")), Customer.class);
		System.out.println("savedCustomerlist : " + savedCustomerList);

	}
}
