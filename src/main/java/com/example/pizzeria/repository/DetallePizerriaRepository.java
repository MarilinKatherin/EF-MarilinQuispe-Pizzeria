package com.example.pizzeria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pizzeria.entity.PizzeriaDetalle;

@Repository
public interface DetallePizerriaRepository extends JpaRepository<PizzeriaDetalle, Integer>{
}