
public class ItemLivro extends Item {
	
	private String autor;
	
	public ItemLivro () {
		setAutor(autor);
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" Livro ==> Autor: ");
		builder.append(autor);
		return builder.toString();
	}
	
	

}
