package com.websopti.example.lazypoc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.websopti.example.lazypoc.entity.LocationDivision;

@Repository
public interface LocationDivisionRepository extends JpaRepository<LocationDivision, Long> {

}
