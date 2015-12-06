package com.vinod.test;

import java.util.Optional;

public class Java8NullHandlingExample {

	public static void main(String[] args) {
		Person person = new Person(null, null);
		
		if (person.getName() != null) {
			
			System.out.println("name length " + person.getName().length());

		}
		Optional<Person> mystring = Optional.of(person);
		String myname = mystring.map(Person::getName).orElse("SASI");
		System.out.println("name length " + myname.length());
	}

}
class Person {
	private String name;
	private String address;
	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
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

}