
public class ItemCd extends ItemMidia {
	
	private int faixas;
	private String artista;
	private String album;
	
	public ItemCd() {
		setFaixas(faixas);
		setArtista(artista);
		setAlbum(album);
	}

	public int getFaixas() {
		return faixas;
	}

	public void setFaixas(int faixas) {
		this.faixas = faixas;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" CD ==> Faixas: ");
		builder.append(faixas);
		builder.append(" Artista: ");
		builder.append(artista);
		builder.append(" Album: ");
		builder.append(album);
		return builder.toString();
	}
	
	

}
