package com.websopti.example.lazypoc.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import lombok.Data;

@Data
@Entity
public class Store {

	@Id
	private Long id;
	
	private String name;
	
	@OneToOne(fetch=FetchType.LAZY)
	private LocationDivision locationDivision;
}
