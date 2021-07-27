package com.bullprogrammer.bullgerencia.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
/*--anotação lombok---*/
@Getter 
@Setter

/*--anotação JPA--*/
@Entity
@Table(name = "cliente")
public class ClienteModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	String nome;
	String email;
	@Column(name = "fone")
	String telefone;
	
	public ClienteModel() {
		
	}
//	/* -- Testar se o ID sera gerado caso o objeto seja construido pelo construtor -- */
//	public ClienteModel(String nome, String email, String telefone) {
//		super();
//		this.nome = nome;
//		this.email = email;
//		this.telefone = telefone;
//	}
//poderia usar o lombok para gerar, mas optei em escreve-los
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClienteModel cliente = (ClienteModel) obj;
		return this.id == cliente.id;
	}
	
	
	
}
