package com.vinod.examples;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity(value = "Employee", noClassnameStored = true)
public class Employee {
   @Id
   private ObjectId id;
   private String name;
   private String address;

   public ObjectId getId() {
      return this.id;
   }

   public void setId(ObjectId id) {
      this.id = id;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getAddress() {
      return this.address;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   @Override
   public String toString() {
      return "Employee [id=" + this.id + ", name=" + this.name + ", address=" + this.address + "]";
   }

}
