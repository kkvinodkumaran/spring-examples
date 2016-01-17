package com.vinod.jsf;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
@FacesConverter("com.vinod.InputConverter")
public class InputConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
        System.out.println(" object value " + value);
        return value;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
        System.out.println(" string value " + value);
        return "Mr." + value.toString();
	}

}
