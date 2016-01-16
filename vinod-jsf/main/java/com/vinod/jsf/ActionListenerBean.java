package com.vinod.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;

@ManagedBean(name = "actionListenerBean", eager = true)
public class ActionListenerBean {
	public ActionListenerBean() {
		System.out.println("My ActionListenerBean");

	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String submit() {
		System.out.println("submit clicked");
		return "success.jsp";
	}
	public void actionSubmit(ActionEvent e) {
		System.out.println("Action submit triggered");
		System.out.println("Action submit event =" + e.getComponent().getId());
		setName(e.getComponent().getId());
	}

}
