package com.vinod.test;

import java.util.StringJoiner;

public class Java8StringJoinerExample {

	public static void main(String[] args) {

		StringJoiner sj = new StringJoiner("-");
		sj.add("Honda").add("Toyota").add("Ford");
		System.out.println(sj);

		// String joiner with prefix and suffix
		StringJoiner sj1 = new StringJoiner("-", "My Vehicle List start",
				"My Vehicle List end");
		sj1.add("Honda").add("Toyota").add("Ford");
		System.out.println(sj1);

		// Merge two string joiner
		System.out.println(sj.merge(sj1));

	}

}
