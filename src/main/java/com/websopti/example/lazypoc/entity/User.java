package com.websopti.example.lazypoc.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class User {

	@Id
	private Long id;
	
	private String name;
	
	private Date birthDate;
}
