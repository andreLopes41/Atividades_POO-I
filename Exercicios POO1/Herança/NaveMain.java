
public class NaveMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NaveEspacial naveE = new NaveEspacial (477.99);
		System.out.println(naveE);
		
		NaveApollo11 naveA = new NaveApollo11(584.98);
		naveA.setTipoCombustivel("hidrogênio líquido ");
		System.out.println(naveA);
		
		NaveMileniumFalcom naveM = new NaveMileniumFalcom (678.78);
		naveM.setTipoCombustivel("metal líquido");
		naveM.setHiperPropulsor(999);
		System.out.println(naveM);

	}

}
