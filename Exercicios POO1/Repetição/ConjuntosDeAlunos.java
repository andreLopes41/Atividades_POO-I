import java.util.Scanner;

public class ConjuntosDeAlunos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		int alunos = 0;
		float alturas = 0;
		boolean flag = true;
		int numeroAlto = 0;
		int numeroBaixo = 0;
		float alturaAlto = 0;
		float alturaBaixo = 0;
		
		for (int i = 1; i <= 10; i++) {
			for (int j = 0; j < 1; j++) {
				System.out.print("Número Do " + i + "° Aluno: ");
				alunos = entrada.nextInt();
				
				System.out.print("Altura Do " + i + "° Aluno: ");
				alturas = entrada.nextFloat();
				
				if (alturas >= alturaAlto) {
					alturaAlto = alturas;
					numeroAlto = alunos;
				}
				if (alturas <= alturaBaixo) {
					alturaBaixo = alturas;
					numeroBaixo = alunos;
				}
				
				if (flag) {
					flag = false;
					numeroAlto = alunos;
					alturaAlto = alturas;
					numeroBaixo = alunos;
					alturaBaixo = alturas;
				}
			}
		}
		entrada.close();
		
		System.out.println("Número Do Aluno Mais Alto: " + numeroAlto);
		System.out.println("Altura Do Aluno Alto: " + alturaAlto + " m");
		System.out.println("Número Do Aluno Mais Baixo: " + numeroBaixo);
		System.out.println("Altura Do Aluno Baixo: " + alturaBaixo + " m");
	}
}
