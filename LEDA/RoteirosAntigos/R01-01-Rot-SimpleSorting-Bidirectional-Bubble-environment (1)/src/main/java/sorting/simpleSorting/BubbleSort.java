package sorting.simpleSorting;

import sorting.AbstractSorting;
import util.Util;

/**
 * The bubble sort algorithm iterates over the array multiple times, pushing big
 * elements to the right by swapping adjacent elements, until the array is
 * sorted.
 */
public class BubbleSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {

		for (int i = leftIndex; i <= rightIndex; i++) {
			for (int j = leftIndex; j < rightIndex - i; j++) {
				if (array[j + 1].compareTo(array[j]) < 0) {
					Util.swap(array, j, j + 1);
				}
			}
		}
	}
}
