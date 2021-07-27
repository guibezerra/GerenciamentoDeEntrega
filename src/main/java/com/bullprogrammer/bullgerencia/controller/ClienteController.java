package com.bullprogrammer.bullgerencia.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bullprogrammer.bullgerencia.model.ClienteModel;

@RestController // indica que a classe é um componente spring capaz de tratar requisições HTTP
public class ClienteController {

	@PersistenceContext // injeta um EntityManager em manager
	private EntityManager manager; //permite fazer as operações com as entidades (exclusão, inserção, alteração etc)
	
	
	@GetMapping ("/clientes")
	public List<ClienteModel> listarClientes() {
		
		return manager.createQuery("from ClienteModel", ClienteModel.class)
				.getResultList();
	} 
	
}
