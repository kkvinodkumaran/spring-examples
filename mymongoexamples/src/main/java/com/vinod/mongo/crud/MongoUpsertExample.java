package com.vinod.mongo.crud;

import java.net.UnknownHostException;
import com.mongodb.BasicDBObject;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoException;

public class MongoUpsertExample {

	public static void main(String[] args) {
		try {
			System.out.println("Mongodb Upsert object example...");
			// Creating mongoinstance
			Mongo mongo = new Mongo("localhost", 27017);

			// Creating database instance
			DB db = mongo.getDB("mydb");

			// Creating collection object
			DBCollection collection = db.getCollection("vinodUpsert2");
			final BasicDBObject query = new BasicDBObject("name", "vinod");

			// Creating BasicDBObjectBuilder object without arguments
			DBObject documentBuilder = BasicDBObjectBuilder.start().add("address", "bangalore")
					.add("phone", "9988998899").get();

			// get the dbobject from builder and Inserting document
			collection.update(query, new BasicDBObject("$set", documentBuilder), true, false);

			// fetch the inserted value
			System.out.println("Inserted record" + collection.findOne(new BasicDBObject("name", "vinod")));

			// Retrieving collection details
			DBCursor cursorDoc = collection.find();
			while (cursorDoc.hasNext()) {
				System.out.println("After insert vinod details " + cursorDoc.next());
			}

			DBObject documentBuilder1 = BasicDBObjectBuilder.start().add("address", "chennai")
					.add("phone", "9999999999").get();

			// get the dbobject from builder and upserting document
			collection.update(query, new BasicDBObject("$set", documentBuilder1), true, false);

			// Retrieving collection details
			DBCursor cursorDoc1 = collection.find();
			while (cursorDoc1.hasNext()) {
				System.out.println("After upsert vinod details " + cursorDoc1.next());
			}
			// Retrieving collection details
			DBCursor newcursorDoc = collection.find();
			System.out.println("No of records exists" + newcursorDoc.count());
			System.out.println("End of program");
		} catch (MongoException e) {
			e.printStackTrace();
		}
	}

}
