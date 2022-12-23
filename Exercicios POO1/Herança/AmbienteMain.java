
public class AmbienteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ambiente ambiente = new Ambiente(45.9f);
		System.out.println(ambiente);
		
		AmbienteQuarto quarto = new AmbienteQuarto(15.6f);
		quarto.setCapacidade(3);
		System.out.println(quarto);
		
		AmbienteSala sala = new AmbienteSala(20.3f);
		sala.setTv(true);
		System.out.println(sala);
		
		AmbienteBanheiro banheiro = new AmbienteBanheiro(9.89f);
		banheiro.setBanheira(false);
		System.out.println(banheiro);
		
		AmbienteCozinha cozinha = new AmbienteCozinha(20.1f);
		cozinha.setMicroOndas(true);
		System.out.println(cozinha);

	}

}
