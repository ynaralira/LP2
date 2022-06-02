import java.util.Scanner;

public class ImparOuPar {
	private static double primeiro, segundo;

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;
		boolean parar = false;
		char letra;

		do{
			System.out.print("Digite um número inteiro: ");
			numero = entrada.nextInt();


			if(numero%2==0){
				System.out.print("O número é par.\n");
			}else{
				System.out.print("O número não é par\n");
			}
			if(numero<0){
				System.out.print("O número é negativo\n");
			}else{
				System.out.print("O número é positivo\n");
			}

			System.out.println("Deseja sair? (s/N)? ");
			letra = entrada.next().charAt(0);
			if(letra == 's' || letra == 'S'){
				parar = true;
			}

		}while(parar==false);

	}
}
