package problems;

import util.Util;

public class FloorBinarySearchImpl implements Floor {

	
	@Override
	public  Integer floor(Integer[] array, Integer x) { 
		
		quickSort(array, 0, array.length - 1);
		return buscaBinariaFloor(array, x, 0, array.length -1);		
		
	}

	private  void quickSort(Integer[] array, int left, int right) {

		if(left <= right) {
			Integer pivot = partition(array, left, right);
			quickSort(array,left,pivot-1);
			quickSort(array,pivot+1,right);	
		}
	}

	private  Integer partition(Integer[] array, int left, int right) {
		
		int i = left;
		Integer pivot = array[left];
		
		for (int j = i+1 ; j <= right; j++) {
			if(array[j] <= pivot) {
				i++;
				Util.swap(array, i, j);
			}
		}
		
		Util.swap(array, left, i);
		 
		return i;
	}

	private  Integer buscaBinariaFloor(Integer[] array, Integer x, int left, int right) {
		
		int middle = (left + right) / 2;
		
		if(left > right && right != -1) {
			return array[right];
		}
		else if (left > right && right == -1){
			return null;
		}
		
		if (x < array[middle]) {
			return buscaBinariaFloor(array, x, left, middle-1);
		}
		else if (x > array[middle]){
			return buscaBinariaFloor(array, x, middle+1, right);
		}
		else {
			return array[middle];
		}
		
	}
}
