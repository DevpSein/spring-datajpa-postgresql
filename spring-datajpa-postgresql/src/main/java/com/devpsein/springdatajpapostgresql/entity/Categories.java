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
public class Categories {
    @Id
    @SequenceGenerator(name = "seq_category",allocationSize = 1)
    @GeneratedValue(generator = "seq_category",strategy = GenerationType.SEQUENCE )
    private Long id;
    @Column(name = "category_name")
    private String categoryName;
}
