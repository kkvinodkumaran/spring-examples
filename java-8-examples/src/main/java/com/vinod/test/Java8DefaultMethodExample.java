package com.vinod.test;

public class Java8DefaultMethodExample {
	/*
	 * Default methods enable us to add new functionalities to interfaces
	 * without breaking the classes that implements that interface. Lets take a
	 * look at the example below.
	 */
	public static void main(String[] args) {
		Vehicle civic = new Civic();
		Vehicle accord = new Accord();
		civic.printName("Civic");
		accord.printName("Accord");
		accord.printColor("White");

	}

}
