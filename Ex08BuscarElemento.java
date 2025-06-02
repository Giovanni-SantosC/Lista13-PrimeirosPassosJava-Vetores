package lista13;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex08BuscarElemento {

	public static void main(String[]args) {
		
		int [] meuVetor = {10,20,30,40,50,60,70,80,90,100};
		
		int elementoBuscado = 0;
		boolean entradaValida = false;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Busca de um Elemento: ");
		System.out.println("Vetor Original " + Arrays.toString(meuVetor));
		
		
		while(!entradaValida) {
			
			try {
				System.out.println("Digite o Elemento que você quer Buscar no Vetor: ");
				elementoBuscado = sc.nextInt();
				entradaValida = true;
			}
			catch(InputMismatchException e) {
				System.out.println("Entrada Invalida!");
				sc.next();
			}
		}
		
		boolean encontrado = false;
		int posicaoEncontrada = -1;
		
		for(int i = 0; i < meuVetor.length; i++) {
			
			if(meuVetor[i] == elementoBuscado) {
				
				encontrado = true;
				posicaoEncontrada = i;
				break;
			}
		}
		
		if(encontrado) {
			System.out.println("O Elemento Encontrado com Sucesso: " + elementoBuscado + " na Posição " + posicaoEncontrada);
		}
		
		else {
			System.out.println("o Elemento " + elementoBuscado + " Não Foi Encontrado.");
		}
		
		sc.close();
	}
	
}
