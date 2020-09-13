package com.nd.SFGPetClinicReal.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import model.Owner;
import model.PetType;
import model.Speciality;
import model.Vet;
import services.OwnerService;
import services.PetService;
import services.PetTypeService;
import services.VetService;
import services.Map.OwnerServiceMap;
import services.Map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;

	@Autowired
	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
	}

	@Override
	public void run(String... args) throws Exception {
		
		PetType dog = new PetType();
		dog.setName("Dog");
		PetType savedDogPetType = petTypeService.save(dog); 

		PetType cat = new PetType();
		dog.setName("Cat");
		PetType savedCatPetType = petTypeService.save(cat);
		
		Owner owner1 = new Owner();
		owner1.setFirstName("Nirr");
		owner1.setLastName("Dhi");

		ownerService.save(owner1);

		Vet vet1 = new Vet();
		vet1.setFirstName("Sum");
		vet1.setLastName("wad");

		vetService.save(vet1);

		System.out.println("Owner1 saved");

		Owner owner2 = new Owner();
		owner2.setFirstName("Dip");
		owner2.setLastName("kad");

		ownerService.save(owner2);

		Vet vet2 = new Vet();
		vet2.setFirstName("Him");
		vet2.setLastName("pan");

		vetService.save(vet2);

		System.out.println("Owner2 saved");
	}

}
