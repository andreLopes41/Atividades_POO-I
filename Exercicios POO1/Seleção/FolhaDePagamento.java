import java.util.Scanner;

public class FolhaDePagamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Horas Trabalhadas No Mês: ");
		float horasTrabalhadas = entrada.nextFloat();
		
		System.out.print("Valor Da Hora [R$]: ");
		float valordahora = entrada.nextFloat();
		
		entrada.close();
		
		float salarioBruto;
		
		salarioBruto = horasTrabalhadas * valordahora;
		
		double impostoDeRenda;
		
		impostoDeRenda = 0;
		
		if (salarioBruto <= 900) {
			impostoDeRenda = 0;
		}
		
		if (salarioBruto > 900 && salarioBruto <= 1500) {
			impostoDeRenda = 0.05;
		}
		if (salarioBruto > 1500 && salarioBruto <= 2500) {
			impostoDeRenda = 0.10;
		}
		
		if (salarioBruto > 2500) {
			impostoDeRenda = 0.20;
		}
		
		double valorImposto;
		
		valorImposto = salarioBruto * impostoDeRenda;
		
		double valorINSS;
		
		valorINSS = salarioBruto * 0.10;
		
		double valorFGTS;
		
		valorFGTS = salarioBruto * 0.11;
		
		double salarioLiquido;
		
		double totalDescontos;
		
		totalDescontos = (valorImposto + valorINSS + valorFGTS);
		
		salarioLiquido = (salarioBruto - valorImposto - valorINSS - valorFGTS);
		
		System.out.println("O Salário Bruto A Ser Recebido É: " + salarioBruto + " R$");
		System.out.println("O Valor Pago Ao Imposto De Renda: " + valorImposto + " R$");
		System.out.println("O Valor Pago Ao INSS: " + valorINSS + " R$");
		System.out.println("O Valor Pago Ao FGTS: " + valorFGTS + " R$");
		System.out.println("Total De Descontos " + totalDescontos + " R$");
		System.out.println("O Salário Liquido A Ser Recebido É: " + salarioLiquido + " R$");
	}
}
