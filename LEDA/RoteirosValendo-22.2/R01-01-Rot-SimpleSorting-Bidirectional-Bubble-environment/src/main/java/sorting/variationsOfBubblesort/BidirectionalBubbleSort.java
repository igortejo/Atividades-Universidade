package sorting.variationsOfBubblesort;

import sorting.AbstractSorting;
import util.Util;

/**
 * This bubble sort variation has two internal iterations. In the first, it
 * pushes big elements to the right, like the normal bubble sort does. Then in
 * the second, iterates the array backwards, that is, from right to left, while
 * pushing small elements to the left. This process is repeated until the array
 * is sorted.
 */
public class BidirectionalBubbleSort<T extends Comparable<T>> extends
		AbstractSorting<T> {
	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		
		boolean houve_troca = true;

		while (houve_troca) {
			houve_troca = false;
			int tamanho_array = rightIndex;
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j].compareTo(array[j + 1]) > 0) {
					Util.swap(array, j, j + 1);
					houve_troca = true;
				}
				if (array[tamanho_array].compareTo(array[tamanho_array - 1]) < 0) {
					Util.swap(array, tamanho_array, tamanho_array - 1);
					houve_troca = true;
				}
				tamanho_array--;
			}
		}
	}
}
