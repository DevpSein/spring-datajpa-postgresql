package com.devpsein.springdatajpapostgresql.service;

import com.devpsein.springdatajpapostgresql.dto.KisiDto;
import com.devpsein.springdatajpapostgresql.entity.Kisi;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface KisiService {
    KisiDto save(KisiDto kisiDto);

    void delete();

    List<KisiDto> getAll();

    Page<Kisi> getAll(Pageable pageable);

}
