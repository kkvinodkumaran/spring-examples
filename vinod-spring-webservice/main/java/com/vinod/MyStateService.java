package com.vinod;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/stateservice")
public class MyStateService {
	@RequestMapping(value = "/{code}", method = RequestMethod.GET)
	public @ResponseBody State getStateDetails(@PathVariable String code) {
		State result;
		if (code.equals("KL")) {
			result = new State("Kerala", "KL");
		} else {
			result = new State("DefaultName", "DefaultCode");
		}
		return result;
	}

}
