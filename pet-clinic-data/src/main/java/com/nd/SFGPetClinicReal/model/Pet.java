package com.nd.SFGPetClinicReal.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Table(name = "pets")
public class Pet extends BaseEntity {

	@Column(name = "birth_date")
	private LocalDate birthDate;

	@Column(name = "name")
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "pettype_id")
	private PetType petType;

	@ManyToOne
	@JoinColumn(name = "owner_id")
	private Owner owner;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "pet")
	private Set<Visit> visits = new HashSet<Visit>();

	/*
	 * public PetType getPetType() { return petType; }
	 * 
	 * public void setPetType(PetType petType) { this.petType = petType; }
	 * 
	 * public Owner getOwner() { return owner; }
	 * 
	 * public void setOwner(Owner owner) { this.owner = owner; }
	 * 
	 * public LocalDate getBirthDate() { return birthDate; }
	 * 
	 * public void setBirthDate(LocalDate birthDate) { this.birthDate = birthDate; }
	 * 
	 * public String getName() { return name; }
	 * 
	 * public void setName(String name) { this.name = name; }
	 * 
	 * public Set<Visit> getVisits() { return visits; }
	 * 
	 * public void setVisits(Set<Visit> visits) { this.visits = visits; }
	 */
}
