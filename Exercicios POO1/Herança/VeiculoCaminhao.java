
public class VeiculoCaminhao extends Veiculo {
	
	private int eixos;
	
	public VeiculoCaminhao (boolean motor)  {
		super(motor);
	}

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" Caminhao =  Eixos: ");
		builder.append(eixos);
		return builder.toString();
	}
	
	

}
