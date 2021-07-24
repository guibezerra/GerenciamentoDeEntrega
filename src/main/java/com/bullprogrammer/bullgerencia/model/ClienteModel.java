package com.bullprogrammer.bullgerencia.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
/*--anotação lombok---*/
@Getter 
@Setter  

public class ClienteModel {
	
	int id;
	String nome;
	String email;
	String telefone;
	public ClienteModel(int id, String nome, String email, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	
	
}
