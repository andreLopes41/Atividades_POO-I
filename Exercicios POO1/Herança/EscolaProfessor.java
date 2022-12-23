
public class EscolaProfessor extends EscolaPessoa {
	
	private String disciplina;
	
	public EscolaProfessor () {
		setDisciplina(disciplina);
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" Professor Disciplina: ");
		builder.append(disciplina);
		return builder.toString();
	}

}
