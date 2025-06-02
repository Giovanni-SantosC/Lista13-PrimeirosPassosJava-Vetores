package lista13;

import java.util.Arrays;

public class Ex10UniaoVetores {

	public static void main(String[]args) {
		
		int[] vetor1 = {2,5,9};
		int[] vetor2 = {3,6,7,8};
		
		System.out.println("União de Vetores: ");
		System.out.println("Vetor 1: " + Arrays.toString(vetor1));
		System.out.println("Vetor 2: " + Arrays.toString(vetor2));
		
		int tamanhoVetor1 = vetor1.length;
		int tamanhoVetor2 = vetor2.length;
		int tamanhoNovoVetor = tamanhoVetor1 + tamanhoVetor2;
		
		int[] vetorUniao = new int[tamanhoNovoVetor];
		
		int indiceAtualNoboVetor = 0;
		
		for(int i = 0; i < tamanhoVetor1; i++) {
			vetorUniao[indiceAtualNoboVetor] = vetor1[i];
			indiceAtualNoboVetor++;
		}
		
		for(int i = 0; i < tamanhoVetor2; i++) {
			vetorUniao[indiceAtualNoboVetor] = vetor2[i];
			indiceAtualNoboVetor++;
		}
		
		System.out.println("Vetor União: " + Arrays.toString(vetorUniao));
	}
	
}
