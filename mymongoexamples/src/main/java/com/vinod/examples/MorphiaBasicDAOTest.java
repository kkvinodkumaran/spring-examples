package com.vinod.examples;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import com.mongodb.MongoClient;

public class MorphiaBasicDAOTest {
   public static final String DB_NAME = "mydb";

   public static void main(String[] args) {
      try {
         Employee emp = new Employee();
         emp.setName("vinod");
         emp.setAddress("Bangalore");
         MongoClient mongo = new MongoClient("127.0.0.1", 27017);
         Datastore datastore = new Morphia().mapPackage("com.vinod.examples").createDatastore(mongo, DB_NAME);

         EmployeeDAO empDoa = new EmployeeDAO(Employee.class, datastore);
         empDoa.save(emp);
         System.out.println("Employee Data saved");
         System.out.println("All employees: " + empDoa.findAll());

      } catch (Exception e) {
         e.printStackTrace();
      }

   }

}
