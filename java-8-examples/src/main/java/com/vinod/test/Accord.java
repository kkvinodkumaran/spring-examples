package com.vinod.test;

public class Accord implements Vehicle {

	@Override
	public void printName(String name) {
		System.out.println("I am Vehicle ...." + name);
	}
	@Override
	public void printColor(String color) {
		System.out.println("My color is ...." + color);
	}

}
