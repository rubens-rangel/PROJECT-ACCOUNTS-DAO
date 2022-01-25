package com.Accounts.RubensBank.Model.entities;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super();
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}
}
