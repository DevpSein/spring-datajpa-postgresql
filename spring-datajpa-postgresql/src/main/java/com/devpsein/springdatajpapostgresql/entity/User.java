package com.devpsein.springdatajpapostgresql.entity;

import lombok.*;

import javax.naming.Name;
import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "USERS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @SequenceGenerator(name ="USER_SEQUENCE", allocationSize = 1)
    @GeneratedValue(generator = "USER_SEQUENCE",strategy = GenerationType.SEQUENCE)
    @Id
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "SURNAME")
    private String surname;
    @Column(name = "password")
    private String password;
    @Column(name = "CREATION_DATE")
    private Date creationDate;
}
