package com.objetos.orientacao.andre;

public class Calculadora {
	
	private float n1;
	private float n2;
	private float esc;
	
	public Calculadora(float n1, float n2, float esc) {
		this.n1 = n1;
		this.n2 = n2;
		this.esc = esc;
	}

	public float getN1() {
		return n1;
	}

	public void setN1(float n1) {
		this.n1 = n1;
	}

	public float getN2() {
		return n2;
	}

	public void setN2(float n2) {
		this.n2 = n2;
	}

	public float getEsc() {
		return esc;
	}

	public void setEsc(float esc) {
		this.esc = esc;
	}
	
	public String Somar(float num1, float num2) {
		StringBuilder builder = new StringBuilder();
		
			builder.append("Resultado Da Soma: ");
			builder.append(n1 + n2);

		return builder.toString();
	}
	
	public String Subtrair(float num1, float num2) {
		StringBuilder builder = new StringBuilder(); 
		
			builder.append("Resultado Da Subtração: ");
			builder.append(n1 - n2);
	
		return builder.toString();
	}
	
	public String Multiplicar(float num1, float num2) {
		StringBuilder builder = new StringBuilder(); 
	
			builder.append("Resultado Da Multiplicação: ");
			builder.append(n1 * n2);
	
		return builder.toString();
	}
	
	public String Dividir(float num1, float num2) {
		StringBuilder builder = new StringBuilder(); 
	
			if ( n2 == 0) {
				builder.append("Erro, Divisão por ZERO");
			}
			
			else {
				builder.append("Resultado Da Divisão: ");
				builder.append(n1 / n2);
			}
		return builder.toString();
	}
	
}
