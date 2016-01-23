package com.vinod.examples;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MapReduceCommand;
import com.mongodb.MapReduceOutput;
import com.mongodb.Mongo;

public class MapReduceExample {

    public static void main(String[] args) {
	Mongo mongo;

	try {
	    mongo = new Mongo("localhost", 27017);
	    DB db = mongo.getDB("library");

	    DBCollection customerCollection = db.getCollection("CustomerDetails");

	    BasicDBObject customer = new BasicDBObject();
	    customer.put("name", "RAM");
	    customer.put("age", 20);
	    customerCollection.insert(customer);

	    customer = new BasicDBObject();
	    customer.put("name", "CHANDRAN");
	    customer.put("age", 26);
	    customerCollection.insert(customer);

	    customer = new BasicDBObject();
	    customer.put("name", "VINOD");
	    customer.put("age", 24);
	    customerCollection.insert(customer);

	    customer = new BasicDBObject();
	    customer.put("name", "SRIKUMAR");
	    customer.put("age", 30);
	    customerCollection.insert(customer);

	    customer = new BasicDBObject();
	    customer.put("name", "SURAJ");
	    customer.put("age", 12);
	    customerCollection.insert(customer);

	    customer.put("name", "REEJU");
	    customer.put("age", 18);
	    customerCollection.insert(customer);

	    customer = new BasicDBObject();
	    customer.put("name", "VINITHA");
	    customer.put("age", 32);
	    customerCollection.insert(customer);

	    customer = new BasicDBObject();
	    customer.put("name", "NIRMAL");
	    customer.put("age", 23);
	    customerCollection.insert(customer);

	    customer = new BasicDBObject();
	    customer.put("name", "RAGHAV");
	    customer.put("age", 10);
	    customerCollection.insert(customer);

	    customer = new BasicDBObject();
	    customer.put("name", "SAYOOJ");
	    customer.put("age", 33);
	    customerCollection.insert(customer);

	    System.out.println("Total records in Customer collections");
	    // Retrieving collection details
	    DBCursor cursorDoc = customerCollection.find();
	    while (cursorDoc.hasNext()) {
		System.out.println("Customer details " + cursorDoc.next());
	    }

	    String map = "function() { " + "var category; " + "if ( this.age >= 21 ) " + "category = 'Major'; "
		    + "else " + "category = 'Minor'; " + "emit(category, {name: this.name});}";

	    String reduce = "function(key, values) { " + "var sum = 0; " + "values.forEach(function(doc) { "
		    + "sum += 1; " + "}); " + "return {mycustomer: sum};} ";

	    MapReduceCommand cmd = new MapReduceCommand(customerCollection, map, reduce, null,
		    MapReduceCommand.OutputType.INLINE, null);

	    MapReduceOutput out = customerCollection.mapReduce(cmd);
	    System.out.println("Mapreduce results");

	    for (DBObject o : out.results()) {
		System.out.println(o.toString());
	    }
	} catch (Exception e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }

}
