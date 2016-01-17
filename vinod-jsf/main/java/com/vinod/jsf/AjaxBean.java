package com.vinod.jsf;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
@ManagedBean
@RequestScoped
public class AjaxBean {
	public AjaxBean() {
	}
	private String name;
	private String designation;
	private String address;
	private String phonenumber;
	private String companyname;

	public String getDetails() {
		setName("Vinod");
		setDesignation("Software Engineer");
		setAddress("Bangalore");
		setPhonenumber("9090909090");
		setCompanyname("Sasi technologies");
		return "Success";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
}