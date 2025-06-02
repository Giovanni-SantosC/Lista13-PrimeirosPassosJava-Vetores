package lista13;

public class Ex03MediaDeReais {

     public static void main(String[]args) {
    	 
    	 double []meuVetor = {9.5 , 8.7 , 7.6 , 1.3};
    	 
    	 double soma = 0.0;		 
    	 		 
    	 System.out.println("Media de Valores de um Vetor: ");
    	 
    	 for(int i = 0; i < meuVetor.length; i++) {
    		 
    		 soma += meuVetor[i];
    		 
    		 System.out.println("Numero: " + meuVetor[i]);
    	 }
    	 
    	 
    	 double media = soma / (meuVetor.length);
    	 
    	 System.out.println("A Media dos Numeros é " + media);
     }
			
}
