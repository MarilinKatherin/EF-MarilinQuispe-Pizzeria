package com.example.pizzeria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.pizzeria.entity.Pizerria;
import com.example.pizzeria.service.PizzeriaService;


@Controller
@RequestMapping("/pizzeria/v1")
public class PizzeriaController {
	@Autowired
	private PizzeriaService service;
	@PostMapping("/guardar")
	public @ResponseBody void guardar(@RequestBody Pizerria pizerria) {
		service.guardar(pizerria);
	}
	
	@GetMapping("/asignar")
	public @ResponseBody void asignarAlumnosAaula() {
		service.asignarPizza();
	}
}
