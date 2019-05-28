package com.websopti.example.lazypoc;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;

@SpringBootApplication
public class LazyPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(LazyPocApplication.class, args);
	}
	
	@PostConstruct
	void started() {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
	}

	@Bean
	public Module datatypeHibernateModule() {
	  return new Hibernate5Module();
	}
}

