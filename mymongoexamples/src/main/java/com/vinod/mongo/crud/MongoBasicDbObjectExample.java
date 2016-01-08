package com.vinod.mongo.crud;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import com.mongodb.MongoException;

public class MongoBasicDbObjectExample {

	public static void main(String[] args) {
		try {
			System.out.println("BasicDBObject insert example...");
			// Creating mongoinstance
			Mongo mongo = new Mongo("localhost", 27017);
			// Creating database instance
			DB db = mongo.getDB("mydb");

			// Creating collection object
			DBCollection collection = db.getCollection("customer");

			Customer customer = new Customer("vinod", "se", "wipro", "bangalore");

			collection.insert(customer);

			// Retrieving collection details
			DBCursor cursorDoc = collection.find();
			while (cursorDoc.hasNext()) {
				System.out.println("Address details " + cursorDoc.next());
			}
		} catch (MongoException e) {
			e.printStackTrace();
		}
	}

}

class Customer extends BasicDBObject {
	private static final long serialVersionUID = 1L;
	public String name;
	public String designation;
	public String employer;
	public String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Customer() {
	}

	public Customer(String name, String designation, String employer, String address) {
		put("name", name);
		put("designation", designation);
		put("employer", employer);
		put("address", address);

	}

}