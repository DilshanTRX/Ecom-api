package com.bootcamp.ecomapi.Ecomapi.repo;

import com.bootcamp.ecomapi.Ecomapi.entity.ProductImages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface ProductImagesRepo extends JpaRepository<ProductImages,String> {
}
