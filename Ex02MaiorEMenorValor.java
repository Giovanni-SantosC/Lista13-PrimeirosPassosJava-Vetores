package lista13;


public class Ex02MaiorEMenorValor {

	public static void main(String[]args) {
		
		int [] meuVetor = {50,40,60,70};
		
		Integer numeroMenor = null;
		Integer numeroMaior = null;
		
		System.out.println("Encontre Menor e Maior Valor: ");
		
		
		for(int i = 0; i < meuVetor.length; i++) {
			System.out.print(meuVetor[i]);
			if(i < meuVetor.length - 1) {
				System.out.print(", ");
			}
		}
		
		System.out.println(" ");
		
		for(int elemento : meuVetor) {
			
			if(numeroMaior == null || numeroMenor == null) {
				
				numeroMaior = elemento;
				numeroMenor = elemento;
				
			}else {
				if(elemento > numeroMaior){
					numeroMaior = elemento;
					
				}
				
				if(elemento < numeroMaior){
					numeroMenor = elemento;
					
				}
				
			}
			
		}
		
		if(numeroMaior != null && numeroMenor != null) {
			System.out.println("Numero Maior é " + numeroMaior);
			System.out.println("Numero Menor é " + numeroMenor);
		}
		else {
			System.out.println("Numero Invalido.");
		}
		
	}
	
}
