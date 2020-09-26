package com.nd.SFGPetClinicReal.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "pettypes")
public class PetType extends BaseEntity{
	
	@Column(name = "name")
	private String name;
	
	//@OneToMany(cascade = CascadeType.ALL, mappedBy = "pettype")
	//private Set<Pet> pets = new HashSet<Pet>();

	/*
	 * public String getName() { return name; }
	 * 
	 * public void setName(String name) { this.name = name; }
	 */
}
