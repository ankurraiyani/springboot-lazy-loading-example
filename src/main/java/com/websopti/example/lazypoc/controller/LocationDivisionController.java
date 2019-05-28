package com.websopti.example.lazypoc.controller;

import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.websopti.example.lazypoc.entity.LocationDivision;
import com.websopti.example.lazypoc.repository.LocationDivisionRepository;

@RestController
@RequestMapping("/ld")
public class LocationDivisionController {

	@Autowired
	private LocationDivisionRepository locDivRepo;
	
	@GetMapping("/lazy")
	public List<LocationDivision> getAllLazy() {
		return locDivRepo.findAll();
	}
	
	@GetMapping("/eager")
	public List<LocationDivision> getAllEager() {
		List<LocationDivision> locDivs = locDivRepo.findAll();
		Hibernate.initialize(locDivs.get(0).getCountry());
		return locDivs;
	}
}
