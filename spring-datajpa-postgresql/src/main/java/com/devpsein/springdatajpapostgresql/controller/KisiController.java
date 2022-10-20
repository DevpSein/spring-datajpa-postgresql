package com.devpsein.springdatajpapostgresql.controller;
import com.devpsein.springdatajpapostgresql.dto.KisiDto;
import com.devpsein.springdatajpapostgresql.service.KisiService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/kayit",produces = "application/json")
@RequiredArgsConstructor

public class KisiController {
    private final KisiService kisiService;
    @PostMapping(value = "/createOrUpdate")
    public ResponseEntity<KisiDto> kaydet (@RequestBody KisiDto kisiDto){
        return ResponseEntity.ok(kisiService.save(kisiDto));
    }
    @GetMapping
    public ResponseEntity<List<KisiDto>> hepsiniGetir(){
        return ResponseEntity.ok(kisiService.getAll());
    }

}
