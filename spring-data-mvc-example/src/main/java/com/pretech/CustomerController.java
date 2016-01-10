package com.pretech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	public String getCustomerList(ModelMap model) {
		model.addAttribute("customerList", customerService.listCustomers());
		return "customerdetails";
	}

	@RequestMapping(value = "/customer/save", method = RequestMethod.POST)
	public View saveCustomer(@ModelAttribute Customer customer, ModelMap model) {
		customerService.saveCustomer(customer);
		return new RedirectView("/spring-data-mvc-example/customer");
	}

}