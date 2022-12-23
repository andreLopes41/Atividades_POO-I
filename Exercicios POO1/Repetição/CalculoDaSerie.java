
public class CalculoDaSerie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double i = 37;
		double j = 38;
		double k = 1;
		double serie = 0;
		double soma = 0;
		
		for (double x = 1; x <= 37; x++) {
			serie = (i * j) / k;
			
			soma = serie + soma;

			System.out.println(i + " x " + j + " / " + k + " = " + soma);
			
			i = i -1;
			j = j -1;
			k = k + 1;
		}
	}

}
