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
    @Column(name = "product_name")
    private String productName;
    @Column(name = "quantity")
    private Long quantity;
    @Column(name = "creationdate")
    private Date creationDate;
    @Column(name = "product_type_id")
    private Long productTypeId; // foreign key oluşturulacak  // Many To One
    @Column(name = "category_id")
    private Long categoryId; // foreign key oluşturulacak // Many to One
    @Column(name = "user_id")
    private Long userId;


}
