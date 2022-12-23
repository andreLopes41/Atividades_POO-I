import java.util.Scanner;

public class EleicaoPresidencial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		boolean votar = true;
		float voto = 0;
		float votosCandidato1 = 0;
		float votosCandidato2 = 0;
		float votosCandidato3 = 0;
		float votosCandidato4 = 0;
		float totalDeVotos = 0;
		float totalNulo = 0;
		float totalBranco = 0;
		float percNulo = 0;
		float percBranco = 0;
		 
		
		while(votar) {
			System.out.println("   CANDIDATOS");
			System.out.println("[1] Michael De Santa");
			System.out.println("[2] Carl Johnson ");
			System.out.println("[3] Tommy Vercetti");
			System.out.println("[4] Arthur Morgan");
			System.out.println("[5] Voto Nulo");
			System.out.println("[6] Voto Em Branco");
			System.out.println("[0] Encerrar Votação");
			voto = entrada.nextInt();
			
			if ( voto == 0 ) {
				votar = false;
				System.out.println("Votação Finalizada!");
			}
			
			if ( voto == 1) {
				votosCandidato1 = votosCandidato1 + 1;
				totalDeVotos = totalDeVotos + 1;
			}
			
			else if ( voto == 2) {
				votosCandidato2 = votosCandidato2 + 1;
				totalDeVotos = totalDeVotos + 1;
			}
			
			else if ( voto == 3) {
				votosCandidato3 = votosCandidato3 + 1;
				totalDeVotos = totalDeVotos + 1;
			}
			
			else if ( voto == 4) {
				votosCandidato4 = votosCandidato4 + 1;
				totalDeVotos = totalDeVotos + 1;
			}
			
			else if ( voto == 5) {
				totalNulo = totalNulo + 1;
				totalDeVotos = totalDeVotos + 1;
			}
			
			else if ( voto == 6) {
				totalBranco = totalBranco + 1;
				totalDeVotos = totalDeVotos + 1;
			}
			else {
				System.out.println("Voto Não Computado!");
			}
		}
		
		entrada.close();
		
		totalDeVotos = (totalDeVotos * 100) / 100;
		percNulo = (totalNulo * 100) / totalDeVotos;
		percBranco = (totalBranco * 100) / totalDeVotos;
		
		System.out.println("   RESULTADO");
		System.out.println("Michael De Santa: " + votosCandidato1 + " Voto(s)");
		System.out.println("Carl Johnson: " + votosCandidato2 + " Voto(s)");
		System.out.println("Tommy Vercetti: " + votosCandidato3 + " Voto(s)");
		System.out.println("Arthur Morgan: " + votosCandidato4 + " Voto(s)");
		System.out.println("\nTotal De Votos Nulos: " + totalNulo + " Voto(s)");
		System.out.println("Total De Votos Em Branco: " + totalBranco + " Voto(s)");
		System.out.println("\nPercentagem de Nulos: " + percNulo + "%");
		System.out.println("Percentagem de Brancos: " + percBranco + "%");
	}
}
