package com.vinod.service;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.mongodb.Mongo;
public class BusinessServiceImpl implements BusinessService {

	public String updateData(String data) {
		Mongo mongo;
		String status="Success";
		try {
			mongo = new Mongo("localhost");
			MongoTemplate mongoTemplate = new MongoTemplate(mongo,
					"LocationDocuments");
			// Create Collections
			if (!mongoTemplate.collectionExists("Location")) {
				mongoTemplate.createCollection("Location");
			}
			System.out.println(
					"Collection created " + mongoTemplate.getCollectionNames());
            Gson gson = new Gson();
            Location obj = gson.fromJson(data, Location.class);
			mongoTemplate.save(obj);
            System.out.println("Data updated in to mongodb "+obj);
			String result=RestCallClient.excecuteRestPostCall("http://localhost:8182/solrPushService", data);
            System.out.println("Data updated in to solr asynchronously "+result);
			status="Success";
		} catch (Exception e) {
			status=e.getMessage();
			e.printStackTrace();
		}
		return status;

	}
}