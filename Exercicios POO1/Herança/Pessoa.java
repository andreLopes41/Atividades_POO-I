
public class Pessoa {
	
	private String nome;
	private String endereco;
	
	public Pessoa() {
		setNome(nome);
		setEndereco(endereco);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Nome: ");
		builder.append(nome);
		builder.append(" ==> Endereço: ");
		builder.append(endereco);
		return builder.toString();
	}
	
	
	
	

}
