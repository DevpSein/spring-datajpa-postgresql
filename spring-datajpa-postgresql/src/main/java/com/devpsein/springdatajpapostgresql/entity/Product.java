package com.devpsein.springdatajpapostgresql.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Product {
    @Id
    @SequenceGenerator(name = "seq_product_increase", allocationSize = 1)
    @GeneratedValue(generator = "seq_product_increase",strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "PRODUCT_NAME")
    private String productName;
    @Column(name = "QUANTITY")
    private Long quantity;
    @Column(name = "CREATION_DATE")
    private Date creationDate;
    @Column(name = "PRODUCT_TYPE_ID")
    private Long productTypeId; // foreign key oluşturulacak  // Many To One
    @Column(name = "CATEGORY_ID")
    private Long categoryId; // foreign key oluşturulacak // Many to One

}
