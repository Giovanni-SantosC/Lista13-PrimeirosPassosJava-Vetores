package lista13;

import java.util.Arrays;

public class Ex07OrdemCrescente {

	public static void main(String[]args) {
		
		int[] meuVetor = {10,50,60,40,302,5,24,54,5,6,12,34,0};
		
		int n = meuVetor.length;
		
		System.out.println("Ordenação em Ordem Crescente de Um Vetor:");
		System.out.println("Vetor Original: " + Arrays.toString(meuVetor));
		System.out.println("  ");
		
		for(int i = 0; i < n - 1; i++) {
			
			for(int j = 0; j < n - 1; j++) {
				
				if(meuVetor[j] > meuVetor[j + 1] ) {
					
					int temp = meuVetor[j];
					meuVetor[j] = meuVetor[j + 1];
					meuVetor[j + 1] = temp;
				}
			}
		}
		
		System.out.println(" ");
		System.out.println("Vetor Ordenado: " + Arrays.toString(meuVetor));
	}
	
}
