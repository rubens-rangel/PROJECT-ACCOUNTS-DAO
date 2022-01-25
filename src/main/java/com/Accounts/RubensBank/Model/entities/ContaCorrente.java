package com.Accounts.RubensBank.Model.entities;

import lombok.Data;

@Data
public class ContaCorrente extends Conta {

	public ContaCorrente(int id, int agencia, int numero, double saldo, Cliente cliente) {
		super(id, agencia, numero, saldo, cliente);
	}


	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
}
