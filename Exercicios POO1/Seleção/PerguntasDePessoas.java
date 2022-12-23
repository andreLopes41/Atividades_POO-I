import java.util.Scanner;

public class PerguntasDePessoas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Telefonou para a vítima?");
		System.out.println("[1] Sim");
		System.out.println("[2] Não");
		int escolha1 = entrada.nextInt();
		
		System.out.println("Esteve no local do crime?");
		System.out.println("[1] Sim");
		System.out.println("[2] Não");
		int escolha2 = entrada.nextInt();
			
		System.out.println("Mora perto da vítima?");
		System.out.println("[1] Sim");
		System.out.println("[2] Não");
		int escolha3 = entrada.nextInt();
				
		System.out.println("Devia para a vítima?");
		System.out.println("[1] Sim");
		System.out.println("[2] Não");
		int escolha4 = entrada.nextInt();
					
		System.out.println("Já trabalhou com a vítima?");
		System.out.println("[1] Sim");
		System.out.println("[2] Não");
		int escolha5 = entrada.nextInt();
		
		entrada.close();
		
		int resultado;
		
		resultado = 0;
		
		if (escolha1 == 1) {
			resultado = resultado + 1;
		}
		if (escolha2 == 1) {
			resultado = resultado + 1;
		}
		if (escolha3 == 1) {
			resultado = resultado + 1;
		}
		if (escolha4 == 1) {
			resultado = resultado + 1;
		}
		if (escolha5 == 1) {
			resultado = resultado + 1;
		}
		
		if (resultado == 2) {
			System.out.println("Pessoa: Suspeita");
		}
		else if (resultado == 3 || resultado == 4) {
			System.out.println("Pessoa: Cúmplice");
		}
		else if (resultado == 5) {
			System.out.println("Pessoa: Assasino(a)");
		}
		else {
				System.out.println("Pessoa: Inocente");
		}
	}
}
