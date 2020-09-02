package com.nd.SFGPetClinicReal.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import model.Owner;
import model.Vet;
import services.OwnerService;
import services.PetService;
import services.VetService;
import services.Map.OwnerServiceMap;
import services.Map.PetServiceMap;
import services.Map.VetServiceMap;
@Component
public class DataLoader implements CommandLineRunner{

	private final OwnerService ownerService;
	private final VetService vetService;
	
	@Autowired
	public DataLoader(OwnerService ownerService, VetService vetService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
	}

	@Override
	public void run(String... args) throws Exception {
		Owner owner1 = new Owner();
		owner1.setId(1L);
		owner1.setFirstName("Nirr");
		owner1.setLastName("Dhi");
		
		ownerService.save(owner1);
		
		Vet vet1 = new Vet();
		vet1.setId(1L);
		vet1.setFirstName("Sum");
		vet1.setLastName("wad");
		
		vetService.save(vet1);
		
		System.out.println("Owner1 saved");
		
		Owner owner2 = new Owner();
		owner2.setId(2L);
		owner2.setFirstName("Dip");
		owner2.setLastName("kad");
		
		ownerService.save(owner2);
		
		Vet vet2 = new Vet();
		vet2.setId(2L);
		vet2.setFirstName("Him");
		vet2.setLastName("pan");
		
		vetService.save(vet2);
		
		System.out.println("Owner2 saved");
	}

}
