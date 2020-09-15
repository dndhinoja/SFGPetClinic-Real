package com.nd.SFGPetClinicReal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/oups")
	public String opps() {
		return "notimplemented";
	}
}
