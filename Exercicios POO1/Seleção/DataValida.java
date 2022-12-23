import java.util.Scanner;

public class DataValida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Dia [dd]: ");
		String dia = entrada.nextLine();
		
		if (dia.length() == 2) {
			System.out.print("Mês [mm]: ");
			String mes = entrada.nextLine();
			
			if (mes.length() == 2) {
				System.out.print("Ano [aaaa]: ");
				String ano = entrada.nextLine();
				
				if (ano.length() == 4) {
					System.out.println("Data Válida: " + dia + "/" + mes + "/" + ano);
				}
				else {
					System.out.println("Data Inválida ");
				}
			}
			else {
				System.out.println("Data Inválida ");
			}
		}	
		else {
			System.out.println("Data Inválida ");
		}
		entrada.close();
	}
}
