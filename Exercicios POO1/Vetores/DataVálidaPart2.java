import java.util.Scanner;

public class DataVálidaPart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		String dia;
		String mes;
		String ano;
		
		System.out.println("Insira Uma Data No padrão: dd/mm/aaaa");
		do {
			System.out.print("Dia: ");
			dia = entrada.nextLine();
		}while(dia.length() != 2);
		
		do {
			System.out.print("Mês: ");
			 mes = entrada.nextLine();
		}while(mes.length() != 2);
		
		do {
			System.out.print("Ano: ");
			ano = entrada.nextLine();
		}while(ano.length() != 4);
		
		entrada.close();
		
		System.out.println("Data: " + dia + "/" + mes + "/" + ano);
	}
}
