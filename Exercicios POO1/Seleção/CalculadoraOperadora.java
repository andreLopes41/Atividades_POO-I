import java.util.Scanner;

public class CalculadoraOperadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("[1] Soma");
		System.out.println("[2] Subtração");
		System.out.println("[3] Multiplicação");
		System.out.println("[4] Divisão");
		int escolha = entrada.nextInt();
		
		float resultado;
		
		resultado = 0;
		
		if (escolha < 1 || escolha > 4) {
			System.out.println("Operação Inválida");
		}
		else if (escolha == 1) {
			System.out.print("1° Número: ");
			float num1 = entrada.nextFloat();
			
			System.out.print("2° Número: ");
			float num2 = entrada.nextFloat();
			
			resultado = num1 + num2;
			
			System.out.println("O Resuldao Da Adição Foi: " +resultado);
		}
		else if (escolha == 2) {
			System.out.print("1° Número: ");
			float num1 = entrada.nextFloat();
			
			System.out.print("2° Número: ");
			float num2 = entrada.nextFloat();
			
			resultado = num1 - num2;
			
			System.out.println("O Resuldao Da Subtração Foi: " +resultado);
		}
		else if (escolha == 3) {
			System.out.print("1° Número: ");
			float num1 = entrada.nextFloat();
			
			System.out.print("2° Número: ");
			float num2 = entrada.nextFloat();
			
			resultado = num1 * num2;
			
			System.out.println("O Resuldao Da Multiplicação Foi: " +resultado);
		}
		else if (escolha == 4) {
			System.out.print("1° Número: ");
			float num1 = entrada.nextFloat();
			
			System.out.print("2° Número: ");
			float num2 = entrada.nextFloat();
			
			resultado = num1 / num2;
			
			if (num2 == 0) {
				resultado = 1;
				System.out.println("Denominador Alterado Para Não Ocorrer Erro De Divisão Por ZERO");
			}
			
			System.out.println("O Resuldao Da Divisão Foi: " +resultado);
		}
		if (escolha >=1 && escolha <= 4) {
					
			if (resultado % 2 == 0) {
				System.out.println("Número PAR");
			}
			else {
				System.out.println("Número ÍMPAR");
			}
		
			if (resultado < 0) {
				System.out.println("Número NEGATIVO");
			}
			else {
				System.out.println("Número POSITIVO");
			}
		
			if (resultado == (int)resultado) {
				System.out.println("Número INTEIRO");
			}
			else {
				System.out.println("Número DECIMAL");
			}
		}			
			entrada.close();

	}

}
