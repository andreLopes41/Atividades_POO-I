package com.objetos.orientacao.andre;

public class BombaCombustivelMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String tipoCombustivel = "";
		float valorLitro = 0;
		float quantidadeCombustivel = 0;
		
		BombaCombustível posto = new BombaCombustível(tipoCombustivel,valorLitro,quantidadeCombustivel );
		
		posto.setValorLitro(3.16f);
		posto.setValorAbastecer(81);
		System.out.println("Litros Por Valor: " + posto.abastecerPorValor());
		
		posto.setQuantidadeCombustivel(52);
		System.out.println("Litros Por Litros: " + posto.abastecerPorLitro());
		
		System.out.println("Valor: " + posto.alterarValor());
		
		System.out.println("Tipo: " + posto.alterarCombustivel());
		
		System.out.println("Quant Combustível: " + posto.alterarQuantidadeCombustivel());
	

	}

}
