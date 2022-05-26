import java.util.Scanner;

public class LDP7251 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in); 
		int n, maior;
		n = entrada.nextInt();
		maior = n;

		while(n != 0) {
			n = entrada.nextInt();

			if(n > maior && n != 0) { 
				maior = n;
			}
		}	
		entrada.close();
		System.out.println("maior = "+maior);
		
		
	}
	}
