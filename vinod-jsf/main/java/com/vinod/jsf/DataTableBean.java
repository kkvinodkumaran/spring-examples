package com.vinod.jsf;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class DataTableBean {

	public DataTableBean() {
	}
    public List getCustomers() {
        List customers = new ArrayList();
        customers.add(new Customer("vinod", "Bangalore", "7777777777"));
        customers.add(new Customer("hari", "chennai", "7777447777"));
        customers.add(new Customer("Jithesh", "Pala", "7777557777"));
        return customers;

    }
}
