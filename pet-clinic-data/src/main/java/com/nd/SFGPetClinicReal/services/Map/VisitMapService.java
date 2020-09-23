package com.nd.SFGPetClinicReal.services.Map;

import java.util.Set;

import com.nd.SFGPetClinicReal.model.Visit;
import com.nd.SFGPetClinicReal.services.VisitService;

public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {

	private final VisitService visitService;

	public VisitMapService(VisitService visitService) {
		super();
		this.visitService = visitService;
	}

	@Override
	public Set<Visit> findAll() {
		return super.findAll();
	}

	@Override
	public Visit findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Visit save(Visit object) {

		if (object.getPet() == null || object.getPet().getOwner() == null || object.getPet().getId() == null
				|| object.getPet().getOwner().getId() == null) {
			throw new RuntimeException("Invalid Visit");
		} else {
			return super.save(object);
		}
	}

	@Override
	public void delete(Visit object) {
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}
