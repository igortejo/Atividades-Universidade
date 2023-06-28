package problems;

	
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

	public int indiceFloor(Integer[] array, int x, int leftIndex, int rightIndex) {

		int result = -1;
		if ( leftIndex <= rightIndex) {
			int meio = (leftIndex + rightIndex) / 2;
			if (array[meio] == x) {
				result = meio;
			}else if (meio - 1 > -1 && array[meio] >= x) {
				result = indiceFloor(array, x, leftIndex, meio - 1);
			}else if (meio + 1 < array.length && array[meio+1] <= x){
				result = indiceFloor(array, x, meio + 1, rightIndex);
			}else if (array[meio] <= x) {
				result = meio;
			}
			
		}
		return result;
	}
	
	public Integer ceil(Integer[] array, Integer x) {
		
		quickSort(array, 0, array.length - 1);

		int resultado = indiceCeil(array, x, 0, array.length - 1);

		if (resultado != -1) {
			return array[resultado];
		} else {
			return null;
		}

	}

	public int indiceCeil(Integer[] array, int x, int leftIndex, int rightIndex) {

		int result = -1;
		
		if (leftIndex <= rightIndex) {
			int meio = (leftIndex + rightIndex) / 2;
			if (array[meio] == x) {
				result = meio;
			}else if ((meio + 1) < array.length && array[meio] <= x) {
				result = indiceCeil(array, x, meio + 1, rightIndex);
			
			}else if ((meio -1) > -1 && array[meio - 1] >= x){
				result = indiceCeil(array, x, leftIndex, meio - 1);
				
			}else if (array[meio] > x) {
				result = meio;
			}
		}
		
		
			
		
		return result;
	}

	public void quickSort(Integer[] array, int leftIndex, int rightIndex) {

		if (leftIndex < rightIndex) {

			int pivot_index = partition(array, leftIndex, rightIndex);
			quickSort(array, leftIndex, pivot_index - 1);
			quickSort(array, pivot_index + 1, rightIndex);

		}
	}

	public int partition(Integer[] array, int leftIndex, int rightIndex) {

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
