package com.vinod.test;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamExample {

	/*
	 * 
	 * 
	 * Sequence of elements − A stream provides a set of elements of specific
	 * type in a sequential manner. A stream gets/computes elements on demand.
	 * It never stores the elements.
	 * 
	 * Source − Stream takes Collections, Arrays, or I/O resources as input
	 * source.
	 * 
	 * Aggregate operations − Stream supports aggregate operations like filter,
	 * map, limit, reduce, find, match, and so on.
	 * 
	 * Pipelining − Most of the stream operations return stream itself so that
	 * their result can be pipelined. These operations are called intermediate
	 * operations and their function is to take input, process them, and return
	 * output to the target. collect() method is a terminal operation which is
	 * normally present at the end of the pipelining operation to mark the end
	 * of the stream.
	 * 
	 * Automatic iterations − Stream operations do the iterations internally
	 * over the source elements provided, in contrast to Collections where
	 * explicit iteration is required.
	 * 
	 */
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

		System.out.println("Before java 8");
		for (Employee emp : empList) {
			System.out.println(emp);
		}
		// java 8
		System.out.println("Java 8 Iterating List");

		empList.stream().forEach(System.out::println);
		
		
		
		// Filter
		System.out.println("Java 8 filtering a list");
		List<Employee> filterEmployee = empList.stream()
				.filter(e -> e.getName().equalsIgnoreCase("Vinod"))
				.collect(Collectors.toList());;
		System.out.println(filterEmployee.toString());
		
		
		
		// Limit
		List<Employee> limitEmployee = empList.stream().limit(2)
				.collect(Collectors.toList());;
		System.out.println(limitEmployee);
		
		//Match
		boolean matchEmployee = empList.stream().anyMatch(e->e.getAge()<30);
		System.out.println("Match  :"+matchEmployee);
		
		//Map example
		IntSummaryStatistics stats = empList.stream()
				.mapToInt((x) -> x.getAge()).summaryStatistics();

		System.out.println("Highest age in List : " + stats.getMax());
		System.out.println("Lowest age in List : " + stats.getMin());
		System.out.println("Average of all ages : " + stats.getAverage());

	}

}
