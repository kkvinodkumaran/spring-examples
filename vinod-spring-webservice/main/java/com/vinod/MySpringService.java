package com.vinod;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/state")
public class MySpringService {
	@RequestMapping(value = "/{code}", method = RequestMethod.GET)
	public @ResponseBody String getState(@PathVariable String code) {
		String result;
		if (code.equals("KL")) {
			result = "Kerala";
		} else {
			result = "Default State";
		}
		return result;
	}
}
