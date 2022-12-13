package com.devpsein.springdatajpapostgresql.repo;

import com.devpsein.springdatajpapostgresql.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
