package sorting.linearSorting;

import java.util.Arrays;

import sorting.AbstractSorting;

/**
 * Classe que implementa a estratégia de Counting Sort vista em sala.
 *
 * Procure evitar desperdício de memória: AO INVÉS de alocar o array de contadores
 * com um tamanho arbitrariamente grande (por exemplo, com o maior valor de entrada possível),
 * aloque este array com o tamanho sendo o máximo inteiro presente no array a ser ordenado.
 *
 * Seu algoritmo deve assumir que o array de entrada nao possui numeros negativos,
 * ou seja, possui apenas numeros inteiros positivos e o zero.
 *
 */
public class CountingSort extends AbstractSorting<Integer> {

	@Override
	public void sort(Integer[] array, int leftIndex, int rightIndex) {
		if(validacao(array, leftIndex, rightIndex)) {
			Integer maior = procuraMaior(array, leftIndex, rightIndex);
			Integer[] vetorAux = new Integer[rightIndex - leftIndex + 1];
			Integer[] contador = new Integer[maior + 1];
			
			Arrays.fill(contador, 0);
			
			for(int i = leftIndex; i <= rightIndex; i++) contador[array[i]]++;
			
			for(int i = 0; i < contador.length - 1; i++) 
				contador[i + 1] += contador[i];
			
			for(int i = rightIndex; i >= leftIndex; i--) {
				vetorAux[--contador[array[i]]] = array[i];
			}
			
			for(int i = leftIndex; i <= rightIndex; i++) 
				array[i] = vetorAux[i - leftIndex];
		}
		
	}

	private int procuraMaior(Integer[] array, int leftIndex, int rightIndex) {
		Integer maior = array[leftIndex];
		for(int i = leftIndex; i <= rightIndex; i++) {
			if(array[i].compareTo(maior) > 0)
				maior = array[i];
		}return maior;
	}
	
	private boolean validacao(Integer[] array, int leftIndex, int rightIndex) {
		boolean valido = true;
		if (array == null || array.length == 0) valido = false;
		else if((leftIndex >= rightIndex) || (leftIndex < 0) || (rightIndex <= 0)) valido = false;
		else if((rightIndex > array.length - 1) || (leftIndex > array.length)) valido = false;
		return valido;
	}

}
