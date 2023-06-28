package orderStatistic;

import util.Util;

/**
 * Uma implementacao da interface KLargest que usa estatisticas de ordem para 
 * retornar um array com os k maiores elementos de um conjunto de dados/array.
 * 
 * A k-esima estatistica de ordem de um conjunto de dados eh o k-esimo menor
 * elemento desse conjunto. Por exemplo, considere o array [4,8,6,9,12,1]. 
 * A 3a estatistica de ordem eh 6, a 6a estatistica de ordem eh 12.
 * 
 * Note que, para selecionar os k maiores elementos, pode-se pegar todas as 
 * estatisticas de ordem maiores que k. 
 * 
 * Requisitos do algoritmo:
 * - DEVE ser in-place. Porem, voce pode modificar o array original.
 *   Voce pode criar ainda um array de tamanho k que vai armazenar apenas
 *   os elementos a serem retornados.
 * - Voce DEVE usar alguma ideia de algoritmo de ordenacao visto em sala 
 *   para calcular estatisticas de ordem.
 * - Se a entrada for invalida, deve-se retornar um array vazio (por exemplo,
 *   ao solicitar os 5 maiores elementos em um array que soh contem 3 elementos).
 *   Este metodo NUNCA deve retornar null.
 * 
 * @author campelo and adalberto
 *
 * @param <T>
 */
public class KLargestOrderStatisticsImpl<T extends Comparable<T>> implements KLargest<T> {

	@SuppressWarnings("unchecked")
	@Override
	public T[] getKLargest(T[] array, int k) {

		if (validation(array, k)) {
			
			T[] maiores_elementos = (T[]) new Comparable[k];
			T estatistica_ordem = orderStatistics(array, array.length - k);


			int contador = 0;
			for (int i = 0; i < array.length; i++) {
				if (array[i].compareTo(estatistica_ordem) > 0) {
					maiores_elementos[contador] = array[i];
					contador ++;
				}
			}

			//return selectionSort(maiores_elementos);
			return maiores_elementos;

		}

		return (T[]) new Comparable[0];
	}

	/**
	 * Metodo que retorna a k-esima estatistica de ordem de um array, usando a ideia
	 * de algum algoritmo de ordenacao visto em sala. Caso nao exista a k-esima
	 * estatistica de ordem, entao retorna null.
	 * 
	 * Obs: o valor de k deve ser entre 1 e N.
	 * 
	 * @param array
	 * @param k
	 * @return
	 */
	public T orderStatistics(T[] array, int k) {
		if (validation(array, k)) {
			selectionSort(array);
			return array[k - 1];
		} else {
			return null;
		}
	}
	
	private T[] selectionSort(T[] array) {

		for (int i = 0; i < array.length; i++) {
			int menor_index = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j].compareTo(array[menor_index]) < 0) {
					menor_index = j;
				}
			}
			Util.swap(array, menor_index, i);

		}
		return array;

	}

	public boolean validation(T[] array, int k) {

		return k <= array.length && k >= 1;

	}

}
