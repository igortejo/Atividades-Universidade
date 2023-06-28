package problems;

public class FindBiggestBitonic {

	public Integer biggestBitonic(Integer[] array, int left, int right) {
		int result = -1;
		if (left <= right) {
			int middle = (left + right) / 2;
			if ((middle - 1) > -1 && array[middle - 1] > array[middle]) {
				result = biggestBitonic(array, left, middle - 1);
			} else if ((middle + 1) < array.length && array[middle + 1] > array[middle]) {
				result = biggestBitonic(array,middle + 1, right);
			} else {
				result = array[middle];
			} 
		}
		
		return result;
		
	}
	
	
	
}
