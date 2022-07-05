import java.math.BigInteger;

public class LDP7252 {


	public static void main(String[] args) {

		BigInteger graosCasa=BigInteger.ONE ;
		BigInteger graos=BigInteger.ONE ;		
		double casasTabuleiro=64;

		for(int x=2;x<=casasTabuleiro;x++){
			graosCasa = graosCasa.multiply(BigInteger.valueOf(2));
			graos = graosCasa.add(graos);
		}

		System.out.println("totalGraos = "+graos);

	}
}
