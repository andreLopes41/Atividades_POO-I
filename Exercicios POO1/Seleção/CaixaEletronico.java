import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Valor Do Saque [Min: 10R$] E [Máx: 600R$]: ");
		float valorSaque = entrada.nextFloat();
		
		entrada.close();
		
		float nota1;
		float nota5;
		float nota10;
		float nota50;
		float nota100;
		
		nota100 = 0;
		
		
		if (valorSaque < 10 || valorSaque > 600) {
			System.out.println("Valor Inválido");
		}
		else {
			nota100 = valorSaque / 100;
			nota50 = (valorSaque % 100) / 50;
			nota10 = (valorSaque % 100) / 10;
			 if (((valorSaque % 100) / 10) < (valorSaque % 100) % 10) {
				nota10 = ((valorSaque % 100) / 10) - ((valorSaque % 100) % 10) *-1;
			}
			 nota5 = (valorSaque % 100) / 5;
			 nota1 = (valorSaque % 100) % 10;
			 
			 System.out.println("Valor Do Saque Feito: " + valorSaque);
			 System.out.println("Quantidades De Notas De [100]: " + nota100);
			 System.out.println("Quantidades De Notas De [50]: " + nota50);
			 System.out.println("Quantidades De Notas De [10]: " + nota10);
			 System.out.println("Quantidades De Notas De [5]: " + nota5);
			 System.out.println("Quantidades De Notas De [1]: " + nota1);
		}
	}

}
