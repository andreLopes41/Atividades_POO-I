import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("1° Número [INTEIRO]: ");
		int num1 = entrada.nextInt();
		
		System.out.print("2° Número [INTEIRO]: ");
		int num2 = entrada.nextInt();
		
		entrada.close();
		
		if (num1 > num2) {
			System.out.println("O Número " + num1 + " É o Maior Número!");
		}
		
		if (num2 > num1) {
			System.out.println("O Número " + num2 + " É o Maior Número!");
		}
	}

}
