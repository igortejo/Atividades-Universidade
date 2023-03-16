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
			while(houve_troca) {
				int tamanho_array = rightIndex;
				houve_troca = false;
				for(int i = leftIndex; i < rightIndex; i++) {
					if(array[i].compareTo(array[i + 1]) > 0) {
						Util.swap(array, i, i + 1);
						houve_troca = true;
					}
					if(array[tamanho_array].compareTo(array[tamanho_array - 1]) < 0) {
						Util.swap(array, tamanho_array, tamanho_array - 1);
						houve_troca = true;
					}tamanho_array--;
				}
			}	
		}
}
