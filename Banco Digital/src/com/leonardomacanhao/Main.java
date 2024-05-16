package com.leonardomacanhao;


import com.leonardomacanhao.clientes.PessoaFisica;
import com.leonardomacanhao.clientes.PessoaJuridica;
import com.leonardomacanhao.contas.ContaCorrente;
import com.leonardomacanhao.contas.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		
		
		ContaCorrente contaPf1 = new ContaCorrente();
		contaPf1.criarConta(300.00);
		
		ContaPoupanca contaPj1 = new ContaPoupanca();
		contaPj1.criarConta(10000);
		
		
		PessoaFisica pf1 = new PessoaFisica("João Silva", "Rua 1 n 34", "123123123-12", contaPf1);
		PessoaJuridica pj1 = new PessoaJuridica("JR Empreendimentos","Rua 2 n 2", "123412341234/0001-12", "Jair Santos", contaPj1);
		
		
		
		pj1.imprimirDadosPessoaJuridica();
		pf1.imprimirDadosPessoaFisica();
		contaPf1.imprimirSaldo();
		contaPj1.imprimirSaldo();
		
		
		System.out.println("\nRealizando Saques...");
		contaPf1.sacar(50);
		contaPf1.imprimirSaldo();
		
		contaPj1.sacar(217);
		contaPj1.imprimirSaldo();
		
		System.out.println("Imprimindo dados contaPf1. Agência: " + contaPf1.getAgencia() + " Conta: " + contaPf1.getNumeroConta());
		System.out.println("Imprimindo dados contaPj1. Agência: " + contaPj1.getAgencia() + " Conta: " + contaPj1.getNumeroConta());
		
		//tentando sacar mais do que saldo existente
		
		contaPf1.sacar(999998);
		

	}

}
