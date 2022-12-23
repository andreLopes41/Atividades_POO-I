package com.objetos.orientacao.andre;

public class Pessoa {
	
	private String nome = "";
	private String sobreNome = "";
	
	public Pessoa(String nome, String sobreNome) {
		this.nome = nome;
		this.sobreNome = sobreNome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bem-Vindo(a) ");
		builder.append(nome);
		builder.append(" ");
		builder.append(sobreNome);
		builder.append("!");
		return builder.toString();
	}

	
}
