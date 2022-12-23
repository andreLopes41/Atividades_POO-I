package com.andre.objetos;

public class CuboMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 float area = 0;
		 float redTinta = 0;
		 int tipoTinta = 0;
		 float precoTinta = 0;
		
		Cubo formato = new Cubo (area, redTinta, tipoTinta, precoTinta);
		
		formato.setArea(4);
		formato.setRedTinta(2);
		formato.setTipoTinta(1);
		formato.setPrecoTinta(101.90f);
	
		System.out.println(formato);
		System.out.println(formato.AreaBaseCubo());
		System.out.println(formato.AreaTotalCubo());
		System.out.println(formato.VolumeCubo());
		System.out.println(formato.DiagonalCubo());
		System.out.println(formato.LitrosCubo());
		System.out.println(formato.LatasCubo());
		System.out.println(formato.ValorTotalCubo());
	}

}
