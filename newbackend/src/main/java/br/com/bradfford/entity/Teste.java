package br.com.bradfford.entity;

import java.io.Serializable;

public class Teste implements Serializable {

	private static final long serialVersionUID = 3803632078154025616L;
	
	private Integer id;
	private String name;
	private String surname;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
}
