package com.vinod.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class NewJSFManagedBean {
	private String name;
	private String address;

	public NewJSFManagedBean() {
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

	public String nameSubmission() {
		return "validationtest.xhtml";
	}

	public String addressSubmission() {
		return "validationtest.xhtml";
	}
}
