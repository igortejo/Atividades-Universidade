package problems;

import java.util.Arrays;

import util.Util;

public class FloorBinarySearchImpl implements Floor {

	@Override
	public Integer floor(Integer[] array, Integer x) {
		// TODO implement your code here
		throw new UnsupportedOperationException("Not implemented yet!");
	}
	public static void main(String[] args) {

		Integer[] array = new Integer[] { 22, 35, 2, 8, 9 };
		System.out.println(floor(array, 23));
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
			} else if (x < array[meio]) {
				resultado = indiceFloor(array, x, leftIndex, meio - 1);
				return resultado == -1 ? meio : resultado;        // se eu quiser o ceil

			} else {
				resultado = indiceFloor(array, x, meio + 1, rightIndex);
				//if(resultado == -1) {
				//	return meio;
				//} else {
				//	return resultado;
				//}
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

}
