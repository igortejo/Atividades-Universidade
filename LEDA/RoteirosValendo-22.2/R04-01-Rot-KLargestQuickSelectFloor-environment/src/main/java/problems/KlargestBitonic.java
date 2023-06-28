package problems;

public class KlargestBitonic {
	
	public int klargestBitonic(int[] array, int k) {
		int result = -1;
		if (k-1 < array.length && k - 1 > -1) {
			sort(array,0,array.length-1);
			result = array[array.length - k];
		}
		return result;
	}
	
	public void sort(int[] array, int left, int right) {
		if (left < right) {
			int meio = (left+right) / 2;
			sort(array,left,meio);
			sort(array,meio+1, right);
			merge(array, left,meio,right);
		}
		return;
	}

	public void merge (int[] array, int left, int meio, int right) {
		
		int[] aux = new int[array.length];
		for (int i = 0; i <= right; i++) {
			aux[i] = array[i];
		}

		int i = left;
		int j = meio + 1;
		int k = left;
		
		while (i <= meio && j <= right) {
			if (aux[i] <= aux[j]) {
				array[k] = aux[i];
				i++;
				k++;
			} else {
				array[k] = aux[j];
				j++;
				k++;
			}
			
		}
		
		while (i <= meio) {
			array[k] = aux[i];
			i++;
			k++;
		}
		while (j <= right) {
			array[k] = aux[j];
			j++;
			k++;
		}
	}
	private int maximum(int[] array) {
		int indexMaior = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > array[indexMaior]) {
				indexMaior = i;
			}
		}
		return indexMaior;
	}

}
