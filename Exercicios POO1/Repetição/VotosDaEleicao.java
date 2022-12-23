import java.util.Scanner;

public class VotosDaEleicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Número De Pessoas Que Irão Votar: ");
		int numVotantes = entrada.nextInt();
		
		int candidato1 = 0;
		int candidato2 = 0;
		int candidato3 = 0;
		
		if (numVotantes > 0) {
			
			for (int x = 0; x < numVotantes; x++) {
				System.out.println("[1] Jimmy Hopkins");
				System.out.println("[2] Franklin Clinton ");
				System.out.println("[3] John Marston");
				int escolha = entrada.nextInt();
			
				if (escolha == 1) {
					candidato1 = candidato1 + 1;
				}
				else if (escolha == 2) {
					candidato2 = candidato2 + 1;
				}
				else if (escolha == 3) {
					candidato3 = candidato3 + 1;
				}
				else {
					System.out.println("ERRO ! Voto Não Computado");
				}
			}
			entrada.close();
		
			System.out.println("Jimmy Hopkins: " + candidato1 + " voto(s)");
			System.out.println("Franklin Clinton: " + candidato2 + " voto(s)");
			System.out.println("John Marston: " + candidato3 + " voto(s)");
		}
		else {
			System.out.println("A Votação Não Pode Ser Iniciada!");
		}
	}
}
