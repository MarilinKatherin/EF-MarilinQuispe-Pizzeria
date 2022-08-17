package com.example.pizzeria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pizzeria.entity.Pizerria;
@Repository
public interface PizerriaRepository extends JpaRepository<Pizerria,Integer>{

}
