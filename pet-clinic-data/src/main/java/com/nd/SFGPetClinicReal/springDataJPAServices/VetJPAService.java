package com.nd.SFGPetClinicReal.springDataJPAServices;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import com.nd.SFGPetClinicReal.model.Vet;
import com.nd.SFGPetClinicReal.repositories.VetRepository;
import com.nd.SFGPetClinicReal.services.VetService;

public class VetJPAService implements VetService{
	
	VetRepository vetRepository;
	
	public VetJPAService(VetRepository vetRepository) {
		super();
		this.vetRepository = vetRepository;
	}

	@Override
	public Set<Vet> findAll() {
		Set<Vet> setOfVet = new HashSet<Vet>();
		vetRepository.findAll().forEach(setOfVet::add);
		return setOfVet;
	}

	@Override
	public Vet findById(Long id) {
		Optional<Vet> vet = vetRepository.findById(id);
		return vet.get();
	}

	@Override
	public Vet save(Vet object) {
		return vetRepository.save(object);
	}

	@Override
	public void delete(Vet object) {
		vetRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		vetRepository.deleteById(id);
	}

}
