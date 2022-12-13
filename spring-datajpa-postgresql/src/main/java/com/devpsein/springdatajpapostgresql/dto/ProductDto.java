package com.devpsein.springdatajpapostgresql.dto;

import lombok.Data;

import java.util.Date;
@Data
public class ProductDto {

    private Long id;
    private String productName;
    private Long quantity;
    private Date creationDate;
    private Long productTypeId;
    private Long categoryId;
    private Long userId;


}
