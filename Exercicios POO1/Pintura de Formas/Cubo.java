package com.andre.objetos;

public class Cubo {
	
	private float area;
	private float redTinta;
	private int litros = 18;
	private int tipoTinta;
	private float precoTinta;
	
	public Cubo (float area, float redTinta, int tipoTinta, float precoTinta) {
		this.area = area;
		this.redTinta = redTinta;
		this.tipoTinta = tipoTinta;
		this.precoTinta = precoTinta;
	}
	
	public String AreaBaseCubo() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("Área da Base: " + area * area);
		
		return builder.toString();
	}
	
	public String AreaTotalCubo() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("Área Total: " + (area * area) * 6);
		
		return builder.toString();
	}
	
	public String VolumeCubo() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("Volume: " + area * area * area);
		
		return builder.toString();
	}
	
	public String DiagonalCubo() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("Diagonal do Cubo: " + area * Math.sqrt(3));
		builder.append("\n================");
		
		return builder.toString();
	}
	
	public String LitrosCubo() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("Litros de Tinta: " + 6 * (area * area) / redTinta);
		
		return builder.toString();
	}
	
	public String LatasCubo() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("Latas de Tinta: " + (6 * (area * area) / redTinta) / litros);
		
		return builder.toString();
	}
	
	public String ValorTotalCubo() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("Valor Total: " + (6 * ((area * area) / redTinta) / litros) * precoTinta);
		
		return builder.toString();
	}
	
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	public float getRedTinta() {
		return redTinta;
	}
	public void setRedTinta(float redTinta) {
		this.redTinta = redTinta;
	}
	public int getLitros() {
		return litros;
	}
	public void setLitros(int litros) {
		this.litros = litros;
	}
	public int getTipoTinta() {
		return tipoTinta;
	}
	public void setTipoTinta(int tipoTinta) {
		this.tipoTinta = tipoTinta;
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
		builder.append("- Cubo");
		builder.append("\nÁrea: ");
		builder.append(area);
		builder.append("\nRendimento: ");
		builder.append(redTinta);
		builder.append("\nTipo de Tinta: ");
		builder.append(tipoTinta);
		builder.append("\n================");
		return builder.toString();
	}
	
	

}
