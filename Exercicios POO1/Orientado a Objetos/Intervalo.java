package com.objetos.orientacao.andre;

public class Intervalo {
	
	private int num1;
	private int num2;
	
	public Intervalo (int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public String MostraIntervalo() {
		StringBuilder builder = new StringBuilder();
		
		if(num1 < num2 ) {
			for (int i = num1; i <= num2; i++) {
				builder.append(i);
				builder.append(" | ");
			}
		}
		else if(num1 > num2 ) {
			for (int i = num2; i <= num1; i++) {
				builder.append(i);
				builder.append(" | ");
			}
		} 
		return builder.toString();
	}
}
