import java.util.Scanner;

	public class LDP7142 {
		public static void main (String[] args) {
			Scanner entrada = new Scanner(System.in);
			int codigo = entrada.nextInt();
			int horasTrabalhadas = entrada.nextInt();
			entrada.close();
			int salario = 0;
		
			if (horasTrabalhadas <= 50) {
				salario = horasTrabalhadas*10;
				System.out.println("codigo = " + codigo);
				System.out.println("salarioExcedente = 0");
				System.out.println("salarioTotal = " + salario);
				
			} else {
				int salarioExcedente = (horasTrabalhadas - 50)*20;
				salario = 500+salarioExcedente;
				System.out.println("codigo = " + codigo);
				System.out.println("salarioExcedente = " + salarioExcedente);
				System.out.println("salarioTotal = " +  salario);
				
			}
		}
	}
