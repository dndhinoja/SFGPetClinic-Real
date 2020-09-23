package com.nd.SFGPetClinicReal.springDataJPAServices;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import com.nd.SFGPetClinicReal.model.PetType;
import com.nd.SFGPetClinicReal.repositories.PetTypeRepository;
import com.nd.SFGPetClinicReal.services.PetTypeService;

public class PetTypeJPAService implements PetTypeService{

	private PetTypeRepository petTypeRepository;
	
	public PetTypeJPAService(PetTypeRepository petTypeRepository) {
		super();
		this.petTypeRepository = petTypeRepository;
	}

	@Override
	public Set<PetType> findAll() {
		Set<PetType> setOfPetType = new HashSet<PetType>();
		petTypeRepository.findAll().forEach(setOfPetType::add);;
		return setOfPetType;
	}

	@Override
	public PetType findById(Long id) {
		Optional<PetType> petTypes = petTypeRepository.findById(id); 
		return petTypes.get();
	}

	@Override
	public PetType save(PetType object) {
		return petTypeRepository.save(object);
	}

	@Override
	public void delete(PetType object) {
		petTypeRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		petTypeRepository.deleteById(id);
	}

}
