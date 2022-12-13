package com.devpsein.springdatajpapostgresql.dto;

import lombok.Data;

import java.util.Date;
@Data
public class UserDto {
    private Long id;
    private Boolean active = false;
    private String surname;
    private String password;
    private String mail;
    private Date creationDate;

}
