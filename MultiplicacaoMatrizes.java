import java.util.Scanner;

public class MultiplicacaoMatrizes {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in); 
		int NumLinhaA, NumColunaA, NumColunaB;
		
		 NumLinhaA = entrada.nextInt();
		 NumColunaA = entrada.nextInt();
		 NumColunaB = entrada.nextInt();
		
		int [][] valorA = new int[NumLinhaA][NumColunaA];
		int [][] valorb = new int[NumLinhaA][NumColunaB];
		//int [][] AxB = new int[valorA.length][valorb[0].length];
		
		for (int i = 0; i< NumLinhaA; i++ ){
			for (int j = 0; j< NumColunaA; j++ ){
				valorA [i][j] = entrada.nextInt();		
		}	
		}
		for (int i = 0; i< NumColunaA; i++ ){
			for (int j = 0; j< NumColunaB; j++ ){
				valorb [i][j] = entrada.nextInt();		
		  }	
		}
		int[][] matrizC = new int[valorA.length][valorb[0].length];
		for (int i = 0; i < valorA.length; i++) {
			for (int j = 0; j < valorb[0].length; j++) {
				for (int k = 0; k < valorb.length; k++) {
					matrizC[i][j] += valorA[i][k] * valorb[k][j];
				}
			}
		}

		for (int i = 0; i < matrizC.length; i++) {
			for (int j = 0; j < matrizC[0].length; j++) {
				System.out.println(matrizC[i][j]);
	}
}
}
}
