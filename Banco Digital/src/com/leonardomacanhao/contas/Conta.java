package com.leonardomacanhao.contas;


public class Conta {
	
	private static int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numeroConta;
	protected double saldo;
	
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public double exibirSaldo() {
		return saldo;
	}
	
	
	public void criarConta(double saldo) {
		this.agencia = AGENCIA_PADRAO;
		this.numeroConta = SEQUENCIAL++;
		this.saldo = saldo;
	}
	
	public Conta() {
	}
	
	public void sacar(double valor) {
		if (saldo - valor < 0) {
			System.out.println("\nSaldo Insuficiente");
		}else {
			saldo -= valor;
			
		}
		
	}
	
	public void depositar (double valor) {
		saldo += saldo;
	}
	
	

}
