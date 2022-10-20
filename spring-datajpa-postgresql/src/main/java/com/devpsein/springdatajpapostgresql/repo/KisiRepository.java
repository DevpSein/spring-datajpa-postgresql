package com.devpsein.springdatajpapostgresql.repo;

import com.devpsein.springdatajpapostgresql.entity.Kisi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KisiRepository extends JpaRepository <Kisi,Long> {
}
