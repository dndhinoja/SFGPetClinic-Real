package com.nd.SFGPetClinicReal.springDataJPAServices;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import com.nd.SFGPetClinicReal.model.Speciality;
import com.nd.SFGPetClinicReal.repositories.SpecialityRepository;
import com.nd.SFGPetClinicReal.services.SpecialitiesService;

public class SpecialityJPAService implements SpecialitiesService{
	
	SpecialityRepository specialityRepository;
	
	public SpecialityJPAService(SpecialityRepository specialityRepository) {
		super();
		this.specialityRepository = specialityRepository;
	}

	@Override
	public Set<Speciality> findAll() {
		Set<Speciality> setOfSpeciality = new HashSet<Speciality>();
		specialityRepository.findAll().forEach(setOfSpeciality::add);;
		return setOfSpeciality;
	}

	@Override
	public Speciality findById(Long id) {
		Optional<Speciality> speciality = specialityRepository.findById(id);
		return speciality.get();
	}

	@Override
	public Speciality save(Speciality object) {
		return specialityRepository.save(object);
	}

	@Override
	public void delete(Speciality object) {
		specialityRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		specialityRepository.deleteById(id);
	}

}
