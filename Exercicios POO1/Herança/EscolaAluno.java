
public class EscolaAluno extends EscolaPessoa {
	
	private int matricula;
	
	public EscolaAluno() {
		setMatricula(matricula);
	}
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" Aluno Matricula: ");
		builder.append(matricula);
		return builder.toString();
	}
	
	

}
