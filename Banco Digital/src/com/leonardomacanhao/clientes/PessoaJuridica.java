package com.leonardomacanhao.clientes;

import com.leonardomacanhao.contas.Conta;

public class PessoaJuridica extends Pessoa{
	
	private String cnpj;
	private String responsavelLegal;
	private Conta tipoDeConta;
	
	
	public Conta getTipoDeConta() {
		return tipoDeConta;
	}
	public void setTipoDeConta(Conta tipoDeConta) {
		this.tipoDeConta = tipoDeConta;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getResponsavelLegal() {
		return responsavelLegal;
	}
	public void setResponsavelLegal(String responsavelLegal) {
		this.responsavelLegal = responsavelLegal;
	}
	

	
	public PessoaJuridica(String nome, String endereco, String cnpj, String responsavelLegal, Conta tipoDeConta) {
		super(nome, endereco);
		this.cnpj = cnpj;
		this.responsavelLegal = responsavelLegal;
		this.tipoDeConta = tipoDeConta;
	}
	public PessoaJuridica() {
		
	}
	
	public void imprimirDadosPessoaJuridica() {
		System.out.println("Nome: " + nome + " CNPJ: " + cnpj + " Endereco: " + endereco + " Responsável Legal: " + responsavelLegal);
	}
	

}
