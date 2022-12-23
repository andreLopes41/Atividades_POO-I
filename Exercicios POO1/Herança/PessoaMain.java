
public class PessoaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa p = new Pessoa();
		p.setNome("André");
		p.setEndereco("Atalanta");
		System.out.println(p);
		
		PessoaFisica pf = new PessoaFisica();
		pf.setNome("Gian");
		pf.setEndereco("Rio do Sul");
		pf.setCpf("426.789.163-51");
		pf.setEstadoCivil("Solteiro");
		System.out.println(pf);
		
		PessoaJuridica pj = new PessoaJuridica();
		pj.setNome("João");
		pj.setEndereco("Vidal Ramos");
		pj.setCnpj("03.768.134/0001-41");
		pj.setTipoEmpresa("Gastronomia");
		System.out.println(pj);

	}

}
