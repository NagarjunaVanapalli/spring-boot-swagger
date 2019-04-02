package com.springboot.nag;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping(value = "status", method = RequestMethod.GET)
	public String getStatus() {
		return "Get service successfully Running";
	}

	@RequestMapping(value = "status", method = RequestMethod.POST)
	public String setStatus() {
		return "Post service successfully Running";
	}

}
