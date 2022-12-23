import java.util.Scanner;

public class AumentoSalarial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Salário Do Colaborador: ");
		double salarioInicial = entrada.nextDouble();
		
		entrada.close();
		
		double salarioNovo;
		double valorDoAumento;
		int valorPercentual;
		
		valorPercentual = 0;
		valorDoAumento = 0;
		salarioNovo = 0;
		
		if (salarioInicial <= 280) {
			valorDoAumento = (salarioInicial * 0.20);
			salarioNovo = salarioInicial + valorDoAumento;
			valorPercentual = 20;
		}
		
		if (salarioInicial > 280 && salarioInicial <= 700) {
			valorDoAumento = (salarioInicial * 0.15);
			salarioNovo = salarioInicial + valorDoAumento;
			valorPercentual = 15;
		}
		
		if (salarioInicial > 700 && salarioInicial <= 1500) {
			valorDoAumento = (salarioInicial * 0.10);
			salarioNovo = salarioInicial + valorDoAumento;
			valorPercentual = 10;
		}
		
		if (salarioInicial > 1500) {
			valorDoAumento = (salarioInicial * 0.05);
			salarioNovo = salarioInicial + valorDoAumento;
			valorPercentual = 5;
		}
		
		System.out.println("Salario Antigo: " + salarioInicial + " R$");
		System.out.println("Percentual De Aumento: " + valorPercentual + " %");
		System.out.println("Valor Do Aumento: " + valorDoAumento + " R$");
		System.out.println("Salario Novo (Após Aumento): " + salarioNovo + " R$");
	}
}
