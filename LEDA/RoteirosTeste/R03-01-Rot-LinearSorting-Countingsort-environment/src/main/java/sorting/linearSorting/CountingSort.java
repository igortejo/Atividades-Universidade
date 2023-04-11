package sorting.linearSorting;

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
		
		Integer maiorNumero = procuraMaior(array, leftIndex, rightIndex);
		
		Integer[] arrayContador = new Integer[maiorNumero+1];   // sem o +1
		Integer[] arrayAux = new Integer[array.length];
		
		// frequencia
		
		for (int i = 0; i < array.length; i++) {
			arrayContador[array[i]] += 1;  //-1
		}
		
		// cumulativa
		
		for (int i = 1; i <= maiorNumero; i++) { //**
			arrayContador[i] += arrayContador[i-1];
		}
		
		// colocando em arrayContador
		
		for (int i = array.length - 1; i >= 0; i--) {
			
			arrayAux[arrayContador[array[i]]-1] = array[i];  // sem o -1
			arrayContador[array[i]] -= 1;  // sem o -1			
		}		
		
		// copiando de arrayContador para array
		
		for (int i = 0; i < array.length; i++) {
			array[i] = arrayAux[i];
		}
		
	}
	
	
	public Integer procuraMaior(Integer[] array, int leftIndex, int rightIndex) {
		
		Integer maiorNumero = array[leftIndex];
		
		for(int i = 1; i < array.length; i++) {
			if(array[i] > maiorNumero) {
				maiorNumero = array[i];
			}
		}
		return maiorNumero;
		
		
	}

}
