package com.objetos.orientacao.andre;

public class BombaCombustível {
	
	private String tipoCombustivel;
	private float valorLitro;
	private float quantidadeCombustivel;
	private float valorAbastecer;
	
	public BombaCombustível(String tipoCombustivel, float valorLitro, float quantidadeCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
		this.valorLitro = valorLitro;
		this.quantidadeCombustivel = quantidadeCombustivel;
	}
	
	public float abastecerPorValor() {
		quantidadeCombustivel = valorAbastecer / valorLitro;
		
		return quantidadeCombustivel;
	}
	
	public float abastecerPorLitro(){
		float valorPagar = 0;
		
		valorPagar = valorLitro * quantidadeCombustivel;
		
		return valorPagar;
	}
	
	public float alterarValor() {
		
		setValorLitro(2.41f);
		
		return valorLitro;
	}
	
	public String alterarCombustivel() {
		
		setTipoCombustivel("Disel");
		
		return tipoCombustivel;
	}
	
	public float alterarQuantidadeCombustivel() {
		
		setQuantidadeCombustivel(57);
		
		return quantidadeCombustivel;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public float getValorLitro() {
		return valorLitro;
	}

	public void setValorLitro(float valorLitro) {
		this.valorLitro = valorLitro;
	}

	public float getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}

	public void setQuantidadeCombustivel(float quantidadeCombustivel) {
		this.quantidadeCombustivel = quantidadeCombustivel;
	}

	public float getValorAbastecer() {
		return valorAbastecer;
	}

	public void setValorAbastecer(float valorAbastecer) {
		this.valorAbastecer = valorAbastecer;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BombaCombustível [tipoCombustivel=");
		builder.append(tipoCombustivel);
		builder.append(", valorLitro=");
		builder.append(valorLitro);
		builder.append(", quantidadeCombustivel=");
		builder.append(quantidadeCombustivel);
		builder.append(", valorAbastecer=");
		builder.append(valorAbastecer);
		builder.append("]");
		return builder.toString();
	}

}
