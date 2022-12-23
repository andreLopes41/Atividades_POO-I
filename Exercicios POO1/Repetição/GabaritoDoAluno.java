import java.util.Scanner;

public class GabaritoDoAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		String resposta; 
		float nota = 0;
		int escolha = 0;
		int contador = 0;
		float maiorNota = 0;
		float menorNota = 0;
		float media = 0;
		float soma = 0;
		boolean flag = true;
		
		
		do {
			
			System.out.println("[1] Responder a Prova");
			System.out.println("[0] Finalizar Teste");
			escolha = entrada.nextInt();
			nota = 0;
			
			if (escolha == 1) {
				entrada.nextLine();
				contador = contador + 1;
		
				for (int x = 1; x <= 10; x++) {
					System.out.print(x + "° Questão: ");
					resposta = entrada.nextLine();
					
					if (x == 1 && resposta.equalsIgnoreCase("A") ) {
						nota = nota + 1;
						soma = nota;
					}
					
					if (x == 2 && resposta.equalsIgnoreCase("B") ) {
						nota = nota + 1;
						soma = nota;
					}
					
					if (x == 3 && resposta.equalsIgnoreCase("C") ) {
						nota = nota + 1;
						soma = nota;
					}
					
					if (x == 4 && resposta.equalsIgnoreCase("D") ) {
						nota = nota + 1;
						soma = nota;
					}
					
					if (x == 5 && resposta.equalsIgnoreCase("E") ) {
						nota = nota + 1;
						soma = nota;
					}
					
					if (x == 6 && resposta.equalsIgnoreCase("E") ) {
						nota = nota + 1;
						soma = nota;
					}
					
					if (x == 7 && resposta.equalsIgnoreCase("D") ) {
						nota = nota + 1;
						soma = nota;
					}
					
					if (x == 8 && resposta.equalsIgnoreCase("C") ) {
						nota = nota + 1;
						soma = nota;
					}
					
					if (x == 9 && resposta.equalsIgnoreCase("B") ) {
						nota = nota + 1;
						soma = nota;
					}
					
					if (x == 10 && resposta.equalsIgnoreCase("A") ) {
						nota = nota + 1;
						soma = nota;
					}
						
					if (flag) {
						flag = false;
						maiorNota = nota;
						menorNota = nota;
					}
					
					if (soma > maiorNota) {
						maiorNota = soma;
					}
						
					if (soma < menorNota ) {
						menorNota = soma;
					}
				}
			}
			else {
				System.out.println("Questionário Finalizado!");
			}
		}while (escolha == 1);
		
		entrada.close();
		
		media = soma / contador;
		
		System.out.println("Maior Nota: " + maiorNota);
		System.out.println("Menor Nota: " + menorNota);
		System.out.println("\nTotal Que Utilizaram O Sistema: " + contador + " Aluno(s)" );
		System.out.println("Media Das Notas: " + media);
	}
}
