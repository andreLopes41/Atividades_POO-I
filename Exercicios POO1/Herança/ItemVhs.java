
public class ItemVhs extends ItemMidia {
	
	private String titulo;
	
	public ItemVhs () {
		setTitulo(titulo);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" VHS  ==> Titulo: ");
		builder.append(titulo);
		return builder.toString();
	}
	
	

}
