package com.nd.SFGPetClinicReal.repositories;

import org.springframework.data.repository.CrudRepository;

import com.nd.SFGPetClinicReal.model.Owner;

public interface OwnRepository extends CrudRepository<Owner, Long>{
	
	public Owner findByLastName(String lastName);
}
