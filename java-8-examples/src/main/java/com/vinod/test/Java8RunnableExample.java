package com.vinod.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Java8RunnableExample {
	 private static ExecutorService executor = null;
	public static void main(String[] args) {
		Runnable r = () -> print();
		executor = Executors.newFixedThreadPool(2);
		executor.submit(r);
	}

	private static void print() {
		System.out.println("Vinod");
		
	}
}
