package com.vinod.jsf;

import javax.faces.bean.ManagedBean;
@ManagedBean(name = "myFirstManagedBean", eager = true)
public class MyFirstManagedBean {
	public MyFirstManagedBean() {
	      System.out.println("My bean");
	   }
	   public String getMessage() {
	      return "Welcome to my jsf example";
	   }
}
