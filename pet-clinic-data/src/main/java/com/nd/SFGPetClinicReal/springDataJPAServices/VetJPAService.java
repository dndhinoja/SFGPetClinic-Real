package com.nd.SFGPetClinicReal.springDataJPAServices;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.nd.SFGPetClinicReal.model.Vet;
import com.nd.SFGPetClinicReal.repositories.VetRepository;
import com.nd.SFGPetClinicReal.services.VetService;

@Service
@Profile("springdatajpa")
public class VetJPAService implements VetService{
	
	private final VetRepository vetRepository;
	
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
		return vetRepository.findById(id).orElse(null);
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
