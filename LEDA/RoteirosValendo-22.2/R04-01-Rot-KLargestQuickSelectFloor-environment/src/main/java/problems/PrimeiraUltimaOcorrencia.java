package problems;

public class PrimeiraUltimaOcorrencia {
	
	
	
	
    public int[] startEndPosition(int[] array, Integer x) {
    	
    	int[] result = new int[] {-1,-1};
    	if(array != null && x != null) {
        	result[0] = primeiraOcorrencia(array, x, 0, array.length-1);
        	if (result[0] != -1) {
            	result[1] = ultimaOcorrencia(array, x, result[0], array.length-1);
        	}
    	}
		return result;
    }

	public int primeiraOcorrencia(int[] array, int x, int left, int right) {

		int result = -1;
		if (left <= right) {
			int mid = (left + right) / 2;

			if (mid -1 > -1 && array[mid - 1] == x) {
				result = primeiraOcorrencia(array, x, left, mid - 1);
			} else if (array[mid] == x) {
				result = mid;
			} else if (x > array[mid]) {
				result = primeiraOcorrencia(array, x, mid + 1, right);
			} else {
				result = primeiraOcorrencia(array, x, left, mid - 1);

			}
		}

		return result;
	}

	public int ultimaOcorrencia(int[] array, int x, int left, int right) {

		int result = -1;
		if (left <= right) {
			int mid = (left + right) / 2;

			if (mid + 1 < array.length - 1 && array[mid + 1] == x) {
				result = ultimaOcorrencia(array, x, mid + 1, right);
			} else if (array[mid] == x) {
				result = mid;
			}
			else if (x > array[mid]) {
				result = ultimaOcorrencia(array, x, mid + 1, right);
			} else {
				result = ultimaOcorrencia(array, x, left, mid -1);

			}
		}

		return result;
	}

}
