package com.vinod;

public class SimpleValidate {
	public String validation(String name, String gender) {
		if (name.equals("")) {
			System.out.println("name should not be null");
		}
		if (gender.equals("")) {
			System.out.println("gender should not be null");
		}
		String result = null;
		if (name.equals("pretech")) {
			if (gender.equals("male")) {
				result = "success";
			} else {
				result = "fail";
			}
		} else {
			result = "try again";
		}
		return result;
	}
}
