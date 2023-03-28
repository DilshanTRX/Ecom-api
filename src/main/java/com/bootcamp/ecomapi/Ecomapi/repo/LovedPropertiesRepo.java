package com.bootcamp.ecomapi.Ecomapi.repo;

import com.bootcamp.ecomapi.Ecomapi.entity.LovedProperty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface LovedPropertiesRepo extends JpaRepository<LovedProperty,String> {
}
