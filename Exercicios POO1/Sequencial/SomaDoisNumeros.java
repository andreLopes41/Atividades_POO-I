import java.util.Scanner;

public class SomaDoisNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Informe o 1° Número [Inteiro]: ");
		int num1 = entrada.nextInt();
		
		System.out.print("Informe o 2° Número [Inteiro]: ");
		int num2 = entrada.nextInt();
		
		entrada.close();
		
		int soma;
		
		soma = num1 + num2;
		
		System.out.print("A Soma Entre Os Dois Números Foi: " + soma);
	}

}
