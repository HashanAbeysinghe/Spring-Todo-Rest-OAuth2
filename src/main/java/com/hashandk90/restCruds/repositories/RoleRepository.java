package com.hashandk90.restCruds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hashandk90.restCruds.models.jwt.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}