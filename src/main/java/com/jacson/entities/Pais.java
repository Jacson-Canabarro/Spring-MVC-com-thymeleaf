package com.jacson.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pais implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	private String capital;
	
	public Pais() {
	}
	

	public Pais(String nome, String capital) {
		this.nome = nome;
		this.capital = capital;
	}
	


	@Override
	public String toString() {
		return "Pais [id=" + id + ", nome=" + nome + ", capital=" + capital + "]";
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}
	
	
	
	

}
