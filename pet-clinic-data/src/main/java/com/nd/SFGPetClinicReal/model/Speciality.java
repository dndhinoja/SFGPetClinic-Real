package com.nd.SFGPetClinicReal.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "specialities")
public class Speciality extends BaseEntity{
	
	@Column(name = "description")
	private String description;

	//@ManyToMany(cascade = CascadeType.ALL, mappedBy = "specialities")
	//private Set<Vet> vets = new HashSet<Vet>();
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
