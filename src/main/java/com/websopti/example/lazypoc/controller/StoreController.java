package com.websopti.example.lazypoc.controller;

import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.websopti.example.lazypoc.entity.Store;
import com.websopti.example.lazypoc.repository.StoreRepository;

@RestController
@RequestMapping("/store")
public class StoreController {

	@Autowired
	StoreRepository storeRepo;
	
	@GetMapping("/lazy")
	public List<Store> lazyLoad() {
		return storeRepo.findAll();
	}
	
	@GetMapping("/eager")
	public List<Store> eagerLoad() {
		List<Store> stores = storeRepo.findAll();
		stores.stream().forEach(st -> Hibernate.initialize(st.getLocationDivision()));
		return stores;
	}
	
	@GetMapping("/eagerall")
	public List<Store> eagerAll() {
		List<Store> stores = storeRepo.findAll();
		stores.stream().forEach(st -> Hibernate.initialize(st.getLocationDivision().getUser()));
		return stores;
	}
}
