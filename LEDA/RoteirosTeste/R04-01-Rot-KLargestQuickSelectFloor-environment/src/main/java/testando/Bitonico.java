package testando;

import java.util.Arrays;

import problems.Floor;
import util.Util;

public class Bitonico {

	public static void main(String[] args) {
		
		int[] array = new int[] { 1, 7, 8, 9, 12, 14, 6, 5, 3 };
		int biggest = findBiggestInBitonicArray(array, 0, array.length - 1);
		System.out.println(biggest); // 7
	}

	public static int findBiggestInBitonicArray(int[] array, int left, int right) {
		int result = -1;
		if (left <= right) {
			int mid = (left + right) / 2;
			if (mid + 1 < array.length && array[mid + 1] > array[mid]) {
				result = findBiggestInBitonicArray(array, mid + 1, right);
			} else if (mid - 1 > -1 && array[mid - 1] > array[mid]) {
				result = findBiggestInBitonicArray(array, left, mid - 1);
			} else {
				result = array[mid];
			}
		}
		return result;
	}

}
