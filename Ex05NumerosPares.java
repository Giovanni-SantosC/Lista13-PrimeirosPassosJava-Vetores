package lista13;

import java.util.Arrays;

public class Ex05NumerosPares {

	public static void main(String[]args) {
		
		int [] meuVetor = {10,11,12,13,24,25,36,47,50};
		int contagemValorPares = 0;
		
		System.out.println("Numeros Pares de um Vetor: ");
	    System.out.println(" ");
	    System.out.println("Nosso Vetor " + Arrays.toString(meuVetor));
		
		for(int i = 0; i < meuVetor.length; i++) {
			
			if(meuVetor[i] % 2 == 0) {
				
				System.out.println("Numero Par = " + meuVetor[i]);
				contagemValorPares++;
				
			}
		}
		System.out.println(" ");
		System.out.println(" Quantidade de Numeros Pares no Vetor: " + contagemValorPares);
	}
	
}
