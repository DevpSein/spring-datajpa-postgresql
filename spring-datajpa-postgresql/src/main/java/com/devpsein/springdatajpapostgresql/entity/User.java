package com.devpsein.springdatajpapostgresql.entity;
import lombok.*;
import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "USERS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @SequenceGenerator(name ="seq_user", allocationSize = 1)
    @GeneratedValue(generator = "seq_user",strategy = GenerationType.SEQUENCE)
    @Id
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "active")
    private boolean active = false;
    @Column(name = "surname")
    private String surname;
    @Column(length = 15,name = "password" )
    private String password;
    @Column(name = "mail")
    private String mail;
    @Column(name = "creation_date")
    private Date creationDate;
}
