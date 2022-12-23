package com.objetos.orientacao.andre;

public class SerHumano {
	
	private String nome;
	private int idade;
	private int peso;
	private float altura;
	
	public SerHumano(String nome, int idade, int peso, float altura) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}
	
	public int Envelhecer(int idade) {
			setIdade(idade);
		
		return idade;
	}
	
	public int Engordar(int peso) {
			setPeso(peso);
		
		return peso;
	}
	
	public int Emagrecer(int peso) {
			setPeso(peso);
			peso = peso - peso;
		
		return peso;
	}
	
	public float Crescer(float altura) {
			setAltura(altura);
		
		return altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Nome:");
		builder.append(nome);
		builder.append("\nIdade: ");
		builder.append(idade);
		builder.append("\nPeso: ");
		builder.append(peso);
		builder.append("\nAltura: ");
		builder.append(altura);
		return builder.toString();
	}
	
	
	
	

}
