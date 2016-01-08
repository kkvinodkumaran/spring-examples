package com.vinod.examples;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.Query;

public class MorphiaTest {

   public static void main(String[] args) {
      MorphiaConnection mc = MorphiaConnection.instance();
      Datastore ds = mc.getDatabase();

      Employee emp = new Employee();
      emp.setName("vinod");
      emp.setAddress("Bangalore");
      ds.save(emp);
      System.out.println("Employee details saved");

      Query<Employee> emp1 = ds.find(Employee.class);

      System.out.println(emp1.fetch().next());
   }

}
