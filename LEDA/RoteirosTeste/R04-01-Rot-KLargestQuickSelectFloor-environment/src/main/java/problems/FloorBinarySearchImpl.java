package problems;

import java.util.Arrays;

import util.Util;

public class FloorBinarySearchImpl implements Floor {

	@Override
	public Integer floor(Integer[] array, Integer x) {
		
		quickSort(array, 0, array.length - 1);

		int resultado = indiceFloor(array, x, 0, array.length - 1);

		if (resultado != -1) {
			return array[resultado];
		} else {
			return null;
		}

	}

	public static int indiceFloor(Integer[] array, int x, int leftIndex, int rightIndex) {

		if (leftIndex > rightIndex) {
			return rightIndex;
		}

		int meio = (leftIndex + rightIndex) / 2;

		if (array[meio] == x) {
			return meio;
		} else if (array[meio] < x) {
			return indiceFloor(array, x, meio + 1, rightIndex);
		} else {
			return indiceFloor(array, x, leftIndex, meio - 1);
		}
	}

	public static String quickSort(Integer[] array, int leftIndex, int rightIndex) {

		if (leftIndex < rightIndex) {

			int pivot_index = partition(array, leftIndex, rightIndex);
			quickSort(array, leftIndex, pivot_index - 1);
			quickSort(array, pivot_index + 1, rightIndex);

		}
		return Arrays.toString(array);
	}

	public static int partition(Integer[] array, int leftIndex, int rightIndex) {

		Integer pivot = array[leftIndex];

		int i = leftIndex;

		for (int j = i + 1; j <= rightIndex; j++) {
			if (array[j].compareTo(pivot) <= 0) {
				i++;
				Util.swap(array, j, i);
			}
		}
		Util.swap(array, leftIndex, i);

		return i;
	}

}
