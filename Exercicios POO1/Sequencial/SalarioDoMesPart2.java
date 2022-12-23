import java.util.Scanner;

public class SalarioDoMesPart2 {

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
		
		impostoDeRenda = salarioBruto * 0.11;
		
		double valorINSS;
		
		valorINSS = salarioBruto * 0.08;
		
		double valorSindicato;
		
		valorSindicato = salarioBruto * 0.05;
		
		double salarioLiquido;
		
		salarioLiquido = (salarioBruto - impostoDeRenda - valorINSS - valorSindicato);
		
		System.out.println("O Salário Bruto A Ser Recebido É: " + salarioBruto + " R$");
		System.out.println("O Valor Pago Ao Imposto De Renda: " + impostoDeRenda + " R$");
		System.out.println("O Valor Pago Ao INSS: " + valorINSS + " R$");
		System.out.println("O Valor Pago Ao Sindicato: " + valorSindicato + " R$");
		System.out.println("O Salário Liquido A Ser Recebido É: " + salarioLiquido + " R$");
	}

}
