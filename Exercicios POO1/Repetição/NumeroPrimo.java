import java .util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite Um Número: ");
		int numI = entrada.nextInt();
		
		entrada.close();
		
		
		boolean flag = true;
		
		for (int x = 1; x <= numI; x++) {
			
			flag = true;
			
			for (int y = 2; y < x; y++) {
				if (x % y == 0 ) {
					flag = false;
				}
			}
		}
		if (flag) {
			System.out.println(numI + " é Primo!");
		}
		else {
			System.out.println(numI + " Não é Primo!");
		}
	}
}
