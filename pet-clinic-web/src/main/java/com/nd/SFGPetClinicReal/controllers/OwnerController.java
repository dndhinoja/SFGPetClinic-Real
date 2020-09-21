package com.nd.SFGPetClinicReal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nd.SFGPetClinicReal.services.OwnerService;

@RequestMapping("/owners")
@Controller
public class OwnerController {
	
	private final OwnerService ownerService;
	@Autowired
	public OwnerController(OwnerService ownerService) {
		//super();
		this.ownerService = ownerService;
	}

	@RequestMapping({"","/","/index","/index.html"})
	public String listOwner(Model model) {
		model.addAttribute("owners", ownerService.findAll());
		return "owners/index";
	}
	@RequestMapping({"/find"})
	public String findOwners() {
		return "notimplemented";
	}
	
}
