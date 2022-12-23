
public class VeiculoMoto extends Veiculo {
	
	private int cilindradas;
	
	public VeiculoMoto(boolean motor) {
		super(motor);
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" Moto = Cilindradas: ");
		builder.append(cilindradas);
		return builder.toString();
	}
	
	

}
