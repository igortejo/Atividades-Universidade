package testando;

import java.util.Arrays;

import problems.Floor;
import util.Util;

public class FloorBinarySearchImpl2 {

	public static void main(String[] args) {

		Integer[] array = new Integer[] { 1, 2, 8, 22, 60 };
		System.out.println(floor(array, 25));
	}

	public static Integer floor(Integer[] array, int x) {

		quickSort(array, 0, array.length - 1);

		int resultado = indiceFloor(array, x, 0, array.length - 1);

		if (resultado != -1) {
			return array[resultado];
		} else {
			return null;
		}

	}

	public static int indiceFloor(Integer[] array, int x, int leftIndex, int rightIndex) {
		
		int resultado = -1;
		
		if (leftIndex <= rightIndex) {
			int meio = (leftIndex + rightIndex) / 2;
			if (array[meio] == x) {
				resultado = meio;
			} else if (meio - 1 > -1 && x < array[meio]) {
				resultado = indiceFloor(array, x, leftIndex, meio - 1);
			} else if (meio + 1 < array.length && array[meio + 1] <= x) {
				resultado = indiceFloor(array, x, meio + 1, rightIndex);
			} else if (array[meio] <= x) {
				resultado = meio;
			}
		}
		return resultado;
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

	// if(resultado == -1) {
	// return meio;
	// } else {
	// return resultado; // se eu quiser o ceil
	// }

}
