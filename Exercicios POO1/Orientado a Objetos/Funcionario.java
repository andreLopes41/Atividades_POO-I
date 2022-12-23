package com.objetos.orientacao.andre;

public class Funcionario {
	
	private float valHora;
	private float hrs;
	private float salBruto;
	private float valImposto;
	private float valINSS;
	private float valSind;
	private float salLiquido;
	
	public Funcionario(float valHora, int hrs) {
		this.valHora = valHora;
		this.hrs = hrs;
	}
	
	public float SalarioBruto() {
		float valor = this.valHora * this.hrs;
		this.salBruto = valor;
		
		return valor;
	}
	
	public float INSS() {
		float valor = this.salBruto * 0.08f;
		this.valINSS = valor;
		
		return valor;
	}
	
	public float Sindicato() {
		float valor = this.salBruto * 0.05f;
		this.valSind = valor;
		
		return valor;
	}
	
	public float Imposto() {
		float valor = this.salBruto * 0.11f;
		this.valImposto = valor;
		
		return valor;
	}
	
	public float SalarioLiquido() {
		float valor = this.salBruto - this.valINSS - this.valSind - this.valImposto;
		this.salLiquido = valor;
		
		return valor;
	}

	public float getValHora() {
		return valHora;
	}

	public void setValHora(float valHora) {
		this.valHora = valHora;
	}

	public float getHrs() {
		return hrs;
	}

	public void setHrs(float hrs) {
		this.hrs = hrs;
	}

	public float getSalBruto() {
		return salBruto;
	}

	public void setSalBruto(float salBruto) {
		this.salBruto = salBruto;
	}

	public float getValImposto() {
		return valImposto;
	}

	public void setValImposto(float valImposto) {
		this.valImposto = valImposto;
	}

	public float getValINSS() {
		return valINSS;
	}

	public void setValINSS(float valINSS) {
		this.valINSS = valINSS;
	}

	public float getValSind() {
		return valSind;
	}

	public void setValSind(float valSind) {
		this.valSind = valSind;
	}

	public float getSalLiquido() {
		return salLiquido;
	}

	public void setSalLiquido(float salLiquido) {
		this.salLiquido = salLiquido;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Salario Bruto: ");
		builder.append(this.salBruto + " R$");
		builder.append("\nINSS: ");
		builder.append(this.valINSS + " R$");
		builder.append("\nSindicato: ");
		builder.append(this.valSind + " R$");
		builder.append("\nImposto: ");
		builder.append(this.valImposto + " R$");
		builder.append("\nSalário Líquido: ");
		builder.append(this.salLiquido + " R$");
		return builder.toString();
	}

}
