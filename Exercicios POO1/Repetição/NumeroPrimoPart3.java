import java.util.Scanner;

public class NumeroPrimoPart3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		int numI;
		int divisoes = 1;
		
		do {
			System.out.print("Digite Um Número Maior que [1]: ");
			 numI = entrada.nextInt();
		}while (numI < 2);
		
		entrada.close();
				
		boolean flag = true;
		
		for (int x = 1; x <= numI; x++) {
			
			flag = true;
			
			for (int y = 2; y < x; y++) {
				if (x % y == 0 ) {
					
					flag = false;
					
					break;
				}
				else {
					divisoes = divisoes + 1;
				}	
			}	
		}
		if (flag) {
			System.out.println(numI + " é Primo!");
		}
		else {
			System.out.println(numI + " Não é Primo!");
		}
		System.out.println("Total De Divisões: " + divisoes);
				
	}
}
