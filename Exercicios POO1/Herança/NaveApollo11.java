
public class NaveApollo11 extends NaveEspacial {
	
	private String tipoCombustivel;
	
	public NaveApollo11 (double velocidadeMaxima) {
		super(velocidadeMaxima);
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Nave Apollo11 Tipo Combustivel: ");
		builder.append(tipoCombustivel);
		builder.append("]");
		return builder.toString();
	}
	
		

}
