	package com.vinod.test;
	
	public class Java8ThreadExample {
		public static void main(String[] args) {
			Thread t1 = new Thread(Java8ThreadExample::printJob);
			Thread t2 = new Thread(Java8ThreadExample::printJob);
			t1.start();
			t2.start();
	
		}
		public static void printJob() {
			for (int i = 1; i <= 15; i++) {	
				System.out.println(Thread.currentThread()+"printing" + i);
			}
	
		}
	}
