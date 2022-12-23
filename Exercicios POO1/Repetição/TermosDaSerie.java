import java.util.Scanner;

public class TermosDaSerie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Quantidade De Termos Da Série: ");
		int numTermos = entrada.nextInt();
		
		entrada.close();
		
		int n = 0;
		int m = 1;
		
		for (int x = 0; x <= numTermos; x++) {
			n = n + 1;
			m = m + 2;
			if (x == 0 ) {
				n = 1;
				m = 1;
			}
			System.out.println(n + "|" + m);
		}
	}
}
