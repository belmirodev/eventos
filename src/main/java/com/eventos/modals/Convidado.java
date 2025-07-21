package com.eventos.modals;

import java.util.Objects;

public class Convidado {
	private String rg;
	private String nome;
	
	public Convidado() {
		// TODO Auto-generated constructor stub
	}

	public Convidado(String rg, String nome) {
		super();
		this.rg = rg;
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(rg);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Convidado other = (Convidado) obj;
		return Objects.equals(rg, other.rg);
	}
	
	
}
