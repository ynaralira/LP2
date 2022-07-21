import java.util.Scanner;
	import java.util.Set;
	import java.util.HashSet;
	
	
	public class SubtracaoConjuntos {
	
	public static void main(String[] args) {
	Scanner entrada = new Scanner (System.in);
	
	Set<Integer> numerosA = new HashSet<Integer>();
	 
	int numero;
	do {  numero = entrada.nextInt();
	      numerosA.add(numero);
	   
	      } while (numero != 0);
	
	       
	Set<Integer> numerosB = new HashSet<Integer>();
	do {  numero = entrada.nextInt();
	      numerosB.add(numero);
	   
	      } while (numero != 0);
	
	Set<Integer> subtracao = new HashSet<Integer>(numerosA);
	subtracao.removeAll(numerosB);
	
	for (Integer elementos : subtracao)
	System.out.println(elementos);
	
	
	}
	
	}
