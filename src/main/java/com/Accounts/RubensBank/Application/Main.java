package com.Accounts.RubensBank.Application;

import com.Accounts.RubensBank.Model.dao.ContasDao;
import com.Accounts.RubensBank.Model.dao.DaoFactory;
import com.Accounts.RubensBank.Model.dao.implementation.ContasDaoJDBC;
import com.Accounts.RubensBank.Model.entities.Cliente;
import com.Accounts.RubensBank.Model.entities.Conta;
import com.Accounts.RubensBank.Model.entities.ContaCorrente;
import com.Accounts.RubensBank.Model.entities.ContaPoupanca;

public class Main {

	public static void main(String[] args) {

		ContasDao ContaDao = DaoFactory.createContasDao();

		System.out.println("Findby ID");
		Conta conta1 = ContaDao.findById(1);
		Conta conta2 = ContaDao.findById(2);
		Conta conta3 = ContaDao.findById(3);
		Conta conta4 = ContaDao.findById(4);


		System.out.println(conta1);
		System.out.println(conta2);
		System.out.println(conta3);
		System.out.println(conta4);



		/*Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
*/

	}

}
