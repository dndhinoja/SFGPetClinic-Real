package com.nd.SFGPetClinicReal.repositories;

import org.springframework.data.repository.CrudRepository;

import com.nd.SFGPetClinicReal.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long>{
	
}
