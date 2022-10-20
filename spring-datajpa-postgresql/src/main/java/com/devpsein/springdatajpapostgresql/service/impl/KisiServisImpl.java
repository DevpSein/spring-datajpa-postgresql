package com.devpsein.springdatajpapostgresql.service.impl;

import com.devpsein.springdatajpapostgresql.dto.KisiDto;
import com.devpsein.springdatajpapostgresql.entity.Adres;
import com.devpsein.springdatajpapostgresql.entity.Kisi;
import com.devpsein.springdatajpapostgresql.repo.AdresRepository;
import com.devpsein.springdatajpapostgresql.repo.KisiRepository;
import com.devpsein.springdatajpapostgresql.service.KisiService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor // İhtiyaç duyduğu constructerlar için
@Service
public class KisiServisImpl implements KisiService {
    private final KisiRepository kisiRepository; // final dediğimiz için constructor atanmak zorunda
    private final AdresRepository adresRepository;
    @Override
    @Transactional //Bu işlemlerin tamamı ya tek bir transaction da yapılır ya da geri alınır.
    public KisiDto save(KisiDto kisiDto) {
        // Assert.isNull(kisiDto.getAd(),"Adi alani zorunludur");
        Kisi kisi = new Kisi();
        kisi.setAd(kisiDto.getAd());
        kisi.setSoyad(kisiDto.getSoyad());
        final Kisi kisiDb =kisiRepository.save(kisi);
        List<Adres> liste =new ArrayList<>();
        kisiDto.getAdresler().forEach(item ->{
            Adres adres = new Adres();
            adres.setAdres(item);
            adres.setAdresTip(Adres.AdresTip.DIGER);
            adres.setAktif(true);
            adres.setKisi(kisiDb);
            liste.add(adres);
        });
        adresRepository.saveAll(liste);
        kisiDto.setId(kisiDb.getId());
        return kisiDto;
    }

    @Override
    public void delete() {

    }

    @Override
    public List<KisiDto> getAll() {
        List <Kisi> kisiler = kisiRepository.findAll();
        List <KisiDto> kisiDtos = new ArrayList<>();
        kisiler.forEach(it -> {
            KisiDto kisiDto = new KisiDto();
            kisiDto.setId(it.getId());
            kisiDto.setAd(it.getAd());
            kisiDto.setSoyad(it.getSoyad());
            kisiDto.setAdresler(it.getAdresleri().stream().map(Adres::getAdres)// Adres kolonlarını liste halinde dtonun adreslerine doldur.
                    .collect(Collectors.toList()));
            kisiDtos.add(kisiDto);
        });
        return kisiDtos;
    }

    @Override
    public Page<Kisi> getAll(Pageable pageable) {
        return null;
    }
}
