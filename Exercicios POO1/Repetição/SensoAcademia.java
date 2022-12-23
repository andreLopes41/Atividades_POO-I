import java.util.Scanner;

public class SensoAcademia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		boolean flag1 = true;
		boolean flag2 = true;
		int codigo = 0;
		int contador = 0;
		float altura = 0;
		float peso = 0;
		float mediaAltura = 0;
		float mediaPeso = 0;
		float maisGordo = 0;
		float maisMagro = 0;
		float maisAlto = 0;
		float maisBaixo = 0;
		int codigoGordo = 0;
		int codigoMagro = 0;
		int codigoAlto = 0;
		int codigoBaixo = 0;
		
		
		while (flag1) {
			System.out.print("Código DO Cliente: ");
			codigo = entrada.nextInt();
			
			if (codigo == 0 && contador > 0) {
				flag1 = false;
				System.out.println("Registro Finalizado");
			}
			if (codigo == 0 && contador == 0) {
				flag1 = false;
				contador = 1;
				System.out.println("Registro Finalizado");
			}
			if (codigo != 0) {
				System.out.print("Altura(m): ");
				altura = entrada.nextFloat();
				
				System.out.print("Peso(kg): ");
				peso = entrada.nextFloat();
			}
			mediaAltura = mediaAltura + altura;
			mediaPeso = mediaPeso + peso;
			contador = contador + 1;
			
			if (peso > maisGordo) {
				maisGordo = peso;
				codigoGordo = codigo;
			}
			if (peso < maisMagro) {
				maisMagro = peso;
				codigoMagro = codigo;
			}
			if (altura > maisAlto) {
				maisAlto = altura;
				codigoAlto = codigo;
			}
			if (altura < maisBaixo) {
				maisBaixo = altura;
				codigoBaixo = codigo;
			}
			
			if (flag2) {
				flag2 = false;
				maisGordo = peso;
				codigoGordo = codigo;
				maisMagro = peso;
				codigoMagro = codigo;
				maisAlto = altura;
				codigoAlto = codigo;
				maisBaixo = altura;
				codigoBaixo = codigo;
			}
		}
		mediaAltura = mediaAltura / contador;
		mediaPeso = mediaPeso / contador;
		
		entrada.close();
		
		if (codigo == 0 && contador > 0) {
			System.out.println("Código Mais Magro: " + codigoMagro);
			System.out.println("Peso Do Magro: " + maisMagro + " Kg's");
			System.out.println("Código Mais Gordo: " + codigoGordo);
			System.out.println("Peso Do Gordo: " + maisGordo + " Kg's");
			System.out.println("Código Mais Alto: " + codigoAlto);
			System.out.println("Altura Do Alto: " + maisAlto + " m");
			System.out.println("Código Mais Baixo: " + codigoBaixo);
			System.out.println("Altura Do Baixo: " + maisBaixo + " m");
			System.out.println("Média De Altura: " + mediaAltura + " m");
			System.out.println("Média De Peso: " + mediaPeso + " Kg's");
		}
	}
}
