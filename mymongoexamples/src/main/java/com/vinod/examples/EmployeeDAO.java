package com.vinod.examples;

import java.util.List;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.dao.BasicDAO;

public class EmployeeDAO extends BasicDAO<Employee, String> {

   public EmployeeDAO(Class<Employee> entityClass, Datastore ds) {
      super(entityClass, ds);
   }

   public List<Employee> findAll() {
      return ds.find(Employee.class).asList();
   }

   public List<Employee> findUnderName(String name) {
      return ds.find(Employee.class).filter("name = ", name).order("name").asList();
   }

}
