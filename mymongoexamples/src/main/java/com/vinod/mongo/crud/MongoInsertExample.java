package com.vinod.mongo.crud;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import com.mongodb.MongoException;

public class MongoInsertExample {

	public static void main(String[] args) {
		try {
			System.out.println("BasicDBObject insert example...");
			// Creating mongoinstance
			Mongo mongo = new Mongo("localhost", 27017);
			// Creating database instance
			DB db = mongo.getDB("mydb");

			// Creating collection object
			DBCollection collection = db.getCollection("customer");

			// BasicDBObject helpful create docuent object
			// Creating contact object
			BasicDBObject contact = new BasicDBObject();
			contact.put("name", "vinod");
			contact.put("address", "bangalore");
			// Creating phone number object
			BasicDBObject phoneNumber = new BasicDBObject();
			phoneNumber.put("cell", "9999999999");
			phoneNumber.put("landline", "08099999999");
			phoneNumber.put("fax", "08099999990");

			// adding phone number object in to contact object
			contact.put("Phone numbers", phoneNumber);
			// Inserting document
			collection.insert(contact);

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
