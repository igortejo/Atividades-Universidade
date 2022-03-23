package sorting.variationsOfSelectionsort;

import sorting.AbstractSorting;
import util.Util;

public class RecursiveSelectionsort<T extends Comparable<T>> extends AbstractSorting<T> {

	/**
	 * Implemented
	 * 
	 * @param array      the target of the sorting algorithm
	 * @param leftIndex  where the sorting should begin
	 * @param rightIndex
	 */
	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {


		for (int i = leftIndex; i < rightIndex; i++) {
			int limit = rightIndex;
			int min = i;

			for (int j = i + 1; j <= limit; j++) {
				if (array[j].compareTo(array[min]) < 0) {
					min = j;
				}
			}

			Util.swap(array, i, min);

			int max = i + 1;

			for (int j = max + 1; j <= limit; j++) {
				if (array[j].compareTo(array[max]) > 0) {
					max = j;
				}
			}

			Util.swap(array, limit, max);
		}
	}
}
