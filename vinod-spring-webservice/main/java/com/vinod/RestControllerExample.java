package com.vinod;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerExample {
	@RequestMapping("/hello/{name}")
	public Customer message(@PathVariable String name) {
		return new Customer("Hello " + name, "USA");
	}

}

class Customer {
	private String name;
	private String address;

	public Customer(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}