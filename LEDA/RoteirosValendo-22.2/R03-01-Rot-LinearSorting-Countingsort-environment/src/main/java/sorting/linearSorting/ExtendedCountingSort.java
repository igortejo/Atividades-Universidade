package sorting.linearSorting;

import java.util.Arrays;

import sorting.AbstractSorting;

/**
 * Classe que implementa do Counting Sort vista em sala. Desta vez este
 * algoritmo deve satisfazer os seguitnes requisitos:
 * - Alocar o tamanho minimo possivel para o array de contadores (C)
 * - Ser capaz de ordenar arrays contendo numeros negativos
 */
public class ExtendedCountingSort extends AbstractSorting<Integer> {

	@Override
	public void sort(Integer[] array, int leftIndex, int rightIndex) {

		if (validando(array, leftIndex, rightIndex)) {
			
			Integer maiorNumero = procuraMaior(array, leftIndex, rightIndex);
			Integer menorNumero = procuraMenor(array, leftIndex, rightIndex);


			Integer[] arrayContador = new Integer[maiorNumero - menorNumero + 1]; 
			Integer[] arrayAux = new Integer[array.length];

			Arrays.fill(arrayContador, 0);
			

			// frequencia

			for (int i = leftIndex; i <= rightIndex; i++) {
				arrayContador[array[i] - menorNumero] += 1;
			}

			// cumulativa

			for (int i = 1; i < arrayContador.length; i++) {
				arrayContador[i] += arrayContador[i - 1];
			}

			// colocando em arrayAux

			for (int i = rightIndex; i >= leftIndex; i--) {
				
				arrayContador[array[i]- menorNumero] -= 1;
				arrayAux[arrayContador[array[i] - menorNumero]] = array[i]; // ?????
			}

			// copiando de arrayContador para o array original

			for (int i = leftIndex; i <= rightIndex; i++) {
				array[i] = arrayAux[i];
			}

		}

	}
	
	public Integer procuraMaior(Integer[] array, int leftIndex, int rightIndex) {

		Integer maiorNumero = array[leftIndex];

		for (int i = leftIndex + 1; i <= rightIndex; i++) {
			if (array[i] > maiorNumero) {
				maiorNumero = array[i];
			}
		}
		return maiorNumero;

	}
	
	public Integer procuraMenor(Integer[] array, int leftIndex, int rightIndex) {

		Integer menorNumero = array[leftIndex];

		for (int i = leftIndex + 1; i <= rightIndex; i++) {
			if (array[i] < menorNumero) {
				menorNumero = array[i];
			}
		}
		return menorNumero;


	}
	
	public boolean validando (Integer[] array, int leftIndex, int rightIndex) {
		boolean valido = true;
		if (array == null || array.length <= 0) valido = false;
		else if (leftIndex >= rightIndex || leftIndex < 0 || rightIndex < 0) valido = false;
		return valido;
		
	}

}
