package sorting.linearSorting;

import java.util.Arrays;

import sorting.AbstractSorting;

/**
 * Classe que implementa a estratégia de Counting Sort vista em sala.
 *
 * Procure evitar desperdício de memória: AO INVÉS de alocar o array de
 * contadores com um tamanho arbitrariamente grande (por exemplo, com o maior
 * valor de entrada possível), aloque este array com o tamanho sendo o máximo
 * inteiro presente no array a ser ordenado.
 *
 * Seu algoritmo deve assumir que o array de entrada nao possui numeros
 * negativos, ou seja, possui apenas numeros inteiros positivos e o zero.
 *
 */
public class CountingSort extends AbstractSorting<Integer> {

	@Override
	public void sort(Integer[] array, int leftIndex, int rightIndex) {

		if (validando(array, leftIndex, rightIndex)) {
			
			Integer maiorNumero = procuraMaior(array, leftIndex, rightIndex);

			Integer[] arrayContador = new Integer[maiorNumero + 1]; // sem o +1
			Integer[] arrayAux = new Integer[array.length];

			Arrays.fill(arrayContador, 0);

			// frequencia

			for (int i = leftIndex; i <= rightIndex; i++) {
				arrayContador[array[i]] += 1;
			}

			// cumulativa

			for (int i = leftIndex + 1; i <= maiorNumero; i++) {
				arrayContador[i] += arrayContador[i - 1];
			}

			// colocando em arrayAux

			for (int i = rightIndex; i >= leftIndex; i--) {

				arrayAux[arrayContador[array[i]] - 1] = array[i];
				arrayContador[array[i]] -= 1;
			}

			// copiando de arrayAux para o array original

			for (int i = leftIndex; i <= rightIndex; i++) {
				array[i] = arrayAux[i];
			}

		}

	}
	
	public Integer procuraMaior(Integer[] array, int leftIndex, int rightIndex) {

		Integer maiorNumero = array[leftIndex];

		for (int i = leftIndex + 1; i < array.length; i++) {
			if (array[i] > maiorNumero) {
				maiorNumero = array[i];
			}
		}
		return maiorNumero;

	}
	
	public boolean validando (Integer[] array, int leftIndex, int rightIndex) {
		boolean valido = true;
		if (array == null || array.length <= 0) valido = false;
		else if (leftIndex >= rightIndex || leftIndex < 0 || rightIndex < 0) valido = false;
		return valido;
		
	}

	

}
