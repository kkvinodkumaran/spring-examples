package com.vinod.mongo.crud;

import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

import com.mongodb.BasicDBObject;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import com.mongodb.MongoException;

public class MongoBasicDBObjectBuilderExample {

	public static void main(String[] args) {
		try {
			System.out.println("Mongodb Basicdb object example...");
			// Creating mongoinstance
			Mongo mongo = new Mongo("localhost", 27017);
			// Creating database instance
			DB db = mongo.getDB("mydb");

			// Creating collection object
			DBCollection collection = db.getCollection("Employee");
			// Creating BasicDBObjectBuilder object without arguments
			BasicDBObjectBuilder documentBuilder = BasicDBObjectBuilder.start().add("name", "vinod").add("address",
					"bangalore");
			// get the dbobject from builder and Inserting document
			collection.insert(documentBuilder.get());
			// Creating BasicDBObjectBuilder object with arguments
			BasicDBObjectBuilder documentBuilder1 = BasicDBObjectBuilder.start("name", "vinod");
			collection.insert(documentBuilder1.get());
			// Creating BasicDBObjectBuilder object with map arguments
			Map<String, String> map = new HashMap<String, String>();
			map.put("name", "vinod");
			map.put("address", "bangalore");
			BasicDBObjectBuilder documentBuilder2 = BasicDBObjectBuilder.start(map);
			collection.insert(documentBuilder2.get());
			// Retrieving collection details
			DBCursor cursorDoc = collection.find();
			while (cursorDoc.hasNext()) {
				System.out.println(" details " + cursorDoc.next());
			}
		} catch (MongoException e) {
			e.printStackTrace();
		}
	}

}
