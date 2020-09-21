package com.nd.SFGPetClinicReal.bootstrap;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nd.SFGPetClinicReal.model.Owner;
import com.nd.SFGPetClinicReal.model.Pet;
import com.nd.SFGPetClinicReal.model.PetType;
import com.nd.SFGPetClinicReal.model.Speciality;
import com.nd.SFGPetClinicReal.model.Vet;
import com.nd.SFGPetClinicReal.services.OwnerService;
import com.nd.SFGPetClinicReal.services.PetService;
import com.nd.SFGPetClinicReal.services.PetTypeService;
import com.nd.SFGPetClinicReal.services.SpecialitiesService;
import com.nd.SFGPetClinicReal.services.VetService;
import com.nd.SFGPetClinicReal.services.Map.OwnerServiceMap;
import com.nd.SFGPetClinicReal.services.Map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;
	private final SpecialitiesService specialitiesService;

	@Autowired
	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService,
			SpecialitiesService specialitiesService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
		this.specialitiesService = specialitiesService;
	}

	@Override
	public void run(String... args) throws Exception {

		int count = petTypeService.findAll().size();

		if (count == 0) {
			loadData();
		}
	}

	private void loadData() {
		PetType dog = new PetType();
		dog.setName("Dog");
		PetType savedDogPetType = petTypeService.save(dog);
		System.out.println("PetType:Dog");

		PetType cat = new PetType();
		dog.setName("Cat");
		PetType savedCatPetType = petTypeService.save(cat);
		System.out.println("PetType:Cat");

		Speciality radiology = new Speciality();
		radiology.setDescription("Radiology");
		Speciality savedRadiology = specialitiesService.save(radiology);

		Speciality surgery = new Speciality();
		surgery.setDescription("Surgery");
		Speciality savedSurgery = specialitiesService.save(surgery);

		Speciality dentistry = new Speciality();
		dentistry.setDescription("Dentistry");
		Speciality savedDentisrty = specialitiesService.save(dentistry);

		Owner owner1 = new Owner();
		owner1.setFirstName("Nirr");
		owner1.setLastName("Dhi");
		owner1.setAddress("Hillsboro");
		owner1.setCity("portland");
		owner1.setTelephone("1234567");

		Pet mikePet = new Pet();
		mikePet.setPetType(savedDogPetType);
		mikePet.setOwner(owner1);
		mikePet.setBirthDate(LocalDate.now());
		mikePet.setName("Dippy");
		owner1.getPets().add(mikePet);

		ownerService.save(owner1);

		Vet vet1 = new Vet();
		vet1.setFirstName("Sum");
		vet1.setLastName("wad");
		vet1.getSpecialities().add(savedRadiology);

		vetService.save(vet1);

		System.out.println("Owner1 saved");

		Owner owner2 = new Owner();
		owner2.setFirstName("Dip");
		owner2.setLastName("kad");
		owner2.setAddress("Pooja");
		owner2.setCity("DHor");
		owner2.setTelephone("1234567");

		Pet kikeePet = new Pet();
		kikeePet.setPetType(savedDogPetType);
		kikeePet.setOwner(owner2);
		kikeePet.setBirthDate(LocalDate.now());
		kikeePet.setName("Dippy");
		owner2.getPets().add(kikeePet);

		ownerService.save(owner2);

		Vet vet2 = new Vet();
		vet2.setFirstName("Him");
		vet2.setLastName("pan");
		vet2.getSpecialities().add(savedSurgery);
		vetService.save(vet2);

		System.out.println("Owner2 saved");
	}

}
