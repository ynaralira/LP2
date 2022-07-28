import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		List<Integer> notas1 = new ArrayList<Integer>();

		int quantidadedeNotas, notas, i, j = 1;
		quantidadedeNotas = entrada.nextInt();

		for (i = 0; i < quantidadedeNotas; i++) {
			notas = entrada.nextInt();
			notas1.add(notas);
		}

		double soma = 0;
		for (Integer elementos : notas1)
			soma += elementos;

		double media = soma / quantidadedeNotas;
		NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
		formatador.setMinimumFractionDigits(1);
		formatador.setMaximumFractionDigits(1);

		System.out.println("media = " + formatador.format(media));

		for (Integer elementos : notas1)
			System.out.println("nota " + (j++) + " = " + formatador.format(elementos));
	}
}
