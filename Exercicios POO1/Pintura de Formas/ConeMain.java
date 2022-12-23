package com.andre.objetos;

public class ConeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float raio = 0;
		float altura = 0;
		int tipoTinta = 0;
		float precoTinta = 0;
		float geratriz = 0;
		
		
		Cone formato = new Cone (raio, altura, tipoTinta, precoTinta, geratriz);
		
		formato.setRaio(6);
		formato.setAltura(8);
		formato.setTipoTinta(1);
		formato.setPrecoTinta(238.90f);
		formato.setGeratriz(10);
		
		System.out.println(formato);
		System.out.println(formato.FundoCone());
		System.out.println(formato.LateralCone());
		System.out.println(formato.AreaTotalCone());
		System.out.println(formato.LitrosCone());
		System.out.println(formato.LatasCone());
		System.out.println(formato.PrecoTotalCone());

	}

}
