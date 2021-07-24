package com.bullprogrammer.bullgerencia.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bullprogrammer.bullgerencia.model.ClienteModel;

@RestController // indica que a classe é um componente spring capaz de tratar requisições HTTP
public class ClienteController {

	@GetMapping ("/clientes")
	public ClienteModel[] listarClients() {
		ClienteModel cliente1 = new ClienteModel(1,"Renato Gaucho", "renatoGaucho@flamengo.com","8496628922");
		ClienteModel cliente2 = new ClienteModel(2,"Jorge Jesus", "JJ@flamengo.com","8481201951");
		
		ClienteModel[] clientes = new ClienteModel[2];
		clientes[0] = cliente1;
		clientes[1] = cliente2;
		
		return clientes;
	} 
	
}
