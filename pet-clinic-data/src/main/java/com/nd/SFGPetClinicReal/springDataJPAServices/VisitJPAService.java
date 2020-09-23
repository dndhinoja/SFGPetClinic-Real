package com.nd.SFGPetClinicReal.springDataJPAServices;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.hibernate.hql.internal.ast.util.NodeTraverser.VisitationStrategy;

import com.nd.SFGPetClinicReal.model.Visit;
import com.nd.SFGPetClinicReal.repositories.VisitRepository;
import com.nd.SFGPetClinicReal.services.VisitService;

public class VisitJPAService implements VisitService{

	VisitRepository visitRepository;
	
	public VisitJPAService(VisitRepository visitRepository) {
		super();
		this.visitRepository = visitRepository;
	}

	@Override
	public Set<Visit> findAll() {
		Set<Visit> setOfVisits = new HashSet<Visit>();
		visitRepository.findAll().forEach(setOfVisits::add);;
		return setOfVisits;
	}

	@Override
	public Visit findById(Long id) {
		Optional<Visit> visit = visitRepository.findById(id);
		return visit.get();
	}

	@Override
	public Visit save(Visit object) {
		return visitRepository.save(object);
	}

	@Override
	public void delete(Visit object) {
		visitRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		visitRepository.deleteById(id);
	}

}
