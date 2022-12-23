package com.andre.objetos;

public class PiramideMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float areaBase = 0;
		float altura = 0;
		int tipoTinta = 0;
		float precoTinta = 0;
		
		Piramide formato = new Piramide (areaBase, altura, tipoTinta, precoTinta);
		
		formato.setAreaBase(13.89f);
		formato.setAltura(41.87f);
		formato.setTipoTinta(3);
		formato.setPrecoTinta(344.34f);
		
		System.out.println(formato);
		System.out.println(formato.AreaLadoPiramide());
		System.out.println(formato.AreaTriangulo());
		System.out.println(formato.AreaBasePiramide());
		System.out.println(formato.AreaTotalTriangulo());
		System.out.println(formato.LitrosPiramide());
		System.out.println(formato.LatasPiramide());
		System.out.println(formato.PrecoPiramide());
		System.out.println(formato.VolumePiramide());
	}

}
