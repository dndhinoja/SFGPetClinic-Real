package com.nd.SFGPetClinicReal.confg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.nd.SFGPetClinicReal.bootstrap.DataLoader;

import services.OwnerService;
import services.VetService;
import services.Map.OwnerServiceMap;
import services.Map.VetServiceMap;

//@EnableWebMvc
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
	/*
	 * @Bean public ViewResolver htmlViewResolver() { InternalResourceViewResolver
	 * bean = new InternalResourceViewResolver();
	 * bean.setPrefix("/templates/fragments/"); bean.setSuffix(".html"); return
	 * bean; }
	 */
}
