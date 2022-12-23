
public class ItemMidia extends Item {
	
	private String gravadora;
	private float duracao;
	
	public ItemMidia () {
		setGravadora(gravadora);
		setDuracao(duracao);
	}

	public String getGravadora() {
		return gravadora;
	}

	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}

	public float getDuracao() {
		return duracao;
	}

	public void setDuracao(float duracao) {
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" Midia ==> Gravadora: ");
		builder.append(gravadora);
		builder.append(" Duracao: ");
		builder.append(duracao);
		return builder.toString();
	}
	
	
	

}
