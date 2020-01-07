package com.kishor.spring.security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kishor.spring.security.entities.AutoUser;

public interface AutoUserRepository extends JpaRepository<AutoUser, Long> {

}
