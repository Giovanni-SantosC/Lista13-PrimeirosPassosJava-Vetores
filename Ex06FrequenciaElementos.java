package lista13;

import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class Ex06FrequenciaElementos {

	public static void main(String[]args) {
		
		int [] meuVetor = {1,1,2,3,4,3,2,1,4,5};
		
		Map<Integer, Integer> frequenciaElementos = new HashMap<>();
		
		
		System.out.println("Frequencai de um Valor em um Vetor: ");
		System.out.println("Nosso Vetor " + Arrays.toString(meuVetor));
		
		for(int elemento : meuVetor) {
			
			frequenciaElementos.put(elemento, frequenciaElementos.getOrDefault(elemento, 0) + 1);
		}
		
		System.out.println("Frequencia de Cada Elemento: ");
		
		for (Map.Entry<Integer, Integer> entrada : frequenciaElementos.entrySet()) {
            System.out.println("Elemento: " + entrada.getKey() + ", Frequência: " + entrada.getValue());
        }
	}
	
}
