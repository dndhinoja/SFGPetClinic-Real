package com.nd.SFGPetClinicReal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nd.SFGPetClinicReal.services.VetService;

@Controller
public class VetController {
	
	private final VetService vetService;
	@Autowired
	public VetController(VetService vetService) {
		super();
		this.vetService = vetService;
	}

	@RequestMapping({"/vets","/vets/index","/vets/index.html","/vets.html"})
	public String listVet(Model model) {
		model.addAttribute("vets", vetService.findAll());
		return "vets/index";
	}
}
