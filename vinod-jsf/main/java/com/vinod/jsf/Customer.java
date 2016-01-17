package com.vinod.jsf;

public class Customer {
	private String name;
	private String address;
	private String phonenumber;
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public Customer(String name, String address, String phoneNumber) {
		super();
		this.name = name;
		this.address = address;
		this.phonenumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
