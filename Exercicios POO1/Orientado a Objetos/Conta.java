package com.objetos.orientacao.andre;

public class Conta {
	
	private String numConta;
	private String nome;
	private float saldo;
	private float valor;
	
	public Conta(String numConta, String nome, float saldo, float valor) {
		this.numConta = numConta;
		this.nome = nome;
		this.saldo = saldo;
		this.valor = valor;
	}
	
	public String Incluir(String numConta, String nome, float saldo) {
		StringBuilder builder = new StringBuilder();
			builder.append("Conta: ");
			builder.append(numConta);
			builder.append("\nNome: ");
			builder.append(nome);
			builder.append("\nSaldo: ");
			builder.append(saldo);
		return builder.toString();
	}
	
	public String AlterarNome(String nome) {
		StringBuilder builder = new StringBuilder();
			builder.append("\nNovo Nome: ");
			this.nome = nome;
			builder.append(nome);
			return builder.toString();
	}
	
	public float Deposito(float valor) {
		setValor(valor);
		
		return valor;
	}
	
	public float Sacar(float valor) {
		setValor(valor);
		
		saldo = saldo - valor;
		
		return valor;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Conta [numConta=");
		builder.append(numConta);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append(", valor=");
		builder.append(valor);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	

}
