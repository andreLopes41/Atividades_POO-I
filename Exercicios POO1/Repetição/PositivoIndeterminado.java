import java.util.Scanner;

public class PositivoIndeterminado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		int num = 0;
		int mostraNum = 1;
		int intervalo_025 = 0;
		int intervalo_2650 = 0;
		int intervalo_5175 = 0;
		int intervalo_76100 = 0;
		
		System.out.println("Para Sair Digite Um Valor Negativo!");
		
		do {
			System.out.print(mostraNum + "° Nota: ");
			num = entrada.nextInt();
			
			mostraNum = mostraNum + 1;
			
			if (num >= 0 && num <= 25) {
				intervalo_025 = intervalo_025 + 1;
			}
			
			else if (num >= 26 && num <= 50) {
				intervalo_2650 = intervalo_2650 + 1;
			}
			
			else if (num >= 51 && num <= 75) {
				intervalo_5175 = intervalo_5175 + 1;
			}
			
			else if (num >= 76 && num <= 100) {
				intervalo_76100 = intervalo_76100 + 1;
			}
			
		}while (num >= 0);
		
		entrada.close();
		
		System.out.println("Quant. [0-25]: " + intervalo_025 + " Números" );
		System.out.println("Quant. [26-50]: " + intervalo_2650 + " Números" );
		System.out.println("Quant. [51-75]: " + intervalo_5175 + " Números" );
		System.out.println("Quant. [76-100]: " + intervalo_76100 + " Números" );
	}

}
