package com.Accounts.RubensBank.Model.entities;

import java.util.Locale;

public class Cliente {

	private String nome;

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return  nome.toUpperCase(Locale.ROOT);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
