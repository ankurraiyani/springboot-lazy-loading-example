package com.websopti.example.lazypoc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.websopti.example.lazypoc.entity.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {

}
