
public class VeiculoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Veiculo veic = new Veiculo (true);
		System.out.println(veic);
		
		VeiculoCaminhao caminhao = new VeiculoCaminhao (false);
		caminhao.setEixos(3);
		System.out.println(caminhao);
		
		VeiculoCarro carro = new VeiculoCarro (false);
		carro.setPortas(4);
		System.out.println(carro);
		
		VeiculoMoto moto = new VeiculoMoto (true);
		moto.setCilindradas(160);
		System.out.println(moto);

	}

}
