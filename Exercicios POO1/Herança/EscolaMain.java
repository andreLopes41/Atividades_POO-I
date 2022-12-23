
public class EscolaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EscolaPessoa pessoa = new EscolaPessoa ();
		pessoa.setCodigo(4);
		pessoa.setNome("Eduardo");
		pessoa.setEndereco("Agrolândia");
		System.out.println(pessoa);
		
		EscolaAluno aluno = new EscolaAluno ();
		aluno.setCodigo(7);
		aluno.setNome("Marcos");
		aluno.setEndereco("Palhoça");
		aluno.setMatricula(20214798);
		System.out.println(aluno);
		
		EscolaProfessor professor = new EscolaProfessor ();
		professor.setCodigo(19);
		professor.setNome("Paulo");
		professor.setEndereco("Indaial");
		professor.setDisciplina("Matemática");
		System.out.println(professor);

	}

}
