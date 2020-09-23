package com.nd.SFGPetClinicReal.springDataJPAServices;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.nd.SFGPetClinicReal.model.Pet;
import com.nd.SFGPetClinicReal.repositories.PetRepository;
import com.nd.SFGPetClinicReal.services.PetService;

@Service
@Profile("springdatajpa")
public class PetJPAService implements PetService {

	private final PetRepository petRepository;

	public PetJPAService(PetRepository petRepository) {
		super();
		this.petRepository = petRepository;
	}

	@Override
	public Set<Pet> findAll() {
		Set<Pet> setOfPet = new HashSet<Pet>();
		petRepository.findAll().forEach(setOfPet::add);;
		return setOfPet;
	}

	@Override
	public Pet findById(Long id) {
		Optional<Pet> pets = petRepository.findById(id);
		if (pets.isPresent()) {
			return pets.get();
		} else {
			return null;
		}
	}

	@Override
	public Pet save(Pet object) {
		return petRepository.save(object);
	}

	@Override
	public void delete(Pet object) {
		petRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		petRepository.deleteById(id);
	}

}
