package sorting.divideAndConquer;

import sorting.AbstractSorting;

/**
 * Merge sort is based on the divide-and-conquer paradigm. The algorithm
 * consists of recursively dividing the unsorted list in the middle, sorting
 * each sublist, and then merging them into one single sorted list. Notice that
 * if the list has length == 1, it is already sorted.
 */
public class MergeSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] aux, int leftIndex, int rightIndex) {
		
		if(leftIndex >= rightIndex || aux == null) {
			return;
		} else {
			int meio = (leftIndex + rightIndex) / 2;
			sort(aux, leftIndex, meio);
			sort(aux, meio + 1, rightIndex);
			merge(aux, leftIndex, meio, rightIndex);
		}

	}

	private void merge(T[] array, int leftIndex, int meio, int rightIndex) {
		
		T[] aux = (T[]) new Comparable[array.length];

		for (int i = leftIndex; i <= rightIndex; i++) {
			aux[i] = array[i];
		}

		int i = leftIndex;
		int j = meio + 1;
		int k = leftIndex;

		while (i <= meio && j <= rightIndex) {
			if (aux[i].compareTo(aux[j]) <= 0) {
				array[k++] = aux[i++];
			} else {
				array[k++] = aux[j++];
			}

		}

		while (i <= meio) {
			array[k++] = aux[i++];
		}
		while (j <= rightIndex) {
			array[k++] = aux[j++];
		}
	}
}
