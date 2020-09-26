package com.nd.SFGPetClinicReal.services.Map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.nd.SFGPetClinicReal.model.Speciality;
import com.nd.SFGPetClinicReal.model.Vet;
import com.nd.SFGPetClinicReal.services.SpecialitiesService;
import com.nd.SFGPetClinicReal.services.VetService;

@Service
@Profile({"default","map"})
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService{

	private final SpecialitiesService specialitiesService;
	
	public VetServiceMap(SpecialitiesService specialitiesService) {
		super();
		this.specialitiesService = specialitiesService;
	}

	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}

	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Vet save(Vet object) {
		
		if(object.getSpecialities().size()>0) {
			object.getSpecialities().forEach(Speciality->{
				if(Speciality.getId()==null) {
					Speciality savedSpeciality = specialitiesService.save(Speciality);
					Speciality.setId(savedSpeciality.getId());
				}
			});
		}
		return super.save(object);
	}

	@Override
	public void delete(Vet object) {
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}
