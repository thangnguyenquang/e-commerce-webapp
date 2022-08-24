package com.thangnq.eco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thangnq.eco.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
