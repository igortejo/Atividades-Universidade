package sorting.divideAndConquer.hybridMergesort;

import sorting.AbstractSorting;
import util.Util;

/**
 * A classe HybridMergeSort representa a implementação de uma variação do
 * MergeSort que pode fazer uso do InsertionSort (um algoritmo híbrido) da
 * seguinte forma: o MergeSort é aplicado a entradas maiores a um determinado
 * limite. Caso a entrada tenha tamanho menor ou igual ao limite o algoritmo usa
 * o InsertionSort.
 * 
 * A implementação híbrida deve considerar os seguintes detalhes: - Ter
 * contadores das quantidades de MergeSorts e InsertionSorts aplicados, de forma
 * que essa informação possa ser capturada pelo teste. - A cada chamado do
 * método de sort(T[] array) esses contadores são resetados. E a cada chamada
 * interna de um merge ou insertion, os contadores MERGESORT_APPLICATIONS e
 * INSERTIONSORT_APPLICATIONS são incrementados. - O InsertionSort utilizado no
 * algoritmo híbrido deve ser in-place.
 */
public class HybridMergeSort<T extends Comparable<T>> extends AbstractSorting<T> {

	/**
	 * For inputs with size less or equal to this value, the insertionsort algorithm
	 * will be used instead of the mergesort.
	 */
	public static final int SIZE_LIMIT = 4;

	protected static int MERGESORT_APPLICATIONS = 0;
	protected static int INSERTIONSORT_APPLICATIONS = 0;
	
	

	public void sort(T[] array, int leftIndex, int rightIndex) {
		hybridMergesort(array, leftIndex, rightIndex);
	}

	public void hybridMergesort(T[] array, int leftIndex, int rightIndex) {

		MERGESORT_APPLICATIONS++;

		if (leftIndex < rightIndex) {

			int meio = (leftIndex + rightIndex) / 2;

			if (array.length > SIZE_LIMIT) {

				hybridMergesort(array, leftIndex, meio);

				hybridMergesort(array, meio + 1, rightIndex);

				merge(array, leftIndex, meio, rightIndex);

			} else {
				insertionSort(array, leftIndex, meio);

				insertionSort(array, meio + 1, rightIndex);

				merge(array, leftIndex, meio, rightIndex);
			}
		}
	}

	@SuppressWarnings("unchecked")
	private void merge(T[] array, int leftIndex, int indiceMedio, int rightIndex) {
		
		T[] array_aux = (T[]) new Comparable[array.length];

		for (int i = leftIndex; i <= rightIndex; i++) {
			array_aux[i] = array[i];
		}

		int i = leftIndex;
		int j = indiceMedio + 1;
		int k = leftIndex;

		while (i <= indiceMedio && j <= rightIndex) {

			if (array_aux[i].compareTo(array_aux[j]) < 0) {
				array[k] = array_aux[i++];
			} else {
				array[k] = array_aux[j++];
			}
			k++;
		}

		while (i <= indiceMedio) {
			array[k++] = array_aux[i++];
		}

		while (j <= rightIndex) {
			array[k++] = array_aux[j++];
		}
	}

	public void insertionSort(T[] array, int leftIndex, int rightIndex) {

		INSERTIONSORT_APPLICATIONS++;

		for (int i = leftIndex + 1; i <= rightIndex; i++) {

			int j = i;
			while (j > 0 && array[j].compareTo(array[j - 1]) < 0) {
				Util.swap(array, j, j - 1);
				j--;
			}
		}
	}

	public int getInsertionApplications() {
		return INSERTIONSORT_APPLICATIONS;
	}

	public int getMergesortApplications() {
		return MERGESORT_APPLICATIONS;
	}
}
