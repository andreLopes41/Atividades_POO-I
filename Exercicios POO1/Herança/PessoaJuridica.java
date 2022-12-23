
public class PessoaJuridica extends Pessoa {
	
	private String cnpj;
	private String tipoEmpresa;
	
	public PessoaJuridica() {
		setCnpj(cnpj);
		setTipoEmpresa(tipoEmpresa);
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTipoEmpresa() {
		return tipoEmpresa;
	}

	public void setTipoEmpresa(String tipoEmpresa) {
		this.tipoEmpresa = tipoEmpresa;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\nCNPJ: ");
		builder.append(cnpj);
		builder.append(" ==> Empresa: ");
		builder.append(tipoEmpresa);
		return builder.toString();
	}
	
	

}
