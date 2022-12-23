public class LojaDeArtigos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float quantItens = 50;
		float soma = 0;
		
		System.out.println("Lojas Quase Dois - Tabela de preços");
		for (int x = 1; x <= quantItens; x++) {
			soma = soma + 1.99f;
			
			System.out.println(x +"- R$ " + soma);
		}
	}
}
