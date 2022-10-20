package com.devpsein.springdatajpapostgresql.repo;

import com.devpsein.springdatajpapostgresql.entity.Adres;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdresRepository extends JpaRepository<Adres,Long> {
}
