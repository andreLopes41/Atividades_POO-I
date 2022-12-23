package com.andre.objetos;

public class Cone {
	
	private float pi = 3.14f;
	private float raio;
	private float altura;
	private int tipoTinta;
	private float precoTinta;
	private float geratriz;
	private float redTinta = 3.45f;
	private int litros = 18;
	
	
	public Cone (float raio, float altura, int tipoTinta, float geratriz, float precoTinta ) {
		this.raio = raio;
		this.altura = altura;
		this.tipoTinta = tipoTinta;
		this.precoTinta = precoTinta;
		this.geratriz = geratriz;
	}
	
	public String FundoCone() {
		StringBuilder builder = new StringBuilder();
		builder.append("Área do Fundo:  " + pi * (raio * raio));
		
		return builder.toString();
		
	}
	
	public String LateralCone() {
		StringBuilder builder = new StringBuilder();
		builder.append("Area Lateral Cone:  " + raio * geratriz * pi);
		
		return builder.toString();
		
	}
	
	public String AreaTotalCone() {
		StringBuilder builder = new StringBuilder();
		builder.append("Area Total:  " + (pi * (raio * raio) + raio * geratriz * pi));
		builder.append("\n================");
		
		return builder.toString();
		
	}
	
	public String LitrosCone() {
		StringBuilder builder = new StringBuilder();
		builder.append("Litros:  " + redTinta * ((pi * (raio * raio)) + raio * geratriz * pi));
		
		return builder.toString();
		
	}
	
	public String LatasCone() {
		StringBuilder builder = new StringBuilder();
		builder.append("Latas:  " + redTinta * ((pi * (raio * raio)) + raio * geratriz * pi) / litros);
		
		return builder.toString();
		
	}
	
	public String PrecoTotalCone() {
		StringBuilder builder = new StringBuilder();
		builder.append("Preço Total:  " + redTinta * ((pi * (raio * raio)) + raio * geratriz * pi) / litros * precoTinta);
		
		return builder.toString();
		
	}

	public float getPi() {
		return pi;
	}

	public void setPi(float pi) {
		this.pi = pi;
	}

	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public int getTipoTinta() {
		return tipoTinta;
	}

	public void setTipoTinta(int tipoTinta) {
		this.tipoTinta = tipoTinta;
	}

	public float getGeratriz() {
		return geratriz;
	}

	public void setGeratriz(float geratriz) {
		this.geratriz = geratriz;
	}

	public float getredTinta() {
		return redTinta;
	}

	public void setredTinta(float redTinta) {
		this.redTinta = redTinta;
	}

	public int getLitros() {
		return litros;
	}

	public void setLitros(int litros) {
		this.litros = litros;
	}

	public float getPrecoTinta() {
		return precoTinta;
	}

	public void setPrecoTinta(float precoTinta) {
		this.precoTinta = precoTinta;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("- Cone");
		builder.append("\nRaio: ");
		builder.append(raio);
		builder.append("\nAltura: ");
		builder.append(altura);
		builder.append("\ntipoTinta: ");
		builder.append(tipoTinta);
		builder.append("\nGeratriz: ");
		builder.append(geratriz);
		builder.append("\n================");
		return builder.toString();
	}

	

	
	
	
	
	
	

}
