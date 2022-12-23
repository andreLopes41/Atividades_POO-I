import java.util.Scanner;

public class AcertosDaProva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Alternativas Das Questôes: [a] [b] [c] [d] [e]");
		System.out.print("Questão[1]: ");
		String resposta1 = entrada.nextLine();
		
		System.out.print("Questão[2]: ");
		String resposta2 = entrada.nextLine();
		
		System.out.print("Questão[3]: ");
		String resposta3 = entrada.nextLine();
		
		System.out.print("Questão[4]: ");
		String resposta4 = entrada.nextLine();
		
		System.out.print("Questão[5]: ");
		String resposta5 = entrada.nextLine();
		
		System.out.print("Questão[6]: ");
		String resposta6 = entrada.nextLine();
		
		System.out.print("Questão[7]: ");
		String resposta7 = entrada.nextLine();
		
		System.out.print("Questão[8]: ");
		String resposta8 = entrada.nextLine();
		
		System.out.print("Questão[9]: ");
		String resposta9 = entrada.nextLine();
		
		System.out.print("Questão[10]: ");
		String resposta10 = entrada.nextLine();
		
		entrada.close();
		
		int pontos;
		
		pontos = 0;
		
		if (resposta1.equals("a")) {
			System.out.println("GABARITO:");
			System.out.println("[Q1]: " + resposta1 + " ==> CORRETO!");
			pontos = pontos + 1;
		}
		else {
			System.out.println("[Q1]: " + resposta1 + " ==> ERRADO! Resposta Correta: a");
		}
		
		if (resposta2.equals("a")) {
			System.out.println("[Q2]: " + resposta2 + " ==> CORRETO!");
			pontos = pontos + 1;
		}
		else {
			System.out.println("[Q2]: " + resposta2 + " ==> ERRADO! Resposta Correta: a");
		}
		
		if (resposta3.equals("b")) {
			System.out.println("[Q3]: " + resposta3 + " ==> CORRETO!");
			pontos = pontos + 1;
		}
		else {
			System.out.println("[Q3]: " + resposta3 + " ==> ERRADO! Resposta Correta: b");
		}
		
		if (resposta4.equals("b")) {
			System.out.println("[Q4]: " + resposta4 + " ==> CORRETO!");
			pontos = pontos + 1;
		}
		else {
			System.out.println("[Q4]: " + resposta4 + " ==> ERRADO! Resposta Correta: b");
		}
		
		if (resposta5.equals("c")) {
			System.out.println("[Q5]: " + resposta5 + " ==> CORRETO!");
			pontos = pontos + 1;
		}
		else {
			System.out.println("[Q5]: " + resposta5 + " ==> ERRADO! Resposta Correta: c");
		}
		
		if (resposta6.equals("c")) {
			System.out.println("[Q6]: " + resposta6 + " ==> CORRETO!");
			pontos = pontos + 1;
		}
		else {
			System.out.println("[Q6]: " + resposta6 + " ==> ERRADO! Resposta Correta: c");
		}
		
		if (resposta7.equals("d")) {
			System.out.println("[Q7]: " + resposta7 + " ==> CORRETO!");
			pontos = pontos + 1;
		}
		else {
			System.out.println("[Q7]: " + resposta7 + " ==> ERRADO! Resposta Correta: d");
		}
		
		if (resposta8.equals("d")) {
			System.out.println("[Q8]: " + resposta8 + " ==> CORRETO!");
			pontos = pontos + 1;
		}
		else {
			System.out.println("[Q8]: " + resposta8 + " ==> ERRADO! Resposta Correta: d");
		}
		
		if (resposta9.equals("e")) {
			System.out.println("[Q9]: " + resposta9 + " ==> CORRETO!");
			pontos = pontos + 1;
		}
		else {
			System.out.println("[Q9]: " + resposta9 + " ==> ERRADO! Resposta Correta: e");
		}
		
		if (resposta10.equals("e")) {
			System.out.println("[Q10]: " + resposta10 + " ==> CORRETO!");
			pontos = pontos + 1;
		}
		else {
			System.out.println("[Q10]: " + resposta10 + " ==> ERRADO! Resposta Correta: e");
		}
		System.out.println("Pontuação Final: " + pontos + " Acertos!");
	}
}
