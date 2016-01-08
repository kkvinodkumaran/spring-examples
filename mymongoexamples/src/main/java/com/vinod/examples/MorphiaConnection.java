package com.vinod.examples;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import com.mongodb.MongoClient;


public class MorphiaConnection {
   private static final MorphiaConnection INSTANCE = new MorphiaConnection();

   private final Datastore datastore;
   public static final String DB_NAME = "mydb";

   private MorphiaConnection() {
          try {
                 MongoClient mongo = new MongoClient("127.0.0.1", 27017);
                 datastore = new Morphia().mapPackage( "com.vinod.examples").createDatastore(mongo, DB_NAME);
                 datastore.ensureIndexes();
          } catch (Exception e) {
                 throw new RuntimeException(
                               "Error initializing mongo connections", e);
          }
   }

   public static MorphiaConnection instance() {
          return INSTANCE;
   }

   public Datastore getDatabase() {
          return datastore;
   }
}


