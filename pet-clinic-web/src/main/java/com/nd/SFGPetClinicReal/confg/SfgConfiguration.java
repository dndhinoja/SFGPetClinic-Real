package com.nd.SFGPetClinicReal.confg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nd.SFGPetClinicReal.bootstrap.DataLoader;

import services.OwnerService;
import services.VetService;
import services.Map.OwnerServiceMap;
import services.Map.VetServiceMap;

@Configuration
public class SfgConfiguration {
	@Bean
	public OwnerService ownerDataLoader() {
		return new OwnerServiceMap();
	}
	@Bean
	public VetService vetDataLoader() {
		return new VetServiceMap();
	}
}
