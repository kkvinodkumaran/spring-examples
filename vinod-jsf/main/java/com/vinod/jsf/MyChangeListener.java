package com.vinod.jsf;

import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;

public class MyChangeListener implements ValueChangeListener { 

    @Override
    public void processValueChange(ValueChangeEvent event) throws AbortProcessingException {
       ChangeListenerBean changeListenerBean = (ChangeListenerBean) FacesContext.getCurrentInstance().
                getExternalContext().getRequestMap().get("changeListenerBean");
        System.out.println(changeListenerBean);
        System.out.println("Executin change listener");
        changeListenerBean.setUpdatedCountry("You Selected " +event.getNewValue()); 
    }
}