package com.devpsein.springdatajpapostgresql.dto;

import com.devpsein.springdatajpapostgresql.entity.Adres;
import lombok.Data;

import java.util.List;
@Data
// Entityleri doğrudan dış dünyaya açmak istemeyiz.Biz eğer zor durumda kalır ve entitydeki veri yapısı değişir ise bu apiyi kullanan müşteri vesaire ne yapacağımı bilmesin
public class KisiDto {
    private Long id;

    private String ad ;

    private String soyad;

    private List<String> adresler;
}
