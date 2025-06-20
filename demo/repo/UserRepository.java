package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.CRUD;
@Repository 
public interface UserRepository extends JpaRepository<CRUD, Integer> { 
    
}
