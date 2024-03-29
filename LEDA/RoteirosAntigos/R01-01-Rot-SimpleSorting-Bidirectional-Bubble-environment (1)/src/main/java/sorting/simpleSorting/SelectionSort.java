package sorting.simpleSorting;

import sorting.AbstractSorting;
import util.Util;

/**
 * The selection sort algorithm chooses the smallest element from the array and
 * puts it in the first position. Then chooses the second smallest element and
 * stores it in the second position, and so on until the array is sorted.
 */
public class SelectionSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {

		for (int j = leftIndex; j < rightIndex; j++) {
			int menor_index = j;
			for (int i = j + 1; i <= rightIndex; i++) {
				if (array[i].compareTo(array[menor_index]) < 0){
					menor_index = i;
				}
			}
			Util.swap(array, j, menor_index);
		}
	}
}