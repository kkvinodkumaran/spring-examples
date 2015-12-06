package com.vinod.test;

public class Employee {
	private String name;
	private String department;
	private String address;
	private Integer age;

	public Employee(String name, String department, String address,
			Integer age) {
		super();
		this.name = name;
		this.department = department;
		this.address = address;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department
				+ ", address=" + address + ", age=" + age + "]";
	}

}
