import java.util.Scanner;

public class TresMaioresNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("1° Número [INTEIRO]: ");
		int num1 = entrada.nextInt();
		
		System.out.print("2° Número [INTEIRO]: ");
		int num2 = entrada.nextInt();
		
		System.out.print("3° Número [INTEIRO]: ");
		int num3 = entrada.nextInt();
		
		entrada.close();
		
		if( ( num1 > num2 && num1 > num3 ) && ( num2 > num3 ) ) {
			System.out.println("Maior Número: " + num1);
			System.out.println("Menor Número: " + num3);
		}
		else if( ( num1 > num2 && num1 > num3 ) && ( num3 > num2 ) ) {
			System.out.println("Maior Número: " + num1);
			System.out.println("Menor Número: " + num2);
		}
		else if( ( num2 > num1 && num2 > num3 ) && ( num1 > num3 ) ) {
			System.out.println("Maior Número: " + num2);
			System.out.println("Menor Número: " + num3);
		}
		else if( ( num2 > num1 && num2 > num3 ) && ( num3 > num1 ) ) {
			System.out.println("Maior Número: " + num2);
			System.out.println("Menor Número: " + num1);
		}
		else if( ( num3 > num1 && num3 > num2 ) && ( num1 > num2 ) ) {
			System.out.println("Maior Número: " + num3);
			System.out.println("Menor Número: " + num2);
		}
		else if( ( num3 > num1 && num3 > num2 ) && ( num2 > num1 ) ) {
			System.out.println("Maior Número: " + num3);
			System.out.println("Menor Número: " + num1);
		}
	}
}
