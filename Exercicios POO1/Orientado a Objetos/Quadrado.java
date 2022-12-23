package com.objetos.orientacao.andre;

public class Quadrado {
	
	private int tam;
	
	public Quadrado(int tam) {
		this.tam = tam;
		
	}
	
	public String MudarValor(int tam) {
		StringBuilder builder = new StringBuilder();
		setTam(tam);
		
		return builder.toString();
	
	}
	
	public String DesenhaQuadrado() {
		String saida = "";
		
		for (int i = 0; i < tam; i++) {
			if (i == 0 ) {
				System.out.print("\nx");
			}
			
			System.out.print("---");
			
			if (i == (tam -1)) {
				System.out.print("x");
			}
			
		}
		
		for (int j = 0; j < tam; j++) {
			for (int i = 0; i < tam; i++) {
				if (i == 0 ) {
					System.out.print("\n|");
				}
				else {
					System.out.print("   ");
				}
			
				if (i == (tam -1)) {
					System.out.print("   |");
				}
			}
		}
		
		for (int i = 0; i < tam; i++) {
			if (i == 0 ) {
				System.out.print("\nx");
			}
			
			System.out.print("---");
			
			if (i == (tam -1)) {
				System.out.print("x");
			}
			
		}
		return saida;
	}
	
	public String AreaQuadrado() {
		StringBuilder builder = new StringBuilder();
			builder.append("Área Do Quadrado: ");
			builder.append(tam * tam + "cm²");
			
		return builder.toString();
	}
	
	public int getTam() {
		return tam;
	}
	public void setTam(int tam) {
		this.tam = tam;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Quadrado [tam=");
		builder.append(tam);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	

}
