package com.nd.SFGPetClinicReal.services;

import java.util.Set;

import com.nd.SFGPetClinicReal.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
	
	Owner findByLastName(String lastName);
}
