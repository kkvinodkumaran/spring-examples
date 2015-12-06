package com.test.solr;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.google.gson.Gson;
import com.mysolr.Employee;

public class SolrServiceStart {

	public static void main(String[] args) {

		String configLocation = "classpath:activemq-applicationContext.xml";
		Gson gson = new Gson();
		Employee emp = new Employee();
		emp.setEmpId(new Long(12));
		emp.setEmpFirstName("Vinod");
		emp.setEmpLastName("Kariyathungal Kumaran");
		emp.setEmpAddress1("3200 Payne Avenue");
		emp.setEmpAddress2("Apartment 441");
		emp.setEmpCity("San Jose");
		emp.setEmpZipCode("95117");
		System.out.println(gson.toJson(emp));
		new ClassPathXmlApplicationContext(configLocation);

	}

}
