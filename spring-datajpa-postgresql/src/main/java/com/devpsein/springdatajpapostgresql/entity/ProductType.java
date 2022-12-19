package com.devpsein.springdatajpapostgresql.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ProductType {
    @Id
    @SequenceGenerator(name = "seq_product_type",allocationSize = 1)
    @GeneratedValue(generator = "seq_product_type",strategy = GenerationType.SEQUENCE )
    private Long id;
    @Column(name = "name")
    private String typeName;


}
