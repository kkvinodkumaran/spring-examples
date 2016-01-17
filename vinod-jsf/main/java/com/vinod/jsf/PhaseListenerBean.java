package com.vinod.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;

@ManagedBean
public class PhaseListenerBean {
	public String getMessage() {
		return "Hello World!";
	}

	public void phaseTest(PhaseEvent evt) throws Exception {
		try {
			if (PhaseId.APPLY_REQUEST_VALUES.equals(evt.getPhaseId())) {
				System.out.println("Phase is " + PhaseId.APPLY_REQUEST_VALUES);
			}
			if (PhaseId.INVOKE_APPLICATION.equals(evt.getPhaseId())) {
				System.out.println("Phase is " + PhaseId.INVOKE_APPLICATION);
			}
			if (PhaseId.RENDER_RESPONSE.equals(evt.getPhaseId())) {
				System.out.println("Phase is " + PhaseId.RENDER_RESPONSE);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String actionSubmit() {
		System.out.println("Action submit triggered");
		return "phase.xhtml";

	}
}
