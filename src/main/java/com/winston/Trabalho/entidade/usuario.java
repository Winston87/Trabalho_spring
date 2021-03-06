package com.winston.Trabalho.entidade;

import java.io.Serializable;

public class usuario implements Serializable { // Serializable e para tranforma os objetos em bits para trafegar na rede
	private static final long serialVersionUID = 1L; //  numero de serie padrao do Serializable 1L
	
	private long id;
	private String nome;
	private String email;
	private String fone;
	private String senha;
	
	public usuario() {
	}

	public usuario(long id, String nome, String email, String fone, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.fone = fone;
		this.senha = senha;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override  // 
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		usuario other = (usuario) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}
