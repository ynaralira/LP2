import java.util.Scanner;

public class LDP7141 {
	public static void main(String[] args) {
		int excesso, multa, peso, pesoLimite;
		Scanner entrada = new Scanner(System.in);
		peso = entrada.nextInt();
		pesoLimite = 50;

		entrada.close();

		if (peso > pesoLimite) {
			multa = (peso - pesoLimite) * 4;
			excesso = peso - pesoLimite;
			System.out.println("excedente = " + excesso);
			System.out.println("multa = " + multa);
		} else {
			System.out.println("excedente = 0");
			System.out.println("multa = 0");

		}
	}
}
