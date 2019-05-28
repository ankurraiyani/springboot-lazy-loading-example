package com.websopti.example.lazypoc.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class LocationDivision {

	@Id
	private Long id;
	
	private String name;
	
	@ManyToOne
	private Country country;
	
	@OneToOne(fetch=FetchType.LAZY)
	private User user;
}
