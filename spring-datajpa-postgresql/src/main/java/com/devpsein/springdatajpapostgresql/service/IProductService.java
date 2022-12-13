package com.devpsein.springdatajpapostgresql.service;

import com.devpsein.springdatajpapostgresql.dto.ProductDto;
import com.devpsein.springdatajpapostgresql.entity.Product;

import java.util.List;

public interface IProductService {

    ProductDto save(Product product);
    void delete();
    List<Product> getAll();

}
