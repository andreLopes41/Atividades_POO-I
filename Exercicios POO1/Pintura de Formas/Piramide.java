package com.andre.objetos;

public class Piramide {
	
	private float areaBase;
	private float altura;
	private int tipoTinta;
	private float precoTinta;
	private float redTinta = 4.76f;
	private int litros = 18;
	
	public Piramide (float areaBase, float altura, int tipoTinta, float precoTinta) {
		this.areaBase = areaBase;
		this.altura = altura;
		this.tipoTinta = tipoTinta;
		this.precoTinta = precoTinta;
	}
	
	public String AreaLadoPiramide() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("al: " + Math.sqrt((areaBase * areaBase + altura * altura)));
		
		return builder.toString();
	}
	
	public String AreaTriangulo() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("Área Triângulo: " + (areaBase * Math.sqrt(areaBase * areaBase + altura * altura)));
		
		return builder.toString();
	}
	
	public String AreaBasePiramide() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("Area Base: " + (areaBase * areaBase) * 4);
		
		return builder.toString();
	}
	
	public String AreaTotalTriangulo() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("Área Total: " + (((areaBase * Math.sqrt(((areaBase * areaBase + altura * altura))) * 4) + (areaBase * areaBase) * 4)));
		builder.append("\n================");
		
		return builder.toString();
	}
	
	public String LitrosPiramide() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("Litros de Tinta: " + (((areaBase * Math.sqrt(((areaBase * areaBase + altura * altura))) * 4) + (areaBase * areaBase) * 4))/ redTinta);
		
		return builder.toString();
	}
	
	public String LatasPiramide() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("Latas de Tinta: " + (((areaBase * Math.sqrt(((areaBase * areaBase + altura * altura))) * 4) + (areaBase * areaBase) * 4) / redTinta) / litros);
		
		return builder.toString();
	}
	
	public String PrecoPiramide() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("Preço: " + (((((areaBase * Math.sqrt(((areaBase * areaBase + altura * altura))) * 4) + (areaBase * areaBase) * 4) / redTinta) / litros)) * precoTinta);
		
		return builder.toString();
	}
	
	public String VolumePiramide() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("Volume: " + ((areaBase * areaBase) * 4) * altura / 3);
		
		return builder.toString();
	}

	public float getAreaBase() {
		return areaBase;
	}

	public void setAreaBase(float areaBase) {
		this.areaBase = areaBase;
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

	public float getPrecoTinta() {
		return precoTinta;
	}

	public void setPrecoTinta(float precoTinta) {
		this.precoTinta = precoTinta;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("- Piramide ");
		builder.append("\nab: ");
		builder.append(areaBase);
		builder.append("\nAltura: ");
		builder.append(altura);
		builder.append("\nTipo Tinta: ");
		builder.append(tipoTinta);
		builder.append("\n================");
		return builder.toString();
	}
}
