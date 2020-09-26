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
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
@Entity
@Table(name = "owners")
public class Owner extends Person{

	@Builder
	public Owner(Long id, String firstName, String lastName, String address, String city, String telephone,
			Set<Pet> pets) {
		super(id, firstName, lastName);
		this.address = address;
		this.city = city;
		this.telephone = telephone;
		this.pets = pets;
	}
	
	@Column(name = "address")
	private String address;
	
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "telephone")
	private String telephone;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
	public Set<Pet> pets = new HashSet<>();
	
	/*
	 * public Set<Pet> getPets() { return pets; } public void setPets(Set<Pet> pets)
	 * { this.pets = pets; } public String getAddress() { return address; } public
	 * void setAddress(String address) { this.address = address; } public String
	 * getCity() { return city; } public void setCity(String city) { this.city =
	 * city; } public String getTelephone() { return telephone; } public void
	 * setTelephone(String telephone) { this.telephone = telephone; }
	 */

}
