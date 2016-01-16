package com.vinod.jsf;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ValueChangeEvent;

/**
 * @author vinodkariyathungalkumaran
 *
 */
@RequestScoped
@ManagedBean
public class ChangeListenerBean {

	public ChangeListenerBean() {
	}
	private String country;
	private String updatedCountry;

	public String getUpdatedCountry() {
		return updatedCountry;
	}

	public void setUpdatedCountry(String updatedCountry) {
		this.updatedCountry = updatedCountry;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public ArrayList getCountries() {
		ArrayList countries = new ArrayList();
		countries.add("India");
		countries.add("Austria");
		countries.add("USA");
		return countries;
	}
	public void changeListernMethod(ValueChangeEvent e) {
		setUpdatedCountry("You selected " + e.getNewValue().toString());
	}

}