import java.util.Scanner;

public class PopulaçaoDoPais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		float populacaoA;
		float populacaoB;
		float taxaA;
		float taxaB;
		
		do {
			System.out.print("Tamanho População [A]: ");
			populacaoA = entrada.nextFloat();
			
			if ((populacaoA <= 0 )) {
				System.out.println("Entrada Inválida!");
			}
		}while (populacaoA <= 0 );
		
		do {
			System.out.print("Tamanho População [B]: ");
			populacaoB = entrada.nextFloat();
			
			if (populacaoB <= 0) {
				System.out.println("Entrada Inválida!");
			}
		}while (populacaoB <= 0 );
		
		do {
			System.out.print("Taxa De crescimento População [A]: ");
			taxaA = entrada.nextFloat();
			
			if (taxaA <= 0) {
				System.out.println("Entrada Inválida!");
			}
		}while (taxaA <= 0);
		
		do {
			System.out.print("Taxa De crescimento População [B]: ");
			taxaB = entrada.nextFloat();
			
			if (taxaB <= 0 || taxaB >= taxaA) {
				System.out.println("Entrada Inválida Ou Taxa B Com Valor Maior Que a Taxa A!");
			}
		}while (taxaB <= 0 || taxaB >= taxaA);
		
		float CrescimentoA =  populacaoA * (taxaA / 100);
		float CrescimentoB =  populacaoB * (taxaB / 100);
		
		float anosA = populacaoA + CrescimentoA;  
		float anosB = populacaoB + CrescimentoB;
		int anosNecessarios = 0;
		
		while(anosA < anosB) {
		anosA = anosA + CrescimentoA;
		anosB = anosB + CrescimentoB;
		anosNecessarios = anosNecessarios + 1;
		}
		
		if (populacaoA > populacaoB) {
			System.out.println("População [A] Já é Igual Ou Superior a População [B]");
		}
		else {
			System.out.println("Para a População [A] Se Igualar Ou Ultrapassar a População [B], Será Necessário: " + anosNecessarios + " ano(s)" );
		}
		entrada.close();
	}
}