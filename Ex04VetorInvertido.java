package lista13;

import java.util.Arrays;

public class Ex04VetorInvertido {

	
	public static void main(String[]args) {
		
		
		int [] meuVetor = {10, 30, 40, 80};
		int [] meuVetorInverso = new int[meuVetor.length];
		
		System.out.println("Inversão de Valores: ");
		System.out.println("Vetor Original: " + Arrays.toString(meuVetor));
		
		for(int i = 0; i < meuVetor.length; i++) {
			int j = (meuVetor.length - 1) - i;
			
			
			meuVetorInverso[j] = meuVetor[i];
		}
		
		System.out.println("Vetor Inverso: " + Arrays.toString(meuVetorInverso));
	}
	
}
