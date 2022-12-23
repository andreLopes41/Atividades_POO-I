package com.objetos.orientacao.andre;

public class Cardapio {
	
	private float cod100 = 1.20f;
	private float cod101 = 1.30f;
	private float cod102 = 1.50f;
	private float cod103 = 1.20f;
	private float cod104 = 1.30f;
	private float cod105 = 1.00f;
	private int quant100;
	private int quant101;
	private int quant102;
	private int quant103;
	private int quant104;
	private int quant105;
	private float valorTotal;
	
	public Cardapio(int quant100, int quant101, int quant102, int quant103, int quant104, int quant105) {
		this.quant100 = quant100;
		this.quant101 = quant101;
		this.quant102 = quant102;
		this.quant103 = quant103;
		this.quant104 = quant104;
		this.quant105 = quant105;
	}
	
	public String CachQuente() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("Cachorro Quente: ");
		builder.append(this.quant100 * cod100 + " R$");
		
		valorTotal  = valorTotal + (this.quant100 * cod100);
		
		
		return builder.toString();
	}
	
	public String BauSimp() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("Bauru Simples: ");
		builder.append(this.quant101 * cod101 + " R$");
		
		valorTotal  = valorTotal + (this.quant101 * cod101);
		
		return builder.toString();
	}
	
	public String BauOvo() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("Bauru com ovo: ");
		builder.append(this.quant102 * cod102 + " R$");
		
		valorTotal  = valorTotal + (this.quant102 * cod102);
		
		return builder.toString();
	}
	
	public String Hambúrguer() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("Bauru com ovo: ");
		builder.append(this.quant103 * cod103 + " R$");
		
		valorTotal  = valorTotal + (this.quant103 * cod103);
		
		return builder.toString();
	}
	
	public String Cheeseburguer() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("Bauru com ovo: ");
		builder.append(this.quant104 * cod104 + " R$");
		
		valorTotal  = valorTotal + (this.quant104 * cod104);
		
		return builder.toString();
	}
	
	public String Refrigerante() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("Bauru com ovo: ");
		builder.append(this.quant105 * cod105 + " R$");
		
		valorTotal  = valorTotal + (this.quant105 * cod105);
		
		return builder.toString();
	}
	
	public String Total() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("Total(R$): ");
		builder.append(valorTotal + " R$");
		
		return builder.toString();
	}

	public float getCod100() {
		return cod100;
	}

	public void setCod100(float cod100) {
		this.cod100 = cod100;
	}

	public float getCod101() {
		return cod101;
	}

	public void setCod101(float cod101) {
		this.cod101 = cod101;
	}

	public float getCod102() {
		return cod102;
	}

	public void setCod102(float cod102) {
		this.cod102 = cod102;
	}

	public float getCod103() {
		return cod103;
	}

	public void setCod103(float cod103) {
		this.cod103 = cod103;
	}

	public float getCod104() {
		return cod104;
	}

	public void setCod104(float cod104) {
		this.cod104 = cod104;
	}

	public float getCod105() {
		return cod105;
	}

	public void setCod105(float cod105) {
		this.cod105 = cod105;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("   Cardápio     | Código |   Preço");
		builder.append("\nCachorro Quente |   100  | ");
		builder.append(" R$ " + cod100);
		builder.append("\nBauru Simples   |   101  | ");
		builder.append(" R$ " + cod101);
		builder.append("\nBauru com ovo   |   102  | ");
		builder.append(" R$ " + cod102);
		builder.append("\nHambúrguer      |   103  | ");
		builder.append(" R$ " + cod103);
		builder.append("\nCheeseburguer   |   104  | ");
		builder.append(" R$ " + cod104);
		builder.append("\nRefrigerante    |   105  | ");
		builder.append(" R$ " + cod105);
		builder.append("\nPara Sair Digite ZERO [0] ");
		return builder.toString();
	}
	
	

}
