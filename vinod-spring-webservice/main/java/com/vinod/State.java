package com.vinod;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
@XmlRootElement(name = "state")
public class State {
	@XmlElement(name = "name")
	private String name;
	@XmlElement(name = "code")
	private String code;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public State(String name, String code) {
		super();
		this.name = name;
		this.code = code;
	}
	

}
