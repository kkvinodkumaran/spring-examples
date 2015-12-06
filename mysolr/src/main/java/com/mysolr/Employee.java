package com.mysolr;

import org.apache.solr.client.solrj.beans.Field;

public class Employee {
	@Field("empId")
	private Long empId;
	@Field("empFirstName")
	private String empFirstName;
	@Field("empLastName")
	private String empLastName;
	@Field("empAddress1")
	private String empAddress1;
	@Field("empAddress2")
	private String empAddress2;
	@Field("empCity")
	private String empCity;
	@Field("empZipCode")
	private String empZipCode;
	
	
	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	public String getEmpAddress1() {
		return empAddress1;
	}

	public void setEmpAddress1(String empAddress1) {
		this.empAddress1 = empAddress1;
	}

	public String getEmpAddress2() {
		return empAddress2;
	}

	public void setEmpAddress2(String empAddress2) {
		this.empAddress2 = empAddress2;
	}

	public String getEmpCity() {
		return empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}

	public String getEmpZipCode() {
		return empZipCode;
	}

	public void setEmpZipCode(String empZipCode) {
		this.empZipCode = empZipCode;
	}

}
