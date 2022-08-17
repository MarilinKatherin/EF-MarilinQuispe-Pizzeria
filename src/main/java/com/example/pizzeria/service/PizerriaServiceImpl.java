package com.example.pizzeria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.pizzeria.client.OpenFeignClient;
import com.example.pizzeria.dto.Cliente;
import com.example.pizzeria.entity.Pizerria;
import com.example.pizzeria.entity.PizzaFK;
import com.example.pizzeria.entity.PizzeriaDetalle;
import com.example.pizzeria.repository.DetallePizerriaRepository;
import com.example.pizzeria.repository.PizerriaRepository;

public class PizerriaServiceImpl implements PizzeriaService{
	@Autowired
	private PizerriaRepository repository;
	
	@Autowired
	private DetallePizerriaRepository repositoryDetalle;
	
	@Autowired
	private OpenFeignClient feign;
	@Override
	public void guardar(Pizerria pizzeria) {
		// TODO Auto-generated method stub
		repository.save(pizzeria);
	}

	@Override
	public void asignarPizza() {
		// TODO Auto-generated method stub
		List<Cliente> listado = feign.listarCliente();
		PizzaFK fk = null;
		PizzeriaDetalle detalle = null;

		
		for (Cliente cliente : listado) {
			
			fk = new PizzaFK();
			fk.setIdCliente(cliente.getIdCliente());
			fk.setIdPizerria(1);
			fk.setNombrePizza("Peperoni");
			fk.setDescripcion("Contiene peperoni y queso");			
			detalle = new PizzeriaDetalle();
			detalle.setFk(fk);	
			
			repositoryDetalle.save(detalle);		
		}
	}

}
