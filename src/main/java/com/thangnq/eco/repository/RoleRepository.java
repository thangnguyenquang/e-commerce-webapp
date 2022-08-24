package com.thangnq.eco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thangnq.eco.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

}
