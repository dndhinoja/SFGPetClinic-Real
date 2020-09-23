package com.nd.SFGPetClinicReal.springDataJPAServices;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import com.nd.SFGPetClinicReal.model.Owner;
import com.nd.SFGPetClinicReal.repositories.OwnRepository;
import com.nd.SFGPetClinicReal.services.OwnerService;

public class OwnerJPAService implements OwnerService{

	private final OwnRepository ownRepository;
	
	public OwnerJPAService(OwnRepository ownRepository) {
		super();
		this.ownRepository = ownRepository;
	}

	@Override
	public Set<Owner> findAll() {
		Set<Owner> setOfOwner = new HashSet<Owner>();
		ownRepository.findAll().forEach(setOfOwner::add);
		return setOfOwner;
	}

	@Override
	public Owner findById(Long id) {
		/*
		 * Optional<Owner> owner = ownRepository.findById(id); if(owner.isPresent()) {
		 * return owner.get(); } else { return null; }
		 */
		return ownRepository.findById(id).orElse(null);
	}

	@Override
	public Owner save(Owner object) {
		return ownRepository.save(object);
	}

	@Override
	public void delete(Owner object) {
		ownRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		ownRepository.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lastName) {
		/*for(Owner owner:setOfOwner) {
			if(owner.getLastName().equals(lastName)) {
				return owner;
			}
			else {
				return null;
			}
		}
		return null;*/
		return ownRepository.findByLastName(lastName);
	}
}
