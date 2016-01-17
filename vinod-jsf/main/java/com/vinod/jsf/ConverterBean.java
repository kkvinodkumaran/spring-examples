package com.vinod.jsf;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ConverterBean {
    public ConverterBean() {
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
        return "ConverterExample.xhtml";
    }
}
