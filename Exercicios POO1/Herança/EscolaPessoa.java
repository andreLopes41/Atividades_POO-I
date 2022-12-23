
public class EscolaPessoa {
	
	private int codigo;
	private String nome;
	private String endereco;
	
	public EscolaPessoa() {
		setCodigo(codigo);
		setNome(nome);
		setEndereco(endereco);
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
		builder.append(" Pessoa Codigo: ");
		builder.append(codigo);
		builder.append(" Nome: ");
		builder.append(nome);
		builder.append(" Endereco: ");
		builder.append(endereco);
		return builder.toString();
	}
	
	

}
