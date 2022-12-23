
public class PessoaFisica extends Pessoa {
	
	private String cpf;
	private String estadoCivil;
	
	public PessoaFisica() {
		setCpf(cpf);
		setEstadoCivil(estadoCivil);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\nCPF: ");
		builder.append(cpf);
		builder.append(" ==> Estado Civil: ");
		builder.append(estadoCivil);
		return builder.toString();
	}

}
