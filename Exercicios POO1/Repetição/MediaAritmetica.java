import java.util.Scanner;

public class MediaAritmetica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		int mostrarNota = 1;
		float nota;
		int contador = 0;
		float soma = 0;
		float media;
		
		System.out.println("Para Sair Digite Um Valor Negativo! [Após A Segunda Nota]");
		
		do {
			System.out.print(mostrarNota + "° Nota: ");
			nota = entrada.nextFloat();
			
			if (nota < 0 && contador < 2) {
				System.out.println("Entrada Inválida!");
			}
			else if (nota >= 0) {
				mostrarNota = mostrarNota + 1;
				contador = contador + 1;
				soma = soma + nota;
			}
			
		}while (nota > 0 || contador < 2);
		
		entrada.close();
		
		media = soma / contador;
		
		System.out.println("Média Aritmética: " + media);
	}
}
