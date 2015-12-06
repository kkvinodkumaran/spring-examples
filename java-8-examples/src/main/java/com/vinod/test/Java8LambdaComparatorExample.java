package com.vinod.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Java8LambdaComparatorExample {

	public static void main(String[] args) {
		Employee emp1 = new Employee("Vinod", "Admin", "CA", 33);
		Employee emp2 = new Employee("Santhosh", "SD", "CA", 34);
		Employee emp3 = new Employee("Anish", "Fin", "CA", 30);
		Employee emp4 = new Employee("Raghav", "Sales", "CA", 12);
		Employee emp5 = new Employee("Raghav", "Sales", "CA", 12);

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);

		List<Employee> empNewList = new ArrayList<Employee>();
		empNewList.addAll(empList);

		// Java 7
		System.out.println("Java 7 Sorting using comparator");
		Collections.sort(empList, new Comparator<Employee>() {
			public int compare(Employee emp1, Employee emp2) {
				return emp1.getName().compareTo(emp2.getName());
			}
		});

		for (Employee e : empList) {
			System.out.println(e);
		}

		// Java 8
		System.out.println("Java 8 Sorting using Lambda expression");
		Collections.sort(empNewList,
				(s1, s2) -> s1.getName().compareTo(s2.getName()));
		System.out.println("after sort");
		empNewList.stream().forEach(System.out::println);

	}

}
