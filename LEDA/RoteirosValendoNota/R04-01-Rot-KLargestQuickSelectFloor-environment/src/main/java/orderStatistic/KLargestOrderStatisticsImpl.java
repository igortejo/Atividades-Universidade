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
public class KLargestOrderStatisticsImpl<T extends Comparable<T>> implements KLargest<T>{

	@Override
	public T[] getKLargest(T[] array, int k) {
		
		Comparable[] array_final = null;
		
		if (k >= 1 && k <= array.length) {
			
			T numero = orderStatistics(array, k);
			int controlador = 0;
			array_final = new Comparable[array.length - k];
			for (int i = 0; i < array.length; i++) {
				if (array_final[i].compareTo(numero) > 0) {
					array_final[controlador] = array[i];
					controlador++;
				}
			}
			
		}
		else {
			array_final = new Comparable[1];
		}
		return (T[]) array_final;
		
		
	}

	/**
	 * Metodo que retorna a k-esima estatistica de ordem de um array, usando
	 * a ideia de algum algoritmo de ordenacao visto em sala. Caso nao exista 
	 * a k-esima estatistica de ordem, entao retorna null.
	 * 
	 * Obs: o valor de k deve ser entre 1 e N.
	 * 
	 * @param array
	 * @param k
	 * @return
	 */
	public T orderStatistics(T[] array, int k){
		
		quickSort(array, 0, array.length-1);
		
		if (k >= 1 && k <= array.length) {
			return array[k-1];
		}else {
			return null;
		}
		
		
	}
	
	private  void quickSort(T[] array, int left, int right) {

		if(left <= right) {
			Integer pivot = partition(array, left, right);
			quickSort(array,left,pivot-1);
			quickSort(array,pivot+1,right);	
		}
	}

	private  Integer partition(T[] array, int left, int right) {
		
		int i = left;
		T pivot = array[left];
		
		for (int j = i+1 ; j <= right; j++) {
			if(array[j].compareTo( pivot) < 0) {
				i++;
				Util.swap(array, i, j);
			}
		}
		
		Util.swap(array, left, i);
		 
		return i;
	}
}
