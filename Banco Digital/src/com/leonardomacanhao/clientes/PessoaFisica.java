package com.leonardomacanhao.clientes;

import com.leonardomacanhao.contas.Conta;

public class PessoaFisica extends Pessoa{
	
	private String cpf;
	private Conta tipoDeConta;
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Conta getTipoDeConta() {
		return tipoDeConta;
	}
	public void setTipoDeConta(Conta tipoDeConta) {
		this.tipoDeConta = tipoDeConta;
	}
	
	public PessoaFisica(String nome, String endereco, String cpf, Conta tipoDeConta) {
		super(nome, endereco);
		this.cpf = cpf;
		this.tipoDeConta = tipoDeConta;
	}
	
	public PessoaFisica() {
	
	}

	public void imprimirDadosPessoaFisica() {
		System.out.println("Nome: " + nome + " CPF: " + cpf + " Endereco" + endereco);
	}

}
