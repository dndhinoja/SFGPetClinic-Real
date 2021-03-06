package com.nd.SFGPetClinicReal.services.Map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.nd.SFGPetClinicReal.model.Speciality;
import com.nd.SFGPetClinicReal.services.SpecialitiesService;

@Service
@Profile({"default","map"})
public class SpecialitiesMapService extends AbstractMapService<Speciality, Long> implements SpecialitiesService{

	@Override
	public Set<Speciality> findAll() {
		return super.findAll();
	}

	@Override
	public Speciality findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Speciality save(Speciality object) {
		return super.save(object);
	}

	@Override
	public void delete(Speciality object) {
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}
