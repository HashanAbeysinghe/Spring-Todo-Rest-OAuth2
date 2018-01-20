package com.hashandk90.restCruds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hashandk90.restCruds.models.jwt.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}