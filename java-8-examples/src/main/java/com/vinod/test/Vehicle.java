package com.vinod.test;

public interface Vehicle {
	void printName(String name);

	default public void printColor(String color) {
		System.out.println(color);
	}
}
