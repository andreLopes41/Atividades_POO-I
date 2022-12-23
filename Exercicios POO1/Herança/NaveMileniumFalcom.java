
public class NaveMileniumFalcom extends NaveApollo11 {
	
	private float hiperPropulsor;
	
	public NaveMileniumFalcom (double velocidadeMaxima) {
		super(velocidadeMaxima);
		setHiperPropulsor(hiperPropulsor);
	}

	public float getHiperPropulsor() {
		return hiperPropulsor;
	}

	public void setHiperPropulsor(float hiperPropulsor) {
		this.hiperPropulsor = hiperPropulsor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Nave MileniumFalcom [HiperPropulsor=");
		builder.append(hiperPropulsor);
		builder.append("]");
		return builder.toString();
	}

	
	
	

}
