
public class VeiculoCarro extends Veiculo {
	
	private int portas;
	
	public VeiculoCarro(boolean motor) {
		super(motor);
	}

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" Carro = Portas: ");
		builder.append(portas);
		return builder.toString();
	}
	
	

}
