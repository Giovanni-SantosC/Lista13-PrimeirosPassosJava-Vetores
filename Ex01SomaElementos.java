package lista13;

public class Ex01SomaElementos {

	public static void main(String[]args) {
		
		int []meuVetor = {10, 20 , 30 , 40};
		
		int soma = 0;
		
		
		System.out.println("Soma de Um Vetor de Inteiros: ");
		
		for(int i = 0; i < meuVetor.length; i++) {
			System.out.print(meuVetor[i]);
			if(i < meuVetor.length - 1) {
				System.out.print(", ");
				
			}
		}
		
		System.out.println(" ");
		
		for(int elemento : meuVetor) {
			soma = soma + elemento;
		}
		
		System.out.println("A Soma De Todos os Elementos do Vetor é: " + soma);
	}
	
}
