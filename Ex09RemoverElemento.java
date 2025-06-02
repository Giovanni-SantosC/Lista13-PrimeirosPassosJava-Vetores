package lista13;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex09RemoverElemento {

	public static void main(String[]args) {
		
		int[] meuVetor = {5,10,15,20,25,30,35,40,45,50};
		
		int elementoParaRemover = 0;
		Scanner sc = new Scanner(System.in);
		boolean entradaValida = false;
		
		System.out.println("Remoção de Elementos: ");
		System.out.println("Vetor Original: " + Arrays.toString(meuVetor));
		
		
		while(!entradaValida) {
			try {
				System.out.println("Digite o Elemento Para Remover: ");
				elementoParaRemover = sc.nextInt();
				entradaValida = true;
			}
			catch(InputMismatchException e) {
				System.out.println("Entrada Invalida!");
				sc.next();
			}
			
		}
		
		System.out.println(" ");
		
		int novoTamanho = 0;
		for(int elemento : meuVetor) {
			if(elemento != elementoParaRemover) {
				novoTamanho++;
			}
		}
		
		int []novoVetor = new int[novoTamanho];
		
		int indiceNovoVetor = 0;
		for(int elemento : meuVetor) {
			if(elemento != elementoParaRemover) {
				novoVetor[indiceNovoVetor] = elemento;
				indiceNovoVetor++;
			}
		}
		
		System.out.println("Elemento para Remover: " + elementoParaRemover);
		System.out.println("Novo Vetor com Elemento Removido: " + Arrays.toString(novoVetor
				));
		sc.close();
	}
	
}
