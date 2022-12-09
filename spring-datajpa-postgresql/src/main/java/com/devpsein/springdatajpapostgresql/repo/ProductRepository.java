package com.devpsein.springdatajpapostgresql.repo;

import com.devpsein.springdatajpapostgresql.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
