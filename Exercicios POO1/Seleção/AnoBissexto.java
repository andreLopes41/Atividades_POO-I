import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite O Ano: ");
		int ano = entrada.nextInt();
		
		entrada.close();
		
		if (ano % 400 == 0) {
			System.out.println("Ano BISSEXTO");
		}
		
		else if (ano % 4 == 0 && ano % 100 != 0) {
			System.out.println("Ano BISSEXTO");
		}
		
		else {
			System.out.println("Ano NÃO BISSEXTO");
		}
	}	
}
